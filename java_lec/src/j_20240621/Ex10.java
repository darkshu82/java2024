package j_20240621;

public class Ex10 {
	
	public static void main(String args[]) {
		
		// 72 page
		// Integer.toBinaryString(3) : 10 진수를 2 진수로 바꿔서 문자열로 출력함
		System.out.println(Integer.toBinaryString(3));
		System.out.println(Integer.toBinaryString(64));
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toBinaryString(5));
		
	    // 비트 연산자 : & / | / ^ (XOR) / ~ (NOT)
		
			// 0 0 1 0 (2)
			int num1 = 2;
			// 0 0 1 1 (2)
			int num2 = 3;
			
			int result = num1  & num2;
			// & : 모두 1 일 때만 1
			System.out.println("result : " + result);
			
			result = num1 | num2;
			// & : 모두 0 일 때만 0
			System.out.println("result : " + result);
			
			result = num1 ^ num2;
			// ^ : 1 이 하나 있을 때 1
			System.out.println("result : " + result);
			
		  result = ~num1  & num2;
			// & : 모두 1 일 때만 1
			System.out.println("result : " + result);
			
			
			// 3 에 ~ 비트연산자 사용한 경우
			System.out.println("~3 : " + ~3);
			
			System.out.println("============================");
			
			System.out.println(Integer.toBinaryString(3));
			System.out.println(Integer.toBinaryString(~3));
			System.out.println(Integer.toBinaryString(3).length());
			System.out.println(Integer.toBinaryString(~3).length());
			
			// 2147483647
			System.out.println(Integer.MAX_VALUE);
			// -2147483648
			System.out.println(Integer.MIN_VALUE);
			
		  // 2147483646
      System.out.println(Integer.MAX_VALUE - 1);
      
      // Integer.parseInt(문자열) : 문자열을 정수(Integer)로 변환함

      // 2 진수 1100 을 10 진수로 변환함
      System.out.println(Integer.parseInt("1100", 2));
      System.out.println(Integer.parseInt("1010", 2));
      System.out.println(Integer.parseInt("0010", 2));
      System.out.println(Integer.parseInt("0101", 2));
      
      // 16 진수 A 를 10 진수로 변환함
      System.out.println(Integer.parseInt("A", 16));
      // 8 진수 12 를 10 진수로 변환함
      System.out.println(Integer.parseInt("12", 8));
      
      
      
      
      
      
      
      
	}

}



