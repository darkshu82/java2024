package j_20240627;

public class Ex04 {
	
	public static void main(String[] args) {
		
		// 212 page
		Child3 ch3 = new Child3();
		ch3.print();
		
	}

}

class Parent3{
	int number = 3;
	Parent3(){
		System.out.println("부모객체 생성 - Parent3() 생성자 호출");
	}
}

class Child3 extends Parent3{
	// 멤버변수
	
	// 부모클래스의 멤버변수 이름과 똑같은 이름의 멤버변수를
	// 자식클래스의 멤버변수로 선언하고 초기화함
	int number = 2;
	Child3(){
		super();
		System.out.println("자식객체 생성 - Child3() 생성자 호출");
	}
	void print() {
		// 지역변수
		int number = 1;
		System.out.println("number (지역변수)      : " + number);
		System.out.println("this.number (해당 클래스의 멤버변수) : " + this.number);
		System.out.println("super.number(부모 클래스의 멤버변수) : " + super.number);
	}
}







