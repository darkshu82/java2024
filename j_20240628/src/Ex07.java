interface Fax2 {

  String FAX_NUMBER = "02-1234-5678";

  void send(String tel);

  void receive(String tel);
}

class Complexer2 implements Fax2 {
  @Override
  public void send(String tel) {
    System.out.println("Complexer2 클래스의 send() 메소드");
  }

  @Override
  public void receive(String tel) {
    System.out.println("Complexer2 클래스의 receive() 메소드");
  }
}

public class Ex07 {
  public static void main(String[] args) {

    Complexer2 c2 = new Complexer2();
    c2.send("010-985-6532");
    c2.receive("010-985-6532");

    Fax2 f2 = new Fax2() {
      @Override
      public void send(String tel) {
        System.out.println("Fax2를 구현한 익명 클래스의 send() 메소드");
      }

      @Override
      public void receive(String tel) {
        System.out.println("Fax2를 구현한 익명 클래스의 receive() 메소드");
      }
    };

    f2.send("010-985-6532");
    f2.receive("010-985-6532");

  }
}
