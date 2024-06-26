
public class Ex05 {
	
	public static void main(String[] args) {
		
		// 184 ~ 185 page
		
		
	}

}

class InitEx2{
	
	// static 변수
	static int cv;
	
	// instance 변수
	int iv;
	
  // static method 1
	public static void staticMethod1() {
		cv = 11;
		// static method 에서는 instance 를 사용 못함
		// iv = 22;
	  
	  staticMethod2();
	  
	  // static method 에서는 instance 를 사용 못함
	  // instanceMethod1();
	  // instanceMethod2();
	  
	  // static method 에서는 instance 를 사용 못함
	  // this 라는 키워드 자체를 사용 못함
	  // this 는 객체 생성 이후에야 생성된 객체의 주소를 저장함
	  // this.iv = 222;
	  
	}
	
	// static method 2
	public static void staticMethod2() { 
		
		/* 
		   static method 에서도 객체를 생성하면
		   instance 를 사용할 수 있음  
		*/
		InitEx2 init2 = new InitEx2();
		init2.iv = 111;
		init2.instanceMethod1();
		init2.instanceMethod2();

		
	}
	
	// instance method 1
	public void instanceMethod1() {
  	// instance method 에서는 static 도 사용할 수 있음
		cv = 11;
		iv = 22;
	  
	  // instance method 에서는 static 도 사용할 수 있음
	  staticMethod1();
	  staticMethod2();
	  
	  instanceMethod2();
	}
	
	// instance method 2
	public void instanceMethod2() { 
		
		// instance 초기화 블럭, 생성자, instance method 안에서만 
		// this 를 사용할 수 있음  <-- static 초기화 블럭이나 static 메소드에서는 사용 못함		
		this.iv = 333;
		iv = 555;
		
	  // instance method 에서는 static 도 사용할 수 있음
		cv = 777;
		// 객체에서 static 변수에 접근할 때는
		// this 나 참조변수 보다는 클래스 이름으로 접근하는 것이 바람직함
		this.cv = 999;
		InitEx2.cv = 1111;
		
	}
	
	
}





