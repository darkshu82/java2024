import java.util.Arrays;

public class Ex08 {
	
	public static void main(String args[]) {
		
		// 1) 변수 선언하기  / 2) data(literal data, 변수) 를 변수에 할당하기 (초기화)
		// 1), 2) 따로 할 수 있음 : 변수의 선언과 초기화를 따로 하는 것
		// 1), 2) 동시 : 변수의 선언과 초기화를 동시에 하는 것
		
		// 1) 배열 변수 선언하기
		int[] numbers;
		
		// 2_1) 배열 생성하기 : item(element) 있는 배열
		// new int[] {1, 2, 3, 4, 5};

		// 2_2) 배열 생성하기 : 크기만 지정하고 item(element) 없는 배열
		// new int[5];
		
		// 3_1) 생성한 (item(element) 있는)배열을 배열타입의 참조변수에 할당하기 (초기화)
		//      배열의 크기(길이) <-- item(element) 의 개수
		//      배열의 크기(길이)가 5 인 배열 
		numbers = new int[] {1, 2, 3, 4, 5};
		
		// 3_2) 생성한 크기만 지정하고 (item(element)을 넣지 않은)배열을 배열타입의 참조변수에 할당하기 (초기화)
    //      배열의 크기(길이) <-- item(element) 의 개수
    //      배열의 크기(길이)가 5 인 배열 
		//      배열의 크기(길이)만 지정하고 실제 item을 넣지 않은 배열
		//                   ㄴ item 이 자동으로 넣어짐(할당됨)
		//                      해당 type 의 기본값으로 초기화됨
		numbers = new int[5];
		System.out.println("numbers[0] : " + numbers[0]);
		System.out.println("numbers[1] : " + numbers[1]);
		System.out.println("numbers[2] : " + numbers[2]);
		System.out.println("numbers[3] : " + numbers[3]);
		System.out.println("numbers[4] : " + numbers[4]);
		
		System.out.println("=================================");
		
		// 4) 배열의 크기(길이)만 지정하고 실제 item을 넣지 않은 배열에 
		//    index 를 사용해서 item 추가하기
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		System.out.println("numbers[0] : " + numbers[0]);
		System.out.println("numbers[1] : " + numbers[1]);
		System.out.println("numbers[2] : " + numbers[2]);
		System.out.println("numbers[3] : " + numbers[3]);
		System.out.println("numbers[4] : " + numbers[4]);
		
		System.out.println("=================================");
		
		// 3_2) + 4) : numbers = new int[] {10, 20, 30, 40, 50};
		// 3_2) + 4) : numbers = new int[5] {10, 20, 30, 40, 50};
		//                               ㄴ 크기를 지정하면 오류 발생
		numbers = new int[] {10, 20, 30, 40, 50};
		System.out.println("numbers[0] : " + numbers[0]);
		System.out.println("numbers[1] : " + numbers[1]);
		System.out.println("numbers[2] : " + numbers[2]);
		System.out.println("numbers[3] : " + numbers[3]);
		System.out.println("numbers[4] : " + numbers[4]);
		
		System.out.println("=================================");
		
		// 배열의 length 속성 : 배열의 크기(길이) 를 저장하고 있는 속성
		// 배열 numbers 의 크기(길이)
		 System.out.println("배열 numbers 의 크기(길이) : " + numbers.length);
		
		 System.out.println("=================================");
		 
		 // 반복문을 사용해서 배열 numbers 의 item 출력하기
		 for(int i = 0; i <= 4; i++) {
			 System.out.println("numbers[" + i + "] : " + numbers[i]); 
		 }

		 System.out.println("=================================");
		 
		 // 반복문을 사용해서 배열 numbers 의 item 출력하기
		 for(int i = 0; i < 5; i++) {
			 System.out.println("numbers[" + i + "] : " + numbers[i]); 
		 }
		 System.out.println("=================================");
		 
		 // 반복문을 사용해서 일차원 배열 numbers 의 item 출력하기
		 for(int i = 0; i < numbers.length; i++) {
			 System.out.println("numbers[" + i + "] : " + numbers[i]); 
		 }
		 System.out.println("=================================");
		 
		 for(int i = 0; i < numbers.length; i++) {
			 System.out.println(numbers[i]); 
		 }
		 
		 System.out.println("=================================");
		 
		 
		 // Arrays 클래스의 toString() 을 사용해서 배열 출력하기
		 // numbers  : [10, 20, 30, 40, 50]
		 System.out.println("numbers : " + Arrays.toString(numbers)); 
	
		 // 반복문을 사용해서 배열 numbers 의 item 출력하기
		 System.out.print("numbers : [");
		 for(int i = 0; i < numbers.length; i++) {
			 if(i != numbers.length-1 ) {
			   System.out.print(numbers[i] + ", ");
			 }else {
				 System.out.print(numbers[i]);
			 }
		 }
		 System.out.println("]");
		 
		 // 일차월 배열
		 numbers = new int[] {10, 20, 30, 40, 50};
		 
		 // 이차원 배열
		 int[][] numbers2 = new int[][] {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		 

		 
		 // 119 page		
		 // 배열 변수의 선언과 초기화를 동시에 하는 경우에는 
		 // new String[] 이 부분을 생략할 수 있음
		 // String[] arrStr = new String[]{"홍길동", "이순신", "김유신"};
		 String[] arrStr = {"홍길동", "이순신", "김유신"};
		 
		 // 배열 변수의 선언과 초기화를 동시에 하지 않는 경우에는 
		 // new String[] 이 부분을 생략할 수 없음
		 String[] arrStr2;
		 arrStr2 = new String[]{"홍길동", "이순신", "김유신"};
		 
		 // int[] arrInt = new int[] {1, 2, 3, 4, 5};		 
		 // 배열 변수의 선언과 초기화를 동시에 하는 경우에는 
		 // new int[] 이 부분을 생략할 수 있음
		 int[] arrInt = {1, 2, 3, 4, 5};		 
		 
	}

}



