
// 489 ~ 490 page

class YieldThread extends Thread{
	
	boolean isBreak = false;
	boolean isContinue = true;
	
	@Override
	public void run() {
		// getName() : 부모클래스인 Thread 클래스로부터 상속받은
		//              instance 메소드
		System.out.println(getName() + " 시작");
		while(!isBreak) {
			if(isContinue) {
				System.out.println(getName() + " 실행 중");
			}else {
				// 다른 스레드에서 실행을 양보함
				Thread.yield();
			}
		} // while
		System.out.println(getName() + " 종료");
	}
}


public class Ex05 {
	
	public static void main(String []args) {
		System.out.println("(main thread) 프로그램 시작");
		
		YieldThread t1 = new YieldThread();
		YieldThread t2 = new YieldThread();
		
		t1.start();
		t2.start();
		
		// main 에서 sleep() 을 호출함
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// t1의 isContinue 가 false 가 되면
		// t1에서 Thread.yield() 를 호출하게 됨
		t1.isContinue = false;
		
		// main 에서 sleep() 을 호출함
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// t1의 isContinue 가 true 가 되면
		// t1 thread 가 다시 실행됨
		t1.isContinue = true;		
		
		// main 에서 sleep() 을 호출함
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// main 에서 t1, t2 의 isBreak 를 true 로 함
		// while(!isBreak) 의 조건이 false 가 되서 while 반복을 종료함
		t1.isBreak = true;
		t2.isBreak = true;
		
		System.out.println("(main thread) 프로그램 종료");
	} // main

}
