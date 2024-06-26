package j_20240626;

public class Ex09 {
	
	public static void main(String[] args) {
		
		// 111 page : 5 장 연습문제
		
		// 1 번 : 1부터 100까지의 정수 중에서 5의 배수의 합
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 5 == 0) {
				sum += i;
				System.out.printf("i : %d, sum : %d%n", i, sum);
			}
		}
		System.out.println("============================================================");
		System.out.println("1부터 100까지의 정수 중에서 5의 배수의 합 : " + sum);	
		System.out.println("============================================================");
		
		sum = 0;
		for(int i = 5; i <= 100; i+=5) {
				sum += i;
				System.out.printf("i : %d, sum : %d%n", i, sum);
		}
		System.out.println("============================================================");
		System.out.println("1부터 100까지의 정수 중에서 5의 배수의 합 : " + sum);
		System.out.println("==2=========================================================");
		
		
		// 2 번 : 1부터 100까지의 짝수와 홀수의 합을 각각 구하기
		// 짝수의 합을 저장하는 변수 : sum1
		// 홀수의 합을 저장하는 변수 : sum2
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum1 += i;
			}else {
				sum2 += i;
			}
		}
		System.out.println("짝수의 합 : " + sum1);
		System.out.println("홀수의 합 : " + sum2);
		
		System.out.println("\n==3=========================================================");
		
		for(int x = 1; x <= 6; x++) {
			for(int y = 1; y <= 6; y++) {
			   if(x + y == 6) {
			  	 System.out.printf("%d + %d = 6%n", x, y);
			   }
			}		
		}
		
		System.out.println("\n==4=========================================================");
		
		/*
		［실행 결과］
      *
      **
      ***
      ****
      *****
		*/
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("\n==5=========================================================");
		
		/*
		［실행 결과］
      *****
      ****
      ***
      **
      *
		*/
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("\n==5=========================================================");
		
		/*
		［실행 결과］
          *
         ***
        *****
       *******
      *********
		*/
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < (2*i + 1) ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n==6=========================================================");
		
		int count = 0;
		while(true) {
			count++;
			int dice =(int)(Math.random() * 6) + 1;
			System.out.println("(" + dice + ")");
			if(dice == 6) { break; }
		}
		System.out.printf("총 주사위 굴린 횟수는 : %d 회\n", count);
		
	}

}
