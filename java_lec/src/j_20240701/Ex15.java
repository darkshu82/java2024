package j_20240701;
import java.util.Arrays;

public class Ex15 {

	public static void main(String[ ]args) {
		
		// 316 page
		String str = "Java is the best programming language";
		
		System.out.println("str 문자열 전체 길이 : " + str.length());
		System.out.println("5 번째 index 에 있는 문자 : " + str.charAt(5));
		System.out.println("best 문자열의 index : " + str.indexOf("best"));
		System.out.println("b 문자열의 index : " + str.indexOf("b"));
		System.out.println("b 문자열의 index : " + str.indexOf('b'));
		
		// programming 만 추출해서 출력하세요
		// substring() 메소드 사용
		// substring(start, stop) - start 부터 stop-1 까지 추출함
		// start : indexOf("p")
		// stop  : str.indexOf("p") + lengthOfProgramming
		int lengthOfProgramming = "programming".length();
		System.out.println(lengthOfProgramming);
		System.out.println(str.indexOf("p"));
    // System.out.println(str.substring(str.indexOf("p"), str.indexOf("p") + str.indexOf(lengthOfProgramming)));

		// str.indexOf("p") + str.indexOf(lengthOfProgramming)
		System.out.println(str.substring(str.indexOf("p"), 28));
		
		// System.out.println(str.indexOf("p") + str.indexOf(lengthOfProgramming));
		//  str.indexOf("p") : 17
		//  str.indexOf(lengthOfProgramming) : -1
		//  indexOf() 메소드는 대상문자열에 없는 문자나 문자열을 넣어주면 -1 을 반환함
		
		// Java is the best programming language
		// 0123456789012345678901234567890123456
		//           1         2         3
		// start : indexOf("p")
		// stop  : str.indexOf("p") + lengthOfProgramming		
		System.out.println(str.substring(str.indexOf("p"), str.indexOf("p") + lengthOfProgramming));
		System.out.println(str.substring(17, 28));
		
		// programming language
		System.out.println(str.substring(str.indexOf("p")));
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.startsWith("Java"));
		System.out.println(str.startsWith("Hello"));
		System.out.println(str.endsWith("language"));		
		System.out.println(str.endsWith("Hello"));		
		
		
		// Java is the best programming language
		// 0123456789012345678901234567890123456
		//           1         2         3
		// the best --> a good		
		// replace(old, new)
		System.out.println(str.replace("the best", "a good"));		
		
		// 문자 g 를 q 호 변경
		System.out.println(str.replace("g", "q"));		
		System.out.println(str.replaceAll("g", "q"));		
		
		// replace() 와 replaceAll() 의 차이점
		// replace(old 문자열, new 문자열)
		// replaceAll(정규(표현)식(regex), new 문자열)
		System.out.println(str.replace("mm", "mm".toUpperCase()));	
		// 정규(표현)식(RegEx (regular expression)) 으로 하면 
		// 문자열의  pattern 을 지정할 수 있음
		// [a-z]{2} : 영문소문자가 2번 연속해서 나온다는 의미
		System.out.println(str.replaceAll("[a-z]{2}", "자바"));	
		System.out.println(str.replaceAll("mm", "자바"));
		
		// Java is the best programming language
		System.out.println(str);
	  // Java is the best programming language
		System.out.println(str.toString());
		
		String str1 = "    Java is the best programming language    ";
		System.out.println(str1.trim());
		
		// replace(old, new) 를 사용해서
		// 특정 문자(열) 삭제하기
		// 특정 문자(열) 을 빈문자열로 변경하면 삭제되는 효과가 있음
		// Java is the best programming language
		System.out.println(str.replace("programming", ""));
		
		String strInt = String.valueOf(222);
		String strDouble = String.valueOf(3.14);
		strInt = "" + 222;
		strDouble = "" + 3.14;
		
		String str2 = "홍길동,이순신,유관순,안중근";
		String[] arrStr =  str2.split(",");
		System.out.println(Arrays.toString(arrStr));
		
		
		
	}
	
}

