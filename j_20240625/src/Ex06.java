
public class Ex06 {
  public static void main(String[] args) {
    
    int[] numbers = new int[5];
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
    numbers[3] = 4;
    numbers[4] = 5;
    
    Person[] p1 = new Person[3];
    p1[0] = new Person();
    p1[1] = new Person();
    p1[2] = new Person();
    
    Car2 car21 = new Car2();
    Car2 car22 = new Car2();
    Car2 car23 = new Car2();
    
    car21.name = "car21";
    car21.color = "white";
    car21.company = "현대";
    car21.type = "중형";
    
    car22.name = "car22";
    car22.color = "darkGreen";
    car22.company = "기아";
    car22.type = "소형";
    
    car23.name = "car23";
    car23.color = "blue";
    car23.company = "쌍용";
    car23.type = "대형";
    
    Car2[] cars = new Car2[3];
    cars[0] = car21;
    cars[1] = car22;
    cars[2] = car23;
    
    System.out.println("cars[0].name : " + cars[0].name);
    System.out.println("cars[0].color : " + cars[0].color);
    System.out.println("cars[0].company : " + cars[0].company);
    System.out.println("cars[0].type : " + cars[0].type);
    System.out.println("=========================================");
    
    System.out.println("cars[1].name : " + cars[1].name);
    System.out.println("cars[1].color : " + cars[1].color);
    System.out.println("cars[1].company : " + cars[1].company);
    System.out.println("cars[1].type : " + cars[1].type);
    System.out.println("=========================================");
    
    System.out.println("cars[2].name : " + cars[2].name);
    System.out.println("cars[2].color : " + cars[2].color);
    System.out.println("cars[2].company : " + cars[2].company);
    System.out.println("cars[2].type : " + cars[2].type);
    System.out.println("=========================================");
    
  }
}

class Car2 {

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

class Person {
  String name = "";
  int age = 0;
}