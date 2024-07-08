package j_20240705;

// 492 page
class SmartPhoneGame2{
	private int level;
	
	public int getLevel() {
		return this.level;
	}
	// public synchronized void increaseLevel() {
	public void increaseLevel() {
		synchronized (this) {
  		while(true) {
  			this.level++;
  			try {
  				Thread.sleep(1000);
  			}catch(InterruptedException e) { }
  			// 현재 스레드 이름과 level
  			System.out.println(Thread.currentThread().getName() + " Level : " + this.level);
  			// level 이 10 의 배수가 되면 종료하기
  			if(this.level % 10 == 0) { break; }
  		} // while
		}
	}
}

// Player1 Thread
class Player2_1 extends Thread{
	private SmartPhoneGame2 game;
	public void setSmartPhoneGame2(SmartPhoneGame2 game) {
		// setName() : 부모클래스인 Thread 클래스로부터 상속받은 instance 메소드
		this.setName("Player1");
		this.game = game;
	}
	@Override
	public void run() {
  	System.out.println(Thread.currentThread().getName() + " thread 시작");
  	game.increaseLevel();
  	System.out.println(Thread.currentThread().getName() + " thread 종료");
	}
}

// Player2 Thread
class Player2_2 extends Thread{
  private SmartPhoneGame2 game;
  public void setSmartPhoneGame2(SmartPhoneGame2 game) {
  	// setName() : 부모클래스인 Thread 클래스로부터 상속받은 instance 메소드
  	this.setName("Player2");
  	this.game = game;
  }
  @Override
  public void run() {
  	System.out.println(Thread.currentThread().getName() + " thread 시작");
  	game.increaseLevel();
  	System.out.println(Thread.currentThread().getName() + " thread 종료");
  }
}
public class Ex07 {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " thread 시작");
		
		// Game 객체 생서하기
		SmartPhoneGame2 game = new SmartPhoneGame2();
		
		// Player1 객체 생성 및 Thread 실행하기(start())
		Player2_1 p1 = new Player2_1();
		p1.setSmartPhoneGame2(game);
		p1.start();
		
		// Player2 객체 생성 및 Thread 실행하기(start())
		Player2_2 p2 = new Player2_2();
		p2.setSmartPhoneGame2(game);
		p2.start();
		
		System.out.println(Thread.currentThread().getName() + " thread 종료");
	} // main

}






