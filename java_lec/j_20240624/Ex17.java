
public class Ex17 {
	
	public static void main(String args[]) {
		
		// 135 page
		// 향상된 for 문 : advanced for loop
		/* 
		  형식
		  
		  for(타입 변수 : 배열변수){
		    System.out.printf("%d ", 변수);
		  }
		  
		*/
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
    for(int i = 0; i < numbers.length; i++) {
    	System.out.printf("numbers[%d] : %d%n", i, numbers[i]);
		}    
		System.out.println("\n--------------------------");
	  
		int idx = 0;
		for(int number : numbers){
			System.out.printf("numbers[%d] : %d%n", idx, numbers[idx]);
			idx++;
	  }
		System.out.println("\n--------------------------");
		
		for(int number : new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}){
			System.out.printf("%d ", number);
		}
		System.out.println("\n--------------------------");
		
	}

}
