import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Ex07Server {
  public static void main(String[] args) {

    try {
      DatagramSocket socket = new DatagramSocket(9500);
      DatagramPacket inPacket;
      byte[] messages = null;
      while (true) {
        messages = new byte[1024];
        inPacket = new DatagramPacket(messages, messages.length);
        socket.receive(inPacket);
        String message = new String(messages, 0, inPacket.getLength());
        System.out.println("Client Message : " + message);

        InetAddress address = inPacket.getAddress();
        System.out.println("Client ip address : " + address);

        int port = inPacket.getPort();
        System.out.println("Client port number : " + port);
      }

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }
}
