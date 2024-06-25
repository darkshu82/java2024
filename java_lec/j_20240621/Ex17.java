
public class Ex17 {
	
	public static void main(String args[]) {
		
		/*
		  아이디가 tjoeun 이고
		  비밀번호가 1234 이면 로그인 성공 !!!
		                아니면 로그인 실패 를 출력하세요
		*/
		
		String id = "tjoeun";
		String pw = "1234";
		
		// 1)
		if (id == "tjoeun" && pw == "1234") {
			System.out.println("로그인 성공 !!!");
		} else {
			System.out.println("로그인 실패");
		}
		
		// 2) 중첩 if 문은 && 조건임
		if (id == "tjoeun") {
			if (pw == "1234") {
			  System.out.println("로그인 성공 !!!");
			}else {
				System.out.println("비밀번호를 다시 입력해 주세요");
			}
		} else {
			System.out.println("아이디를 다시 입력해 주세요");
		}
		
		// 3 - 1)
		// boolean type 변수를 하나 사용하는 방법
		boolean b1 = id == "tjoeun";
		b1 = b1 && pw == "1234";

		if (b1) {
			System.out.println("로그인 성공 !!!");
		} else {
			System.out.println("로그인 실패");
		}
		
		// 3 - 2)
		// boolean type 변수를 두 개 사용하는 방법
		boolean b2 = id == "tjoeun";
		boolean b3 = pw == "1234";
		
		if (b2 && b3) {
			System.out.println("로그인 성공 !!!");
		}else {
			System.out.println("로그인 실패");
		}
		
		
	}
}




