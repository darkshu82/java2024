package j_20240624;

// 79 ~ 80 page
// 4 장 연습문제 3 번

public class Ex01 {
	public static void main(String args[]) {
		int colorPen = 5 * 12;
		int studentCount = 27;
		
		// 학생 당 나눠가지는 색연필수
		int divColorPen = colorPen / studentCount;
		
		// 똑같이 나눠가지고 남은 색연필수
		int remainColorPen = colorPen % studentCount;
		
    System.out.println("학생 당 나눠가지는 색연필수     : " + divColorPen);		
    System.out.println("똑같이 나눠가지고 남은 색연필수 : " + remainColorPen);		
		
	}
}



