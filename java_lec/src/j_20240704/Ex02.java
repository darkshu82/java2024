package j_20240704;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex02 {
	
	// 435 page : 16 장 스트림
	public static void main(String[] args) {
		
		// Arrays 클래스의 static 메소드 asList(배열)
		// 배열을 List 로 변환하는 메소드
		
		String[] nameArr = new String[] {"이순신","강감찬","안중근","유관순"};
		List<String> nameList = Arrays.asList(nameArr);
		
		System.out.println("nameArr  : " + Arrays.toString(nameArr));
		System.out.println("nameList : " + nameList);
		
		// [Ljava.lang.String
		System.out.println("nameArr 의 type  : " + nameArr.getClass().getName());
		// java.util.Arrays$ArrayList
		System.out.println("nameList 의 type : " + nameList.getClass().getName());
		
		Integer number = 100;
		// java.lang.Integer
		System.out.println("number 의 type : " + number.getClass().getName());
		System.out.println("\n=============================");
		
		// nameList : [이순신, 강감찬, 안중근, 유관순]
		// nameList 출력하기
		// for 문 사용
		for(int i = 0; i < nameList.size(); i++) {
			System.out.print(nameList.get(i) + " ");
		}
		System.out.println("\n=============================");
		
		// 향상된 for 문 상용
		for(String name : nameList) {
			System.out.print(name + " ");
		}
		System.out.println("\n=============================");
		
		// Iterator 사용
		Iterator iter = nameList.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println("\n=============================");
		
		// nameList : [이순신, 강감찬, 안중근, 유관순]		
		// stream() 사용
		nameList.stream().forEach(name -> System.out.print(name + " "));
		System.out.println("\n=============================");
		
	}

}
