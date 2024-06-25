
public class Ex15 {
  
  public static void main(String args[]) {
    
    School sch1 = new School();
    
  }

}

  /*
     생성자 : new 연산자에 의해서 확보된 메모리 공간에
              클래스의 멤버변수들을 초기화해 주는 메소드
              
              클래스이름과 같은 이름의 메소드
              
              모든 생성자는 return 값이 없으므로 
              void 라는 return type 도 지정하지 않음
              
              일반 메소드와 같이 참조변수.메소드() 형태로 호출할 수 없고
              항상 new 연산자와 같이 작성해서 호출함
  */

class School{
  String name;
  String address;
  
  // 기본생성자 : default contructor
  // ㄴ parameter 가 없는 생성자
  // 클래스 안에 생성자를 하나도 작성하지 않으면
  // compile 할 때 compiler 가 자동으로 작성해 줌
  School(){ }
  void go() {} 
  
}




