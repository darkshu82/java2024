import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11 {
  public static void main(String[] args) {
    
    Map map = new  HashMap();
    
    String[] names = new String[] {"홍길동", "김유신", "이순신", "강감찬", "김유신"};
    int[] scores = new int[] {98, 85, 92, 76, 88};
    
    // map.put(키, 밸류);
    for(int i = 0; i < names.length; i++) {
      map.put(names[i], scores[i]);
    }
    System.out.println("map : " + map);
    System.out.println("홍길동 성적 : " + map.get("홍길동") + " 점");
    System.out.println("김유신 성적 : " + map.get("김유신") + " 점");
    System.out.println("이순신 성적 : " + map.get("이순신") + " 점");
    
    Set<String> keys = map.keySet();
    System.out.println("keys : " + keys);
    
    for(String name : keys) {
      System.out.print(name + " : " + map.get(name) + " ");
    }
    System.out.println("\n=============================================");
    
    Iterator iter= keys.iterator();
    while(iter.hasNext()) {
      String name = (String)iter.next();
      System.out.print(name + " : " + map.get(name) + " ");
    }
    System.out.println("\n=============================================");
    System.out.println("map : " + map);
    
    Collection<Integer> values = map.values();
    
    for(Object obj : values) {
      System.out.print(obj + " ");
    }
    System.out.println("\n=============================================");
    
    Set entry = map.entrySet();
    for(Object obj : entry) {
      Map.Entry m = (Map.Entry)obj;
      System.out.println("key : " + m.getKey() + ", value : " + m);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}
