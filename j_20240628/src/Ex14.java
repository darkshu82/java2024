
public class Ex14 {
  public static void main(String[] args) {

    try {
      first();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  } // main method
  
  static void first() throws Exception{
    second(); 
  }
  
  static void second() throws Exception{
    throw new Exception("예외 발생 !!!");
  }
}
