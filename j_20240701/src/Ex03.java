
public class Ex03 {
  public static void main(String[] args) {
    
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();
    System.out.println("이름 : " + inner.name);
    
  }
  
}

class Outer{
  class Inner{
    String name = "자바";
  }
}





