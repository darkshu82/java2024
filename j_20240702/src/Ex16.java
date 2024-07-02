import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex16 {
  public static void main(String[] args) {
    
    List<Map<String, Object>> list = new ArrayList<>();
    
    Map<String, Object> m = new HashMap<>();
    m.put("name", "홍길동");
    m.put("id", "hong");
    m.put("age", "30");
    list.add(m);
    
    Map<String, Object> m = new HashMap<>();
    m.put("name", "이순신");
    m.put("id", "less");
    m.put("age", "46");
    list.add(m);
    
    Map<String, Object> m = new HashMap<>();
    m.put("name", "김유신");
    m.put("id", "kim");
    m.put("age", "50");
    list.add(m);
    
    System.out.println("list.size() : " + list.size());
    
    for(int i = 0; i < list.size(); i++) {
      System.out.printf("idx : %d, 이름 : %s, 아이디 : %s, 비밀번호 : %s, 나이 : %d%n",
                        i,
                        list.get(i).get("name"),
                        list.get(i).get("id"),
                        list.get(i).get("age"));
    }
    
    System.out.println("===================================================================");
    
    
    
    
    
    
  }
}
