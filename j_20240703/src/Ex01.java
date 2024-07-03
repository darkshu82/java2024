import java.util.ArrayList;

class Fruit {
  public String toString() {
    return "Fruit";
  }
}

class Apple extends Fruit {
  public String toString() {
    return "Apple";
  }
}

class Grape extends Fruit {
  public String toString() {
    return "Grape";
  }
}

class Meat {
  public String toString() {
    return "Meat";
  }
}

class Stake extends Meat {
  public String toString() {
    return "Stake";
  }
}

class Box<T> {
  ArrayList<T> list = new ArrayList<>();

  void add(T t) {
    list.add(t);
  }

  T get(int i) {
    return list.get(i);
  }

  int size() {
    return list.size();
  }

  public String toString() {
    return list.toString();
  }

}

public class Ex01 {
  public static void main(String[] args) {

    Box<Fruit> boxFruit = new Box<>();
    Box<Apple> boxApple = new Box<Apple>();
    Box<Grape> boxGrape = new Box<Grape>();
//  Box<Grape> boxGrape = new Box<Apple>();
    Box<Meat> boxMeat = new Box<>();
    Box<Stake> boxStake = new Box<>();

    boxFruit.add(new Fruit());
    boxFruit.add(new Apple());
    boxFruit.add(new Grape());

    boxApple.add(new Apple());
    boxGrape.add(new Grape());

    boxMeat.add(new Meat());
    boxMeat.add(new Stake());
    boxStake.add(new Stake());

//  Stake는 Fruit 객체의 자식 객체가 아니라서 add 메소드의 argument로 넣을 수 없슴.    
//  boxApple.add(new Stake());

//    boxApple.add((Apple)new Fruit());
//    boxGrape.add((Grape)new Apple());

    System.out.println("boxFruit : " + boxFruit);
    System.out.println("boxApple : " + boxApple);
    System.out.println("boxGrape : " + boxGrape);
    System.out.println("boxMeat : " + boxMeat);
    System.out.println("boxStake : " + boxStake);

  }
}
