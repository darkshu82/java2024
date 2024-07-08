import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex01 {
  public static void main(String[] args) {
    
    String[] member = {"hong,홍길동,30", "lee,이순신,40", "kim,김유신,50"};
    
    for(int i = 0; i < member.length; i++) {
      System.out.println(member[i].split(",")[1]);
    }
    
    int ageSum = 0;
    for(int i = 0; i < member.length; i++) {
      ageSum += Integer.parseInt(member[i].split(",")[2]);
    }
    
    System.out.println("평균나이 : " + (double)ageSum/member.length);
    
    
    // 13장 3번
    
    MemberEx me1 = new MemberEx("hong", "홍길동", 30);
    MemberEx me2 = new MemberEx("lee", "이순신", 40);
    MemberEx me3 = new MemberEx("kim", "김유신", 50);
    
    List<MemberEx> memberList = new ArrayList<>();
    memberList.add(me1);
    memberList.add(me2);
    memberList.add(me3);
    
    for(int i = 0; i < memberList.size(); i++) {
      MemberEx me = (MemberEx)memberList.get(i);
      System.out.println(me.getId() + ", " + me.getName() + ", " + me.getAge());
    }
    
    
    // 15장 2번
    

    
    
    
    
    Interfacelambda il = new Interfacelambda() {
      @Override
      public int sum(int x, int y) {
        System.out.println(il.sum);
      }
    };
    
    
    // 16장 2번
    
    String[] arr = new String[] {"a", "b", "c", "d", "e", "f"};
       
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    
    for(String alphabet : arr) {
      System.out.print(alphabet + " ");
    }
    
    Stream<String> streamStr = Arrays.stream(arr);
    streamStr.forEach(alphabet -> System.out.print(alphabet + " "));
    
    // 병렬처리로 순서가 일정하지 않다.
    streamStr = Arrays.asList(arr).parallelStream();
    streamStr.forEach(alphabet -> System.out.print(alphabet + " "));
    
    
    
  } // main
}
// 13장 3번
class MemberEx{
  String id;
  String name;
  int age;
}

MemberEx(String id, String name, int age){
  this.id = id;
  this.name = name;
  this.age = age;
}
// getter
public String getId() {
  return this.id;
}
public String getName() {
  return this.name;
}
public int getAge() {
  return this.age;
}


// setter





@Override
public String toString() {
  System.out.format("%s, %s, %d", this.id, this.name, this.age);
}


// 15장 2번
@FunctionalInterface
interface Interfacelambda{
  int sum(int x, int y);
}



