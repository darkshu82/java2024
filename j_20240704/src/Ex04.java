import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Ex04 {
  public static void main(String[] args) {

    int[] arrInt = { 1, 2, 3, 4, 5 };

    System.out.println("Arrays.stream() IntStream 생성하기");
    IntStream intStream1 = Arrays.stream(arrInt);
    intStream1.forEach(number -> System.out.print(number + " "));
    System.out.println("\n===========================================================");

    System.out.println("Arrays.stream() IntStream.of 생성하기");
    IntStream intStream2 = IntStream.of(arrInt);
    intStream2.forEach(number -> System.out.print(number + " "));
    System.out.println("\n===========================================================");

    System.out.println("Arrays.stream() IntStream.range 생성하기");
    IntStream intStream3 = IntStream.range(1, 11);
    intStream3.forEach(number -> System.out.print(number + " "));
    System.out.println("\n===========================================================");

    System.out.println("Arrays.stream() IntStream.rangeClosed 생성하기");
    IntStream intStream4 = IntStream.rangeClosed(1, 11);
    intStream4.forEach(number -> System.out.print(number + " "));
    System.out.println("\n===========================================================");

    System.out.println("int 형 난수 스트림");
    IntStream intStream5 = new Random().ints(3);
    intStream5.forEach(number -> System.out.print(number + " "));
    System.out.println("\n===========================================================");

    System.out.println("int 형 난수 스트림");
    IntStream intStream6 = new Random().ints(10, 0, 3);
    intStream6.forEach(number -> System.out.print(number + " "));
    System.out.println("\n===========================================================");

    System.out.println("long 형 난수 스트림");
    LongStream longStream1 = new Random().longs(20, 0, 10);
    longStream1.forEach(number -> System.out.print(number + " "));
    System.out.println("\n===========================================================");

    System.out.println("double 형 난수 스트림");
    DoubleStream doubleStream1 = new Random().doubles(3);
    doubleStream1.forEach(number -> System.out.print(number + " "));
    System.out.println("\n===========================================================");

    String str1 = "자바 세상을 만들자";

    IntStream intStream7 = str1.chars();
    intStream7.forEach(uniCode -> System.out.print(uniCode + " "));
    System.out.println("\n===========================================================");

    intStream7 = str1.chars();
    intStream7.forEach(uniCode -> System.out.print((char) uniCode + " "));
    System.out.println("\n===========================================================");

  } // main
}
