
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
    this("안중근", 1);
    System.out.println("Student3(String name)");
    this.name = name;
  }

  Student3(String name, int grade) {
    this("안중근", 1, "가정의학과");
    System.out.println("Student3(String name, int grade)");
    this.name = name;
    this.grade = grade;
  }

  Student3(String name, int grade, String department) {    
    System.out.println("Student3(String name, int grade, String department)");
    this.name = name;
    this.grade = grade;
    this.department = department;
  }
  public String toString() {
    // return this.name + " 은(는) " + this.grade + " 학년이고 " + this.department + " 학과입니다";
    return String.format("%s 은(는) %d 학년이고 %s 학과입니다", 
                        this.name, this.grade, this.department);
 }
  
}
