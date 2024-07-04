package j_20240704;

public class Ex19 {
	
	public static void main(String[ ]args) {
		System.out.println("프로그램 시작");
		
		// Runnable 인터페이스를 상속한 익명 클래스
		Thread t1 = new Thread(new Runnable() {
                      			@Override
                      			public void run() {
                      				System.out.println("t1 Thread 시작");
                      				for(int i = 0; i < 50; i++) {
                      					System.out.println("t1 - " + i);
                      				}
                      			}
                      		});
		
		Thread t2 = new Thread(new Runnable() {
                    			@Override
                    			public void run() {
                    				System.out.println("t2 Thread 시작");
                    				for(int i = 0; i < 50; i++) {
                    					System.out.println("t2 - " + i);
                    				}
                    			}
                    		});
		
		t1.start();
		t2.start();
		
		System.out.println("프로그램 종료");
	} // main

}
