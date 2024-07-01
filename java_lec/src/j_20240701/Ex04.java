package j_20240701;
import java.util.Scanner;

// 291 page : 사용자 정의 예외 클래스
class LoginException extends Exception{
	LoginException(String message){
		super(message);
	}
}

public class Ex04 {
	
	static String user_id = "tjoeun";
	static String user_pw = "123456"; 
	
	public static void main(String []args) {
		try {
  		Scanner sc = new Scanner(System.in);
  		System.out.print("아이디 : ");
  		String input_id = sc.nextLine();
  		
  		System.out.print("비밀번호 : ");
  		String input_pw = sc.nextLine();
  		
  		if(!user_id.equals(input_id)) {
  			throw new LoginException("아이디가 올바르지 않습니다");
  		}else if(!user_pw.equals(input_pw)) {
  			throw new LoginException("비밀번호가 올바르지 않습니다");
  		}else {
  		  System.out.println("로그인 성공");
  		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}







