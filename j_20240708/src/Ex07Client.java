import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Ex07Client {
  public static void main(String[] args) {

    DatagramSocket dataSocket = null;

    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      InetAddress serverIP = InetAddress.getByName("127.0.0.1");

      while (true) {
        String data = br.readLine();
        dataSocket = new DatagramSocket();

        byte[] messages1 = data.getBytes();

        DatagramPacket outPacket = new DatagramPacket(messages1, messages1.length, serverIP, 9500);
        dataSocket.send(outPacket);
      }

    } catch (Exception e) {
      dataSocket.close();
    }

  }
}
