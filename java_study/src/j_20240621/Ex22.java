package j_20240621;

public class Ex22 {
	
	public static void main(String args[]) {
		
		// 100 page : do ~ while 문
		// while 문은 조건식이 참일 때부터 반복을 시작함
		//                     거짓일 때 반복을 종료함
		// do ~ while 문은 do 블럭에 있는 code 가
		//                 조건식이 참이든 거짓이든 관계없이
		//                 일단 한 번 실행됨
		//                 그 후에는 조건식이 참인 동안 반복되다가
		//                 거짓일 때 반복을 종료함
		// 형식
		// do {
		//     실행문.....
		//     실행문.....
		//     실행문.....
		// }while(조건식);
		
    int sum = 0;
    int i = 1;
    
    do { // 조건식이 참이든 거짓이든 무조건 한 번 실행함
    	sum += i; 
    	i++;
    }while(i <= 100);
    System.out.printf("1부터 %d까지의 합 : %d\n", i-1, sum);
    		
    System.out.printf("===============================\n");
    
    // 101 page
    int num = 200;
    do {
    	System.out.println("do ~ while 문");
    	System.out.println("num : " + num);
    }while(num < 10);
    
    System.out.printf("===============================\n");
    while(num < 10) {
    	System.out.println("while 문");
    	System.out.println("num : " + num);
    }
    
	}

}







