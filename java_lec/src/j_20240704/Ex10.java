package j_20240704;
import java.util.Arrays;

// 454 page 

public class Ex10 {

	public static void main(String[] args) {
		
		int[] arrInt = new int[] {10, 20, 30, 40, 50, 60};
		
		// double타입의 요소를 갖는 DoubleStream으로 형변환
		Arrays.stream(arrInt).asDoubleStream()
		                     .forEach(number -> System.out.print(number + " "));
		System.out.println("\n=========================================");
		
		// int타입의 요소를 갖는 Stream<Integer>으로 형변환
		Arrays.stream(arrInt).boxed()
	                     	.forEach(number -> System.out.print(number + " "));
		System.out.println("\n=========================================");
		
		Arrays.stream(arrInt).boxed()
   	                     .forEach(number -> System.out.println(number.getClass()));
		System.out.println("=========================================");
		
		Arrays.stream(arrInt).boxed()
		                     .forEach(number -> System.out.println(number.getClass().getName()));
		

		
	}
}






