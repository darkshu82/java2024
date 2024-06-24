
public class Ex13 {
	
	public static void main(String args[]) {
		
		// 76 page
		/*
		    문자열 + any type = 문자열
		    any type + 문자열 = 문자열
		*/
		
		System.out.println("10 + 20 = 30");
		System.out.println("10 + 20 = " + 10 + 20);
		System.out.println("10 + 20 = " + (10 + 20));
		
		// 147
		System.out.println(7 + 7 + "7");
		// 777
		System.out.println(7 + "7" + 7);
		
		System.out.println("=====================================");
		
		
		String name = "홍길동";
		System.out.println("안녕하세요 " + name + " 입니다");
		
		int height = 180;
		System.out.println("저의 키는 " + height + "cm 입니다");
		
		// 실수 double type 인 75.5 에 빈문자열을 연결해서 문자열로 형변환함
	  String weight = 75.5 + "";
	  System.out.println("저의 몸무게는 " + weight + "kg 입니다");
	  
	  // int type : 정수 30
	  int ageInt = 30;
	  // String type : 문자열  30
	  String ageStr = "30";
		
	}

}







