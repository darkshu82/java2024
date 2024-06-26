package j_20240624;

// 81 page
// 4 장 연습문제 7 번

public class Ex05 {
	
	public static void main(String args[]) {
		
		// 1234 -> 1200
		// 123 -> 100
		// 일의 자릿수 구하기 : number % 10
		// 십의 자릿수 구하기 : number % 100
		// 1234 / 100 <-- 12
		// (1234 / 100) * 100 <-- 1200
		
		int number = 1234;
		int result = (number / 100) * 100;
		System.out.println("result : " + result);
		
		number = 1234;
		result = number - (number % 100);
		System.out.println("result : " + result);
		
		number = 123;
		result = (number / 100) * 100;
		System.out.println("result : " + result);
		
		number = 123;
		result = number - (number % 100);
		System.out.println("result : " + result);
				
	}
}
