package j_20240620;

public class Ex02 {
	
	public static void main(String args[]) {
		
		// 40 page
		/* 
		  변수를 선언한다는 의미 : 변수를 메모리에 올린다는 의미
		  JAVA 는 변수이름 앞에 반드시 자료형을 써주고 선언해야 함
		  
		  자료형 변수이름;
		   ㄴ 메모리 공간에 자료형에 해당하는 공간을 확보하고
		      그 공간에 변수이름을 붙인다는 의미
		  
		  int number1;
		   ㄴ int 라는 공간을 확보하고 
		      이 공간에 number1 이라는 이름표를 붙임
		  
		*/
		// 1), 2) 변수의 선언과 초기화를 분리함
		// 1) 자료형 변수이름;
		int number1;
		
		// 2) 변수이름=초깃값 (변수를 초기화함);
		number1 = 10;
		
		// 3) 변수의 선언과 초기화를 동시에 함
		// 3) 자료형 변수이름=초깃값 (변수를 초기화함);
		int number2 = 20;
		
		// 같은 data type 의 변수를 여러 개 선언하는 경우
		// int num1; int num2; int num3; int num4; int num5;  
		int num1, num2, num3, num4, num5;
		
  	// 같은 data type 의 변수 여러 개의 
		// 선언과 초기화를 동시에 하는 경우
		int num6=6, num7=7, num8=8, num9=9, num10=10;
		
		// 같은 data type 의 변수 여러 개 중 
		// 일부는 선언만 하고
		// 일부는 선언과 초기화를 동시에 하는 경우
		int num11, num12=12, num13, num14, num15=15;
		
		System.out.println("===========================================");
		
		int figure1 = 111;
		System.out.println("figure1 : " + figure1);
		
		figure1 = 222;
		System.out.println("figure1 : " + figure1);
		
		figure1 = 333;
		System.out.println("figure1 : " + figure1);
		
		figure1 = 123456;
		System.out.println("figure1 : " + figure1);
		
		// final 키워드를 사용해서 변수를 선언하면
		// 상수가 됨 <-- 프로그램 실행 중에 변하지 않는 값
		// 상수는 선언과 초기화를 동시에 해야 하며
		// 두 번째부터는 값을 할당할 수 없음
		final int FIGURE2 = 200;
		System.out.println("FIGURE2 : " + FIGURE2);
		
		// 상수는 두 번째부터는 값을 할당할 수 없음
		// 상수는 대문자로 표기함
		// FIGURE2 = 300;
		
		// 일반 변수 : camel case (O)  
		int studentNumber1;
		
		// 상수 : SNAKE CASE (O)
		final int STUDENT_NUMBER2;
		
		
	} // main

} // class
