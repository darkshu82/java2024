
public class Ex15 {
	
	public static void main(String args[]) {
		
		// 130 page
		int[][][] arrInt = new int[3][3][3];
		
		int value = 0;
		for(int i = 0; i <= 2; i++) {
			for(int j = 0; j <= 2; j++) {
				for(int k = 0; k <= 2; k++) {
					
					arrInt[i][j][k] = value++; 
					System.out.printf("%2d ", arrInt[i][j][k]); 
					
				} // for i
				System.out.println();
			} // for j
			System.out.println();
		} // for k
					
		
	} // main
} // class


