
public class Ex10 {
  public static void main(String[] args) {
    
    Outer2 outer = new Outer2();
    Outer2.Inner inner = outer.new Inner();
    inner.method1();
    
  }
}

class Outer2 {
  int value = 10;
  
  class Inner{
    int value = 20;
    
    void method1() {
      int value = 30;
      
      System.out.println("value(내부 메소드의 지역변수) : " + value);
      System.out.println("value(내부 클래스의 지역변수) : " + this.value);
      System.out.println("value(외부 클래스의 지역변수) : " + Outer2.this.value);
    }
  }
}

