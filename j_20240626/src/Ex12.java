
public class Ex12 {
  public static void main(String[] args) {
    Parent p1 = new Parent();
//  System.out.printf("아이디 : %d, 이름 : %s%n", p1.id, p1.name);
    System.out.printf("이름 : %s%n", p1.name);
    
    Child ch1 = new Child();
    ch1.displayMember();
    
    ch1.method1();
    ch1.method2();
    
  }
}

class Parent {
  static int age = 21;
  private int id = 1234;
  String name = "더조은";
  
  public static void method1() {
    System.out.println("부모클래스에 정의한 static 메소드 :  method1()");
  }
  
  public void method2() {
    System.out.println("부모클래스에 정의한 인스턴스 메소드 :  method2()");
  }
  
}

class Child extends Parent{
  public void displayMember() {
    System.out.printf("이름 : %s%n", this.name);
    System.out.printf("나이 : %d%n", age);
  }
//  @Override
//  public static void method1() {
//    System.out.println("자식클래스에 정의한 static 메소드 :  method1()");
//  }
  
  @Override
  public void method2() {
    System.out.println("자식클래스에 정의한 인스턴스 메소드 :  method2()");
  }
}




