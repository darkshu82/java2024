package j_20240621;

public class Ex07 {
	
	public static void main(String args[]) {
		
		// 66 page - 논리연산자 (&&, ||, ^(배타적논리합(XOR)), !(NOT 의 의미))
		
		// && : 모두 true 일 때만 true
		System.out.println(true  && true);
		System.out.println(true  && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		// || : 모두 false 일 때만 false
		System.out.println(true  || true);
		System.out.println(true  || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("=====================================");
		
	  // ^ : true 가 홀수 개일 때 true
		// ^ : true 가 짝수 개일 때 false
		//     두 개인 경우 <-- 서로 다를 때만 true 
		System.out.println(true  ^ true);
		System.out.println(true  ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("=====================================");
		
		System.out.println(true  ^ true ^ true ^ true ^ true);
		System.out.println(true  ^ true ^ true ^ false ^ true);
		System.out.println(false ^ true ^ false ^ false ^ false);
		System.out.println(false ^ false ^ false ^ false ^ false);
			
		System.out.println("=====================================");
		
		System.out.println(true  ^ true ^ true ^ true);
		System.out.println(true  ^ true ^ true );
		System.out.println(true  ^ true);
		
		System.out.println("=====================================");
		
		// true 가 하나도 없을 때도 false
		System.out.println(false ^ false ^ false ^ false ^ false ^ false ^ false);
		System.out.println(true  ^ false ^ false ^ false ^ false ^ false ^ false);
		System.out.println(true  ^ true ^ false ^ false ^ false ^ false ^ false);
		System.out.println(true  ^ true ^ true ^ false ^ false ^ false ^ false ^ false);
		System.out.println(true  ^ true ^ true ^ true ^ false ^ false ^ false ^ false);
		System.out.println(true  ^ true ^ true ^ true ^ true ^ false ^ false ^ false);
		System.out.println(true  ^ true ^ true ^ true ^ true ^ true ^ false ^ false);
		
	}

}
