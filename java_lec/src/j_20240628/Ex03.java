package j_20240628;

public class Ex03 {
	public static void main(String[] args) {
		
		/*
        B 클래스의 객체를 생성해서
        B 클래스의 참조변수로 
        B 클래스의 methodB() 를 호출함
		*/
		B b = new B();
		b.method1();
		
		/*
        A 클래스의 객체를 생성해서
        A 클래스의 methodA() 메소드를 호출해서
        A 클래스의 methodA() 메소드에서 
        B 클래스의 methodB() 메소드를 호출함
    */	
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
	// A 클래스의 methodA() 에서 
	// B 클래스의 methodB() 호출하기
	// A 클래스의 methodA() 에서 B 클래스의 객체를 생성하지 않고
	// A 클래스의 methodA() 에서 B 클래스의 객체의 주소를 parameter 로 받기
  public void methodA(B b) {
  	/* B b = new B(); */
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
  	System.out.println("B 클래스의 method1()");
  }
}

class C{
  public void method1() {
  	System.out.println("C 클래스의 method1()");
  }
}

class D{
	public void method1() {
		System.out.println("D 클래스의 method1()");
	}
}

class E{
	public void method1() {
		System.out.println("E 클래스의 method1()");
	}
}

class F{
	public void method1() {
		System.out.println("F 클래스의 method1()");
	}
}
