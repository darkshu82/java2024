

public class Ex01 {
  public static void main(String[] args) {
    
    Exercise ex1 = Exercise.getInstance();
    Exercise ex2 = Exercise.getInstance();
    
    System.out.println("ex1 == ex2 :" + (ex1 == ex2));
    
    
  }
}

class Exercise{
  private static Exercise exercise = null;
  private Exercise() { }
  
  public static Exercise getInstance() {
    if(exercise == null) {
      exercise = new Exercise();
    }
    return exercise;
  }
}