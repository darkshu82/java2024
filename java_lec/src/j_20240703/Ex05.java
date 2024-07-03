package j_20240703;

@FunctionalInterface
interface Inter04{
	int cal(int num1, int num2);
}

public class Ex05 {
	
	public static void main(String[] args) {
		
		Inter04 i1 = (num1, num2) -> { return num1 * num2; };
		System.out.println("두 수의 곱 : " + i1.cal(3,  2));
		
		i1 = (num1, num2) -> num1 + num2;
		System.out.println("두 수의 합 : " + i1.cal(3,  2));
		
		i1 = (num1, num2) -> num1 / num2;
		System.out.println("두 수의 몫 : " + i1.cal(3,  2));
		
		i1 = (num1, num2) -> num1 % num2;
		System.out.println("두 수의 나머지 : " + i1.cal(3,  2));
		
		// parameter 가 같은 static 메소드 호출하기
		i1 = (n1, n2) -> sum(n1, n2);
		System.out.println("두 수의 합 : " + i1.cal(3,  2));
		
		// parameter 가 같은 static 메소드 호출하기
		i1 = (a, b) -> calculate(a, b);
		System.out.println("두 수의 연산 : " + i1.cal(3,  2));
	}
	
  public static int sum(int number1, int number2) {
  	return number1 + number2;
  }
  public static int calculate(int x, int y) {
  	return x + y - 10 + x * y;
  }

}








