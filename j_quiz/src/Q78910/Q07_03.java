package Q78910;

public class Q07_03 {
  public static void main(String[] args) {

    Person p = new Person();

    p.name = "홍길동";
    p.gender = "남자";
    p.age = 30;
    p.height = 180;
    p.weight = 75;

    System.out.println("이름: " + p.name);
    System.out.println("성별: " + p.gender);
    System.out.println("나이: " + p.age + "세");
    System.out.println("키: " + p.height + "cm");
    System.out.println("몸무게: " + p.weight + "kg");

  }
}

class Person {

  String name;
  String gender;
  int age;
  int height;
  int weight;

}