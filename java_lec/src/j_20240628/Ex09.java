package j_20240628;

public class Ex09 {

}

class Outer{
	
	private int outerInstanceVariable = 10;
	static int outerStaticVariable = 20;
	
	class InstanceInner { 
		// 외부 클래스의 private 멤버변수에도 접근 가능함
		int iiv1 = outerInstanceVariable;
		// 외부 클래스의 static 멤버변수에도 접근 가능함
		int iiv2 = outerStaticVariable;
	}
	
	static class StaticInner { 		
		// static 내부 클래스에서는 외부 클래스의 private 멤버변수에 접근 못함
		// int iiv1 = outerInstanceVariable;
		// 외부 클래스의 static 멤버변수에도 접근 가능함
		int iiv2 = outerStaticVariable;
	}
	// instance 멤버변수에 instance 내부클래스의 객체를 할당함
	InstanceInner iv = new InstanceInner();
	
	// static 멤버변수에 static 내부클래스의 객체를 할당함
	static StaticInner cv = new StaticInner();
	
	static void Method() {
		
		// static method 안에서 Instance 내부클래스에 접근하지 못함
		// InstanceInner iv2 = new InstanceInner();
		
		// static method 안에서 static 내부클래스에 접근함
		StaticInner cv = new StaticInner();
		
  	// static method 안에서 Instance 내부클래스에 접근하려면
		// Instance 내부클래스의 객체를 생성해서 접근해야 함
		// Instance 내부클래스의 객체를 생성하려면 먼저 외부클래스의 객체를 생성함
		Outer outer = new Outer();
		
		// 외부클래스의 객체에서 new 연산자와 Instance 내부클래스의 생성자로 
		// Instance 내부클래스의 객체를 생성함
		InstanceInner iv3 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		
		InstanceInner iv4 = new InstanceInner();
		StaticInner cv2 = new StaticInner();
		
		// 다른 메소드에서 지역 클래스로 선언된 클래스에는 접근 못함
		// LocalInner li = new LocalInner();
	}
	
	void method1() {		
		// (외부 클래스의) 지역 변수
		int lv = 10;
		final int LV = 20;
		
		// 지역 클래스
		class LocalInner{
			int iv = 10;
			final int FINAL = 20;
			
			// 외부 클래스의 instance 멤버변수에 접근 가능
			int liv1 = outerInstanceVariable;
			
			// 외부 클래스의 static 멤버변수에 접근 가능
			int liv2 = outerStaticVariable;
			
			// 외부 클래스의 지역 변수에 접근 가능
			int liv3 = iv;
			
			// 외부 클래스의 지역 변수(상수)에 접근 가능
			int liv4 = LV;
			
		}
		// 메소드 내부에서 지역 클래스의 객체를 생성함
		LocalInner li = new LocalInner();		
	}
	
	
	
}



