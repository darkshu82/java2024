package j_20240703;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

// 429 page

public class Ex10 {
	public static Student[] studentList = 
			new Student[] { 
                			new Student("이순신", 90, 80, "컴공"), 
                			new Student("강감찬", 95, 92, "통계"),					
                			new Student("김유신", 100, 60, "빅데이터")					
                    };
  public static void main(String[] args) {
  	
  	int max = maxOrMinMath((a, b) -> {
                                    		if(a >= b) { return a; }
                                    		else { return b; }
                                    	});
    System.out.println("수학 최고 점수 : " + max + " 점");
    System.out.println("수학 최고 점수 : " + (maxOrMinMath((a,b) -> (a >= b ? a : b))) + " 점");
    
  	int min = maxOrMinMath((a, b) -> {
                                    		if(a <= b) { return a; }
                                    		else { return b; }
                                    	});
    System.out.println("수학 최저 점수 : " + min + " 점");
    System.out.println("수학 최저 점수 : " + (maxOrMinMath((a,b) -> (a <= b ? a : b))) + " 점");
    
    double maxAverage = maxOrMinAvg((a, b) -> {
                                              	if (a >= b) { return a; }
                                              	else { return b; }
                                              });
    System.out.println("최대 평균 점수 : " + maxAverage + " 점");
    System.out.println("최대 평균 점수 : " + (maxOrMinAvg((a,b) -> (a >= b ? a : b))) + " 점");
    
    double minAverage = maxOrMinAvg((a, b) -> {
                                              	if (a <= b) { return a; }
                                              	else { return b; }
                                              });
    System.out.println("최저 평균 점수 : " + minAverage + " 점");
    System.out.println("최저 평균 점수 : " + (maxOrMinAvg((a,b) -> (a <= b ? a : b))) + " 점");
  }
  // 두 개의 int 값을 연산해서 int 값을 return 함
  private static int maxOrMinMath(IntBinaryOperator op) {
  	int result = studentList[0].getMath();
  	for(Student s : studentList) {
  		result = op.applyAsInt(result, s.getMath());
  	}
  	return result;
  }
  // 두 개의 double 값을 연산해서 double 값을 return 함
  private static double maxOrMinAvg(DoubleBinaryOperator op) {
  	double average = 
  			(studentList[0].getMath() + studentList[0].getEng()) / 2.0;
  	for(Student s : studentList) {
  		average = op.applyAsDouble(average, (s.getMath()+s.getEng())/2.0);
  	}
  	return average;
  }
  
}






