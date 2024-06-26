package j_20240621;

public class Ex12 {
	
	public static void main(String args[]) {
		
		// 75 page
		// 형식
		// 조건식 ? 참일때반환값(연산식) : 거짓일때반환값(연산식)
		
		int number = 12;
		String result = number % 2 == 0 ? "짝수" : "홀수";
		System.out.println("result : " + result);
		
		int score = 80;
		String pass = score >= 60 ? "합격" : "불합격";
		System.out.println("pass : " + pass);
		
	}

}
