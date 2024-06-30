package j_20240628;

public class Ex13 {
	
	public static void main(String[ ]args) {
		
		// 287 page 예외발생시키기
		// throw new Exception("예외 메세지 작성하는 부분");
		
		/*
		  try 구문에서 발생한 예외보다
		  catch 구문에서 선언한 예외가 같거나 더 조상이어야 함
		*/
		
		System.out.println("프로그램 시작");
		
		try {
			throw new Exception("예외가 발생했습니다");			
		}catch(Exception e) {
			// throw new Exception() 하면서 넣어준 메세지를 출력함
			System.out.println(e.getMessage());
		}
		
		System.out.println("프로그램 종료");
	}

}
