import java.util.Arrays;
import java.util.List;

public class Ex09 {
  public static void main(String[] args) {
    
    List<String> list1 = Arrays.asList("동해물과", "백두산이", "마르고 닳도록");
    System.out.println("list1 : " + list1);
    
    System.out.println("함수적 인터페이스 방식");
    
    list1.stream().flatMapToInt(str -> str.length())
                  .forEach(len -> System.out.print(len + " "));
    
    System.out.println("함수적 인터페이스 방식");
    
    list1.stream().mapToInt(string -> str.length())
                  .forEach(len -> System.out.print(len + " "));
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }

}
