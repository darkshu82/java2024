
public class Ex23 {
  public static void main (String args[]) {    
    for(int dan = 2; dan <= 9; dan++) {
      System.out.printf("-- %d단 --%n", dan);
      for(int num = 1; num <= 9; num++) {
        System.out.printf("%d X %d = %d%n", dan, num, dan * num);
      }System.out.println();
    }    
  }
}