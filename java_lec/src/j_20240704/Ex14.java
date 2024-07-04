package j_20240704;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

// 463 page  

public class Ex14 {
	
	public static void main(String[] args) {
		
		int[] arrInt = new int[100];
		for(int i = 0 ; i < arrInt.length; i++) {
			arrInt[i] += i + 1;
			System.out.print(arrInt[i] + " ");
		}
		System.out.println("\n=============================================");
		System.out.println(Arrays.toString(arrInt));
		
    long count = Arrays.stream(arrInt).count();
    System.out.println("요소들의 개수 : " + count + " 개");
		
		int sum = Arrays.stream(arrInt).sum();
		System.out.println("요소들의 합 : " + sum);
		
		OptionalInt first = Arrays.stream(arrInt).findFirst();
		System.out.println("요소들 중 첫 번째 값 : " + first);
		System.out.println("요소들 중 첫 번째 값 : " + first.getAsInt());
		
		OptionalInt max = Arrays.stream(arrInt).max();
		System.out.println("요소들 중 최댓값 : " + max.getAsInt());
		
		OptionalInt min = Arrays.stream(arrInt).min();
		System.out.println("요소들 중 최솟값 : " + min.getAsInt());
		
		OptionalDouble average = Arrays.stream(arrInt).average();
		System.out.println("요소들의 평균값 : " + average.getAsDouble());
		
		System.out.println("=========================================");
		
		// 465 page
		// 빈 ArrayList 생성
		List<Integer> intList = new ArrayList<>();
		
		System.out.println("intList.size() : " + intList.size());

		long count2 = intList.stream().count();
		System.out.println("요소들의 개수 : " + count2 + " 개");

		int sum2 = intList.stream().mapToInt(Integer::intValue).sum();
		System.out.println("요소들의 합 : " + sum2);
		
		// element 가 없는 list에서 아래와 같이 평균을 구하면 오류 발생함
		// if(average2.isPresent()) 으로 조건을 설정하든지
		//  orElse(0) 로 default 값을 설정하면 오류가 발생하지 않음
		OptionalDouble average2 = intList.stream().mapToInt(Integer::intValue).average();
		if(average2.isPresent()) {
		  System.out.println("요소들의 평균값 : " + average2.getAsDouble());
		}
		
		intList.stream().mapToInt(Integer::intValue).findFirst()
		                .ifPresent(firstValue -> System.out.println("요소들 중 첫 번째 값" + firstValue)); 
    
		int max2 = intList.stream().mapToInt(Integer::intValue).max().orElse(10000);
		System.out.println("요소들 중 최댓값 : " + max2);
		
		int min2 = intList.stream().mapToInt(Integer::intValue).min().orElse(-10);
		System.out.println("요소들 중 최솟값 : " + min2);

		
		
	}

}
