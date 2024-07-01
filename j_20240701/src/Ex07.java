import java.util.Objects;

public class Ex07 {
  public static void main(String[] args) {

// Object 클래스의 equals() 메소드
// 기본적으로 객체의 주솟값을 비교해서
// 같은지 다른지 알아보는 메소드
// 주소값이 아니고, 객체의 값을 비교하는 형태로
// overriding 해서 사용하는 경우가 많음.

    String name1 = new String("더조은");
    String name2 = new String("더조은");

    System.out.println("name1 : " + name1);
    System.out.println("name2 : " + name2);

    System.out.println("name1 == name2 : " + (name1 == name2));
    System.out.println("name1.equals(name2) : " + name1.equals(name2));

    Name name3 = new Name("Tom", "Cruise");
    Name name4 = new Name("Tom", "Cruise");

    System.out.println("name3 == name4 : " + (name3 == name4));
    System.out.println("name3.equals(name4) : " + name3.equals(name4));
    System.out.println(name3.hashCode());
    System.out.println(name4.hashCode());
    System.out.println(System.identityHashCode(name3));
    System.out.println(System.identityHashCode(name4));

  }
}

class Name {
  String firstName;
  String lastName;

  Name() {
  }

  Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Name) {
      Name name = (Name) obj;
      return this.firstName.equals(name.firstName) && this.lastName.equals(name.lastName);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName);
  }
}
