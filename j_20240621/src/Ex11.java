
public class Ex11 {
  public static void main(String args[]) {
  
    int number = 5;
    System.out.println(Integer.toBinaryString(5));
    System.out.println(Integer.parseInt("1010", 2));
    System.out.println("number << 1 (5 X 2의 1제곱) : " + (number << 1));
    System.out.println("number << 2 (5 X 2의 2제곱) : " + (number << 2));
    System.out.println("number << 3 (5 X 2의 3제곱) : " + (number << 3));
    
    number = 10;
    System.out.println("number << 1 (10 X 2의 1제곱) : " + (number << 1));
    System.out.println("number << 2 (10 X 2의 2제곱) : " + (number << 2));
    System.out.println("number << 3 (10 X 2의 3제곱) : " + (number << 3));
    
  }
  
}
