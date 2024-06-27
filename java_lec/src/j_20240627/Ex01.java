package j_20240627;

public class Ex01 {
	
	public static void main(String[] args) {
		
		// 209 page
		// 자식 객체 생성
		// 자식 객체 속에는 부모 객체가 같이 있음
		SmartPhone sp1 = new SmartPhone();
		sp1.name = "갤럭시";
		sp1.color = "white";
		sp1.company = "삼성";

		sp1.call();
		sp1.receive();
		sp1.installApp();

		SmartPhone sp2 = new SmartPhone();
		sp2.name = "아이폰";
		sp2.color = "black";
		sp2.company = "애플";

		sp2.call();
		sp2.receive();
		sp2.installApp();
		
		// 부모 객체 생성
		// 부모 클래스의 정보로만 생성된 객체에는
		// 부모 객체만 있고 자식 객체는 없음
		Phone p1 = new Phone();
		p1.name = "모토로라";
		p1.color = "pink";
		p1.company = "모토로라회사";

		p1.call();
		p1.receive();
		// The method installApp() is undefined for the type Phone
		// 자신의 클래스에서 작성한 메소드에만 접근(호출)할 수 있음
		// 부모객체에서는 자식객체에서 작성된 메소드에 접근하지 못함
		// (자식객체에서는 부모객체에서 작성된 메소드에 접근함:상속받음)
		// p1.installApp();
		
		/*      
		  SmartPhone type                                 
		  sp1,  sp2  가 저장하고 있는 주소지에는 부모 객체도 있음
		  (자식 객체) <-- sp1,  sp2 로는 자식 클래스에서 추가한 data 에 접근할 수 있음
		                                 부모 클래스에 원래 있던 data 에도 접근할 수 있음
		                                 
		  Phone type
		  p1 이  저장하고 있는 주소지에는 부모 객체만 있음 
		  (부모 객체) <-- p1 으로는 자식 클래스에서 추가한 data 에 접근할 수 없음
		                           부모 클래스에 원래 있던 data 에만 접근할 수 있음
		                           
      class = type = 접근권한 		
      
     Phone type 의 참조변수는 
     Phone class 에 작성한 내용대로 메모리에 올라가 있는 data 에 접근할 수 있음
     
		   
		*/
		
		// Phone p1 = new Phone();
		// Phone p2 = p1;
		// p1 에는 부모 객체가 할당됨
		// p2 에는 자식 객체가 할당됨
		Phone p2 = new SmartPhone();
		
		// SmartPhone sp1 = new SmartPhone();
		// SmartPhone sp2 = new SmartPhone();
		Phone p3 = sp1;
		Phone p4 = sp2;
		
		// 참조형 변수의 형변환(상속 관계에서만 가능함)
		// sp1,  sp2 는 자식 type
		// p3, p4 는 부모 type
		// 자식 type 의 참조변수가 저장한 주소를
		// 부모 type 의 참조변수에 할당할 때는
		// 형변환 연산자를 생략할 수 있음
		p3 = (Phone)sp1;
		p4 = (Phone)sp2;

		// 부모 type 의 참조변수가 저장한 주소를
		// 자식 type 의 참조변수에 할당할 때는
		// 형변환 연산자를 생략할 수 없음
		// p1 에는 부모 객체(의 주소)만 할당됨
		// Phone p1 = new Phone();
		// p2 에는 자식 객체(의 주소)가 할당됨
		// 자식 객체 속에는 부모객체가 있기 때문에
		// 부모 type 의 참조변수로 
		// 자식 객체 속에 있는 부모객체의 주소를 할당받을 수 있음
		// sp1 은 SmartPhone type 이므로
		// 실제로 주소를 할당 받을 때는 
		// SmartPhone class 에서 작성한 내용의 data 가 
		// 모두 있는 주소를 할당 받아야 됨		
		// Phone p2 = new SmartPhone();
		// Phone type 의 참조변수 p2 가 할당받은 주소지에는
		// Phone class 에서만 작성한 내용의 data 도 있고
		// SmartPhone class 에서 작성한 내용의 data 모두 있으므로
		// Runtime Exception 이 발생하지 않음
		// instanceof 연산자 : 참조변수 instanceof Type(클래스이름)
		//  ㄴ 참조변수가 저장하고 있는 주소지에 
		//     Type(클래스이름) 의 data(객체) 가 모두 있으면 true,
		//                                            아니면 false 를 반환함 
    // 참조변수 instanceof Type(클래스이름)
		if(p2 instanceof SmartPhone) {
		  sp1 = (SmartPhone)p2;
		}

		// ClassCastException : ClassCast(참조형 변수의 형변환)
		// sp1 은 SmartPhone type 이므로
		// 실제로 주소를 할당 받을 때는 
		// SmartPhone class 에서 작성한 내용의 data 가 
		// 모두 있는 주소를 할당 받아야 됨
		// Phone type 의 참조변수 p1 이 할당받은 주소지에는
		// Phone class 에서만 작성한 내용의 data 만 있고
		// SmartPhone class 에서 작성한 내용의 data 는 없기 때문에
		// Runtime Exception 이 발생함
		// sp1 = (SmartPhone)p1;
		if(p1 instanceof SmartPhone) {
		   sp1 = (SmartPhone)p1;
		}
		if(p2 instanceof SmartPhone) {
		  sp2 = (SmartPhone)p2;
		}
		if(p1 instanceof SmartPhone) {
		  sp2 = (SmartPhone)p1;
		}
		
		
	}

}

class Phone{
	String name;
	String color;
	String company;

	Phone() { }
	
	// 접근제한자가 default 로 되어 있음
	// public > protected > default > private
	void call() {
		System.out.println(this.name + " (으)로 전화를 건다");
	}
	void receive() {
		System.out.println(this.name + " (으)로 전화를 받다");
	}
}
/*  
  Overriding
  부모에서 정의한 메소드를 상속받아서 <-- 선언부를 똑같이 작성해야 됨
                            return type, 메소드이름, Parameter(type, 개수, 순서)
                            자식클래스의 메소드의 접근제한자의 범위는
                            부모클래스의 메소드의 접근제한자의 범위와 같거나 더 넓어야 됨 
  자식에게 맞는 내용으로 해당 메소드의 body 를 변경하는 것
  
  overriding 한 자식객체의 메소드를 실행하면
  자식클래스에서 변경한(재정의한) 내용이 실행됨
   
*/

class SmartPhone extends Phone{
	String serialNumber;
	
	SmartPhone(){ 
		super();
	}
	@Override
	void call() {
		System.out.println(this.name + " 스마트폰으로 전화를 건다");
	}
	@Override
	public void receive() {
		System.out.println(this.name + " 스마트폰으로 전화를 받다");
	}
	void installApp() {
		System.out.println(this.name + " (으)로 앱을 설치함");
	}
}










