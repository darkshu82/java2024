package j_20240704;
import java.util.Arrays;
import java.util.List;

// 448 page : filtering

public class Ex07 {
	
	public static void main(String[ ]args) {
		
		// List 객체 생성하기
		List<String> nameList = Arrays.asList("이순신","강감찬","유관순",
				                                  "안중근","장보고","대조영",
				                                  "안중근","장보고","대조영");
		System.out.println("nameList : " + nameList);
		
		// distinct() 메서드로 중복 제거 후 내부 반복자로 출력
		System.out.println("-- distinct --");
		nameList.stream().distinct().forEach(name -> System.out.print(name + " "));
		System.out.println("\n=================================================");
		
		// "안" 으로 시작하는 문자열 filtering 하기
		System.out.println("-- filter --");
		nameList.parallelStream().filter(name -> name.startsWith("안"))
		                         .forEach(name -> System.out.print(name + " "));
		System.out.println("\n=================================================");
		
		// 중복을 제거하고
		// "안" 으로 시작하는 문자열 filtering 하기
		System.out.println("-- distinct + filter --");
		nameList.parallelStream().distinct()
		                         .filter(name -> name.startsWith("안"))
		                         .forEach(name -> System.out.print(name + " "));
    System.out.println("\n=================================================");
		
	}

}
