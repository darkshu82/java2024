import java.util.function.Predicate;

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

public class Ex01 {
  public static Student[] studentArr = new Student[] { 
      new Student("이순신", 90, 80, "컴공"),
      new Student("강감찬", 95, 92, "통계"), 
      new Student("김유신", 100, 60, "빅데이터"),
      new Student("안중근", 86, 92, "컴공"),
      new Student("윤봉길", 93, 81, "통계"), 
      new Student("양만춘", 100, 100, "빅데이터")
      };
  
  
  public static void main(String[] args) {
    
    double averageEng = avgEng(t -> t.getMajor().equals("컴공"));
    System.out.println("컴공 학과 학생의 영어 점수 평균 : " + averageEng+ " 점");
    
    double averageEng2 = avgEng(t -> t.getMajor().equals("통계"));
    System.out.println("통계 학과 학생의 영어 점수 평균 : " + averageEng2+ " 점");
    
    double averageMath = avgMath(t -> t.getMajor().equals("빅데이터"));
    System.out.println("빅데이터 학과 학생의 수학 점수 평균 : " + averageMath+ " 점");
    
  } //main
  
  private static double avgEng(Predicate<Student> predicate) {
    int count = 0;
    int sum = 0;
    for(Student student : studentArr) {
      if(predicate.test(student)) {
        count++;
        sum += student.getEng();
      }
    }
    return (double)sum / count;
  }
  
  private static double avgMath(Predicate<Student> predicate) {
    int count = 0;
    int sum = 0;
    for(Student student : studentArr) {
      if(predicate.test(student)) {
        count++;
        sum += student.getMath();
      }
    }
    return (double)sum / count;
  }
  
  
}
