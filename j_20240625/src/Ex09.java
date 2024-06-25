
class Local {
  String name;

  void process() {
    name = "더조은";
  }

  void printAge1() {
    int age = 20;
    System.out.println("age in printAge1() : " + age);
  }

  void printAge2() {
    int age = 30;
    System.out.println("age in printAge2() : " + age);
  }
}

public class Ex09 {
  public static void main(String args[]) {

    Local local = new Local();
    System.out.println("local.name : " + local.name);

    local.process();
    System.out.println("local.name : " + local.name);

    local.printAge1();
    local.printAge2();

    int temp = 0;
    for (int i = 0; i < 10; i++) {
      temp += i;
      System.out.println("temp : " + temp);
    }
    System.out.println("---------------");
    System.out.println("temp : " + temp);

  }
}