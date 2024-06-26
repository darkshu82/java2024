package j_20240625;

public class Ex14 {
	
	public static void main(String args[]) {
		
		// method overloading (오버로딩)
		// 메소드의 이름이 같은 경우,
		// 파라미터의 개수, type, 순서 를 다르게 해서
		// 중복 오류가 발생되지 않도록 함
		// 이 때, return type 은 영향을 미치지 않음
		// 같은 class 안에서 일어남
		
		addNumbers(10, 20);
		addNumbers(11, 22, 33);
		addNumbers(555, 23.56F);
		addNumbers(3.14F, 34);
	}
	
	public static int addNumbers(int n1, int n2) {
		return n1 + n2;
	}
	
	/*
	 이 때, return type 은 영향을 미치지 않음
	public static float addNumbers(int n1, int n2) {
		return n1 + n2;
	}
	*/
	
	public static int addNumbers(int n1, int n2, int n3) {
		return n1 + n2;
	}
	
	public static float addNumbers(int n1, float n2) {
		return n1 + n2;
	}
	
	public static float addNumbers(float n1, int n2) {
		return n1 + n2;
	}
	

}
