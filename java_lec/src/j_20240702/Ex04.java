package j_20240702;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex04 {
	
	public static void main(String[] args) {
		
		// 350 page
		// 소문자 b로 시작하는 알파벳 소문자 0개 이상 규칙
		Pattern p = Pattern.compile("b[a-z]*");
		Matcher m;
		
		m = p.matcher("bat");
		System.out.println("bat : " + m.matches());
		
		m = p.matcher("cat");
		System.out.println("cat : " + m.matches());
		
		m = p.matcher("bed");
		System.out.println("bed : " + m.matches());
		
		// 352 page
		String[] patterns = {".", "[a-z]?","[0-9]+","0[1-9]*","^[0-9]",
				                 "[^0-9]","[a-z]*","[a-z]+","02|010","\\s","\\S",
				                 "\\d","\\w","\\W"};
		
		String[] data = {"bat","021231234","12345","011","bed","02","A","9","a","*"};
		
		for(String d : data) {
			System.out.print(d + "문자와 일치하는 pattern : ");
			for(String p2 : patterns) {
				Pattern pattern = Pattern.compile(p2);
				Matcher m2 = pattern.matcher(d);
				if(m2.matches()) {
					System.out.print(p + ", ");
				}
			}
			System.out.println();
		}
		
	}
}





