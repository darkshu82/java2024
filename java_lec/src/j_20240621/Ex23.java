package j_20240621;

public class Ex23 {
	
	public static void main(String args[]) {
		
		// 중첩 for 문 (nested for loop)
		/*
		    구 구 단
		    
		    단수(2 ~ 9)  X  곱하는수(1 ~ 9)
		    일정함          반복됨
		    외부 for 문     내부 for 문
		*/
		 for(int dan = 2; dan <= 9; dan++) {
		   // 단수 출력하기
			 System.out.printf("-- %d 단 --%n", dan);
			 for(int number = 1; number <= 9; number++) {
				 // 곱셈 출력하기
				 System.out.printf("%d X %d = %d%n", dan, number, dan * number);
			 }
			 System.out.println();
		 }
		
		
	}
	
}
