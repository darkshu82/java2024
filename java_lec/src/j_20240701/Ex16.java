package j_20240701;

public class Ex16 {
	
	public static void main(String[] args) {
		
		// 319 page : StringBuffer, StringBuilder
		
		/*
		  거의 모든 programming 언어에서
		  문자열(String type)은 immutable type 으로 되어 있음
		             ㄴ 메모리에 한 번 올린 문자열을 변형할 수 없음
		
		*/
		String str1 = "안녕하세요 ";
		System.out.println(str1);
		System.out.println(str1.hashCode());
		System.out.println(str1 + "이순신 님");
		System.out.println((str1 + "이순신 님").hashCode());
		System.out.println(str1);
		System.out.println(str1.hashCode());
		
		System.out.println("==============================");
		
		String str2 = new String("안녕하세요 ");
		System.out.println(str2);
		System.out.println(str2.hashCode());
		System.out.println(str2 + "이순신 님");
		System.out.println((str2 + "이순신 님").hashCode());
		System.out.println(str2);
		System.out.println(str2.hashCode());
		
		System.out.println("==============================");
		
		StringBuffer sb1 = new StringBuffer("안녕하세요 ");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		sb1 = sb1.append("이순신 님");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());

		sb1.append("1234567890").append("abcdefghijklmnopqrstuvwxyz");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		
		sb1.append(123456).append(3.141592).append(false).append('A');
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		
		sb1.delete(sb1.indexOf(" "), sb1.indexOf("님")+1);
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		
		sb1.deleteCharAt(sb1.indexOf("요"));
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		
		sb1.insert(sb1.indexOf("a"), "/");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		
		sb1.insert(sb1.indexOf("h"), "125.54");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		
	}

}





