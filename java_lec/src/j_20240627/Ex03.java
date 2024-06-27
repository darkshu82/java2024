package j_20240627;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작"); // 0
		new Child2();
		System.out.println("프로그램 종료"); // 9
	}
}

class Parent2{
	Parent2() {
		this(10);
		System.out.println("Parent2()"); // 4
	} 
	Parent2(int n){
		this(10.12F);
		System.out.println("Parent2(int n)"); // 3
	}
	Parent2(float f){
		this(12.34);
		System.out.println("Parent2(float f)"); // 2
	}
	Parent2(double d){
		System.out.println("Parent2(double d)"); // 1
  }
}
class Child2 extends Parent2{
	Child2() {
		this(10);
		System.out.println("Child2()"); // 8
	} 
	Child2(int n){
		this(10.12F);
		System.out.println("Child2(int n)"); // 7
	}
  Child2(float f){
  	this(12.34);
		System.out.println("Child2(float f)"); // 6
	}
  Child2(double d){
  	super();
  	System.out.println("Child2(double d)"); // 5
  }
}



