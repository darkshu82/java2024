
public class Ex05 {
  public static void main(String[] args) {
    
    A3 a = new A3();
    a.methodA();
    
    
  }

}

class A3 {
  void methodA() {
    Inter3 i3 = InstanceMaker.getInstance();
    i3.method1();
  }
}

class InstanceMaker{
  public static Inter3 getInstance() {
    return new B3();
  }
}

interface Inter3{
  void method1();
}

class B3 implements Inter3{
  @Override
  public void method1() {
    System.out.println("B3클래스의 method1()");
  }
}

class C3 implements Inter3{
  @Override
  public void method1() {
    System.out.println("C3클래스의 method1()");
  }
}

class D3 implements Inter3{
  @Override
  public void method1() {
    System.out.println("D3클래스의 method1()");
  }
}

class E3 implements Inter3{
  @Override
  public void method1() {
    System.out.println("E3클래스의 method1()");
  }
}

class F3 implements Inter3{
  @Override
  public void method1() {
    System.out.println("F3클래스의 method1()");
  }
}
