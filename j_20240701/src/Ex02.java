
public class Ex02 {
  public static void main(String[] args) {
    
    Tv tv1 = new Tv() {
      @Override
      public void turnOn() {
        System.out.println("TV를 켭니다.");
      }
    };
    
    tv1.turnOn();
    
    Player p1 = new BaseballPlayer();
    Player p2 = new FootballPlayer();
    
    Ex02.playGame(p1);
    Ex02.playGame(p2);
  }
  public static void playGame(Player player) {
    player.play();
  }
}

interface Player{
  void play();
}

class BaseballPlayer implements Player {
  @Override
  public void play() {
    System.out.println("야구 선수가 야구를 합니다.");
  }
}

class FootballPlayer implements Player {
  @Override
  public void play() {
    System.out.println("축구 선수가 야구를 합니다.");
  }
}
abstract class Tv {
  public abstract void turnOn();
}