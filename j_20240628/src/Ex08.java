
public class Ex08 {
  public static void main(String[] args) {
    System.out.println("InstanceInner.FINAL : " + InstanceInner.FINAL);
    System.out.println("StaticInner.FINAL : " + StaticInner.cv);
    
  }
  
  public class InstanceInner{
    int iv = 100;
    static final int FINAL = 100;
  }
  
  public static class StaticInner{
    int iv = 200;
    static int cv = 200;
  }
  
  void method1() {
    class LocalInner{
      int iv = 300;
      static final int FINAL = 500;
    }
  }
  
  
}
