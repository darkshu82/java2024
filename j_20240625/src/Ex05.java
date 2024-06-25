
public class Ex05 {
  public static void main(String[] args) {
    
    Tv tv1 = new Tv();
    Tv tv2 = new Tv();
    
    tv1.name = "tv1";
    tv2.name = "tv2";
    
    tv1.onOff();
    System.out.println("tv1의 채널 : " + tv1.channel);
    tv1.upChannel();
    System.out.println("tv1의 채널 : " + tv1.channel);
    tv1.upChannel();
    System.out.println("tv1의 채널 : " + tv1.channel);
    tv1.downChannel();
    System.out.println("tv1의 채널 : " + tv1.channel);
    tv1.onOff();
    System.out.println("-------------------------------------------");
    
    tv2.onOff();
    System.out.println("tv1의 채널 : " + tv2.channel);
    tv2.upChannel();
    System.out.println("tv1의 채널 : " + tv2.channel);
    tv2.upChannel();
    System.out.println("tv1의 채널 : " + tv2.channel);
    tv2.downChannel();
    System.out.println("tv1의 채널 : " + tv2.channel);
    tv2.onOff();
    
  }
}

class Tv {
  String name;
  String color;
  int channel;
  boolean power;

  public void onOff() {
    if (power == false) {
      System.out.println(name + "을 켭니다");
    } else {
      System.out.println(name + "을 끕니다");
    }
    power = !power;
  }

  public void upChannel() {
    System.out.println(name + "의 채널을 올립니다.");
    channel++;
  }

  public void downChannel() {
    System.out.println(name + "의 채널을 내립니다.");
    channel--;
  }

}
