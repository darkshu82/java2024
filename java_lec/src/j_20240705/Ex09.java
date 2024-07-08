package j_20240705;

// 497 page
class Account{
	int money;
	
	// 출금
	public synchronized void withdraw() {
		while(money == 0) {
			try {
				System.out.println("잔액이 없어서 " + Thread.currentThread().getName() + " 가 인출하지 않고 wait 함");
				wait();
			}catch(InterruptedException e) {
				break;
			}
		}
		notifyAll();
		System.out.println("잔액이 " + this.money + " 원이 되어서 "+ Thread.currentThread().getName() + " 가 " + this.money + " 원 출금함");
		this.money = 0;
	}
	
	// 입금
	public synchronized void deposit() {
		while(money > 0) {
			try {
				System.out.println("잔액이 있어서 " + Thread.currentThread().getName() + " 가 wait 함");
				wait();				
			}catch(InterruptedException e) { 
				break;
			}
		} // while
		// 랜덤하게 입금함 : 10 ~ 50 만원
		System.out.println();
		this.money = ((int)(Math.random()*5) + 1) * 100000;
		System.out.println(Thread.currentThread().getName() + " 가 " + this.money + " 원 입금함");
		notifyAll();
	}
}
class Parent extends Thread{
	Account account;
	public Parent(Account account) {
		super("Parent");
		this.account = account;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " 시작");
		while(true) {
			try {
				account.deposit();
				Thread.sleep((int)(Math.random()*2000));
			}catch(InterruptedException e) { 
				break;
			}
		}
		System.out.println(Thread.currentThread().getName() + " 종료");
	} // run
} // Parent
class Child extends Thread{
	Account account;
	public Child(Account account) {
		super("Child");
		this.account = account;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " 시작");
		while(true) {
			try {
				if(account.money > 0) {
					account.withdraw();
				}else {
					System.out.println("잔액이 없어서 " + Thread.currentThread().getName() + " 가 인출하지 못함");
				}
				Thread.sleep((int)(Math.random()*500));
			}catch(InterruptedException e) { 
				break;
			}
		}
		System.out.println(Thread.currentThread().getName() + " 종료");
	} // run
} // Child

public class Ex09 {
	
	public static void main(String[ ]args) {
		System.out.println(Thread.currentThread().getName() + " 시작");
		
		// 통장 객체 생성하기
		Account acc = new Account();
		
		// Parent Thread 생성
		Parent p = new Parent(acc);
		// Child Thread 생성
		Child c  = new Child(acc);
		
		p.start();
		c.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 스레드 중지
		c.interrupt();
		p.interrupt();
		
		System.out.println(Thread.currentThread().getName() + " 종료");
	}  // main
}











