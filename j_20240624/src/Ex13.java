import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex13 {
	public static void main(String[] args) {
		
		//Arrays 클래스의 메소드
		//Arrays.copy0f(원본배열, 복사할개수)
		
		int[] arr1 = {1, 93, 19, 93, 46, 85, 22, 15, 81, 70}; 
		
//		for(int i = 0; i < arr1.length; i++) {
//			arr1[i] = (int)(Math.random() * 100 + 1);
//		}
		System.out.println("arr1 : " + Arrays.toString(arr1));
		
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOf(arr1, 4);
    System.out.println("arr3 : " + Arrays.toString(arr3));
		
    int[] arr4 = Arrays.copyOfRange(arr1, 3, 8);
    System.out.println("arr4 : " + Arrays.toString(arr4));
		
    arr1 = new int[] {1, 93, 19, 93, 46, 85, 22, 15, 81, 70};
    
    Arrays.sort(arr1);
    System.out.println("arr1 : " + Arrays.toString(arr1));
    
    Integer[] arr5 = new Integer[] {1, 93, 19, 93, 46, 85, 22, 15, 81, 70};
    Arrays.sort(arr5);
    System.out.println("arr5 : " + Arrays.toString(arr5));
    
		arr5 = new Integer[] {1, 93, 19, 93, 46, 85, 22, 15, 81, 70};
		Arrays.sort(arr5, Collections.reverseOrder());
		System.out.println("arr5 : " + Arrays.toString(arr5));
		
		arr5 = new Integer[] {1, 93, 19, 93, 46, 85, 22, 15, 81, 70};
		List<Integer> listInt = Arrays.asList(arr5);
		System.out.println("listInt : " + listInt);
		
		HashSet<Integer> setInt1 = new HashSet<>(listInt);
		System.out.println("setInt1 : " + setInt1);
		
		Set<Integer> setInt2 = Set.copyOf(listInt);
		System.out.println("setInt2 : " + setInt2);
		
		ArrayList<Integer> arrList1 = new ArrayList<>(setInt1);
		System.out.println("arrList1 : " + arrList1);
		
		Integer[] resultint = arrList1.toArray(new Integer[arrList1.size()]);
		System.out.println("resultint : " + Arrays.toString(resultint));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
