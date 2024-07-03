package j_20240703;
import java.util.ArrayList;

class Fruit{
	public String toString() { return "Fruit"; }
}
class Apple extends Fruit{
	public String toString() { return "Apple"; }
}
class Grape extends Fruit{
	public String toString() { return "Grape"; }
}
class Meat{
	public String toString() { return "Meat"; }
}
class Stake extends Meat{
	public String toString() { return "Stake"; }
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

public class Ex01 {
	
	public static void main(String[] args) {
		
		// 410 page
		// Generics 설명 추가
  	// Box 클래스의 type parameter 인 <T>에는
  	// 어떤 클래스의 객체(의 주소)도 다 들어올 수 있음
  	// Box box = new Box();
  
  	Box<Fruit> boxFruit = new Box<Fruit>();
  	Box<Apple> boxApple = new Box<Apple>();
  	Box<Grape> boxGrape = new Box<Grape>();
  	
  	System.out.println("boxFruit : " + boxFruit);
  	System.out.println("boxApple : " + boxApple);
  	System.out.println("boxGrape : " + boxGrape);

  	boxFruit.add(new Fruit());
  	// Apple 과 Grape 는 Fruit 의 자식객체라서
  	// add(new Apple()) <-- add 메소드의 argument 로 넣을 수 있음
  	// add(new Grape()) <-- add 메소드의 argument 로 넣을 수 있음
  	boxFruit.add(new Apple());
  	boxFruit.add(new Grape());
  	
  	boxApple.add(new Apple());
  	boxGrape.add(new Grape());
  	
    // Fruit 은 Apple 의 부모객체라서
  	// boxApple.add(new Fruit()); <-- add 메소드의 argument 로 넣을 수 없음
  	// Fruit 은 Fruit 의 부모객체라서
  	// boxGrape.add(new Fruit()); <-- add 메소드의 argument 로 넣을 수 없음
  	
  	// Stake 는 Fruit 의 자식객체가 아니라서
  	// add(new Stake()) <-- add 메소드의 argument 로 넣을 수 없음
  	// boxFruit.add(new Stake());
    
  	// type parameter 의 type 이 일치해야 함
  	// Box<Grape> boxGrape = new Box<Apple>();
  	
  	// Stake 는 Meat 의 자식클래스임
  	Box<Meat> boxMeat   = new Box<Meat>();
  	Box<Stake> boxStake = new Box<Stake>();
  
  	boxMeat.add(new Meat());
  	boxMeat.add(new Stake());
  	boxStake.add(new Stake());
  	
  	System.out.println("=============================");
  	
  	System.out.println("boxFruit : " + boxFruit);
  	System.out.println("boxApple : " + boxApple);
  	System.out.println("boxGrape : " + boxGrape);
  	System.out.println("boxMeat  : " + boxMeat);
  	System.out.println("boxStake : " + boxStake);
		
	}

}
