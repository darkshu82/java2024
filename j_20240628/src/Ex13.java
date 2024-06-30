
public class Ex13 {
  public static void main(String[] args) {

    System.out.println("프로그램 시작");

    try {
      throw new Exception("예외가 발생했습니다.");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("프로그램 종료");

  }
}
