
class YieldThread extends Thread {
  boolean isBreak = false;
  boolean isContinue = true;

  @Override
  public void run() {
    System.out.println(getName() + " 시작");
    while (!isBreak) {
      if (isContinue) {
        System.out.println(getName() + "실행 중");
      } else {
        Thread.yield();
      }
    }
    System.out.println(getName() + " 종료");
  }

}

public class Ex05 {
  public static void main(String[] args) {
    System.out.println("프로그램 시작");

    YieldThread t1 = new YieldThread();
    YieldThread t2 = new YieldThread();

    t1.start();
    t2.start();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    t1.isContinue = false;

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    t1.isContinue = true;

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    t1.isBreak = true;
    t2.isBreak = true;

    System.out.println("프로그램 종료");

  }
}
