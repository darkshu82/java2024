
public class Ex03 {
  public static void main(String[] args) {

    System.out.println("프로그램 시작");

    Thread t1 = new Thread(new Runnable() {

      @Override
      public void run() {
        int i = 1;
        while (true) {
          System.out.println("t1 - " + i);
          i++;
          if (Thread.interrupted()) {
            break;
          }
        }
        System.out.println("Thread 종료");
      } // run
    });

    t1.start();

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
    }

    t1.interrupt();

    System.out.println("프로그램 종료");

  }
}
