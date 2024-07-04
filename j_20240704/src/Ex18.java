
class ThreadA extends Thread {
  @Override
  public void run() {
    System.out.println("-- Thread 클래스를 상속받아서 Thread 구현하기 --");
    for (int i = 0; i < 50; i++) {
      System.out.println("ThreadA extends Thread - " + (i + 1));
    }
  }
}

class ThreadB implements Runnable {
  @Override
  public void run() {
    System.out.println("-- Runnable 상속받아서 Thread 구현하기 --");
    for (int i = 0; i < 50; i++) {
      System.out.println("ThreadB implements Runnable - " + (i + 1));
    }
  }
}

public class Ex18 {
  public static void main(String[] args) {
    System.out.println("프로그램 시작");
    ThreadA thA = new ThreadA();

    Runnable r = new ThreadB();

    Thread thB = new Thread(r);

    thA.start();
    thB.start();
    
    try {
      thB.join(); 
    } catch (InterruptedException e) {
        e.printStackTrace();
    }


    System.out.println("프로그램 종료");

  }
}
