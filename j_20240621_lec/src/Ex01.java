
public class Ex01 {
	
	public static void main(String args[]) {
		
		// 51 page  형변환
		// 자동형변환(묵시적(암시적) 형변환)
		//   ㄴ 형변환 coding 을 하지 않아도 되는 것
		// 강제형변환(명시적 형변환)
		//   ㄴ 형변환 coding 을 해야 하는 것
		// 숫자형과 char type 들끼리 형변환이 가능함 
		// (boolean type 제외)
		// 숫자형 형변환은 크기만 고려하면 됨
		// 숫자형과 char type 과의 형변환은
		// 크기와 범위를 모두 고려해야 함
		
		// int number = 10;
		// wrapper class : 기본형 자료형을 참조형 자료형과 같이 사용하는 클래스
		Integer number = 10;
		
		// 자료형(data type) 확인하기
		System.out.println("number 의 data type  : " + number.getClass().getName());
		
		// 기본형 자료형 자료형 확인하기
		int number2 = 20;
		System.out.println("number2 의 data type : " + ((Integer)number).getClass().getName());
		
		
		// 자동 형변환 예시
		// int type 공간에 있는 data 를 double type 공간으로 옮겨담기
		//   ㄴ 더 큰 공간으로 옮겨담을 때는
		//      data 의 손실이 없어서 자동으로 형변환 됨
		//      형변환 표시를 해도 되고 안 해도 됨 (생략할 수 있음)
		// 형변환 표시를 생략하는 경우
		double dNumber = number2;
		// 형변환 표시를 하는 경우
		double dNumber2 = (double)number2;
		
		// 명시적(강제) 형변환
		//   ㄴ 더 큰 공간에 있던 data를 더 작은 공간으로 옮겨담을 때는
		//      data 의 손실이 있어서 자동으로 형변환 되지 않고
		//      형변환 표시를 해야 됨
		int number3 = (int)dNumber;
		
		
		
		
	}

}
