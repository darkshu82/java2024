
public class Ex09 {
	public static void main(String[] args) {
		
		int[] numbers = new int[100];
		
		for(int i = 0; i < numbers.length - 1; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n===================================");
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n===================================");
		
		numbers = new int[20];
		int count = 21;
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i + count;
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n===================================");
		
		// 122p Math.random() : 0부터 1미만의 실수를 반환함.
		
		int random = (int)(Math.random() * 10) + 1;
		System.out.println(random);
				
		int[] lotto =  new int[6];
		int idx = 0;
		while(true) {
			int number = (int)(Math.random() * 45) + 1;
			
			boolean insert = true;
			for(int i = 0; i <= idx; i++) {
				if(lotto[i] == number) {
					insert = false;
					break;
				}
			}
			if(insert == true) {
				lotto[idx] = number;
				idx++;
			}
			if(idx == 6) break;
		}
		
		System.out.print("당첨번호는 : [ ");
		for(int i = 0; i < lotto.length; i++) {
			if(i != lotto.length - 1) {
				System.out.print(lotto[i] + ", ");				
			} else {
				System.out.print(lotto[i]);	
			}
		}
		System.out.print(" ]");
	}
}
