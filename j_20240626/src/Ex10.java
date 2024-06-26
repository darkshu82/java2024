import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {

    int[] score = { 90, 80, 60, 100 };
    int totalScore = 0;
    double average = 0;

    for (int i = 0; i < score.length; i++) {
      totalScore += score[i];
    }
    average = totalScore / (double) score.length;

    System.out.println("합계 점수 : " + totalScore);
    System.out.println("평균 점수 : " + average);
    System.out.println("\n-------------------------------------");

    Scanner sc = new Scanner(System.in);
    System.out.print("과목의 수를 입력해주세요 : ");
    
    int subject = sc.nextInt();
    
    int[] score2 = new int[subject + 1];
    
    average = 0;
    
    for(int i = 0; i < score2.length - 1; i++) {
      System.out.printf("%d 번째 성적을 입력해주세요 : ", i + 1);
      score2[i] = sc.nextInt();
      score2[score2.length-1] += score2[i];
    }
    
    average = score2[score2.length-1] / (double) (score2.length - 1);
    
    System.out.printf("총점 : %d점, 평균 : %.2f 점", score2[score2.length-1], average);    
    
    System.out.println("\n-------------------------------------");
    
    int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] num2 = new int[10];
    
    System.out.print("num1 : ");
    for(int i = 0; i < num1.length; i++) {
      System.out.print(num1[i] + " ");
    }
    System.out.println("\n-------------------------------------");
    
    for(int i = 0; i < num2.length; i++) {
      num2[i] = num1[i] * num1[i];
    }
    
    System.out.print("num2 : ");
    for(int i = 0; i < num2.length; i++) {
      System.out.print(num2[i] + " ");
    }
    
    
    
    
    
    
    
    

  }
}
