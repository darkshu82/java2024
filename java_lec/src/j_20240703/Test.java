package j_20240703;

public class Test {
	public static void main(String[] args) {
		
		Child ch1 = new Child();
		System.out.println("ch1.name : " + ch1.name);
		ch1.diplayClass();
		
		Parent p1 = new Parent();
		System.out.println("p1.name : " + p1.name);
		p1.diplayClass();
		
		Parent p2 = new Child();
		System.out.println("p2.name : " + p2.name);
		p2.diplayClass();
		
	}

}

class Parent{
	String name ;
	public void diplayClass() {
		System.out.println("Parent");
	}
}
class Child extends Parent{
	String name;
	@Override
	public void diplayClass() {
		System.out.println("Child");
	}
}