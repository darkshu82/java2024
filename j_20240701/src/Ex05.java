import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex05 {
  public static void main(String[] args) {
    
    FileInputStream is = null;
    BufferedInputStream bis = null;
    
    try {
      is = new FileInputStream("파일이름");
      bis = new BufferedInputStream(is);
      int data = -1;
      while((data = bis.read()) == -1) {
        System.out.println((char)data);
      }
    }catch(IOException e) {
      e.printStackTrace();
      System.out.println("IO 예외가 발생했습니다.");
    }finally {
      try {
        if (bis != null) { bis.close(); }
        if (bis != null) { is.close(); }
      }catch(Exception e) { }
    }
  }
}
