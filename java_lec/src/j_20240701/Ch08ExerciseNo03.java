package j_20240701;

// 8장 연습문제 3 번
// 238 page

public class Ch08ExerciseNo03 {
	public static void main(String[] args) {
		
		Character c1 = new Character();
		Character c2 = new Warrier();
		Character c3 = new Gladiator();
		Character c4 = new Wizard();
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		System.out.println("c4 : " + c4);
		
		Enemy e = new Enemy();
		System.out.println("e : " + e);
		
		// 부모타입의 참조변수로 attack() 메소드를 실행해도
		// 실제로 할당된 자식객체에 있는 overriding 된
		// 내용이 실행됨
		c1.attack(e);
		c2.attack(e);
		c3.attack(e);
		c4.attack(e);
		
	}

}

class Enemy{
	
	public String toString() {
		return "Enemy";
	}
	
}

class Character {
	int hp;
	int power;
	
	public void attack(Object target) {
		System.out.println(this + "이(가) " + target + "을(를) 공격합니다");
	}
	
	public String toString() {
		return "Character";
	}
	
}

class Warrier extends Character{
	int hp;
	int power;
	int weapon;
	
	@Override
	public void attack(Object target) {
		System.out.println(this + "이(가) " + target + "을(를) 공격합니다");
	}
	public void defence(Object target) {
		System.out.println(this + "이(가) " + target + "을(를) 방어합니다");
	}
	@Override
	public String toString() {
		return "Warrier";
	}
}
class Gladiator extends Character{
	int hp;
	int power;
	int shield;
	
	@Override
	public void attack(Object target) {
		System.out.println(this + "이(가) " + target + "을(를) 공격합니다");
	}
	public void powerAttack(Object target) {
		System.out.println(this + "이(가) " + target + "을(를) 파워공격합니다");
	}
	@Override
	public String toString() {
		return "Gladiator";
	}
}
class Wizard extends Character{
	int hp;
	int power;
	int heal;
	
	@Override
	public void attack(Object target) {
		System.out.println(this + "이(가) " + target + "을(를) 공격합니다");
	}
	public void healing(Object target) {
		System.out.println(this + "이(가) " + target + "을(를) 치료합니다");
	}
	@Override
	public String toString() {
		return "Wizard";
	}
}