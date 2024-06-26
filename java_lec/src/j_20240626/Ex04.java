package j_20240626;

public class Ex04 {
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		System.out.println("------------------------------------------");
		
		System.out.println("init1 객체 생성 - InitEx() 생성자 호출 ");
		InitEx init1 = new InitEx();
		System.out.println("------------------------------------------");
		
		System.out.println("init2 객체 생성 - InitEx() 생성자 호출 ");
		InitEx init2 = new InitEx();
		
		System.out.println("------------------------------------------");
		System.out.println("프로그램 종료");
	}

}

class InitEx{
	
	static int number1 = 1;
	int number2 = 20;
  
	// static 초기화 블럭
	// 단 한 번만 실행됨
	static  { 
		System.out.println("static 초기화 블럭");
		System.out.println("InitEx.number1 : " + InitEx.number1);
		number1 = 3;
		System.out.println("InitEx.number1 : " + InitEx.number1);
		// static 초기화 블럭에서는 instance 멤버변수에 접근 못함
		// number2 = 50;
  	// static 초기화 블럭에서는 instance 멤버변수에 접근 못함
		// System.out.println("InitEx.number1 : " + InitEx.number2);
	}
	
	// instance 초기화 블럭
	// 객체가 생성될 때마다 계속 실행됨
	{ 
	  // instance 멤버변수는 클래스이름으로 접근하지 못함
		// System.out.println("InitEx.number1 : " + InitEx.number2);
		System.out.println("instance 초기화 블럭");
		/*
		  instance 초기화 블럭 에서는
		  static 멤버변수, instance 멤버변수 모두 접근할 수 있음
		*/
		System.out.println("InitEx.number1 : " + InitEx.number1);
		System.out.println("InitEx.number2 : " + number2);
		number1 = 4;
		number2 = 50;
		System.out.println("InitEx.number1 : " + InitEx.number1);
		System.out.println("InitEx.number2 : " + number2);
	}
	
	InitEx(){ 
		System.out.println("InitEx() 생성자");
		/*
  	  생성자 에서는
  	  static 멤버변수, instance 멤버변수 모두 접근할 수 있음
  	*/
		System.out.println("InitEx.number1 : " + InitEx.number1);
		System.out.println("InitEx.number2 : " + number2);
		number1 = 5;
		number2 = 60;
		System.out.println("InitEx.number1 : " + InitEx.number1);
		System.out.println("InitEx.number2 : " + number2);
	}
	
}







