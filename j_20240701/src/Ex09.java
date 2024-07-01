import java.util.Objects;

class Student {
  String name;
  int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Student) {
      Student s = (Student) obj;
      return this.name.equals(s.name) && this.age == s.age;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }
}

public class Ex09 {
  public static void main(String[] args) {

    Student s1 = new Student("이순신", 46);
    Student s2 = new Student("이순신", 46);

    System.out.println("s1.equals(s2) : " + s1.equals(s2));
    System.out.println("s1.hashCode() == s2.hashCode() : " + (s1.hashCode() == s2.hashCode()));
    
    System.out.println(System.identityHashCode(s1));
    System.out.println(System.identityHashCode(s2));
  }

}
