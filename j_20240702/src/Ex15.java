import java.util.ArrayList;
import java.util.List;

public class Ex15 {
  public static void main(String[] args) {
    
    Generic2<String, Integer> gen1 = new Generic2<>();
    gen1.set("홍길동", 1111);
    System.out.println("name : " + gen1.getName());
    System.out.println("id : " + gen1.getId());
    
    Generic2<String, String> gen2 = new Generic2<>();
    gen1.set("홍길동", "3333");
    System.out.println("name : " + gen2.getName());
    System.out.println("id : " + gen2.getId());    
    System.out.println("============================================");
    
    List<Integer> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    List<Boolean> list3 = new ArrayList<>();
    List<Character> list4 = new ArrayList<>();
    
    list1.add(100);
    list1.add(200);
    // list1.add("300");
    
    // list2.add(100);
    // list2.add(200);
    list2.add("300");

    list3.add(false);
    list3.add(true);
    // list3.add("300");
    
    list4.add('1');
    list4.add('2');
    // list4.add("3");
    
    
    
    
    
    
    
    
    
    
    
  }
}

class Generic2<K, V>{
  K name;
  V id;
}

void set(K name, V id) {
  this.name = name;
  this.id = id;
}

K getName() {
  
}

K getId() {
  
}






















