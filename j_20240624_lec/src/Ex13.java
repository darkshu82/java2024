import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex13 {
	
	public static void main(String args[]) {
		
		// Arrays 클래스의 메소드
		
		// Arrays.copyOf(원본배열, 복사할개수)
		
		int[] arr1 = new int[] {1, 93, 19, 93, 46, 85, 22, 15, 81, 70};
		/*
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random() * 100) + 1;
		}
		*/
		System.out.println("arr1 : " + Arrays.toString(arr1));
		
		// arr1 의 값을 arr2 에 복사하기
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
    // 일부만 복사하기
		int[] arr3 = Arrays.copyOf(arr1, 4);
		System.out.println("arr3 : " + Arrays.toString(arr3));
		
		// Arrays.copyOfRange(원본, start, stop+1)
		// index 3 부터 7까지 복사하기
		int[] arr4 = Arrays.copyOfRange(arr1, 3, 8);
		System.out.println("arr4 : " + Arrays.toString(arr4));
		
		arr1 = new int[] {1, 93, 19, 93, 46, 85, 22, 15, 81, 70};
		
		// 정렬하기 : Arrays.sort(배열) <오름차순>
		Arrays.sort(arr1);
		System.out.println("arr1 : " + Arrays.toString(arr1));
		
		Integer[] arr5 = new Integer[] {1, 93, 19, 93, 46, 85, 22, 15, 81, 70};
  	// 정렬하기 : Arrays.sort(배열) <오름차순>
		Arrays.sort(arr5);
		System.out.println("arr5 : " + Arrays.toString(arr5));

		// 정렬하기 : Arrays.sort(배열, Collections.reverseOrder()) <내림차순>
		arr5 = new Integer[] {1, 93, 19, 93, 46, 85, 22, 15, 81, 70};
		Arrays.sort(arr5, Collections.reverseOrder());
		System.out.println("arr5 : " + Arrays.toString(arr5));
		
		// 배열의 중복 제거
		arr5 = new Integer[] {1, 93, 19, 93, 46, 85, 22, 15, 81, 70};
		
		// 배열을 List 로 변환하기 : Arrays.asList(배열)
		// List 는 중복을 허용함
		List<Integer> listInt =  Arrays.asList(arr5);
		// List 출력하기
		System.out.println("listInt : " + listInt);
		
		// Set 은 중복을 허용하지 않음
		// List 를 Set 으로 변환하면 중복이 제거됨
		//   ㄴ List 에 저장된 item(element) 을 Set 에 저장함
		//   ㄴ Set 객체를 생성하면서 List 를 argument 로 넣어줌
		// 1) List -> Set
		HashSet<Integer> setInt1 = new HashSet<>(listInt);
		System.out.println("setInt1 : " + setInt1);
		
		// 2) List -> Set
		Set<Integer> setInt2 = Set.copyOf(listInt);
		System.out.println("setInt2 : " + setInt2);
		
		// 1) Set -> List(중복이 제거된 List)
		ArrayList<Integer> arrList1 = new ArrayList<>(setInt1);
		System.out.println("arrList1 : " + arrList1);
		
		// 2) Set -> List(중복이 제거된 List)
		List<Integer> arrList2 = List.copyOf(setInt1);
		System.out.println("arrList : " + arrList2);
		
		// List -> array
		Integer[] resultint = arrList1.toArray(new Integer[arrList1.size()]);
		
		// 중복이 제거된 array(배열)
		System.out.println("resultint : " + Arrays.toString(resultint));
		
	}

}
