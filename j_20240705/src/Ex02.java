
public class Ex02 {
  public static void main(String[] args) {
    System.out.println("프로그램 시작");
    
    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        Thread t1 = new Thread(new Runnable() 
        
        try {
          int i = 1;
          while(true) {
            System.out.println("t1 - " + i);
            i++;
          }
        }catch(InterruptedException e) { }
        System.out.println("Thread 종료");
      }
    });
    
    t1.start();
    
    try {
      Thread.sleep(10000);
    }catch(InterruptedException e) { }
    
    t1.interrupt();
    
    
    
    
    
    System.out.println("프로그램 종료");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}
