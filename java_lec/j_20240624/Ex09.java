
public class Ex09 {

	public static void main(String args[]) {
		
		// 121 page
		/*
  	  크기가 100인 int 일차원 배열을 생성하고
  	  1 ~ 100 까지 저장하고 출력하세요
  	*/
		int[] numbers = new int[100];
		
		// numbers 배열에 저장된 item 출력하기
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n===========================");
		
		// numbers 배열에 1 부터 100까지 저장과 동시에 출력하기
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n===========================");
		
		/*
		  크기가 20인 int 일차원 배열을 생성하고
		  21 ~ 40 까지 저장하고 출력하세요
		*/
		int[] nums = new int[20];
		
		int count = 21;
		for(int i = 0 ; i < nums.length; i++) {
			nums[i] = count + i;
			System.out.print(nums[i] + " ");
		}
		System.out.println("\n===========================");
		
		
		// 122 page
		// Math.random() : 0 부터 1 미만의 실수를 반환함
		
		/*
		  Math.random() 을 사용해서 1 부터 10까지의 임의의 정수 출력하기
		  
		  0 ~ 0.999999...
		  0  <=  Math.random()  < 1
		  
		  0 ~ 9.99999...  
		  0 * 10  <=  Math.random() * 10 < 1 * 10
		  
		  0 ~ 9
		  (int)(0 * 10)  <=  (int)(Math.random() * 10) < (int)(1 * 10)
		  
		  1 ~ 10
		  (int)(0 * 10)+1  <=  (int)(Math.random() * 10) + 1 < (int)(1 * 10)+1 
		  
		*/
		
		//  1부터 ~ 10까지의 정수 중에서 임의의 정수 출력하기 
		System.out.println((int)(Math.random() * 10) + 1);
		
		//  1부터 ~ 100까지의 정수 중에서 임의의 정수 출력하기 
		System.out.println((int)(Math.random() * 100) + 1);
		
		//  1부터 ~ 50까지의 정수 중에서 임의의 정수 출력하기 
		System.out.println((int)(Math.random() * 50) + 1);
		
		//  1부터 ~ 5까지의 정수 중에서 임의의 정수 출력하기 
		System.out.println((int)(Math.random() * 5) + 1);
		
		//  1부터 ~ 45까지의 정수 중에서 임의의 정수 출력하기 
		System.out.println((int)(Math.random() * 45) + 1);
		
		
		
		
	}
	
}

		
		
		
		