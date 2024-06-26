package j_20240626;

public class Ex02 {
	
	public static void main(String args[]) {
		
		// 178 ~ 179 page
		// 생성자 overloading
		
  	// 기본 생성자 를 호출해서 객체 생성하기
		Student2 s1 = new Student2();
		// .toString() 는 생략할 수 있음
		System.out.println("s1 : " + s1);
		System.out.println("s1.toString() : " + s1.toString());
		
  	// parameter 가 있는 생성자 1를
  	// 호출해서 객체 생성하기
		Student2 s2 = new Student2("더조은");
		System.out.println("s2 : " + s2);
		System.out.println("s2.toString() : " + s2.toString());
		
  	// parameter 가 있는 생성자 2를
  	// 호출해서 객체 생성하기
		Student2 s3 = new Student2("이순신", 3);
		System.out.println("s3 : " + s3);
		System.out.println("s3.toString() : " + s3.toString());
		
  	// parameter 가 있는 생성자 3를
  	// 호출해서 객체 생성하기
		Student2 s4 = new Student2("강감찬", 4, "건축공학과");
		System.out.println("s4 : " + s4);
		System.out.println("s4.toString() : " + s4.toString());
		
	}

}

class Student2{
	// Field = 멤버변수
	String name;
	int grade;
	String department;
	
	// 기본 생성자
	Student2(){ }
	
	// parameter 가 있는 생성자 1
	Student2(String name){
		this.name = name;
	}
	
	// parameter 가 있는 생성자 2
	Student2(String name, int grade){
		this.name = name;
		this.grade  = grade;
	}
	
	// parameter 가 있는 생성자 3
	Student2(String name, int grade, String department){
		this.name = name;
		this.grade = grade;
		this.department = department;
	}
	
	// toString() 메소드 overriding 하기
	// toString() 메소드 : 멤버변수의 값 확인하기
	//                     멤버변수의 값을 문자열로 return 해 줌
	
	public String toString() {
	   // return this.name + " 은(는) " + this.grade + " 학년이고 " + this.department + " 학과입니다";
		 return String.format("%s 은(는) %d 학년이고 %s 학과입니다", 
                         this.name, this.grade, this.department);
	}

	
}









