import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ex13 {
	public static void main(String[] args) {
		
		//Arrays 클래스의 메소드
		//Arrays.copy0f(원본배열, 복사할개수)
		
		int[] arr1 = new int[10];
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random() * 100 + 1);
		}
		System.out.println(Arrays.toString(arr1));
		
		
		
		arr5 = new Integer[] {55, 45, 59, 58, 90, 83, 67, 33, 65, 86};
		Arrays.sort(arr5, Collections)
		
		arr5 = new Integer[] {55, 45, 59, 58, 90, 83, 67, 33, 65, 86};
		List<Integer> listInt = Arrays.asList(arr5);
		System.out.println("listInt : " + listInt);
		
		Hashset<Integer> setInt1 = new HashSet<>(listInt);
		System.out.println("setInt1 : " + setInt1);
		
		set<Interger> setInt2 = Set.copyOf(listInt);
		System.out.println("setInt2 : " + setInt2);
		
		ArrayList<Integer> arrList1 = new ArrayList<>(setInt1);
		System.out.println("arrList1 : " + arrList1);
		
		Interger[] resultInt arrList1.toArray(new Interger[arrList1.size()]);
		System.out.println("resultInt : " + Arrays.toString());
		
		
		
		
		
	}
}
