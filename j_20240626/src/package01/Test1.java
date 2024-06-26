package package01;

import package02.pac.Test2;

public class Test1 {
  
  public static void main(String[] args) {
    
    // 같은 package 에 있는 Test1 클래스에서
    // Professor 클래스의 객체를 생성함
    Professor p1 = new Professor();
    System.out.println("p1 : " + p1);
    
    // 다른 package 에 있는 Test1 클래스에서
    // Test2 클래스의 객체를 생성함
    // Test2 클래스의 접근제한자는 public 임
    Test2 t2 = new Test2();
    System.out.println("t2 : " + t2);
    
  }
  
  // toString() overriding
  public String toString() {
    return "Test1";
  }

}

// 접근제한자를 써 주지 않으면 default 가 됨
// default : 같은 package, 같은 class 에서 접근 가능함
class Professor{
  
  // toString() overriding
  public String toString() {
    return "Professor";
  }
  
}