package j_20240621;

public class Ex16 {
	
	public static void main(String args[]) {
		
		// 성적에 따른 학점 출력
		int score = 83;
		char grade = ' ';
		char plusMinus = ' ';
		
		if(0 <= score && score <= 100) {
  		if (90 <= score) {
  			grade = 'A';
  			if (98 <= score) {
  				plusMinus = '+';
  			} else if (94 <= score) {
  				plusMinus = '0';
  			} else {
  				plusMinus = '-';
  			} 
  		} else if (80 <= score) {
  			grade = 'B';
  			if (88 <= score) {
  				plusMinus = '+';
  			} else if (84 <= score) {
  				plusMinus = '0';
  			} else {
  				plusMinus = '-';
  			} 
  		} else if (70 <= score)  {
  			grade = 'C';
  			if (78 <= score) {
  				plusMinus = '+';
  			} else if (74 <= score) {
  				plusMinus = '0';
  			} else {
  				plusMinus = '-';
  			} 
  		} else if (60 <= score)  {
  			grade = 'D';
  			if (68 <= score) {
  				plusMinus = '+';
  			} else if (64 <= score) {
  				plusMinus = '0';
  			} else {
  				plusMinus = '-';
  			} 
  		} else {
  			grade = 'F';
  		}
  		System.out.printf("당신은 %c%c 학점입니다", grade, plusMinus);
		}else {
			System.out.println("성적을 올바르게 입력해 주세요");
		}
		
		
		
		
	}

}
