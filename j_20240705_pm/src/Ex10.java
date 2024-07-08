
// 500 page : 데몬 스레드
class DeamonThread extends Thread{
	@Override
	public void run() {
		while(true) {
			// System.out.println(Thread.currentThread().getName());
			System.out.println(getName());
			try {
				// Thread.sleep(500);
				sleep(500);
			} catch (InterruptedException e) { }
		} // while
	} // run
}

public class Ex10 {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " 시작");
		
		DeamonThread dt1 = new DeamonThread();
		DeamonThread dt2 = new DeamonThread();
		
		// start() 를 호출하기 전에 반드시 DaemonThread 로 설정해야 함
		// main thread 에서 dt1.setDaemon(true) 를 호출하면
		// dt1 thread 는 main thread 의 daemon thread 가 되어서
		// main thread 가 종료할 때 dt1 thread 도 자동으로 종료됨
		dt1.setDaemon(true);
		dt2.setDaemon(true);
		
		dt1.start();
		dt2.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) { }
		
		System.out.println(Thread.currentThread().getName() + " 종료");
	} // main

}
