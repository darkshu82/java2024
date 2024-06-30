package Q78910;
public class Q08_03 {
  public static void main(String[] args) {

    Warrior w = new Warrior();

    w.hp = 300;
    w.power = 100;
    w.weapon = 200;
    
    System.out.println("hp : " + w.hp + ", power : " + w.power + ", weapon : " + w.weapon);
    w.defence(null);
    
    Gladiator g = new Gladiator();

    g.hp = 500;
    g.power = 100;
    g.shield = 300;

    System.out.println("hp : " + g.hp + ", power : " + g.power + ", shield : " + g.shield);
    g.powerAttack(null);
  }
}

class Character {

  int hp;
  int power;

  public void attack(Object target) {
    System.out.println("공격");
  }
}

class Warrior extends Character {

  int weapon;

  public void defence(Object target) {
    System.out.println("방어");
  }
}

class Gladiator extends Character {

  int shield;

  public void powerAttack(Object target) {
    System.out.println("파워공격");
  }
}

class Wizard extends Character {

  int heal;

  public void healing(Object target) {
    System.out.println("치료마법");
  }
}