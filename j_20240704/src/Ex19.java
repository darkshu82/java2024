
public class Ex19 {
  public static void main(String[] args) {
    
    Thread t1 = new Thread() {
                              @Override
                              public void run() {
                                System.out.println("t1 Thread 시작");
                                for (int i = 0; i < 50; i++) {
                                  System.out.println("t1 - " + i);
                                }
                              }
                            };
    
    Thread t2 = new Thread() {
                              @Override
                              public void run() {
                                System.out.println("t2 Thread 시작");
                                for (int i = 0; i < 50; i++) {
                                  System.out.println("t2 - " + i);
                                }
                              }
                            };
                  
    t1.start();
    t2.start();
    
    
  }
}
