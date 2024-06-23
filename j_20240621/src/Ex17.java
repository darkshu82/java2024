
public class Ex17 {
	public static void main(String args[]) {
	  
	  String id = "tjoeun";
	  String pw = "1234";
	  
	  if (id == "tjoeun" && pw == "1234") {
	    System.out.println("로그인 성공!");	    
	  } else {
	    System.out.println("로그인 실패");	    
	  }
	  
	  if (id == "tjoeun") {
	    if (pw == "1234") {
	      System.out.println("로그인 성공!!");
	    } else {
	      System.out.println("비밀번호를 다시 입력해주세요");
	    }
	  } else {
	    System.out.println("아이디를 다시 입력해주세요");
	  }
	  
	  boolean b1 = id == "tjoeun";
	  b1 = b1 && pw == "1234";
	  
	  if (b1) {
	    System.out.println("로그인 성공!!!");
	  } else {
	    System.out.println("로그인 실패");
	  }
	  
	  boolean b2 = pw == "1234";
	  
	  if (b1 && b2) {
	    System.out.println("로그인 성공!!!!");
	  } else {
	    System.out.println("로그인 실패");
	  }
	  
	  
	}
}




