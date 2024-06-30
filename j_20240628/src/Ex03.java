import j_20240628.C;

public class Ex03 {
  public static void main(String[] args) {
    
    
    B b = new B();
    b.method1();
    
    A a = new A();
    a.methodA(b);
    a.methodA(new B());
    
    System.out.println("========================");

    C c = new C();
    D d = new D();
    E e = new E();
    F f = new F();
    
    a.methodA(b);
    a.methodA(c);
    a.methodA(d);
    a.methodA(e);
    a.methodA(f);
  }
}

class A{
  public void methodA(B b) {
//    B b = new B();
    b.method1();        
  }
  
  public void methodA(C c) {
    c.method1();
  }
  
  public void methodA(D d) {
    d.method1();
  }

  public void methodA(E e) {
    e.method1();
  }

  public void methodA(F f) {
    f.method1();
  }
  
  
}

class B{
  public void method1() {
    System.out.println("B클래스의 method1()");
  }
}

class C{
  public void method1() {
    System.out.println("C클래스의 method1()");
  }
}

class D{
  public void method1() {
    System.out.println("D클래스의 method1()");
  }
}

class E{
  public void method1() {
    System.out.println("E클래스의 method1()");
  }
}

class F{
  public void method1() {
    System.out.println("F클래스의 method1()");
  }
}
