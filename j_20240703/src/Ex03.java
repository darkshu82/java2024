import java.util.ArrayList;

class Fruit3 implements Eatable {
  public String toString() {
    return "Fruit";
  }
}

class Apple3 extends Fruit3 {
  public String toString() {
    return "Apple";
  }
}

class Grape3 extends Fruit3 {
  public String toString() {
    return "Grape";
  }
}

class Ade {
  String name;

  Ade(String name) {
    this.name = name + " Ade";
  }

  public String toString() {
    return this.name;
  }
}

class MakingAde {
  public static Ade makeAde(FruitBox3<? extends Fruit3> box) {
    String fruitName = "";
    for (Fruit3 fruit : box.getList()) {
      fruitName += fruit + " ";
    }
    return new Ade(fruitName);
  }
}

class Box3<T> {
  ArrayList<T> list = new ArrayList<>();

  void add(T t) {
    list.add(t);
  }

  T get(int i) {
    return list.get(i);
  }

  ArrayList<T> getList() {
    return list;
  }

  int size() {
    return list.size();
  }

  public String toString() {
    return list.toString();
  }
}

class FruitBox3<T extends Fruit3> extends Box3<T> {
}

public class Ex03 {
  public static void main(String[] args) {

    FruitBox3<Fruit3> boxFruit = new FruitBox3<>();
    FruitBox3<Apple3> boxApple = new FruitBox3<Apple3>();
    FruitBox3<Grape3> boxGrape = new FruitBox3<Grape3>();

    boxFruit.add(new Fruit3());
    boxFruit.add(new Apple3());
    boxFruit.add(new Grape3());
    boxApple.add(new Apple3());
    boxGrape.add(new Grape3());

    System.out.println(MakingAde.makeAde(boxFruit));
    System.out.println(MakingAde.makeAde(boxApple));
    System.out.println(MakingAde.makeAde(boxGrape));

  }
}
