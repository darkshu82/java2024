package j_20240704;
import java.util.Arrays;
import java.util.List;

public class Ex13 {
  
	// 460 ~ 461 page : 스트림 반복자
	public static void main(String[] ags) {
		
    Shape s1 = new Rectangle(10, 3);
  	Shape s2 = new Circle(0);
  	Shape s3 = new Rectangle(20, 2);
  	Shape s4 = new Circle(11);
  	
  	List<Shape> shapeList = Arrays.asList(s1, s2, s3, s4);
  	System.out.println("shapeList : " + shapeList);
		
		shapeList.parallelStream().mapToDouble(a -> a.area())
		                          .peek(a -> System.out.println(a)).sum();
		
		// 462 page
		// 모든 요소들이 Shape의 인스턴스(객체)인지 조건 비교
		boolean result = shapeList.stream().allMatch(a -> (a instanceof Shape));
		System.out.println("모든 요소는 Shape 의 객체임 : " + result);
		
	  // 요소들 중 하나 이상이 Rectangle 객체인지 조건 비교
		boolean result2 = shapeList.stream().anyMatch(a -> (a instanceof Rectangle));
		System.out.println("요소들 중 하나 이상이 Rectangle 객체임 : " + result2);
			
  	// 모든 요소가 Circle의 객체인지 조건에 해당하지 않는지 비교
		boolean result3 = shapeList.stream().noneMatch(a -> (a instanceof Circle));
		System.out.println("요소들 중 하나 이상이 Rectangle 객체임 : " + result3);
		
		

	}
}





