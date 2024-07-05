class SmartPhoneGame3 {
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
          System.out.println(Thread.currentThread().getName() + ": 레벨 " + this.level);
          if(this.level == 5) {
            notifyAll();
            try {
              wait();
            }catch(InterruptedException e) { }
            break;
          }
          
          if (this.level % 10 == 0)
            break;
        }
      }
    }
  }
}
class Player3_1 extends Thread {
  private SmartPhoneGame3 game;

  public void setSmartPhoneGame3(SmartPhoneGame3 game) {
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

class Player3_2 extends Thread {
  private SmartPhoneGame3 game;

  public void setSmartPhoneGame3(SmartPhoneGame3 game) {
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

public class Ex08 {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + " Thread 시작");

    SmartPhoneGame3 game = new SmartPhoneGame3();

    Player3_1 p1 = new Player3_1();
    p1.setSmartPhoneGame3(game);
    p1.start();

    Player3_2 p2 = new Player3_2();
    p2.setSmartPhoneGame3(game);
    p2.start();

    System.out.println(Thread.currentThread().getName() + " Thread 종료");

  }
}
