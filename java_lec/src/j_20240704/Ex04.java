package j_20240704;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Ex04 {
	
	// 441 ~ 442 page
	
	public static void main(String[ ]args) {
		
	  int[] arrInt = new int[] {1, 2, 3, 4, 5};
	  
	  System.out.println("Arrays.stream() IntStream 생성하기");
	  IntStream intStream1 = Arrays.stream(arrInt);
	  intStream1.forEach(number -> System.out.print(number + " "));
	  System.out.println("\n============================================");
	  
	  System.out.println("IntStream.of() IntStream 생성하기");
	  IntStream intStream2 = IntStream.of(arrInt);
	  intStream2.forEach(number -> System.out.print(number + " "));
	  System.out.println("\n============================================");
	  
	  System.out.println("IntStream.range(1, 11) IntStream 생성하기");
	  IntStream intStream3 = IntStream.range(1, 11);
	  intStream3.forEach(number -> System.out.print(number + " "));
	  System.out.println("\n============================================");
	  
	  System.out.println("IntStream.rangeClosed(1, 11) IntStream 생성하기");
	  IntStream intStream4 = IntStream.rangeClosed(1, 11);
	  intStream4.forEach(number -> System.out.print(number + " "));
	  System.out.println("\n============================================");
	  
	  // 442 ~ 443 page : new Random().ints(3) <-- 개수 지정
	  System.out.println("int 형 난수 스트림");
	  IntStream intStream5 = new Random().ints(3);
	  intStream5.forEach(number -> System.out.print(number + " "));
	  System.out.println("\n============================================");
	  
	  // new Random().ints(개수, 시작, 끝-1)
	  // new Random().ints(10, 0, 3) <- 0 부터 2까지의 정수 중 임의의 수 10 개
	  IntStream intStream6 = new Random().ints(10, 0, 3);
	  intStream6.forEach(number -> System.out.print(number + " "));
	  System.out.println("\n============================================");
	  
	  System.out.println("long 형 난수 스트림");
	  // new Random().longs(3,0,10); <- 0부터 9까지의 정수 중에서 20 개 발생
	  LongStream longStream1 = new Random().longs(20,0,10);
	  longStream1.forEach(number -> System.out.print(number + " "));
	  System.out.println("\n============================================");
	  
	  System.out.println("double 형 난수 스트림");
	  DoubleStream doubleStream1 = new Random().doubles(2);
	  doubleStream1.forEach(number -> System.out.print(number + " "));
	  System.out.println("\n==========================================================");
	  
	  // 444 page
	  String str1 = "자바 세상을 만들자";
	  
	  IntStream intStream7 = str1.chars();
	  intStream7.forEach(uniCode -> System.out.print(uniCode + " "));
	  System.out.println("\n==========================================================");
	  
	  // iterator 가 1 회용인 것과 같이 stream 도 1 회용이므로
	  // str1.chars() 로 stream 을 다시 생성해야 함
	  intStream7 = str1.chars();
	  intStream7.forEach(uniCode -> System.out.print((char)uniCode));
	  System.out.println("\n============================================");
	  
	}

}




