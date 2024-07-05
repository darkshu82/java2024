class SmartPhoneGame2 {
  private int level;

  public int getLevel() {
    return this.level;
  }

  public void increaseLevel() {
    synchronized (this) {
      while (true) {
        this.level++;
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          System.out.println(Thread.currentThread().getName());
          if (this.level % 10 == 0)
            break;
        }
      }
    }
  }
}
class Player2_1 extends Thread {
  private SmartPhoneGame2 game;

  public void setSmartPhoneGame2(SmartPhoneGame2 game) {
    this.setName("Player1");
    this.game = game;
  }

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " Thread 시작");
    game.increaseLevel();
    System.out.println(Thread.currentThread().getName() + " Thread 종료");
  }
}

class Player2_2 extends Thread {
  private SmartPhoneGame2 game;

  public void setSmartPhoneGame2(SmartPhoneGame2 game) {
    this.setName("Player2");
    this.game = game;
  }

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " Thread 시작");
    game.increaseLevel();
    System.out.println(Thread.currentThread().getName() + " Thread 종료");
  }
}

public class Ex07 {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + " Thread 시작");

    SmartPhoneGame2 game = new SmartPhoneGame2();

    Player2_1 p1 = new Player2_1();
    p1.setSmartPhoneGame2(game);
    p1.start();

    Player2_2 p2 = new Player2_2();
    p2.setSmartPhoneGame2(game);
    p2.start();

    System.out.println(Thread.currentThread().getName() + " Thread 종료");

  }
}
