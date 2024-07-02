import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex09 {
  public static void main(String[] args) {
    
    List fruits = new ArrayList();
    fruits.add("포도");
    fruits.add("사과");
    fruits.add("배");
    fruits.add("망고");
    fruits.add("복숭아");
    
    System.out.println("fruits : " + fruits);
    
    for(int i = 0; i < fruits.size(); i++) {
      System.out.print(fruits.get(i) + " ");
    }
    System.out.println("\n======================================");
    
    for(Object obj : fruits) {
      String fruit = (String)obj;
      System.out.print(fruit + " ");
    }
    System.out.println("\n======================================");
    
    Iterator iter = fruits.iterator();
    while(iter.hasNext()) {
      System.out.print(iter.next() + " ");
    }
    
    
  }
}






