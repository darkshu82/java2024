import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Ex07 {
  public static void main(String[] args) {
    
    // Object type 의 배열 생성
    //  ㄴ 서로다른 type 의 data를 저장할 수 있음.
    Object[] arrObj = new Object[] {"홍길동", "이순신","홍길동","이순신", 1, 2, "1", "2"};
    System.out.println("arrObj : " + Arrays.toString(arrObj));
    
    List list = Arrays.asList(arrObj);
    System.out.println("list : " + list);
    
    Set set1 = new HashSet(list);
    System.out.println("set1 : " + set1);
    
    Set set2 = new HashSet(list);
    
    
    for(int i = 0; i < arrObj.length; i++) {
      set2.add(arrObj[i]);
    }
    System.out.println("set2 : " + set2);
    System.out.println("=============================");
    
    Set set = new HashSet();
    
    set.add(new String("hello"));
    set.add(new String("hello"));
    
    System.out.println("set : " + set);
    
    set.add(new Student("더조은", 21));
    
    System.out.println("set : " + set);
    
    
  } // main
}

class Student{
  String name;
  int age;
  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Student) {
      Student s = (Student)obj;
      return this.name == s.name && this.age == s.age;
    }else {
      return false;
    }
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.name) + Objects.hashCode(age);
  }
  @Override
  public String toString() {
    return this.name + " : " + this.age;
  }
  
  
}






