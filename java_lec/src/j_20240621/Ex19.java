package j_20240621;

public class Ex19 {
	
	public static void main(String args[]) {
		
		// switch 문
		int score = 95;
		char grade = ' ';
		char plusMinus = ' ';
		
		if (0 <= score && score <= 100) {
  		switch(score/10) {
  		  case 10: case 9:
  		  	grade = 'A'; 
  		  	if (98 <= score) {
    				plusMinus = '+';
    			} else if (94 <= score) {
    				plusMinus = '0';
    			} else {
    				plusMinus = '-';
    			} 
  		  	break;
  		  case 8:
  		  	grade = 'B';
  		  	if (88 <= score) {
    				plusMinus = '+';
    			} else if (84 <= score) {
    				plusMinus = '0';
    			} else {
    				plusMinus = '-';
    			} 
  		  	break;	
  		  case 7:
  		  	grade = 'C';
  		  	if (78 <= score) {
    				plusMinus = '+';
    			} else if (74 <= score) {
    				plusMinus = '0';
    			} else {
    				plusMinus = '-';
    			} 
  		  	break;	
  		  case 6:
  		  	if (68 <= score) {
    				plusMinus = '+';
    			} else if (64 <= score) {
    				plusMinus = '0';
    			} else {
    				plusMinus = '-';
    			} 
  		  	grade = 'D';
  		  	break;	
  		  default:
  		  	grade = 'F';
  		}
  		System.out.printf("당신은 %c%c 학점입니다%n", grade, plusMinus);
		
		}else {
			System.out.printf("성적을 올바르게 입력해 주세요");
		}
	}

}
