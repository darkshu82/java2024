
public class Ex08 {
  public static void main(String[] args) {

    Animal1 animal = new Animal1();
    Dog1 dog = new Dog1();
    Cat1 cat = new Cat1();
    Poo1 poo = new Poo1();

    PlayGround pg = new PlayGround();
    pg.play(animal);
    pg.play(dog);
    pg.play(cat);
    pg.play(poo);

  }
}

class PlayGround {
  public void play(Animal1 animal) {
    System.out.println(animal + "이(가) 신나게 놉니다.");
  }
}

class Animal1 {
  @Override
  public String toString() {
    return "Animal1";
  }
}

class Dog1 extends Animal1 {
  @Override
  public String toString() {
    return "Dog1";
  }
}

class Cat1 extends Animal1 {
  @Override
  public String toString() {
    return "Cat1";
  }
}

class Poo1 extends Animal1 {
  @Override
  public String toString() {
    return "Poo1";
  }
}
