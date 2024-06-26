import j_20240626.InitEx;

public class Ex04 {
  public static void main(String args[]) {
    
    System.out.println("프로그램 시작");
    System.out.println("-----------------------------");
    
    System.out.println("init1 객체 생성 - InitEx() 생성자 호출");
    InitEx init1 = new InitEx();
    System.out.println("-----------------------------");
    
    System.out.println("init2 객체 생성 - InitEx() 생성자 호출");
    InitEx init2 = new InitEx();
    
    System.out.println("-----------------------------");
    System.out.println("프로그램 종료");
    
  }
}

class InitEx{
  
  static int number1 = 1;
  int number2 = 20;
  
  static {
    System.out.println("스택틱 초기화 블럭");
    System.out.println("InitEx.number1 : " + InitEx.number1);
    number1 = 2;
    System.out.println("InitEx.number1 : " + InitEx.number1);
  }
  
  {
    System.out.println("인스턴스 초기화 블럭");
    System.out.println("InitEx.number1 : " + InitEx.number1);
    System.out.println("InitEx.number2 : " + number2);
    number1 = 4;
    number2 = 50;
    System.out.println("InitEx.number1 : " + InitEx.number1);
    System.out.println("InitEx.number2 : " + number2);
  }
  
  InitEx() {
    System.out.println("InitEx() 생성자");
    System.out.println("InitEx.number1 : " + InitEx.number1);
    System.out.println("InitEx.number2 : " + number2);
    number1 = 5;
    number2 = 60;
    System.out.println("InitEx.number1 : " + InitEx.number1);
    System.out.println("InitEx.number2 : " + number2);
  }
}