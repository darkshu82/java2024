
public class Ex15 {
  public static void main(String[] args) {

    Child2 child = new Child2();
    try {
      child.displayName(); // 자식 클래스의 displayName 메서드 호출
    } catch (ArithmeticException e) {
      System.out.println("산술 예외 발생: " + e.getMessage());
    } catch (NullPointerException e) {
      System.out.println("널 포인터 예외 발생: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("일반 예외 발생: " + e.getMessage());
    }

  }
}

class Parent2 {
  String name = "더조은";

  public void displayName() throws Exception {
    System.out.println("부모 이름 : " + this.name);
  }
}

class Child2 extends Parent2 {
  String name = "아이티";

  @Override
  public void displayName() throws ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException {
    System.out.println("자식 이름 : " + this.name);
  }
}