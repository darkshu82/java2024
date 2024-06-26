
public class Ex03 {
  public static void main(String[] args) {
    
    System.out.println("프로그램 시작");
    
    new Student3();
    
    System.out.println("프로그램 종료");
    
    
  }
}
class Student3 {
  String name;
  int grade;
  String department;

  Student3() {
    this("안중근");
    System.out.println("Student3()");
  }

  Student3(String name) {
    this("안중근");
    System.out.println("Student3(String name)");
    this.name = name;
    return;
  }

  Student3(String name, int grade) {
    this("안중근", 1);
    System.out.println("Student3(String name, int grade)");
    this.name = name;
    this.grade = grade;
    return;
  }

  Student3(String name, int grade, String department) {    
    System.out.println("Student3(String name, int grade, String department)");
    this.name = name;
    this.grade = grade;
    this.department = department;
    return;
  }

  
}
