import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex05 {
  public static void main(String[] args) {

    URL url = null;
    String address = "https://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1";

    BufferedReader br = null;
    String readLine = "";

    try {
      url = new URL(address);
      
      br = new BufferedReader(new InputStreamReader(url.openStream()));
      while ((readLine = br.readLine()) != null) {
        System.out.println(readLine);
      }
    } catch (MalformedURLException e) { 
      e.printStackTrace();
    } catch (IOException e) { 
      e.printStackTrace();
    } finally {
      try {
        if (br != null) {
          br.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

}
