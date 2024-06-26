package j_20240621;

public class Ex15 {
	
	public static void main(String agrs[]) {
		
		// 88 ~ 89 page
		
		int score = 80;
		String grade = "";
		
		System.out.println("학점 부여 시작");
		
		if (score >= 95 ) {
			grade = "A+";
		} else if (score >= 90 ) {
			grade = "A";
		} else if (score >= 85 ) {
			grade = "B+";
		} else if (score >= 80 ) {
			grade = "B";
		} else if (score >= 75 ) { 
			grade = "C+";
		} else if (score >= 70 ) {
			grade = "C";
		} else if (score >= 60 ) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("당신의 학점은 " + grade + " 학점입니다");
		System.out.println("학점 부여 끝");
	}

}
