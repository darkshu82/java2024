
public class Ex04 {
  public static void main(String args[]) {
    
    System.out.println("프로그램 시작");
    System.out.println("-----------------------------");
    
    System.out.println("init1 객체 생성");
    InitEx init1 = new InitEx();
    
    
    System.out.println("init2 객체 생성");
    InitEx init2 = new InitEx();
    
    System.out.println("프로그램 종료");
    
  }
}

class InitEx{
  
  static {
    System.out.println("스택틱 초기화 블럭");
  }
  
  {
    System.out.println("인스턴스 초기화 블럭");
  }
  
  InitEx() {
    System.out.println("InitEx() 생성자");
  }
}