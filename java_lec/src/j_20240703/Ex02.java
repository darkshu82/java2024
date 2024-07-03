package j_20240703;
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

class FruitBox2<T extends Fruit2 & Eatable> extends Box2<T> { }

public class Ex02 {
	
	public static void main(String[] args) {
		
		FruitBox2<Fruit2> boxFruit = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> boxApple = new FruitBox2<Apple2>();
		FruitBox2<Grape2> boxGrape = new FruitBox2<Grape2>();
				  
	  // type parameter 의 type 이 일치해야 함
		// FruitBox<Grape2> boxGrape = new FruitBox<Apple2>();
			
		// FruitBox<T extends Fruit2 & Eatable>
		// <T extends Fruit2 & Eatable> <-- Fruit2 나 Eatable 을 상속받은 객체만 올 수 있음
		//                                  Stake2 는 Fruit2 나 Eatable 을 상속받지 않아서 오류발생함
		// FruitBox<Stake2> boxStake = new FruitBox<Stake2>();

		boxGrape.add(new Grape2());
		boxApple.add(new Apple2());
    // Grape 는 Apple 과 상속 관계가 아니라서
    // Grape 가 Apple 의 자식클래가 아니라서 오류 발생
		// boxApple.add(new Grape2());
		
		System.out.println("boxFruit : " + boxFruit);
  	System.out.println("boxApple : " + boxApple);
  	System.out.println("boxGrape : " + boxGrape);
	}

}




