
public class Ex01 {
  
  public static void main(String[] args) {
    
   
    
    
    
    
    
    
    
  }

}

abstract class Student{
  
  String name;
  int age;
  String address;
  
  public void displayMember() {
    System.out.printf("이름 : %s, 나이 : %d, 주소 : %s%n", name, age, address);
  }
  
  public abstract void displayMember2();
  
}

class Student extends Person {
  String studNumber;
  
  public void study() {
    System.out.printf("%s 은 공부를 합니다%n", this.name);
  }
  
  @Override
  public void displayMember2() {
    System.out.printf("이름 : %s, 나이 : %d, 주소 : %s%n", name, age, address);
  }
  
}









