package j_20240624;
import java.util.Arrays;

public class Ex12 {
	
	public static void main(String args[]) {
		
		// 배열 복사하기 : System.arraycopy() 메소드
		// JAVA 에서 배열은 한 번 생성하면 크기(길이)를 변경할 수 없음
		
		// 기존의 배열보다 두 배 크기의 배열 생성하기
		int[] arr1 = new int[5];
		int[] arr2 = new int[arr1.length * 2];
		
		System.out.println("arr1 의 크기 : " + arr1.length);
		System.out.println("arr2 의 크기 : " + arr2.length);

		System.out.println("arr1 : " + Arrays.toString(arr1));
				
		// arr1 에 1 ~ 5 저장하기
		for(int i = 0; i < arr1.length; i++){
		  arr1[i] = i + 1;	
		}
		
		System.out.println("arr1 : " + Arrays.toString(arr1));
		
		// arr1 의 값을 arr2 에 복사하기
		System.out.println("arr2 : " + Arrays.toString(arr2));
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		arr2 = new int[arr1.length * 2];
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		// arr2 의 index 3, 4, 5, 6, 7 에
		// arr1 의 값 복사하기
		for(int i = 3; i < arr2.length - 2; i++) {
			arr2[i] = arr1[i - 3];
		}
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		
		System.out.println("---- System.arraycopy() 메소드 사용하기 ----");
		// 배열1 에서 배열2 로 복사하는 경우
		// System.arraycopy(배열1, 배열1시작index, 배열2, 배열2시작index, 복사할개수)
		
		char[] arrChar1 = new char[] {'T','J','O','E','U','N'};
		char[] arrChar2 = new char[] {'0','1','2','3','4','5','6','7','8','9'};
		
		System.out.println("---- System.arraycopy 전 ----");
		System.out.println("arrChar1 : " + Arrays.toString(arrChar1));
		System.out.println("arrChar2 : " + Arrays.toString(arrChar2));
		
   	// arrChar1 의 index 0 번부터 3 개의 item 을 복사해서
		// arrChar2 의 index 2 번부터 붙여넣기
		// System.arraycopy(배열1, 배열1시작index, 배열2, 배열2시작index, 복사할개수)
		System.arraycopy(arrChar1, 0, arrChar2, 2, 3);
		
		System.out.println("---- System.arraycopy 후 ----");
		System.out.println("arrChar1 : " + Arrays.toString(arrChar1));
		System.out.println("arrChar2 : " + Arrays.toString(arrChar2));
		
	  // System.arraycopy(배열1, 배열1시작index, 배열2, 배열2시작index, 복사할개수)
	  // arrChar1 의 index 0 번부터 6(arrChar1의 크기) 개의 item 을 복사해서  : TJOEUN
  	// arrResult 배열에 붙여넣기
		// arrChar2 의 index 0 번부터 10(arrChar2의 크기) 개의 item 을 복사해서 : 0123456789
		// arrResult 배열에 붙여넣기
		//   ㄴ TJOEUN0123456789
		char[] arrResult = new char[arrChar1.length + arrChar2.length];
		
		System.arraycopy(arrChar1, 0, arrResult, 0, arrChar1.length);
		System.out.println("arrResult : " + Arrays.toString(arrResult));
		
		arrChar2 = new char[] {'0','1','2','3','4','5','6','7','8','9'};
		System.arraycopy(arrChar2, 0, arrResult, arrChar1.length, arrChar2.length);
		System.out.println("arrResult : " + Arrays.toString(arrResult));
		
	}

}
