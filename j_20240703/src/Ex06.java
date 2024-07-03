
@FunctionalInterface
interface Inter05{
  void method();
}

class Outer{
  public int iv = 10;
  void method() {
    final int iv = 40;
    Inter05 i5 = () -> {
      System.out.println("Outer.this.iv : " + Outer.this.iv);
      System.out.println("this.iv : " + this.iv);
      System.out.println("iv : " + iv);
    };
    i5.method();
  }
}

public class Ex06 {
  public static void main(String[] args) {
    
    Outer outer = new Outer();
    outer.method();
    
    
    
    
    
    
    
    
    
    
  }
}
