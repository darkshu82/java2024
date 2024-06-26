package j_20240621;

public class Ex08 {
	
	public static void main(String args[]) {
		
		// 68 page 밑 부분에 short circuit 설명 나옴
		
		// && : 모두 true 일 때만 true
		System.out.println(true  && true);
		System.out.println(true  && false);
		
		// short circuit : 이미 false 가 하나 나오면 
		//                 뒤의 결과와 상관없이 false 이므로
		//                 뒤의 값을 확인하지 않고 바로 false 를 반환함
		System.out.println(false && true);
		System.out.println(false && false);
		
		// || : 모두 false 일 때만 false
		// short circuit : 이미 true 가 하나 나오면 
		//                 뒤의 결과와 상관없이 true 이므로
		//                 뒤의 값을 확인하지 않고 바로 true 를 반환함 
		System.out.println(true  || true);
		System.out.println(true  || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("=========69 age===================");
		
		// 69 age
		// short circuit
		
		int a = 10;
		int b = 5;
		
		System.out.println("test() : " + test());
		
    // &
		System.out.println(a == b & test());
		
		// &&
		System.out.println(a == b && test());
		
	  // &
		System.out.println(a != b & test());
		
		// &&
		System.out.println(a != b && test());
		
	  // &&
		System.out.println(a == b && (10 <= 20));
		
	  // &&
		System.out.println(a == b && (10 <= 20));
		
		System.out.println("============================");
		
    // |
		// a == b <-- false
		System.out.println(a == b | test());
		
		// ||
		System.out.println(a == b || test());
		
    // |
		// a != b <-- true
		System.out.println(a != b | test());
		
		// ||
		System.out.println(a != b || test());
		
		System.out.println("============================");
		
		// java 에서 논리 연산는 &&, || 만 사용해야 했으나
		// java 버전이 올라가면서 &, | 도 허용함
		// 피연산자가 boolean type 인 경우에는 &, | 이 논리연산자로 실행됨 
		System.out.println(true  & true);
		System.out.println(true  & false);
		System.out.println(false & true);
		System.out.println(false & false);
		
		System.out.println(true  | true);
		System.out.println(true  | false);
		System.out.println(false | true);
		System.out.println(false | false);
		
		System.out.println("============================");
		
		// 70 page
		a = 10;
		b = 0;
		// false
		System.out.println(b > 0 && (a / b > 0));
		// Exception 발생
		// System.out.println(b > 0 & (a / b > 0));
		
	} // main
	
  public static boolean test() {
  	// System.out.println("test() 메소드 실행됨");
  	return true;
  }

}



