package j_20240627;

public class Ex02 {
	
	public static void main(String[] args) {
		
		// instanceof  연산자
		// 참조변수 intanceof 클래스이름(type)
		// 자신 intanceof 자신클래스이름(type) : true
		// 자식 intanceof 부모클래스이름(type) : true
		// 부모 intanceof 자식클래스이름(type) : true / false
		
		// Phone p2 = new SmartPhone();
		// p2 instanceof SmartPhone : true
		// (부모)        (자식)
		
		// Phone p1 = new Phone();
		// p1 instanceof SmartPhone : false
		// (부모)        (자식)
		
		Object obj = new Object();
		GrandParent gp = new GrandParent();
		Parent p = new Parent();
		Child ch = new Child();
		
		System.out.println("gp instanceof Object : " + (gp instanceof Object));
		System.out.println("p instanceof Object  : " + (p instanceof Object));
		System.out.println("ch instanceof Object : " + (ch instanceof Object));
		System.out.println("obj instanceof GrandParent : " + (obj instanceof GrandParent));
		System.out.println("obj instanceof Parent  : " + (obj instanceof Parent));
		System.out.println("obj instanceof Child   : " + (obj instanceof Child));
		
		System.out.println("=================================================================");

		System.out.println("gp instanceof GrandParent  : " + (gp instanceof GrandParent));
		System.out.println("p instanceof GrandParent   : " + (p instanceof GrandParent));
		System.out.println("ch instanceof GrandParent  : " + (ch instanceof GrandParent));
		
		System.out.println("gp instanceof Parent  : " + (gp instanceof Parent));
		System.out.println("p instanceof Parent   : " + (p instanceof Parent));
		System.out.println("ch instanceof Parent  : " + (ch instanceof Parent));
		
		System.out.println("gp instanceof Child  : " + (gp instanceof Child));
		System.out.println("p instanceof Child   : " + (p instanceof Child));
		System.out.println("ch instanceof Child  : " + (ch instanceof Child));
		
		System.out.println("=================================================================");

		// 부모 intanceof 자식클래스이름(type) :  true 인 경우
		// 부모 type 의 참조변수가 자식객체의 주소를 저장한(할당 받은) 경우
		GrandParent gp2 = new Parent();
		System.out.println("gp2 instanceof Parent  : " + (gp2 instanceof Parent));
		GrandParent gp3 = new Child();
		System.out.println("gp3 instanceof Child  : " + (gp3 instanceof Child));
		System.out.println("gp3 instanceof Parent  : " + (gp3 instanceof Parent));
		
		Parent p2 = new Child();
		System.out.println("p2 instanceof Parent  : " + (p2 instanceof Parent));
		
	}

}

class GrandParent extends Object{ }
class Parent extends GrandParent{ }
class Child extends Parent{ }












