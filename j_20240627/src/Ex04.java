
public class Ex04 {
  public static void main(String[] args) {
    
    Child3 ch3 = new Child3();
    ch3.print();    
    
  }
}

class Parent3 {
  int number =3; //부모 멤버변수
  Parent3() {
    System.out.println("부모 객체 생성");
  }
}

class Child3 extends Parent3 {
  int number = 2; //자식 멤버변수
  Child3() {
    System.out.println("자식 객체 생성");
  }
  void print() {
    int number = 1; //지역변수
    System.out.println("number(지역변수) : " + number);
    System.out.println("this.number(해당 클래스의 멤버변수) : " + this.number);
    System.out.println("super.number(부모 클래스의 멤버변수) : " + super.number);
  }
}

