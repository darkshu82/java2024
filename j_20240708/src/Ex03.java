import java.io.IOException;
import java.net.URL;

public class Ex03 {
  public static void main(String[] args) {
    
    try {
      URL url = null;
      url = new URL("https://www.egovframe.go.kr/RgovIntro.jst?menu=1&submenu=1");
      
      System.out.println("authority : " + url.getAuthority());
      System.out.println("content : " + url.getContent());
      System.out.println("protocol : " + url.getProtocol());
      System.out.println("host : " + url.getHost());
      System.out.println("port : " + url.getPort());
      System.out.println("path : " + url.getPath());
      System.out.println("file : " + url.getFile());
      System.out.println("query : " + url.getQuery());
      
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }
    
    
    
    
    
    
    
    
    
    
  }
}
