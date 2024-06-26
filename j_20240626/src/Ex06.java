import static package01.PackageTest1.staticMethod1;
import package01.*;
import package02.pac.PackageTest2;

public class Ex06 {
  public static void main(String args[]) {
    PackageTest1 pt1 = new PackageTest1();
    PackageTest3 pt3 = new PackageTest3();
    
    PackageTest2 pt2 = new PackageTest2();
    
    PackageTest1.staticMethod1();
    staticMethod1();    
    
    pt1.instanceMethod1();
//  package01.PackageTest1 pt1 = new package01.PackageTest1();
  }
}
