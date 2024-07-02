import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex09 {
  public static void main(String[] args) {
  	
  	// 380 page
  	List fruits = new ArrayList();
  	fruits.add("포도");
  	fruits.add("사과");
  	fruits.add("배");
  	fruits.add("망고");
  	fruits.add("복숭아");
  	
    System.out.println("fruits : " + fruits);
    System.out.println("=============================================");
    
  	for(int i = 0; i < fruits.size(); i++) {
  		System.out.print(fruits.get(i) + " ");	
  	}
  	System.out.println("\n=============================================");
  	
  	for(Object obj : fruits) {
  		String fruit = (String)obj;
  		System.out.print(fruit + " ");
  	}
  	System.out.println("\n=============================================");
  	
  	// Iterator 객체는 list 에서 iterator() 를 호출해서 생성함
  	// 포도 사과 배 망고 복숭아 
  	Iterator iter = fruits.iterator();
  	while(iter.hasNext()) {
  		System.out.print(iter.next() + " ");
  	}
  	System.out.println("\n=============================================");
  	System.out.println("fruits : " + fruits);
  	
  	// Iterator 객체를 일회용이라서 한 번 생성해서 사용하고나서
  	// 또다시 사용하려면 iterator() 메소드를 다시 호출해야 됨
  	iter = fruits.iterator();
  	while(iter.hasNext()) {
  		System.out.print(iter.next() + " ");
  		iter.remove();
  	}
  	System.out.println("\n=============================================");
  	System.out.println("fruits : " + fruits);
  	
  }
}
