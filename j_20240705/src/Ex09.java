
class Account {
  int money;

  public synchronized void withdraw() {
    while (money == 0) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
        break;
      }
    }
    System.out.println(Thread.currentThread().getName() + " 가 " + money + " 원 출금");
    this.money = 0;
    notifyAll();
  }

  public synchronized void deposit() {
    while (money > 0) {
      try {
        wait();
      } catch (InterruptedException e) {
        break;
      }
    }
    System.out.println();
    this.money = ((int) (Math.random() * 5) + 1) * 100000;
    System.out.println(Thread.currentThread().getName() + " 가 " + money + " 원 입금");
    notifyAll();
  }
}

class Parent extends Thread {
  Account account;

  public Parent(Account account) {
    super();
    this.account = account;
  }

  @Override
  public void run() {
    while (true) {
      try {
        if (account.money > 0) {
          account.withdraw();
        } else {
          System.out.println(Thread.currentThread().getName() + " 가 출금하지 못함");
        }
        Thread.sleep((int) (Math.random() * 2000));
      } catch (InterruptedException e) {
        break;
      }
    }
  }
}

class Child extends Thread {
  Account account;

  public Child(Account account) {
    super();
    this.account = account;
  }

  @Override
  public void run() {
    while (true) {
      try {
        account.deposit();
        Thread.sleep((int) (Math.random() * 2000));
      } catch (InterruptedException e) {
        break;
      }
    }
  }
}

public class Ex09 {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + " 시작");
    Account acc = new Account();
    Parent p = new Parent(acc);
    Child c = new Child(acc);

    p.start();
    c.start();

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    c.interrupt();
    p.interrupt();

    System.out.println(Thread.currentThread().getName() + " 종료");

  }
}
