//SingleTon Design Pattern
//객체를 단 하나만 생성함.

//생성자의 접근 제한자를 private으로 설정해서
//외부에서 이 생성자를 이 클래스의 객체를 생성하지 못하게 함.
//
//생성자가 private으로 되어 있으므로 다른 클래스에서 이 클래스의 객체를 생성할 때,
//생성자를 호출해서 객체를 생성하지 못함.
//
//외부에서 생성자를 호출, 생성할 수 없다.
//이 클래스의 객체는 이 클래스 내부에서만 생성할 수 있다.

class SingletonTest1{
  private static SingletonTest1 singleInstance = new SingletonTest1();
  private SingletonTest1() { }
  
  public static SingletonTest1 getInstance() {
    return singleInstance;
  }
}

class SingletonTest2{
  private static SingletonTest2 singleInstance = new SingletonTest2();
  private SingletonTest2() { }
  
  public static SingletonTest2 getInstance() {
    return singleInstance;
  }
}

public class Ex07 {
  public static void main(String args[]) {
    
    SingletonTest1 st1 = SingletonTest1.getInstance();
    SingletonTest1 st2 = SingletonTest1.getInstance();
    SingletonTest1 st3 = SingletonTest1.getInstance();
    SingletonTest1 st4 = SingletonTest1.getInstance();
    SingletonTest1 st5 = SingletonTest1.getInstance();
    
    System.out.println("st1" + st1);
    System.out.println("st2" + st2);
    System.out.println("st3" + st3);
    System.out.println("st4" + st4);
    System.out.println("st5" + st5);
    System.out.println("==============================================");
    
    SingletonTest2 st21 = SingletonTest2.getInstance();
    SingletonTest2 st22 = SingletonTest2.getInstance();
    SingletonTest2 st23 = SingletonTest2.getInstance();
    SingletonTest2 st24 = SingletonTest2.getInstance();
    SingletonTest2 st25 = SingletonTest2.getInstance();
    
    System.out.println("st21" + st21);
    System.out.println("st22" + st22);
    System.out.println("st23" + st23);
    System.out.println("st24" + st24);
    System.out.println("st25" + st25);
    
  }
}
