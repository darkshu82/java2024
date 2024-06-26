
public class Ex02 {
  public static void main(String args[]) {

    Student2 s1 = new Student2();
    System.out.println("s1 : " + s1);
    System.out.println("s1.toString : " + s1.toString());

    Student2 s2 = new Student2("더조은");
    System.out.println("s2 : " + s2);
    System.out.println("s2.toString : " + s2.toString());

    Student2 s3 = new Student2("이순신", 3);
    System.out.println("s3 : " + s3);
    System.out.println("s3.toString : " + s3.toString());

    Student2 s4 = new Student2("강감찬", 4, "건축공학과");
    System.out.println("s4 : " + s4);
    System.out.println("s4.toString : " + s4.toString());
    
  }
}

class Student2 {
  String name;
  int grade;
  String department;

  Student2() { }

  Student2(String name) {
    this.name = name;
  }

  Student2(String name, int grade) {
    this.name = name;
    this.grade = grade;
  }

  Student2(String name, int grade, String department) {
    this.name = name;
    this.grade = grade;
    this.department = department;
  }

  public String toString() {
    // return this.name + " 은(는) " + this.grade + " 학년이고 " + this.department + " 학과
    // 입니다.";
    return String.format("%s 은(는) %d 학년이고 %s 학과입니다.", this.name, this.grade, this.department);
  }

}
