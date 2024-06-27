
public class Ex06 {
  public static void main(String[] args) {

    Animal a1 = new Dog();
    Animal a2 = new Cat();
    Animal a3 = new Eagle();
    Animal a4 = new Dolphin();

    System.out.println("a1 : " + a1.toString());
    System.out.println("a1 : " + a1);
    System.out.println("a2 : " + a2);
    System.out.println("a3 : " + a3);
    System.out.println("a4 : " + a4);

    System.out.println("===========================================");

    Animal[] anis = new Animal[7];
    anis[0] = new Animal();
    anis[1] = new Dog();
    anis[2] = new Cat();
    anis[3] = new Animal();
    anis[4] = new Eagle();
    anis[5] = new Dolphin();
    anis[6] = new Cat();

    for (Animal ani : anis) {
      System.out.print(ani + " ");
    }
    System.out.println("=================================");

    for (int i = 0; i < anis.length; i++) {
      System.out.print(anis[i] + " ");
    }
    System.out.println("=================================");

    Dog dog = new Dog();
    Cat cat = new Cat();
    Eagle eagle = new Eagle();
    Dolphin dolphin = new Dolphin();

    Animal ani1 = new Dog();
    Animal ani2 = new Cat();
    Animal ani3 = new Eagle();
    Animal ani4 = new Dolphin();

    Dog d1 = new Dog();
    // Dog d2 = new Cat();
    // Dog d3 = new Eagle();
    // Dog d4 = new Dolphin();

    // Cat c1 = new Dog();
    Cat c2 = new Cat();
    // Cat c3 = new Eagle();
    // Cat c4 = new Dolphin();

    // Eagle e1 = new Dog();
    // Eagle e2 = new Cat();
    Eagle e3 = new Eagle();
    // Eagle e4 = new Dolphin();

    // Dolphin dolphin1 = new Dog();
    // Dolphin dolphin2 = new Cat();
    // Dolphin dolphin3 = new Eagle();
    Dolphin dolphin4 = new Dolphin();

    Animal ani0 = new Animal();
    ani0.sound();
    d1.sound();
    c2.sound();
    e3.sound();
    dolphin4.sound();
    System.out.println("\n===========================================");

    for (int i = 0; i < anis.length; i++) {
      // System.out.println(anis[i]);
      anis[i].sound();
    }
    System.out.println("\n===========================================");

  }
}

class Animal {
  public void sound() {
    System.out.println(this + "(이)가 소리를 냅니다. ~~ 멍멍");
  }

  @Override
  public String toString() {
    return "Animal";
  }
}

class Dog extends Animal {
  @Override
  public void sound() {
    System.out.println(this + "(이)가 소리를 냅니다. ~~ 야옹");
  }

  @Override
  public String toString() {
    return "Dog";
  }
}

class Cat extends Animal{
  @Override
  public void sound() {
    System.out.println(this + "(이)가 소리를 냅니다. ~~ 멍멍");
  }
  @Override
  public String toString() {
    return "Cat";}
  }

class Eagle extends Animal {
  @Override
  public void sound() {
    System.out.println(this + "(이)가 소리를 냅니다. ~~ 이글이글");
  }

  @Override
  public String toString() {
    return "Eagle";
  }
}

class Dolphin extends Animal {
  @Override
  public void sound() {
    System.out.println(this + "(이)가 소리를 냅니다. ~~ 돌돌");
  }

  @Override
  public String toString() {
    return "Dolphin";
  }
}
