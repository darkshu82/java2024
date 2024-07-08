package j_20240705;
// 484 page

public class Ex01 {
	
	public static void main(String[] args ) {
		System.out.println("프로그램 시작");
		
		// 485 page
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 시작");
				
				for(int i = 0; i < 10; i++) {
					System.out.println("t1 - " + i);
					try {
						Thread.sleep(500);
					}catch(InterruptedException e) { }
				} // for
				
				System.out.println("Thread 종료");
			} // run
		});
		
		t1.start();
		
		System.out.println("프로그램 종료");
		
	} // main

}
