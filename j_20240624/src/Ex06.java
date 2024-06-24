
public class Ex06 {
	public static void main(String[] args) {
		for(int x = 2; x <= 9; x++) {
			for(int y = 1; y <= 9; y++) {
//				if (y == 4) { break; }
				System.out.printf("%d X %d = %d%n", x, y, x * y);
				if (y == 3) { break; }
			}
			System.out.println();
		}
		
		//5단까지만 출력
		System.out.println("=================================================");
		for(int x = 2; x <= 9; x++) {
			if (x == 6) { break; }
			for(int y = 1; y <= 9; y++) {
				System.out.printf("%d X %d = %d%n", x, y, x * y);
			}
			System.out.println();
		}
		
		// 5단까지만 출력 레이블 사용
		System.out.println("=================================================");
		target: for(int x = 2; x <= 9; x++) {
			for(int y = 1; y <= 9; y++) {
				if (x == 6) { break target;}
				System.out.printf("%d X %d = %d%n", x, y, x * y);
			}
			System.out.println();
		}
		
	}
}