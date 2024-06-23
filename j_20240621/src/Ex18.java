import java.util.Scanner;

public class Ex18 {
	
	public static void main(String args[]) {
	  Scanner scanner = new Scanner(System.in);
	  
	  System.out.print("성적을 입력해주세요 (0 ~ 100): ");	  	  
		int score = scanner.nextInt();	
	  
		if(0 <= score && score <= 100) {
	    char grade = getGrade(score);
	    char plMi = getPlusMinus(score, grade);
	    
	    System.out.printf("당신은 %c%c 학점입니다.", grade, plMi);
	  } else {
	    System.out.println("성적을 올바르게 입력해 주세요.");
	  }
		
		scanner.close();
	}  
  public static char getGrade(int score) {
    switch(score / 10) {
    case 10: case 9: return 'A';
    case 8: return 'B';
    case 7: return 'C';
    case 6: return 'D';
    default: return 'F';
    }
  }
  
  public static char getPlusMinus(int score, char grade) {
    if (grade == 'F') return ' ';
    
    int lastDigit = score % 10;
    if(lastDigit >= 8) return '+';
    else if (lastDigit >= 4) return '0';
    else return '-';
    }		  
}
