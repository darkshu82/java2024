import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Ex07Server {
	
	public static void main(String[] args) {
		
		try {
			DatagramSocket socket = new DatagramSocket(9500);
			DatagramPacket inPacket;
			byte[] messages = null;
			while(true) {
				// data 수신용 byte 배열
				messages = new byte[1024];
				// DatagramPacket 객체 생성
				inPacket = new DatagramPacket(messages, messages.length);
				// packet data 수신
				socket.receive(inPacket);
				// 문자열로 저장하기
				String message = new String(messages, 0, inPacket.getLength());
				System.out.println("Client Message : " + message);
				
				// Client IP
				InetAddress address = inPacket.getAddress();
				System.out.println("Client ip address  : " + address);
				
				// Client Port
				int port = inPacket.getPort();
				System.out.println("Client port number : " + port);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
