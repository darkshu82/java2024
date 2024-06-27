
public class Ex03 {
  public static void main(String[] args) {
    
    System.out.println("프로그램 시작");
    
    new Child2();
    
    System.out.println("프로그램 종료");
    
  }
}

class Parent2{
  Parent2() {
    this(10);
    System.out.println("Parent2()");
  }
  Parent2(int m) {
    this(10.12F);
    System.out.println("Parent2(int m)");
  }
  Parent2(float f) {
    this(12.34);
    System.out.println("Parent2(float f)");
  }
  Parent2(double d) {
    System.out.println("Parent2(double d)");
  }
}

class Child2 extends Parent2 {
  Child2() {
    this(10);
    System.out.println("child2()");
  }
  Child2(int m) {
    this(10.12F);
    System.out.println("Child2(int m)");
  }
  Child2(float f) {
    this(12.34);
    System.out.println("Child2(float f)");
  }
  Child2(double d) {
    System.out.println("Child2(double d)");
  }
}
  








