
public class Q04_04 {
  public static void main(String[] args) {
    
    int age = 4;
    int height = 125;
    boolean parent = true;
    boolean hearchDease = false;    
    boolean canRide = !hearchDease && ((age >=6) || (height >= 120 && parent));
    
    if(canRide) {
    System.out.println("롤러코스터 탑승 가능");    
    } else {
      System.out.println("롤러코스터 탑승 불가"); 
    }
    
  }
}
