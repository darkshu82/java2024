package j_20240625;

public class Ex12 {
	
	public static void main(String args[]) {
		System.out.println("프로그램의 시작");
		one();
		System.out.println("프로그램의 종료");
		return;
	}
	
	public static void one() {
		two();
		System.out.println("one() 메소드");
		return;
	}
	
  public static void two() {
  	three();
		System.out.println("two() 메소드");
		return;
	}

  public static void three() {
	  System.out.println("three() 메소드");
	  return;
  }

}
