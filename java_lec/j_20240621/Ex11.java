
public class Ex11 {
	
	public static void main(String args[]) {
		
		// 74 page
		
		/*
		  shift 연산자
		  << : left shift 연산자
		  형식]   <<  정수 : 정수 만큼 bit 를 오른쪽으로 이동함
		                     (원래의 값 X 2 의 (정수제곱)) 으로 증가함
		*/
		int number = 5;
		System.out.println("number << 1 (5 X 2의 1제곱) : " + (number << 1));
		System.out.println("number << 2 (5 X 2의 2제곱) : " + (number << 2));
		System.out.println("number << 3 (5 X 2의 3제곱) : " + (number << 3));
		
		/*
  	  shift 연산자
  	  >> : right shift 연산자
		  형식]   >>  정수 : 정수 만큼 bit 를 왼쪽으로 이동함
		                     (원래의 값 / 2 의 (정수제곱)) 으로 감소함
		                      ㄴ 소숫점 이하는 잘라짐 : 정수부분만 반환함		    	
  	*/
		 number = 10;
	 	 System.out.println("number >> 1 (5 / 2의 1제곱) : " + (number >> 1));
	 	 System.out.println("number >> 2 (5 / 2의 2제곱) : " + (number >> 2));
		 System.out.println("number >> 3 (5 / 2의 3제곱) : " + (number >> 3));
			
		
	}

}
