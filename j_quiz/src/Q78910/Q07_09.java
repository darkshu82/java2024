package Q78910;

public class Q07_09 {
  public static void main(String[] args) {
    Excercise ex1 = Excercise.getIntence();
    Excercise ex2 = Excercise.getIntence();
    
    System.out.println("ex1 == ex2 :" + (ex1 == ex2));
  }
}

class Excercise {
  private static Excercise instance; 
  
  private Excercise() { }
  
  public static Excercise getIntence() {    
    if(instance == null) {
      instance = new Excercise();
    }
    return instance;
  }
  
}









