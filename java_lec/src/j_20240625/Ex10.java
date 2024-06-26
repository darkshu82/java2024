package j_20240625;

public class Ex10 {
	
	/*
	   식별자 (identifier)  <-- 변수 / 메소드 / 클래스
	   (이름(표) : name)
	   
	   
	*/
	
	public static void main(String args[]) {
		
		// 160 page : 메소드(클래스 안에 작성한 함수)
		/*
		   1) parameter (X)  -  return 값 (X)
		   2) parameter (O)  -  return 값 (X)
		   3) parameter (X)  -  return 값 (O)
		   4) parameter (O)  -  return 값 (O)
		*/
		// 1) parameter (X)  -  return 값 (X)
		sayHello();
		
		// 2) parameter (O)  -  return 값 (X)
		addTwoNumber(100, 200);
		
  	// 3) parameter (X)  -  return 값 (O)
		String str1 = sayHello2();
		System.out.println("sayHello2() : " + sayHello2());
		System.out.println("str1 : " + str1);
		
		// 4) parameter (O)  -  return 값 (O)		
		double resultNumber = addNumbers(10, 23.56, 20);
		System.out.println("addNumbers(10, 23.56, 20) : " + addNumbers(10, 23.56, 20));
		System.out.println("resultNumber : " + resultNumber);
	}
	// 메소드 정의부(definition)
	// 1) parameter (X)  -  return 값 (X)
	public static void sayHello() {  // 선언부 : signature (declaration)
		// { } <-- body : 구현부 / 몸통 
		System.out.println("안녕하세요, 여러분 !!!");
		return;
	}

	// 2) parameter (O)  -  return 값 (X)
	public static void addTwoNumber(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("result : " + result);
		return;
	}
	
	// 3) parameter (X)  -  return 값 (O)
	public static String sayHello2() {
		String greeting = "안녕하세요, 반갑습니다";
		System.out.println("greeting : " + greeting);
		return greeting;
	}
	
	// 4) parameter (O)  -  return 값 (O)
	public static double addNumbers(int n1, double d1, int n2) {
		double result = n1 + d1 + n2;
		return result;
	}

	/*
	   접근제한자 : access modifier
	   
	   public > protected > default > private
	   
	   public    : 접근제한이 없음 - 어디서나 접근할 수 있음
	               적용대상 : 클래스 / 멤버변수 / 생성자 / 메소드
	               
	   protected : 상속관계인 경우, 같은 package 안에서는 모두 접근 가능
	               적용대상 : 멤버변수 / 생성자 / 메소드
	               
	   default   : 같은 package 안에서는 모두 접근 가능
	               적용대상 : 클래스 / 멤버변수 / 생성자 / 메소드
	               
	   private   : 같은 class 안에서만 접근 가능
	               적용대상 : 멤버변수 / 생성자 / 메소드
	*/
	
	
}








