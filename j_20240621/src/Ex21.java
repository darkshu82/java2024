
public class Ex21 {
  public static void main(String args[]) {
    
    int sum = 0;
    int i;
    for (i = 1; i <= 10; i++) {
      sum += i;
      System.out.printf("%d 회차 >>>>>> i: %d, sum: %d%n", i, i, sum);
    }
    System.out.println("1부터 10까지의 합계 : " + sum);
    System.out.printf("1부터 %d까지의 합계 : %d%n", i - 1, sum);
    
    sum = 0;
    int num = 1;
    while (num <= 100) {
      sum += num;
      num++;
    }
    System.out.printf("1부터 %d까지의 합계 : %d%n", num-1, sum);
    
  }
}

