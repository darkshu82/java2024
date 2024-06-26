package j_20240626;

  /*
     *************************************
         모든 클래스에는 생성자가 있음
     *************************************
         
     생성자 : new 연산자에 의해서 확보된 메모리 공간에
              클래스의 멤버변수들을 초기화해 주는 메소드
              
              클래스이름과 같은 이름의 메소드
              
              모든 생성자는 return 값이 없으므로 
              void 라는 return type 도 지정하지 않음
              
              일반 메소드와 같이 참조변수.메소드() 형태로 호출할 수 없고
              항상 new 연산자와 같이 작성해서 호출함
  */


public class Ex01 {
	public static void main(String args[]) {
		
		// 기본 생성자를 호출해서 객체 생성하기
		Student s1 = new Student();
		System.out.println("s1 : " + s1);
		System.out.println("s1.name : " + s1.name);
		System.out.println("s1.grade : " + s1.grade);
		System.out.println("s1.department : " + s1.department);

		Student s3 = new Student();
		System.out.println("s3 : " + s3);
		System.out.println("s3.name : " + s3.name);
		System.out.println("s3.grade : " + s3.grade);
		System.out.println("s3.department : " + s3.department);
		
		Student s4 = new Student();
		System.out.println("s4 : " + s4);
		System.out.println("s4.name : " + s4.name);
		System.out.println("s4.grade : " + s4.grade);
		System.out.println("s4.department : " + s4.department);
		
		// parameter 가 있는 생성자를 호출해서 객체 생성하기
	  Student s2 = new Student("아이티", 3 , "컴퓨터공학과");
	  System.out.println("s2 : " + s2);
		System.out.println("s2.name : " + s2.name);
		System.out.println("s2.grade : " + s2.grade);
		System.out.println("s2.department : " + s2.department);
	  
		Student s5 = new Student("이순신", 1 , "인공지능학과");
	  System.out.println("s5 : " + s5);
		System.out.println("s5.name : " + s5.name);
		System.out.println("s5.grade : " + s5.grade);
		System.out.println("s5.department : " + s5.department);
		
		// s1 이 저장하고 있는 객체의 주소를 
		// 저장하고 있는 this 출력하기
		s1.diplayThis();
		
		// s1 이 저장하고 있는 주소지에 있는 
		// 멤버변수 출력하기
		s1.displayMemberVariables();
		
		// s2 이 저장하고 있는 객체의 주소를 
		// 저장하고 있는 this 출력하기
		s2.diplayThis();
		
		// s2 이 저장하고 있는 주소지에 있는 
		// 멤버변수 출력하기
		s2.displayMemberVariables();
		
		
		
		
	}  

}

// 175 page
class Student{

	// Field = 멤버변수
	String name = "더조은";
	int grade = 2;
	String department = "교육학과";
	
	// 생성자를 아무것도 작성하지 않으면
	// 기본 생성자(parameter가 없는 생성자)가
	// compiler 에 의해서 자동으로 작성됨
	Student(){ }
	
	// parameter 가 있는 생성자를 하나라도 작성하면
	// 기본 생성자는 자동으로 작성되지 않음
	// this : 생성된 객체의 주소를 저장하고 있는 참조변수
	// this : 생성자와 모든 instance 메소드에 있음
	//        생략할 수 있음
	Student(String name, int grade, String department){
		this.name = name;
		this.grade = grade;
		this.department = department;
	}
	
	public void diplayThis() {
		System.out.println("this : " + this);
	}
	
	public void displayMemberVariables() {
		System.out.println("이름 : " + this.name);
		System.out.println("학년 : " + this.grade);
		System.out.println("학과 : " + this.department);
	}
	
}









