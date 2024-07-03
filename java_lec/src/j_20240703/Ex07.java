package j_20240703;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

// 426 page

public class Ex07 {
	
	public static void main(String[ ]args) {
		
		Consumer<String> c1 = name -> System.out.println("이름 : " + name);
		c1.accept("더조은");
		
		BiConsumer<String, String> c2 = 
				(lastName, firstName) -> System.out.println("이름 : " + firstName + " "+ lastName);
    c2.accept("Cruise", "Tom");				
    
    DoubleConsumer c3 = score -> System.out.println("점수 : " + score);
    c3.accept(87.65);

    ObjIntConsumer<String> c4 = 
    		(subject, score) -> System.out.printf("과목 : %s, 점수 : %d", subject, score);
		c4.accept("국어", 98);
	}

}



