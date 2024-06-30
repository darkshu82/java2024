package Q34567;

public class Q04_05 {
  public static void main(String[] args) {
    
    int year = 2020;
    boolean leapYear = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
        System.out.println(leapYear);
    
  }
}
