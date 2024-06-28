
public class Ex03 {
  public static void main(String[] args) {
    
    
    B b = new B();
    b.method1();
    
    A a = new A();
    a.methodA(b);
    a.methodA(new B());
    
    
  }
}

class A{
  public void methodA(B b) {
//    B b = new B();
    b.method1();
        
  }
}

class B{
  public void method1() {
    System.out.println("B클래스의 method1()");
  }
}