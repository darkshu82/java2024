
public class Ex01 {
  public static void main(String[] args) {
    
    SmartPhone sp1 = new SmartPhone();
    sp1.name = "갤럭시";
    sp1.color = "white";
    sp1.company = "삼성";
    
    sp1.call();
    sp1.receive();
    sp1.installApp();
    
    SmartPhone sp2 = new SmartPhone();
    sp2.name = "아이폰";
    sp2.color = "black";
    sp2.company = "애플";
    
    sp2.call();
    sp2.receive();
    sp2.installApp();
    
    Phone p1 = new Phone();
    p1.name = "모토로라";
    p1.color = "white";
    p1.company = "모토로라";
    
    p1.call();
    p1.receive();
    
    Phone p2 = p1;
    
    Phone p3 = sp1;
    Phone p4 = sp2;
    
//  부모는 하나니까 생략가능
    p2 = sp1;
    p2 = (Phone)sp2;
    
//  자식은 여럿이라 생략 불가능 instanceof 사용
    if(p2 instanceof SmartPhone) {
      sp1 = (SmartPhone)p2;
    } else {
      System.out.println("p2은 SmartPhone 타입이 아닙니다.");
    }
    
    if(p1 instanceof SmartPhone) {
      sp1 = (SmartPhone)p1;
    } else {
      System.out.println("p1은 SmartPhone 타입이 아닙니다.");
    }
    
    if(p1 instanceof SmartPhone) {
      sp2 = (SmartPhone)p1;
    } else {
      System.out.println("p1은 SmartPhone 타입이 아닙니다.");
    }
    if(p2 instanceof SmartPhone) {
      sp2 = (SmartPhone)p2;
    } else {
      System.out.println("p2은 SmartPhone 타입이 아닙니다.");
    }
    
    
  }
}

class Phone {
  String name;
  String color;
  String company;
  
  Phone(){ }
  
  void call() {
    System.out.println(this.name + " (으)로 전화를 건다.");
  }
  
  void receive() {
    System.out.println(this.name + " (으)로 전화를 받는다.");
  }
}  

class SmartPhone extends Phone {
  String serialNumber;
  
  SmartPhone(){
    super();
  }  
  @Override
  void call() {
    System.out.println(this.name + " 스마트폰으로 전화를 건다.");
  }
  @Override
  void receive() {
    System.out.println(this.name + " 스마트폰으로 전화를 받는다.");
  }
  void installApp() {
    System.out.println(this.name + " 스마트폰으로 앱을 설치한다.");    
  }  
}
  
  
