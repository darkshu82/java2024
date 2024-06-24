import java.util.Arrays;

public class Ex08 {
	public static void main(String args[]) {
		
		int[] numbers;
		numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		System.out.println("numbers : " + numbers);
		System.out.println("numbers의 길이 : " + numbers.length);
		System.out.println("numbers[0] : " + numbers[0]);
		System.out.println("numbers[1] : " + numbers[1]);
		System.out.println("numbers[2] : " + numbers[2]);
		System.out.println("numbers[3] : " + numbers[3]);
		System.out.println("numbers[4] : " + numbers[4]);		
		
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("numbers[%d] : %d%n", i, numbers[i]);
		}
		
		System.out.println("numbers : " + Arrays.toString(numbers));
		
		System.out.print("numbers : [");
		for(int i = 0; i < numbers.length; i++) {
			if( i != numbers.length -1) {
				System.out.print(numbers[i] + ", ");
			} else {
				System.out.print(numbers[i]);
			}
		}
		System.out.print("]");
		
		//1차원 배열
		int[] number1 = new int[] {10, 20, 30, 40, 50};
		//2차원 배열
		int[][] numbers2 = new int[][] {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		
		//선언과 초기화를 동시에 할 경우 new String[]을 생략 가능. 
		String[] arrStr = new String[] {"홍길동", "이순신", "김유신"};
		
		
		
	}
}
