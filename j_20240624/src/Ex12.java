import java.util.Arrays;

public class Ex12 {
	public static void main(String[] args) {
		
		int[] arr1 = new int[5];
		int[] arr2 = new int[arr1.length *2];
		
		System.out.println("arr1의 크기 : " + arr1.length);
		System.out.println("arr2의 크기 : " + arr2.length);
		

		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
		}
		
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("arr2 : " + Arrays.toString(arr2));		
		
		arr2 = new int[arr1.length *2];
		
		for(int i = 3; i < arr2.length -2; i++) {
			arr2[i] = arr1[i - 3];
		}
		
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		/*
		 * System.arraycopy() 메소드 사용하기 베열 1에서 배열 2로 복사하는 경우 System.arraycopy(배열1,
		 * 배열1시작index, 배열2, 배열2시작index, 복사할 개수);
		 * 
		 * arrChar1의 index 0번부터 3개의 item을 복사해서 arrChar2의 index 2번부터 붙여넣기
		 */
		
		char[] arrChar1 = new char[] {'T', 'J', 'O', 'E', 'U', 'N'};
		char[] arrChar2 = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.arraycopy(arrChar1, 0, arrChar2, 2, 3);
		
		System.out.println("arrChar1 : " + Arrays.toString(arrChar1));
		System.out.println("arrChar2 : " + Arrays.toString(arrChar2));
		
//		arrChar1의 index 0번부터 5개의 item을 복사해서 arrChar2의 index 0번부터 10개의 item을 복사해서 붙여넣기
//		arrResult 배열에 붙여넣기
		
		arrChar1 = new char[] {'T', 'J', 'O', 'E', 'U', 'N'};
		arrChar2 = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		char[] arrResult =new char[arrChar1.length + arrChar2.length];
		System.arraycopy(arrChar1, 0, arrResult, 0, arrChar1.length);
		System.arraycopy(arrChar2, 0, arrResult, arrChar1.length, arrChar2.length);
		System.out.println("arrResult : " + Arrays.toString(arrResult));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}