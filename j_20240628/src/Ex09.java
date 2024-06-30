
public class Ex09 {

}

class Outer {
  
  private int outerInstanceVariable = 10;
  static int outerStaticVariable = 20;
  
  class InstanceInner {
    int iiv1 = outerInstanceVariable;
    int iiv2 = outerStaticVariable;
  }            
  
  static class StaticInner {
    int iiv = outerStaticVariable;    
  }
  
  InstanceInner iiv = new InstanceInner();  
  static StaticInner cv = new StaticInner();
  
  static void Method() {
    StaticInner cv = new StaticInner();
    Outer outer = new Outer();
    InstanceInner iv3 = outer.new InstanceInner();
  }
  
  void instanceMethod() {
    InstanceInner iv4 = new InstanceInner();
    StaticInner cv2 = new StaticInner();
  }
  
  void method1() {
    int lv = 10;
    final int LV = 20;
    
    class LocalInner{
      int iv = 10;
      final int FINAL = 20;
      
      int liv1 = outerInstanceVariable;
      int liv2 = outerStaticVariable;
      int liv3 = iv;
      int liv4 = LV;
    }
    LocalInner li = new LocalInner();
  }
  
}