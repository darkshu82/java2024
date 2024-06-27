package j_20240627;

public class Ex08 {
	
	public static void main(String[] args) {
		
		Animal1 animal = new Animal1();
		Dog1 dog = new Dog1();
		Cat1 cat = new Cat1();
		Pooh1 pooh = new Pooh1();
		
		PlayGround pg = new PlayGround();
		pg.play(animal);
		pg.play(dog);
		pg.play(cat);
		pg.play(pooh);
		
	}

}
class PlayGround{
	// parameter(매개변수) 의 다형성 - 223 page
	public void play(Animal1 animal) {
		System.out.println(animal + "이(가) 신나게 놉니다");
	}
}

class Animal1{
	@Override
	public String toString() {
		return "Animal";
	}
}
class Dog1 extends Animal1{
	@Override
	public String toString() {
		return "Dog";
	}
}
class Cat1 extends Animal1{
	@Override
	public String toString() {
		return "Cat";
	}
}
class Pooh1 extends Animal1{
	@Override
	public String toString() {
		return "Pooh";
	}
}



