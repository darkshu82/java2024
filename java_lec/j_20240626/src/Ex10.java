import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		// 142 page : 6 장 연습문제
		
		System.out.println("==3=========================================================");
		
		int[] score = {90,80,60,100};
		
		int totalScore = 0;
		double average = 0;
		
		for(int i = 0; i < score.length; i++) {
			totalScore += score[i];
		}
		average = totalScore / (double)score.length;
		
		System.out.printf("총점 : %d점, 평균 : %.2f 점\n", totalScore, average);
		
		System.out.println("\n==3-1=========================================================");
		
		// 4 과목의 성적인 경우
		// 과목 수 보다 하나 더 큰 배열을 생성해서
		// 총점은 마지막 index 에 저장하기
		Scanner sc = new Scanner(System.in);
		System.out.print("과목의 수를 입력하세요 : ");
    int subject = sc.nextInt();
		
		int[] score2 = new int[subject+1];
    
		average = 0;
		
		for(int i = 0; i < score2.length-1; i++) {
			System.out.printf("%d 번째 성적을 입력하세요 : ", i+1);
			score2[i] = sc.nextInt();
			score2[score2.length-1] += score2[i];
		}
		average = score2[score2.length-1] / (double)score.length;
		
		System.out.printf("총점 : %d점, 평균 : %.2f 점", score2[score2.length-1], average);
		
		System.out.println("\n==4=========================================================");
		
		int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] num2 = new int[10];

		// num1 출력
		System.out.print("num1 : ");
		for(int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
		System.out.println("\n-------------------------------------");
		
		// num2 입력
		for(int i = 0; i < num2.length; i++) {
			num2[i] = num1[i] * num1[i];
		}
		
		// num2 출력
		System.out.print("num2 : ");
		for(int i = 0; i < num2.length; i++) {
			System.out.print(num2[i] + " ");
		}
		System.out.println("\n-------------------------------------");
		
		
		
		
		
		
		
		
		
		
	}

}
