import java.util.ArrayList;
import java.util.List;

public class Ex14 {
  public static void main(String[] args) {
    
    List list = new ArrayList();
    
    Member m1 = new Member();
    m1.setName("홍길동");
    m1.setId("tjoeun");
    m1.setPassword("1234");
    m1.setAge(36);
    list.add(m1);
    
    Member m2 = new Member();
    m2.setName("이순신");
    m2.setId("tjoeun");
    m2.setPassword("1234");
    m2.setAge(36);
    list.add(m2);
    
    Member m3 = new Member();
    m3.setName("정약용");
    m3.setId("korea");
    m3.setPassword("3453");
    m3.setAge(30);
    list.add(m3);
    
    System.out.println("list.size() : " + list.size());
    
    for(int i = 0; i < list.size(); i++) {
      System.out.printf("idx : %d, 이름 : %s, 아이디 : %s, 비밀번호 : %s, 나이 : %d%n",
                        i,
                        ((Member)list.get(i)).getName(),
                        ((Member)list.get(i)).getId(),
                        ((Member)list.get(i)).getPassword(),
                        ((Member)list.get(i)).getAge());
    }
    
    System.out.println("===================================================================");
    
    List<Member> list2 = 
    list2.add(m1);
    list2.add(m2);
    list2.add(m3);
    
    
  }
}

class Member{
  private String name;
  private String id;
  private String passwword;
  private int age;
  
  public void setName(String name) {
    if(name.length() >= 3) {
      this.name = name;
    }else {
      System.out.println(" ");
    }
  }
  public void setId(String id) {
    this.id = id;
  }
  public void setPassword(String passwword) {
    this.passwword = passwword;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getName() {
    return this.name;
  }
  public String getId() {
    return this.id;
  }
  public String getPassword() {
    return this.passwword;
  }
  public int getAge() {
    return this.age;
  }
  
  
  
  
  
  
}




