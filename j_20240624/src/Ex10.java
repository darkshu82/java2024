import java.util.Arrays;

public class Ex10 {
	public static void main(String[] args) {
		
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
		
		Arrays.sort(lotto);
		
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
