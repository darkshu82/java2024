import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Ex07Client {
	
	public static void main(String[] args) {
		DatagramSocket dataSocket = null;
		
		try {
			// key board 입력
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(System.in));
			// serverIP <-- 127.0.0.1(localhost)
			InetAddress serverIP = InetAddress.getByName("127.0.0.1");
			
			while(true) {
				// 한 줄을 읽음
				String data = br.readLine();
        dataSocket = new DatagramSocket();
				
				// 문자열을 byte 배열에 저장하기
				byte[] messages1 = data.getBytes();
				
				// data, data 길이, server Ip 값, port number
				DatagramPacket outPacket = 
						new DatagramPacket(messages1, messages1.length, serverIP, 9500);
				dataSocket.send(outPacket);
			}
		}catch(Exception e) { 
			
		}finally {
			// socket 닫기
			dataSocket.close();
		}
		
	}

}
