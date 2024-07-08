
// 492 page
class SmartPhoneGame3{
	private int level;
	
	public int getLevel() {
		return this.level;
	}
	public synchronized void increaseLevel() {
  		while(true) {
  			this.level++;
  			try {
  				Thread.sleep(500);
  			}catch(InterruptedException e) { }
  			// 현재 스레드 이름과 level
  			System.out.println(Thread.currentThread().getName() + " Level : " + this.level);
  			// level 이 5 가 되면 다른 스레드를 깨우면서 (notifyAll())
  			// 자신은 wait() 가 됨 : 다른 스레드가 자신을 notify 해 주면
  		  //                       다시 실행대기 상태가 됨
  			if(this.level == 5) {
  				notifyAll();
  				try {
  					wait();
  				}catch(InterruptedException e) { }
  				break; 
  			} // if
  			
  			// level 이 10의 배수가 되면 반복(while 문)을 종료하기
  			if(this.level % 10 == 0) { break; }
  			
  		} // while
	}
}

// Player1 Thread
class Player3_1 extends Thread{
	private SmartPhoneGame3 game;
	public void setSmartPhoneGame3(SmartPhoneGame3 game) {
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
class Player3_2 extends Thread{
  private SmartPhoneGame3 game;
  public void setSmartPhoneGame3(SmartPhoneGame3 game) {
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
public class Ex08 {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " thread 시작");
		
		// Game 객체 생서하기
		SmartPhoneGame3 game = new SmartPhoneGame3();
		
		// Player1 객체 생성 및 Thread 실행하기(start())
		Player3_1 p1 = new Player3_1();
		p1.setSmartPhoneGame3(game);
		p1.start();
		
		// Player2 객체 생성 및 Thread 실행하기(start())
		Player3_2 p2 = new Player3_2();
		p2.setSmartPhoneGame3(game);
		p2.start();
		
		System.out.println(Thread.currentThread().getName() + " thread 종료");
	} // main

}






