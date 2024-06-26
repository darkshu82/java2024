
public class Ex09 {
  public static void main(String[] args) {

    int sum = 0;

    for (int i = 1; i <= 100; i++) {
      if (i % 5 == 0) {
        sum += i;
        System.out.printf("i : %d, sum : %d%n", i, sum);
      }
    }

    System.out.println("============================================================");
    int evenSum = 0;
    int oddSum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        evenSum += i;
      } else {
        oddSum += i;
      }
    }

    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 6; j++) {
        if (i + j == 6) {
          System.out.printf("(%d, %d)%n", i, j);
        }
      }
    }
    System.out.println("============================================================");
    System.out.println("5의 배수의 합계는 " + sum);
    System.out.println("짝수합 " + evenSum);
    System.out.println("홀수합 " + oddSum);
    System.out.println("============================================================");

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 5; j > i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 4; j > i; j--) {
        System.out.print(" ");
      }
      for (int j = 0; j < (i * 2 + 1); j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("\n==6=========================================================");

    int count = 0;
    while (true) {
      count++;
      int dice = (int) (Math.random() * 6) + 1;
      System.out.println("(" + dice + ")");
      if (dice == 6) {
        break;
      }
    }
    System.out.printf("총 주사위 굴린 횟수는 : %d 회\n", count);

  }
}
