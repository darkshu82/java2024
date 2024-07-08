import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex06 {
    public static void main(String[] args) {
        ServerSocket server = null;
        
        try {
            server = new ServerSocket(9999);
            System.out.println("서버가 클라이언트의 접속을 기다림");
            
            while (true) {
                Socket sSocket = server.accept();
                System.out.println("클라이언트가 접속하였습니다.");
                
                // 클라이언트와 통신할 스레드 생성 및 시작
                HttpThread ht = new HttpThread(sSocket);
                ht.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (server != null)
                    server.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class HttpThread extends Thread {
    private Socket cSocket;
    
    public HttpThread(Socket socket) {
        this.cSocket = socket;
    }
    
    @Override
    public void run() {
        BufferedReader br = null;
        PrintWriter pw = null;
        
        try {
            // 입력 스트림과 출력 스트림 생성
            br = new BufferedReader(new InputStreamReader(cSocket.getInputStream()));
            pw = new PrintWriter(cSocket.getOutputStream(), true);
            
            // 클라이언트로부터 HTTP 요청을 읽음
            String request = br.readLine();
            System.out.println("클라이언트로부터 받은 요청: " + request);
            
            // 간단한 HTTP 응답 전송
            pw.println("HTTP/1.1 200 OK");
            pw.println("Content-Type: text/html; charset=utf-8");
            pw.println();
            pw.println("<html><body><h1>Hello, Client!</h1></body></html>");
            
            pw.flush(); // 버퍼 비우기
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (pw != null)
                    pw.close();
                if (cSocket != null)
                    cSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
