
public class Ex04 {
  public static void main(String[] args) {
    
    A2 a = new A2();
    a.methodA(new B2());
    a.methodA(new C2());
    a.methodA(new D2());
    a.methodA(new E2());
    a.methodA(new F2());
    
    
  }
}

class A2{
  public void methodA(Inter i) {
    i.method1();
  }
}

interface Inter{
  void method1();
}

class B2 implements Inter{
  public void method1() {
    System.out.println("B2클래스의 method1()");
  }
}
class C2 implements Inter{
  public void method1() {
    System.out.println("C2클래스의 method1()");
  }
}
class D2 implements Inter{
  public void method1() {
    System.out.println("D2클래스의 method1()");
  }
}
class E2 implements Inter{
  public void method1() {
    System.out.println("E2클래스의 method1()");
  }
}
class F2 implements Inter{
  public void method1() {
    System.out.println("F2클래스의 method1()");
  }
}