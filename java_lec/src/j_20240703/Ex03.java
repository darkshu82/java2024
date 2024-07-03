package j_20240703;
import java.util.ArrayList;

class Fruit3{
	public String toString() { return "Fruit"; }
}
class Apple3 extends Fruit3{
	public String toString() { return "Apple"; }
}
class Grape3 extends Fruit3{
	public String toString() { return "Grape"; }
}

class Stake3{
	public String toString() { return "Stake"; }
}

class Ade{
	String name;
	Ade(String name){
		this.name = name + " Ade";
	}
	public String toString() {
		return this.name;
	}
}

class MakingAde{
	// 메소드의 parameter 로 type parameter 선언하기
	public static Ade makeAde(FruitBox3<? extends Fruit3> box) {
		String fruitName = "";
		for(Fruit3 fruit : box.getList()) {
			fruitName += fruit + " ";
		}
		return new Ade(fruitName);
	}
}

class Box3<T>{
	ArrayList<T> list = new ArrayList<>();
	void add(T t) {
		list.add(t);
	}
	T get(int i) {
		return list.get(i);
	}
	ArrayList<T> getList(){
		return list;
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
}

// <T extends Fruit3>
//   ㄴ type parameter 로 Fruit3 의 객체나 Fruit3 의 자식객체가 들어올 수 있음
class FruitBox3<T extends Fruit3> extends Box3<T> { }

public class Ex03 {
	
	public static void main(String[ ]args) {
		FruitBox3<Fruit3> boxFruit = new FruitBox3<Fruit3>();
		FruitBox3<Apple3> boxApple = new FruitBox3<Apple3>();
		FruitBox3<Grape3> boxGrape = new FruitBox3<Grape3>();
		
		// FruitBox3<T extends Fruit3>
		//            ㄴ Fruit3 나 Fruit3 의 자식클래스만 지정할 수 있음
		// FruitBox3<Stake3> boxStake = new FruitBox3<Stake3>();
		
		boxFruit.add(new Apple3());
		boxFruit.add(new Fruit3());
		boxFruit.add(new Grape3());
		boxFruit.add(new Apple3());
		boxFruit.add(new Grape3());
		
		MakingAde.makeAde(boxFruit);
		MakingAde.makeAde(boxApple);
		MakingAde.makeAde(boxGrape);
	}

}




