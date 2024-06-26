package j_20240621;

public class Ex09 {
	
	public static void main(String args[]) {
		
		// 71 page
		// 비트 연산자 : & / | / ^ (XOR) / ~ (NOT)
		
		// 1 0 1 0 (2)
		int num1 = 10;
		// 0 1 0 1 (2)
		int num2 = 5;
		
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
		
	}

}
