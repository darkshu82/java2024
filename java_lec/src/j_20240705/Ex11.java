package j_20240705;

// 503 page : Thread Group

class MyThread extends Thread{
	MyThread(ThreadGroup group, String name){
		super(group, name);
	}
	@Override
	public void run() {
		while(true) {
			System.out.println(getName());
			try {
				sleep(500);
			}catch(InterruptedException e) {
				System.out.println(getName() + " interrupted 발생 !!!");
				break;
			} // try - catch
		} // while
		System.out.println(getName() + " thread 종료");
	} // run
}

public class Ex11 {
	
	public static void main(String []args) {
		System.out.println(Thread.currentThread().getName() + " thread 시작");
		
		ThreadGroup group = new ThreadGroup("group1");
		
		MyThread t1 = new MyThread(group, "First");
		MyThread t2 = new MyThread(group, "Second");
		MyThread t3 = new MyThread(group, "Third");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { }
		
		// ThreadGroup 에 있는 모든 Thread 중지시키기
		group.interrupt();
		
		System.out.println(Thread.currentThread().getName() + " thread 종료");
	} // main

}
