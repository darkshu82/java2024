package j_20240625;
/*
   초기화 블럭
   
   { } 안에 code 를 작성함
   
   1) static 초기화 블럭
      static {
        code 작성...
      }   
   2) instance 초기화 블럭
      {
        code 작성...  
      }
   
   
   멤버변수에 값이 할당되는 (실행) 순서
     ㄴ 초기화블럭은 static 초기화블럭이든지
                     instance 초기화블럭이든지 
                     생성자보다 먼저 실행됨
                       ㄴ new 클래스이름() code 가 실행될 때
                            ㄴ 객체가 생성될 때 생성자가 실행됨
   
   static 멤버변수
     ㄴ 기본값 > 명시적 초기화 > static 초기화블럭
   
   instance 멤버변수
     ㄴ 기본값 > 명시적 초기화 > instance 초기화블럭 > 생성자
      
*/

public class Ex08 {
	
	// 멤버변수는 명시적으로 초기화하지 않으면 자동으로 초기화됨
	static int num1 = 200;
	static int num2;
	static boolean b1;
	static boolean b2 = true;
	
	public static void main(String args[]) {
		
		// Cannot make a static reference to the non-static field num1
		// static method 에서는 static 멤버변수만 인식함
		// 멤버변수 num1 을 static 으로 설정하면 인식이됨
		System.out.println("num1 : " + num1);
		// Cannot make a static reference to the non-static field num2
		System.out.println("num2 : " + num2);
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
		
		int number = 100;
		// The local variable number may not have been initialized
		// 지역변수는 명시적으로 초기화하지 않으면 자동으로 초기화되지 않음
		System.out.println("number : " + number);
	
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();

		System.out.println("p1 의 제품번호 : " + p1.serialNumber);
		System.out.println("p2 의 제품번호 : " + p2.serialNumber);
		System.out.println("p3 의 제품번호 : " + p3.serialNumber);

		System.out.println("생산된 제품 개수 : " + Product.count);


		
	}

}

class Product{
	// static 멤버변수 : Product 클래스에서 단 하나만 생성됨
	//                   Product 클래스에서 통합적으로 하나로 관리할 data 를 저장함
	static int count = 0;
	
	// instance 멤버변수 : Product 클래스의 객체별로 생성됨
	//                     Product 클래스에서 객체별로 따로따로 관리할 data 를 저장함
	int serialNumber;
	
	// instance 초기화블럭
	{
		++count;
		serialNumber = count;
	}
	
	// 생성자
	public Product(){ }
	
	
}







