
public class Ex01 {
	public static void main(String args[]) {
		Integer number = 10;
		System.out.println("number의 data type: " + number.getClass().getName());
		
		int number2 = 20;
		System.out.println("number2의 data type: " + ((Integer)number).getClass().getName());
		
		double dNumber = number2;
		dNumber = (double)number2;
		
		int number3 = (int)dNumber;
	}
}
