package j_20240627;

public class Ex01 {
  public static void main(String[] args) {
    SmartPhone sp1 = new SmartPhone();
    sp1.name = "갤럭시";
    sp1.color = "white";
    sp1.company = "삼성";
    
    
    
  }
}

Class Phone {
  String name;
  String color;
  String company;
  
  Phone(){ }
  
  void call() {
    System.out.println(this.name + " (으)로 전화를 건다");
  }
  void receive() {
    System.out.println(this.name + " (으)로 전화를 받다");
  } 
}

class SmartPhone extends Phone {
  String serialNumber;
}








