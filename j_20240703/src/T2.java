import java.util.ArrayList;

public class T2 {
  public static void main(String[] args) {
    
    Box<Fruit> boxFruit = new Box<>();
    Box<Apple> boxApple = new Box<>();
    Box<Grape> boxGrape = new Box<>();
    
    Box<Meat> boxMeat = new Box<>();
    Box<Stake> boxStake = new Box<>();
  }
}

class Fruit{
  public String toString() { return "Fruit";}
}
class Apple extends Fruit{
  public String toString() { return "Apple";}
}
class Grape extends Fruit{
  public String toString() { return "Grape";}
}
class Meat{
  public String toString() { return "Meat";}
}
class Stake extends Meat{
  public String toString() { return "Stake";}
}

class Box<T>{
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














