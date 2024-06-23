
public class Q05_07 {
  public static void main(String[] args) {
    
    int rollCount = 0;
    int diceRoll = 0;
    
    while(diceRoll != 6) {
      diceRoll = (int)(Math.random() * 6) + 1;
      rollCount++;
      System.out.printf("주사위 : (%d)%n", diceRoll);
    }
    System.out.printf("총 주사위 굴린 횟수는 : %d 회%n", diceRoll);
  }
}
