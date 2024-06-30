package j_20240628;

public class Ex05 {
	
	public static void main(String[] args) {
		
		A3 a = new A3();
		a.methodA();
	}

}

class A3{
	/*
	  클래스 영역에서는 
	  멤버변수 선언과 초기화하는 code 만 작성할 수 있음
	*/
	void methodA() {
  	// InstanceMake 클래스의 getInstance() 메소드 호출하기
		Inter3 i3 = InstanceMaker.getInstance();
		i3.method1();
		System.out.println("i3 : " + i3.toString());
	}
}

class InstanceMaker{
	public static Inter3 getInstance() {
		/*
		return new B3();
		return new C3();
		return new D3();
		return new E3();
		return new F3();
		*/
		return new B3();
	}
}

interface Inter3{
	void method1();
}


class B3 implements Inter3{
	@Override
	public void method1() {
		System.out.println("B 클래스의 method1() 메소드");
	}
	@Override
	public String toString() {
		return "B3";
	}
}
class C3 implements Inter3{
	@Override
	public void method1() {
		System.out.println("C 클래스의 method1() 메소드");
	}
	@Override
	public String toString() {
		return "C3";
	}
}
class D3 implements Inter3{
	@Override
	public void method1() {
		System.out.println("D 클래스의 method1() 메소드");
	}
	@Override
	public String toString() {
		return "D3";
	}
}
class E3 implements Inter3{
	@Override
	public void method1() {
		System.out.println("E 클래스의 method1() 메소드");
	}
	@Override
	public String toString() {
		return "E3";
	}
}
class F3 implements Inter3{
	@Override
	public void method1() {
		System.out.println("F 클래스의 method1() 메소드");
	}
	@Override
	public String toString() {
		return "F3";
	}
}
