import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// 544 page

public class Ex06 {
	
	public static void main(String[ ]arsg) {
		
		// 서버 소켓 생성하기 : 클라이언트로부터 접속이 들어오는지 관찰함
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(9999); 
			
			// 클라이언트로부터 접속이 들어오는지 관찰하면서 대기함
			while(true) {
				System.out.println("서버가 클라이언트의 접속을 기다림");
				System.out.println(".. 대기하다가 클라이언트가 (서버가 열어놓은 port로) 접속해 오면");
				System.out.println("server socket 이 accept() 메소드를 호출해서 client 의 접속을 허용함"); 
				Socket sSocket = server.accept();
				System.out.println("Thread 생성");
				HttpThread ht = new HttpThread(sSocket);
				ht.start();
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				server.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	} // main

} // class

class HttpThread extends Thread{
	private Socket cSocket;
	BufferedReader br;
	PrintWriter pw;
	HttpThread(Socket cSocket){
		this.cSocket = cSocket;
		try {
			br = new BufferedReader(new InputStreamReader(cSocket.getInputStream()));
			pw = new PrintWriter(cSocket.getOutputStream());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void run() {
    BufferedReader fbr = null;
    DataOutputStream outToClient = null;
    try {
    	String line = this.br.readLine();
    	// Http Header : GET /index.html HTTP/1.1
    	//                  ㄴ 이 문자열에서 substring() 으로
    	//                     html 파일 이름을 추출함
    	System.out.println("Http Header (line) : " + line);
    	// start 는 파일 이름인 index.html 의 시작 문자인 i 의 index 번호가 됨 
    	int start = line.indexOf("/") + 1;
    	// end 는 start 는 파일 이름인 index.html 의 다음 공백문자의 index 번호가 됨
    	int end   = line.indexOf("HTTP") - 1;
    	// 위와 같이 start 와 end 를 설정한 후, substring() 으로 
    	// 파일 이름인 index.html 만 추출함
    	String fileName = line.substring(start, end);
    	System.out.println("substring() 으로 추출한 파일 이름 : " + fileName);
    	if(fileName.contentEquals("")) {
    		fileName = "index.html";
    	}
    	System.out.println("사용자 요청 파일 : " + fileName);
    	fbr = new BufferedReader(new FileReader(fileName));
    	String fileLine = null;
    	this.pw.println("HTTP/1.0 200 Document Follows \r\n");
    	while((fileLine = fbr.readLine()) != null) {
    		this.pw.println(fileLine);
    		this.pw.flush();
    	}
    }catch(Exception e) {
    	System.out.println(e.getMessage());
    }finally {
    	try {
				if(fbr != null) { fbr.close(); }
				if(this.pw != null) { this.pw.close(); }
				if(this.br != null) { this.br.close(); }
			} catch (IOException e) {
				e.printStackTrace();
			}
    }
    
	}
	
}












