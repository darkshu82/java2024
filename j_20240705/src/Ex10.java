
class DaemonThread extends Thread {
  @Override
  public void run() {
    while (true) {
      System.out.println(getName());
      try {
        sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
//    System.out.println(getName() + " 종료");
  }
}

public class Ex10 {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + " 시작");
    DaemonThread dt1 = new DaemonThread();
    DaemonThread dt2 = new DaemonThread();

    dt1.setDaemon(true);
    dt2.setDaemon(true);

    dt1.start();
    dt2.start();

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(Thread.currentThread().getName() + " 종료");

  }
}
