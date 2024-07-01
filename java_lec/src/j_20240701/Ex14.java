package j_20240701;

public class Ex14 {
	
	public static void main(String []args) {
		
		// 310 page : String 클래스
		
		int score = 90;
		System.out.println("당신의 점수는 " + score + " 점입니다");
		
		// score 변수에 저장된 값을 문자열로 형변환하기
		// 1) 빈문자열과 연결 연산을 함
		String strScore = score + "";
		System.out.println("당신의 점수는 " + strScore + " 점입니다");
		
		// 2) String.valueOf() 메소드 사용
		strScore = String.valueOf(score);
		System.out.println("당신의 점수는 " + strScore + " 점입니다");
		
		System.out.println("==============================");
		
		// 311 page
		
		String number = "";
		
		for(int i = 0; i <= 5; i++) {
      number += " " + i;
		}
		System.out.println("number : " + number);
		
		System.out.println("==============================");
		
		// 313 page
		// 문자열은 낱문자들의 연결된 형태
		// String   Character(char)
		
	  String text = "Hello My Name is Hong Gil Dong";
	  System.out.println("길이 :" + text.length());
	  System.out.println(text.charAt(29));
	  System.out.println(text.charAt(text.length() - 1));
		
	  // 맨 마지막에 있는 글자 <-- text.charAt(29) : 'g'
	  // lastIndexOf() : 오른쪽에서 시작해서 첫 번째에 있는 문자의 index 
	  System.out.println(text.lastIndexOf(text.charAt(29)));
	  
	  // 맨 마지막에 있는 글자 <-- text.charAt(29) : 'g'
	  // indexOf() : 왼쪽에서 시작해서 첫 번째에 있는 문자의 index
		System.out.println(text.indexOf(text.charAt(29)));
		
		System.out.println("\n==================================");
		
		for(int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i));
		}
		System.out.println("\n==================================");
		System.out.println(text);
		System.out.println("==================================");
		
		/*
		  charAt() 을 사용해서
      문자열(String type) "G" 를 char type 으로 변환하세요
		*/
	  String str1 = "G";
	  System.out.println("str1 : " + str1);
	  char ch = str1.charAt(0);
	  System.out.println("ch  : " + ch);
	  
	  /* 빈문자열의 길이 ? */
	  System.out.println("".length());
		
	}

}




