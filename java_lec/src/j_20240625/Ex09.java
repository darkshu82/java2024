package j_20240625;

class Local{
	// 멤버변수
	String name;
	
	void process() {
		// 멤버변수
		// instance method process() 에서
		// 멤버변수 name 에 "더조은"이라는 문자열을 할당한 것
		name = "더조은";
  }
	void printAge1() {
		// 지역변수		
		int age = 20;
		System.out.println("age in printAge1() : " + age);
	} 
	void printAge2() {
		// 지역변수		
		int age = 30;
		System.out.println("age in printAge2() : " + age);
	} 
	
	
}


public class Ex09 {
	
	public static void main(String args[]) {
		
		// 158 page
	  Local local = new Local();
	  System.out.println("local.name : " + local.name);
	  
		local.process();
		System.out.println("local.name : " + local.name);
	  
		local.printAge1();
		local.printAge2();
		
		int temp = 0;
		for(int i = 0; i < 10; i++) {
			// int temp = 0;
			temp += 1;
			System.out.println("temp : " + temp);
		}
		System.out.println("------------------");
		// 더 넓은 scope 에서는 더 좁은 scope 에 있는 값을 인식하지 못함
		// 더 좁은 scope 에서는 더 넓은 scope 에 있는 값을 인식함		
		// temp cannot be resolved to a variable
		// for 문 밖에서 int temp 를 선언해서 해결함
		System.out.println("temp : " + temp);
		
	}

}
