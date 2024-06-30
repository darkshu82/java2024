package j_20240628;

public class Ex08 {
	
	public static void main(String[] args) {
		
		// 268 page
	// static 변수 출력하기
  //	  ㄴ 객체를 생성하지 않고
  //	     클래스이름으로 접근 가능

	System.out.println("InstanceInner.FINAL : " + InstanceInner.FINAL);
	System.out.println("StaticInner.FINAL   : " + StaticInner.cv);
		
	}
	
	// instance 멤버 클래스
	public class InstanceInner{
		int iv = 100;
		// static 변수를 선언하지 못함
		// static int cv = 100;
		// static final 은 허용함
		static final int FINAL = 100;
	}
	// static 멤버 클래스
	public static class StaticInner{
		int iv = 200;
		// static inner 클래스에서만 static 변수 선언 가능
		static int cv = 200;
	}
	
	void method1() {
		// local 내부 클래스
		class LocalInner{
			int iv = 300;
			// static 변수를 선언하지 못함
			// static int cv = 400;
			// static final 변수는 선언 가능
			static final int FINAL = 500;
		}
	}
	
}






