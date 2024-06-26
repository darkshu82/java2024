package j_20240620;
/*
  41 page
  
  기본형 자료형 : primitive data type - 8 개
                  "값이 변수(이름표)가 붙은 공간에 직접 할당됨"
                  
  
  int number = 10;  <-- 10 이라는 정수형 값이
                         number 라는 이름표(변수)가 붙은 int type 공간에 할당됨
                         "값이 변수(이름표)가 붙은 공간에 직접 할당됨"                  
                  
  참조형 자료형 : reference data type - 개수를 알 수 없음
                  "값이 변수(이름표)가 붙은 공간에 직접 할당되지 않고
                   값은 값대로 별도의 메모리 공간에 올라가고(loading)
                   변수도 따로 메모리 공간에 올라감
                   이 변수 공간에는 실제 값이 올라간 
                   메모리 공간의 주소만 저장됨
                   참조형 자료형의 data 를 메모리 공간에 올릴 때는
                   new 연산자를 사용해서 공간을 확보하여 
                   참조형 자료형의 data 를 저장하고
                   변수에는 이 지점의 주소(값)만 저장됨"
                   
  String name = new String("더조은 학원");                   
  
  
                    
  < 기본형 자료형의 종류 > 

  논리형 : boolean type (1 byte)   
  
  문자형 : char type (o)  (2byte) :  0 ~ 2 ^ 8
           character type (x)
  
  숫자형 - 정수형 - byte  (1) :  -2 ^ 7 ~ 2 ^ 7-1  
                    short (2) :  -2 ^ 15 ~ 2 ^ 15-1  
          (integer) int   (4) :  -2 ^ 31 ~ 2 ^ 31-1  
                    long  (8) :  -2 ^ 63 ~ 2 ^ 63-1  
  
           실수형 - float (4) / double (8)    

*/
public class Ex03 {
	public static void main(String args[]) {
		
		// 42 page : 각 기본 자료형의 기본값들
		
		// java 에서 정수형의 기본 type 은 int type 으로 함
		// java 에서 long type 의 값을 할당하는 경우에는 
		// L이라는 접미사를 사용함 
		// (L 접미사를 사용하지 않으면 int type 으로 인식함)
		// byte / short / int / long : 0
		
		int number1 = 100;
		// int type : -2147483638 ~ 2147483647
		
		// int type 의 최댓값
		number1 = 2147483647;

		// int type 의 최솟값
		number1 = -2147483648;
		
		// number1 = -2147483649;
		
		// int type 의 범위를 벗어나는 값은 할당되지 않음
		// number1 = 2147483648;
		
		long number2 = 2147483648L;
		
		number2 = -2147483649l;
		
		// java 에서 실수형의 기본 type 은 double type 으로 함
		// java 에서 float type 의 값을 할당하는 경우에는
		// F 라는 접미사를 사용함
	  // (F 접미사를 사용하지 않으면 double type 으로 인식함)
		// float / double : 0.0
		
		double dNumber  = 3.14;
		dNumber  = 3.14D;
		
		float fNumber = 3.14F;
		
		// boolean  : false
		// char     : null 문자 (\u0000)
		
		// char type 은 기본값이  null 문자 (\u0000) 이지만
		// char type 을 code 상에서 초기화하는 경우에는 ' ' (공백문자) 로 초기화함
		
		char ch1 = ' ';
		// 빈문자라는 것은 없음
		// ch1 = '';
		// char ch2 = "  "; 
		
		// 참조형 자료형 (reference type) 의 기본값은 null 값임 (null 문자와는 다름)
		// String type 도 참조형 자료형 (reference type) 이라서 기본값이 null 값이지만
		//  ㄴ 문자열 type
		// String type 은 ""(빈문자열)로 초기화하는 경우가 많음
		
		// 문자 두 개로 된 문자열 
		String str1 = "  ";
		// 문자 하나로 된 문자열
		str1 = " ";
		// 빈문자열
		str1 = "";
		
		String str2 = null;
		String str3 = "";
		
		long l = 1000;
		long l2 = 1000L;
		
	}
}



