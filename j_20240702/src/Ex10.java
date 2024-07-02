import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ex10 {
  public static void main(String[] args) {
    
    Vector v = new Vector();
    for (int i = 0; i <= 5; i++) {
      v.add(i);
    }
    System.out.println("v : " + v);
    
    Enumeration e = v.elements();
    while(e.hasMoreElements()) {
      System.out.print(e.nextElement() + " ");
    }
    
    Iterator iter = v.iterator();
    while(iter.hasNext()) {
      System.out.print(iter.next() + " ");
    }
    
    
    
    
    
  }

}
