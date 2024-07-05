class SmartPhoneGame {
  private int level;

  public int getLevel() {
    return this.level;
  }

  public void increaseLevel() {
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
class Player1 extends Thread {
  private SmartPhoneGame game;

  public void setSmartPhoneGame(SmartPhoneGame game) {
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

class Player2 extends Thread {
  private SmartPhoneGame game;

  public void setSmartPhoneGame(SmartPhoneGame game) {
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

public class Ex06 {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + " Thread 시작");

    SmartPhoneGame game = new SmartPhoneGame();

    Player1 p1 = new Player1();
    p1.setSmartPhoneGame(game);
    p1.start();

    Player2 p2 = new Player2();
    p2.setSmartPhoneGame(game);
    p2.start();

    System.out.println(Thread.currentThread().getName() + " Thread 종료");

  }
}
