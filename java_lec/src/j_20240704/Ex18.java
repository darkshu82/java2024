package j_20240704;

// 478 page

class ThreadA extends Thread{
	@Override
	public void run() {
		System.out.println("-- Thread 클래스를 상속받아서 Thread 구현하기 --");
		for(int i = 0; i < 50; i++) {
			System.out.println("ThreadA extends Thread - " + (i+1));
		}
	}
}
class ThreadB implements Runnable{
	@Override
	public void run() {
		System.out.println("-- Runnable 인터페이스를 상속받아서 Thread 구현하기 --");
		for(int i = 0; i < 50; i++) {
			System.out.println("ThreadB implements Runnable - " + (i+1));
		}
	}
}

public class Ex18 {
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		// Thread 클래스를 상속받는 방법
		// Thread 클래스의 start() 메소드를 호출하면 
		// run() 메소드가 자동으로 호출되어서 
		// 독립적인 Thread 를 가지고 프로그램이 실행됨
		ThreadA thA = new ThreadA();
	
		// Runnable 인터페이스를 상속받는 방법
		Runnable r = new ThreadB();
		System.out.println(r);
		System.out.println(new ThreadB());
		// Thread 클래스의 생성자의 parameter 에
		// Runnable 인터페이스 type 의 참조변수 r을 전달함
		Thread thB = new Thread(r);
		
		thA.start();
		thB.start();
		System.out.println("프로그램 종료");
	}

}
