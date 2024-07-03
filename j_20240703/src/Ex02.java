import java.util.ArrayList;

interface Eatable { }

class Fruit2 implements Eatable{
  public String toString() { return "Fruit"; } 
}
class Apple2 extends Fruit2{
  public String toString() { return "Apple"; } 
}
class Grape2 extends Fruit2{
  public String toString() { return "Grape"; } 
}
class Meat2{
  public String toString() { return "Meat"; } 
}
class Stake2 extends Meat2{
  public String toString() { return "Stake"; } 
}

class Box2<T>{
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

// 중요!!
class FruitBox<T extends Fruit2 & Eatable> extends Box2<T>{ }
// 중요!!

public class Ex02 {
  public static void main(String[] args) {
    
    FruitBox<Fruit2> boxFruit = new FruitBox<>();
    FruitBox<Apple2> boxApple = new FruitBox<Apple2>();
    FruitBox<Grape2> boxGrape = new FruitBox<Grape2>();
    
    boxGrape.add(new Grape2());
    boxApple.add(new Apple2());
    
    System.out.println("boxFruit : " + boxFruit);
    System.out.println("boxApple : " + boxApple);
    System.out.println("boxGrape : " + boxGrape);
    
    
  }
}
