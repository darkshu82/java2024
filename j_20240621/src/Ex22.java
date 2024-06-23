
public class Ex22 {
  public static void main(String args[]) {
    
    int sum = 0;
    int i = 1;
    
    do {
      sum += i;
      i++;
    } while (i <= 100);
    System.out.printf("1부터 %d까지의 합 : %d%n", i - 1, sum);
    System.out.println("==========================");
    
    i = 0;
    System.out.println("do~while문");
    do {
      i++;      
      System.out.println("num : " + i);
    } while (i < 5);
    
  }
}
