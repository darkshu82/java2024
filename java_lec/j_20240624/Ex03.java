import java.util.Scanner;

// 80 page
// 4 장 연습문제 5 번

public class Ex03 {
  public static void main(String args[]) {
  	/*
    	1. 연도를 4로 나누어 떨어지면 윤년,
      2. 100으로 나누어 떨어지는 연도는 윤년이 아님
      3. 400으로 나누어 떨어지면 윤년
      
      int year;
      
      윤년 : 
      4로 나누어 떨어지고 100 으로 나누어 떨어지지 않거나 400으로 나누어 떨어지는 년도
      
       year % 4 == 0   &&  year % 100 != 0       ||        year % 400 == 0
      
  	*/

  	Scanner sc = new Scanner(System.in);
  	System.out.print("년도를 입력하세요 : ");
  	
  	int year = sc.nextInt();
  	
  	boolean leapYear = year % 4 == 0  &&  year % 100 != 0 || year % 400 == 0;
  	
  	// 삼항 연산자
  	String result = leapYear ? "윤년" : "평년";
  	
  	System.out.printf("%d 년은 %s 입니다\n", year, result);
  	
  	
  	
  }
}
