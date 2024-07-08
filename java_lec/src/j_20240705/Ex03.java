package j_20240705;

// 487 page

public class Ex03 {
	
	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 시작");
				int i = 1;
				while(true) {
					System.out.println("t1 - " + i);
					i++;
					if(Thread.interrupted()) {
						break;
					}
				}
				System.out.println("Thread 종료");
			} // run 
		});
		
		t1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// main method 에서 호출함
		//   ㄴ main thread 가 실행함
		// main thread 가 t1 thread 의 상태를 interrupt 함
		// t1 입장에서는 자신의 상태
		// Thread.interrupted 가 true 가 됨  
		t1.interrupt();
		
		System.out.println("프로그램 종료");
	} // main

}
