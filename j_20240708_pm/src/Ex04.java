import java.net.URL;
import java.net.URLConnection;

// 540 page
public class Ex04 {

	public static void main(String[] args) {
		
		URL url = null;
		String address = "https://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1";
		
		try {
			url = new URL(address);
			URLConnection conn = url.openConnection();
			System.out.println("conn.toString() : " + conn);
			System.out.println("getAllowUserInteraction() : " + conn.getAllowUserInteraction());
			System.out.println("getConnectTimeout()       : " + conn.getConnectTimeout());
			System.out.println("getContent()              : " + conn.getContent()); 
			System.out.println("getContentEncoding()      : " + conn.getContentEncoding());
			System.out.println("getContentLength h()      : " + conn.getContentLength());
			System.out.println("getContentType()          : " + conn.getContentType());
			System.out.println("getDate()                 : " + conn.getDate());
			System.out.println("getDefaultAllowUserInteraction() : " + conn.getDefaultAllowUserInteraction());
			System.out.println("getDefaultUseCaches()     : " + conn.getDefaultUseCaches());
			System.out.println("getDoInput()              : " + conn.getDoInput());
			System.out.println("getDoOutput()             : " + conn.getDoOutput());
			System.out.println("getExpiration()           : " + conn.getExpiration());
			System.out.println("getHeaderFields()         : " + conn.getHeaderFields());
			System.out.println("getIfModifiedSince()      : " + conn.getIfModifiedSince() );
			System.out.println("getLastModifiedSince()    : " + conn.getLastModified());
			System.out.println("getURL()                  : " + conn.getURL());
			System.out.println("getUseCaches()            : " + conn.getUseCaches());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
