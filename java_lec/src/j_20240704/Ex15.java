package j_20240704;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

// 467 page

public class Ex15 {

	public static void main(String[] args) {
    Shape s1 = new Rectangle(10, 3);
  	Shape s2 = new Circle(0);
  	Shape s3 = new Rectangle(20, 2);
  	Shape s4 = new Circle(11);
  	
  	List<Shape> shapeList = Arrays.asList(s1, s2, s3, s4);
  	System.out.println("shapeList : " + shapeList);	
  	
  	double areaSum = shapeList.stream().mapToDouble(Shape::area).sum();
  	System.out.println("면적의 합 (sum) : " + areaSum);
  	
  	areaSum = shapeList.stream().mapToDouble(Shape::area)
  			                        .reduce((a, b) -> a + b)
  			                        .getAsDouble();
  	System.out.println("면적의 합 (reduce) : " + areaSum);
  	
    areaSum = shapeList.stream().mapToDouble(Shape::area)
    		                        .reduce(0, (a, b) -> (a + b));
    System.out.println("면적의 합 (reduce) : " + areaSum);
    
    
    // 468 page : collect() 메소드
    List<Shape> recList = shapeList.stream()
    		                           .filter(s -> s instanceof Rectangle)
    		                           .collect(Collectors.toList());
    recList.stream().forEach(f -> System.out.println(f));
    System.out.println("=========================================");
    
    Set<Shape> recSet = shapeList.stream()
    		                         .filter(s -> s instanceof Rectangle)
    		                         .collect(Collectors.toSet());
    recSet.stream().forEach(f -> System.out.println(f));
    System.out.println("=========================================");		
    
    // 469 page : groupingBy() 메소드
    try {
    	// 객체 타입(클래스이름)으로 grouping 하기 : Rectangle / Circle
    	Map<Object, List<Shape>> map = 
                			shapeList.stream()
            	                 .collect(Collectors.groupingBy(f -> f.getClass()));
    	System.out.println("-- Rectangle --");
    	map.get(Class.forName("Rectangle")).stream()
    	                                   .forEach(f -> System.out.println(f));
    	System.out.println("-- Circle --");
    	map.get(Class.forName("Circle")).stream()
    	                                .forEach(f -> System.out.println(f));
    }catch(Exception e) { 
    	System.out.println(e.getMessage());
    }
	}
	
}



