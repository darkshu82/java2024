
public class Ex02 {
	
	public static void main(String args[]) {
		
		// 세 과목의 총점과 평균 출력하기
		int kor  = 91;
		int math = 90;
		int eng  = 90;
		
		int total = kor + math + eng;
		
		// int type 공간에서는 소숫점 이하 data 를 표현하지 못함
		// int average = total / 3;
		// double type 공간에서는 소숫점 이하 data 를 표현함
		// int type 이하의 data type 들이 연산할 때
		// 모든 피연산자의 data type 이 int type 으로 자동 형변환됨
		// int type 보다 큰 피연산자가 있는 경우에는
		// 모든 피연산자의 data type 이 가장 큰 data type 으로 자동 형변환됨
		double average;		
		// average = total / 3;
		average = (double)total / (double)3;
		average = (double)total / 3;
		average = total / (double)3;
		average = total / 3D;
		
		System.out.println("총점 : " + total + " 점, 평균 : " + average + " 점");
		
		System.out.printf("총점 : %d 점, 평균 : %f 점%n", total, average);
		
		// 소숫점 이하 둘 째자리까지 출력 : %.2f
		// 소숫점 이하 네 째자리까지 출력 : %.4f
		// 소숫점 이하 열 째자리까지 출력 : %.10f
		System.out.printf("총점 : %d 점, 평균 : %.2f 점%n", total, average);
		
		
		// (소숫점 포함)전체 자릿수는 10 자리, 소숫점 이하 둘 째자리까지 출력
		// : %10.2f  - 오른쪽 정렬
		// : %-10.2f - 왼쪽 정렬
		System.out.printf("총점 : %d 점, 평균 : %10.2f 점%n", total, average);
		System.out.printf("총점 : %d 점, 평균 : %-10.2f 점%n", total, average);
	}
}









