
public class Ex22 {
	public static void main(String args[]) {
//		while문은 참일때부터 반복을 시작함.
//							거짓일 때 반복을 종료함.
//		do ~ while문은 일단 실행함.
		
		int sum = 0;
		int i = 1;
				
		do {
			sum += i;
			i++;
		}while(i <= 100);
		System.out.printf("1부터 %d까지의 합 : %d%n", i-1, sum);
		
		System.out.printf("==============================\n");
		
		int num = 10;
		do {
			System.out.println("do ~ while문");
			System.out.println("num :" + num);
		}while(num < 10);
		
		
		
}
