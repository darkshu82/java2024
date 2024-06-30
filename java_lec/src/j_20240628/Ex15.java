package j_20240628;

public class Ex15 {

}

/*
  overriding 규칙 추가 내용
  
  부모클래스에서 throws 한 Exception 과 
  같거나 더 하위 Exception 을 throws 해야 됨
  부모클래스에서 throws 할 수 있는 예외의 개수가
  자식클래스에서 throws 할 수 있는 예외의 개수 보다 더 많아야 됨

*/
class Parent2{
	String name = "더조은";
	public void displayName() throws Exception{
		System.out.println("부모이름 : " + this.name);
	}
}

class Child2 extends Parent2{
	String name = "아이티";
	@Override
	public void displayName() throws ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException{
		System.out.println("자식이름 : " + this.name);
	}
}


