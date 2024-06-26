
public class Ex05 {
  public static void main(String args[]) {

  }
}

class InitEx2 {

  // static 변수
  static int cv;
  // instance 변수
  int iv;

  public static void staticMethod1() {
    cv = 11;
    // static method에서는 instance를 사용 못함
    // iv = 22;
    // instanceMethod1();
    // instanceMethod2();

    // this는 객체 생성 이후에야
    this.iv = 222;

  }

  public static void staticMethod2() {
    InitEx2 init2 = new InitEx2();
    init2.iv = 111;
    init2.instanceMethod1();
    init2.instanceMethod2();

  }

  public void instanceMethod1() {
    cv = 11;
    // instance method에서는 instance를 사용 할 수 있슴
    iv = 22;
  }

  public void instanceMethod2() {

    // instance 초기화블럭, 생성자, method 안에서만
    // this를 사용 할 수 있슴
    this.iv = 333;
    iv = 555;
    // instance에서는 static도 접근 가능함.
    cv = 777;

    // this나 참조변수 보다는 클래스 이름으로 접근하는 것이 바람직함.
    this.cv = 999;
    InitEx2.cv = 999;

  }

}