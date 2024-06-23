
public class Ex02 {
	public static void main(String args[]) {
		int kor  = 91;
		int math = 90;
		int eng  = 90;
		
		int total = kor + math + eng;
				
		double average;
		average = (double)total / (double)3;
		average = (double)total / 3;
		average = total / (double)3;
		average = total / 3D;
		
		System.out.println("총점 : " + total + " 점, 평균 : " + average + " 점");
		System.out.printf("총점 : %d 점, 평균 : %f 점%n", total, average);
		System.out.printf("총점 : %d 점, 평균 : %.2f 점%n", total, average);		
	}	
}









