package j_20240705;

// 486 page

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
				
				Thread t1 = new Thread(new Runnable() {
					@Override
					public void run() {
						try {
							int i = 1;
							while(true) {
								System.out.println("t1 - " + i);
			  				// Thread t1 의 run method 에서 호출함
								//   ㄴ t1 thread 가 실행함								
								Thread.sleep(1000);
								i++;
							}
						}catch(InterruptedException e) { }
						
						System.out.println("Thread 종료");
					} // run
				}); // 익명 클래스
				
				// main method 에서 호출함
				//   ㄴ main thread 가 실행함
				t1.start();
				
				try {
  				// main method 에서 호출함
					//   ㄴ main thread 가 실행함
					// main thread 의 실행이 10 초 중지됨
					// 다음에 나오는 code 는 10 초 이후에 실행됨
					Thread.sleep(10000);
				}catch(InterruptedException e) { }
				
				// main method 에서 호출함
				//   ㄴ main thread 가 실행함
				// main thread 가 t1 thread 의 상태를 interrupted 함
				// t1 입장에서는 자신의 상태
				// Thread.interrupted 가 true 가 됨  
				t1.interrupt();
				
		System.out.println("프로그램 종료");
	} // main

}
