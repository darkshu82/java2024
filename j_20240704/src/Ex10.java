import java.util.Arrays;

public class Ex10 {
  public static void main(String[] args) {
    
    int[] arrInt = new int[] { 10, 20 , 30, 40, 50, 60 };
    
    Arrays.stream(arrInt).asDoubleStream().forEach(number -> System.out.print(number + " "));
    System.out.println("\n==========================================");
    Arrays.stream(arrInt).boxed().forEach(number -> System.out.print(number + " "));
    
    System.out.println("\n==========================================");
    Arrays.stream(arrInt).boxed().forEach(number -> System.out.println(number.getClass()));
    
    System.out.println("\n==========================================");
    Arrays.stream(arrInt).boxed().forEach(number -> System.out.println(number.getClass().getName()));
    
    
    
    
    
    
    
    
    
  }

}
