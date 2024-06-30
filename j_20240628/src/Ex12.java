
public class Ex12 {
  public static void main(String[] args) {
    
    System.out.println("프로그램 시작");
    
    try {      
      int[] numbers = new int[3];
      
      numbers[0] = 10;
      numbers[1] = 20;
      numbers[2] = 30;
      numbers[3] = 40;
      
      System.out.println(1);
      
      String name = null;
      System.out.println("이름의 길이 : " + name.length());
      
      System.out.println(2);
      System.out.println(3 / 0);
      
    }catch(ArithmeticException e) {
      System.out.println("숫자는 0 으로 나눌 수 없습니다.");
    }catch(NullPointerException e) {
      System.out.println("문자열이 할당되지 않았습니다.");
    }catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("배열의 크기가 3인데, index 번호 3을 지정했습니다.");
    }catch(Exception e) {
      System.out.println("예외가 발생했습니다.");
    }
    
    System.out.println(4);
    System.out.println(5);
    System.out.println(6);
    System.out.println("프로그램 종료");
  }
}

