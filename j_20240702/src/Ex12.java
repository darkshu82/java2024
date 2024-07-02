import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Ex12 {
  public static void main(String[] args) {

    try {
      Properties pr = new Properties();

      FileInputStream reader = new FileInputStream("C:\\workspace\\java\\j_20240702\\src\\test.properties");

      pr.load(reader);
      System.out.println("pr : " + pr);
      System.out.println("이름 : " + pr.get("name"));

      pr.put("subject", "자바");
      System.out.println("pr : " + pr);

      pr.store(new FileOutputStream("C:\\workspace\\java\\j_20240702\\src\\\\test.properties"), "#save");

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

  }
}
