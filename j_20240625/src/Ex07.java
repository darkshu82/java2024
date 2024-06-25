
public class Ex07 {
  public static void main(String args[]) {
    System.out.println("Avate.company : " + Avante.company);

    Avante a1 = new Avante();
    System.out.println("a1.color : " + a1.color);
    System.out.println("a1.company : " + a1.company);
    System.out.println("Avante.company : " + Avante.company);
    System.out.println("-----------------------------------");

    Avante a2 = new Avante();
    Avante a3 = new Avante();

    a1.color = "white";
    a2.color = "blue";
    a3.color = "orange";

    System.out.println("a1.color : " + a1.color);
    System.out.println("a2.color : " + a2.color);
    System.out.println("a3.color : " + a3.color);
    System.out.println("-----------------------------------");

    a1.color = "skyblue";
    System.out.println("a1.color : " + a1.color);
    System.out.println("a2.color : " + a2.color);
    System.out.println("a3.color : " + a3.color);
    System.out.println("-----------------------------------");

    a3.color = "pink";
    System.out.println("a1.color : " + a1.color);
    System.out.println("a2.color : " + a2.color);
    System.out.println("a3.color : " + a3.color);
    System.out.println("-----------------------------------");

    System.out.println("a1.company : " + a1.company);
    System.out.println("a2.company : " + a2.company);
    System.out.println("a3.company : " + a3.company);
    System.out.println("-----------------------------------");

    a1.company = "기아";
    System.out.println("a1.company : " + a1.company);
    System.out.println("a2.company : " + a2.company);
    System.out.println("a3.company : " + a3.company);
    System.out.println("-----------------------------------");

    a2.company = "벤츠";
    System.out.println("a1.company : " + a1.company);
    System.out.println("a2.company : " + a2.company);
    System.out.println("a3.company : " + a3.company);
    System.out.println("-----------------------------------");

    a3.company = "쌍용";
    System.out.println("a1.company : " + a1.company);
    System.out.println("a2.company : " + a2.company);
    System.out.println("a3.company : " + a3.company);

  }
}

class Avante {
  String color;
  static String company = "현대";
}