class Sum extends Thread {
  int sum = 0;

  @Override
  public void run() {
    for (int i = 0; i <= 100; i++) {
      sum += i;
    }
  }
}

public class Ex04 {
  public static void main(String[] args) {

    Sum t1 = new Sum();
    Sum t2 = new Sum();

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
    }

    System.out.println("두 스레드의 합계 : " + (t1.sum + t2.sum));

  }
}
