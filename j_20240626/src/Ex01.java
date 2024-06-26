
public class Ex01 {
  public static void main(String args[]) {
    
    Student s1 = new Student();
    System.out.println("s1 : " + s1);
    System.out.println("s1.name : " + s1.name);
    System.out.println("s1.grade : " + s1.grade);
    System.out.println("s1.department : " + s1.department);
    
    Student s2 = new Student("아이티", 3, "컴퓨터공학과");
    System.out.println("s2 : " + s2);
    System.out.println("s2.name : " + s2.name);
    System.out.println("s2.grade : " + s2.grade);
    System.out.println("s2.department : " + s2.department);
    
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
    
    Student s5 = new Student("이순신", 1, "인공지능학과");
    System.out.println("s5 : " + s5);
    System.out.println("s5.name : " + s5.name);
    System.out.println("s5.grade : " + s5.grade);
    System.out.println("s5.department : " + s5.department);
    
    s1.displayThis();    
    s1.displayMemberVariables();
    
    s2.displayThis();    
    s2.displayMemberVariables();
    
  }
}
class Student{
  
  String name = "더조은";
  int grade = 2;
  String department = "교육학과";
  
  Student() {}
  
  Student(String name, int grade, String department) {
    this.name = name;
    this.grade = grade;
    this.department = department;
  }
  public void displayThis() {
    System.out.println("this : " + this);
  }
  public void displayMemberVariables() {
    System.out.println("이름 : " + this.name);
    System.out.println("학년 : " + this.grade);
    System.out.println("학과 : " + this.department);
  }
  
}
