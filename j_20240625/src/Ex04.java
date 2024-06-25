
public class Ex04 {
  public static void main(String args[]) {

    Car tico = new Car();
    Car pride = new Car();

    tico.name = "티코";
    tico.color = "화이트";
    tico.company = "대우";
    tico.type = "경차";

    pride.name = "프라이드";
    pride.color = "블랙";
    pride.company = "기아";
    pride.type = "소형";

    tico.go();
    tico.back();

    System.out.println("-------------------------");

    pride.go();
    pride.back();

    System.out.println("-------------------------");

    System.out.println(tico.name + "의 이름 : " + tico.name);
    System.out.println(tico.name + "의 색상 : " + tico.name);
    System.out.println(tico.name + "의 회사 : " + tico.name);
    System.out.println(tico.name + "의 타입 : " + tico.name);

    System.out.println("-------------------------");

    System.out.println(pride.name + "의 이름 : " + pride.name);
    System.out.println(pride.name + "의 색상 : " + pride.name);
    System.out.println(pride.name + "의 회사 : " + pride.name);
    System.out.println(pride.name + "의 타입 : " + pride.name);

  }
}

class Car {

  String name;
  String color;
  String company;
  String type;

  public void go() {
    System.out.println(name + "가 전진하다.");
  }

  public void back() {
    System.out.println(name + "가 후진하다.");
  }
}