import java.util.Arrays;
import java.util.List;

public class Ex13 {
  public static void main(String[] args) {
    
    Shape s1 = new Rectangle(10, 3);
    Shape s2 = new Circle(10, 3);
    Shape s3 = new Rectangle(10, 3);
    Shape s4 = new Circle(10, 3);
    
    List<Shape> shapeList = Arrays.asList(s1, s2, s3, s4);
    System.out.println("shapeList :" + shapeList);
    
    shapeList.parallelStream().mapToDouble(a -> a.area()).peek(a -> System.out.println(a)).sum();
    
    boolean result = shapeList.parallelStream().allMatch(a -> (a instanceof Shape));
    System.out.println("모든 요소는 Shape의 객체임 :" + result);

    boolean result2 = shapeList.stream().anyMatch(a -> (a instanceof Rectangle));
    System.out.println("요소들 중 하나 이상이 Rectangle의 객체임 :" + result2);
    
    boolean result3 = shapeList.stream().noneMatch(a -> (a instanceof Circle));
    System.out.println("요소들 중 하나 이상이 Rectangle의 객체임 :" + result3);
    
    
    
    
    
  }

}
