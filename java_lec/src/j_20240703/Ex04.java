package j_20240703;

  // 415 page : 15 장 람다식(Lambda)
	// (추상)메소드가 하나인 interface 의 (추상)메소드를
	// 호출하기 위해서는 interface 를 implements 하는 
	// 일반클래스로 자식객체를 생성한 후
	// 조상인 interface 에서 상속받은 (추상)메소드를
	// Overriding 한 후 호출해야 됨

// 메소드가 하나 뿐인 interface <-- FunctionalInterface(함수적인터페이스)
@FunctionalInterface
interface Inter01{	
	int sum(int number1, int number2);
}

@FunctionalInterface
interface Inter02{
	void print();
}

// 420 page : parameter 가 있는 메소드
@FunctionalInterface
interface Inter03{
	void print(String name);
}

public class Ex04 {
	public static void main(String[] args) {
		Inter03 i5 = (String name) -> System.out.println("이름 : " + name);
		i5.print("이순신");
		
		Inter03 i6 = (name) -> {
			System.out.println("이름 : " + name);
		};
		i6.print("이순신");
		
		Inter03 i7 = name -> {
			System.out.println("이름 : " + name);
		};
		i7.print("이순신");
		
		Inter03 i8 = name -> System.out.println("이름 : " + name);
		i8.print("이순신");
		
		
		Inter02 i3 = new Inter02() {
              			public void print() {
              				String name = "더조은";
              				System.out.println("Inter02 인터페이스를 implements 한 익명클래스");
              				System.out.println("이름 : " + name);
              			}
              		};
		i3.print();
		
		Inter02 i4 = () -> {
                    			String name = "더조은";
                    			System.out.println("Inter02 인터페이스를 implements 한 익명클래스");
                    			System.out.println("이름 : " + name);
                    		};
		i4.print();
				
		// anonymous class
		Inter01 i1 = new Inter01() {
              			@Override
              			public int sum(int number1, int number2) {
              				return number1 + number2;
              			}
              		};
    int sumResult =  i1.sum(10, 20);
    System.out.println("sumResult : " + sumResult);
    
    Inter01 i2 = (int number1, int number2) -> number1 + number2;
    int sumResult2 =  i2.sum(111, 222);
    System.out.println("sumResult2 : " + sumResult2);
    
	}
}











