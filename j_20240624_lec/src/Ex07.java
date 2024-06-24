
public class Ex07 {
	
	public static void main(String args[]) {
		
		// 116 page
		
		int[ ] arrInt;
		int arrInt2[] = null;
		
		// new 연산자에 의해서 확보된 메모리 공간에
		// 비어있는 배열을 생성(메모리에 올림)하고
		// 그 주소를 arrInt3 에 저장함
		int[] arrInt3 = new int[] {};
		
		// compile error 발생
		// The local variable arrInt may not have been initialized
		// System.out.println("arrInt[0]  : " + arrInt[0]);
		
		// compile error 발생하지 않음
		// runtime error 가 발생함
		// java.lang.NullPointerException
		// System.out.println("arrInt2[0] : " + arrInt2[0]);
		
   	// runtime error 가 발생함
		// ArrayIndexOutOfBoundsException
		System.out.println("arrInt3[0] : " + arrInt3[0]);
		
	}

}
