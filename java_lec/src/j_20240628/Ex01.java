package j_20240628;

public class Ex01 {
	
	// 229 page : 추상클래스
	/*
	   추상클래스 : abstract class
	     ㄴ 추상메소드가 하나라도 있는 클래스 : abstract method
	          ㄴ 메소드의 선언부만 있고 
	             body(구현부:메소드의 내용) 부분이 없는 메소드
	   
	   추상클래스를 정의하는 경우 class 키워드 앞에 abstract 키워드를 작성함
	   
     abstract class 클래스이름 { }    
         (추상메소드가 작성되지 않은 클래스라도
          abstact class... 라고 클래스를 정의하면
          JAVA 에서 추상클래스로 인식함)  
          
     추상클래스를 상속하는 일반클래스(자식클래스) 에서는
     부모클래스인 추상클래스에 정의되어 있는 추상메소드를
     반드시 overriding 해서 body 부분을 작성해야 함
        ㄴ 추상클래스를 상속하는 모든 일반클래스에서는
           추상클래스에서 정의한 추상메소드와 같은 선언부를 갖는 메소드를
           강제적으로 작성(overriding)하게 하기 위해서 추상클래스를 작성함
             ㄴ 결과적으로는 안내서 역할을 함
           
               
	*/
	
	public static void main(String[ ]args) {
		
		
	}

}

abstract class Person{
	
	String name;
	int age;
	String address;
	
	
	// 일반 메소드 <-- 선언부 + Body
	public void displayMember() {
		System.out.printf("이름 : %s, 나이 : %d, 주소 : %s%n", name, age, address);		
	}
	
	// 추상 메소드 <-- 선언부 + Body(X)
	public abstract void displayMember2();
	
}

class Student extends Person{
	String studNumber;
	
	public void study() {
		System.out.printf("%s 은 공부를 합니다%n", this.name);
	}
	
	// 추상클래스를 상속받은 자식클래스가 
	// 추상클래스가 아니고 일반클래스인 경우에는
	// 상속받은 추상메소드를 일반메소드로 변환해야 됨
	//           Body(X)  --> Body(O)             
	@Override
	public void displayMember2() {
		System.out.printf("이름 : %s, 나이 : %d, 주소 : %s%n", name, age, address);		
	}
	
}






