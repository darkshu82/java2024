import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class Ex07 {
  public static void main(String[] args) {
    
    Consumer<String> c1 = name -> System.out.println("이름 : " + name);
    c1.accept("더조은");
    
    BiConsumer<String, String> c2 = (lastName, firstName) 
        -> System.out.println("이름 : " + firstName + "성 : " + lastName);
    c2.accept("Cruise", "Tom");
    
    DoubleConsumer c3 = score -> System.out.println("점수 : " + score);
    c3.accept(87.65);
    
    
    
    
    
    
    
    
    
    
    
  }
}
