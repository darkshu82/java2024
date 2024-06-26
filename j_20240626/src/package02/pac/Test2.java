package package02.pac;

import package01.Test1;

public class Test2 {
  public static void main(String[] args) {
    
    // 다른 package 에 있는 Test2 클래스에서
    // Professor 클래스의 객체를 생성 못함
    // Professor 클래스의 접근제한자는 default 임
    //  ㄴ import 자체가 안 됨
    // Professor p1 = new Professor();
    // System.out.println("p1 : " + p1);
    
    // 다른 package 에 있는 Test2 클래스에서
    // Test1 클래스의 객체를 생성함
    // Test1 클래스의 접근제한자는 public 임
    Test1 t1 = new Test1();
    System.out.println("t1 : " + t1);
    
    
  }
  
  // toString() overriding
  public String toString() {
    return "Test2";
  }

}
