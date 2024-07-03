import java.util.function.Function;
import java.util.function.ToDoubleFunction;

class Student {
  private String name;
  private int eng;
  private int math;
  private String major;

  public Student(String name, int eng, int math, String major) {
    this.name = name;
    this.eng = eng;
    this.math = math;
    this.major = major;
  }
  public String getName() {
    return this.name;
  }

  public int getEng() {
    return this.eng;
  }

  public int getMath() {
    return this.math;
  }

  public String getMajor() {
    return this.major;
  }
}
public class Ex09 {

  public static Student[] studentList = new Student[] {
      new Student("이순신", 90, 80, "컴공"),
      new Student("강감찬", 95, 92, "통계")
  };

  public static void main(String[] args) {
    
        
    System.out.print("학생 이름 : ");
    printString(s -> s.getName());
    
    System.out.print("과목 이름 : ");
    printString(s -> s.getMajor());
    
    System.out.print("이순신과 강감찬의 수학 평균 : ");
    printAvg(s -> s.getMath());
    
    System.out.print("이순신과 강감찬의 영어 평균 : ");
    printAvg(s -> s.getEng());
    
    System.out.print("이순신과 강감찬의 수학 합계 : ");
    printTotal(s -> s.getMath());
    
    System.out.print("이순신과 강감찬의 영어 합계 : ");
    printTotal(s -> s.getEng());
    
    
  }
    
  public static void printAvg(ToDoubleFunction<Student> f) {
    double sum = 0;
    for (Student s : studentList) {
      sum += f.applyAsDouble(s);
    }
    System.out.println(sum / studentList.length);
  }
  
  public static void printTotal(ToDoubleFunction<Student> f) {
    double sum = 0;
    for (Student s : studentList) {
      sum += f.applyAsDouble(s);
    }
    System.out.println(sum);
  }
  
  public static void printInt(Function<Student, Integer> f) {
    for(Student s : studentList) {
      System.out.print(f.apply(s) + " ");
    }
    System.out.println();
  }

  public static void printString(Function<Student, String> f) {
    for(Student s : studentList) {
      System.out.print(f.apply(s) + " ");
    }
    System.out.println();
  }
}
