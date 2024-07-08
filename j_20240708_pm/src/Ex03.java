import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

// 537 page

public class Ex03 {
	
	public static void main(String[] args) {
		
		try {
			URL url = null;
			url = new URL("https://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1");
			
			System.out.println("authority : " + url.getAuthority());
			System.out.println("content   : " + url.getContent());
			System.out.println("protocol  : " + url.getProtocol());
			System.out.println("host      : " + url.getHost());
			System.out.println("port      : " + url.getPort());
			System.out.println("path      : " + url.getPath());
			System.out.println("file      : " + url.getFile());
			System.out.println("query     : " + url.getQuery());
			
			int data = 0;
			try {
				Reader is = new InputStreamReader(url.openStream());
				while((data = is.read()) != -1) {
					System.out.print((char)data);
				}
				System.out.println();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
