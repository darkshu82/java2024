package j_20240621;

public class Ex24 {
	
	public static void main(String args[]) {
		
		// 106 page : break, continue
		/*
		  break : (반복문 내에서)
		          이후의 code 를 실행하지 않고
		          반복을 종료함
		  
		  continue :  (반복문 내에서)
    		          이후의 code 를 실행하지 않고
    		          반복을 건너뜀 
    		          (건너뛰고 남은 반복을 계속함)
		*/
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n------------------------");
		
		for(int i = 1; i <= 10; i++) {
			if(i == 5) { break; }
			System.out.print(i + " ");
		}
		System.out.println("\n------------------------");
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			if(i == 5) { break; }
		}
		System.out.println("\n------------------------");

		for(int i = 1; i <= 10; i++) {
			if(i == 5) { continue; }
			System.out.print(i + " ");
		}
		System.out.println("\n------------------------");
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			if(i == 5) { continue; }
		}
		System.out.println("\n------------------------");
		
		
		
		
	}

}



