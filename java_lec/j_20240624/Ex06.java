
// 107 page

public class Ex06 {
	
	public static void main(String args[]) {
		
		// 각 단에 3 까지만 곱하는 구구단을 출력하세요
		// dan 에 대한 조건인지
		// number 에 대한 조건인지 파악함

		for(int dan = 2; dan <= 9; dan++) {
			for(int number = 1; number <= 9; number++) {
				// if (number == 4) { break; }
				System.out.printf("%d X %d = %d\n", dan, number, dan*number);
				if (number == 3) { break; }
			}
			System.out.println();
		}
		System.out.println("================================");
		
		// 5 단까지만 출력하는 구구단을 작성하세요
		for(int dan = 2; dan <= 9; dan++) {
			if (dan == 6) { break; }
			for(int number = 1; number <= 9; number++) {
				System.out.printf("%d X %d = %d\n", dan, number, dan*number);
			}
			System.out.println();
		}
		System.out.println("================================");
		
		
		// 5 단까지만 출력하는 구구단을 작성하세요
		for(int dan = 2; dan <= 9; dan++) {
			for(int number = 1; number <= 9; number++) {
				System.out.printf("%d X %d = %d\n", dan, number, dan*number);
			}
			if (dan == 5) { break; }
			System.out.println();
		}
		System.out.println("================================");
		
		
		// 5 단까지만 출력하는 구구단을 작성하세요
		for(int dan = 2; dan <= 5; dan++) {
			for(int number = 1; number <= 9; number++) {
				System.out.printf("%d X %d = %d\n", dan, number, dan*number);
			}
			System.out.println();
		}
		System.out.println("================================");
		

		// 5 단에서 1까지만 곱하는 구구단을 작성하세요
		for(int dan = 2; dan <= 9; dan++) {
			for(int number = 1; number <= 9; number++) {
				System.out.printf("%d X %d = %d\n", dan, number, dan*number);
				if (dan == 5) { break; }
			}
			System.out.println();
		}
		System.out.println("================================");
		
	  // 5 단만 건너뛰고 출력하는 구구단을 작성하세요 : break
		for(int dan = 2; dan <= 9; dan++) {
			for(int number = 1; number <= 9; number++) {
				if (dan == 5) { break; }
				System.out.printf("%d X %d = %d\n", dan, number, dan*number);
			}
			System.out.println();
		}
		System.out.println("================================");
		
		// 5 단만 건너뛰고 출력하는 구구단을 작성하세요 : continue
		for(int dan = 2; dan <= 9; dan++) {
			if (dan == 5) { continue; }
			for(int number = 1; number <= 9; number++) {
				System.out.printf("%d X %d = %d\n", dan, number, dan*number);
			}
			System.out.println();
		}
		System.out.println("================================");
		
		// 108 page - label 이 있는 break
		// 4 단까지만 출력하는 구구단을 작성하세요 : break
		target: for(int dan = 2; dan <= 9; dan++) {
			for(int number = 1; number <= 9; number++) {
				// 4 단까지만 출력됨
				if (dan == 5) { break target; }
				System.out.printf("%d X %d = %d\n", dan, number, dan*number);
			}
			System.out.println();
		}
		System.out.println("================================");
		
		// 108 page - label 이 있는 break
		// 5 단까지만 출력하는 구구단을 작성하세요 : break
		target: for(int dan = 2; dan <= 9; dan++) {
			for(int number = 1; number <= 9; number++) {
				System.out.printf("%d X %d = %d\n", dan, number, dan*number);
				// 5 X 1 = 5 까지는 출력이 됨
				if (dan == 5) { break target; }
			}
			System.out.println();
		}
		System.out.println("================================");
		
	}

}








