package j_20240703;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

// 425 page : Supplier

public class Ex08 {
	
	public static void main(String[] args) {
		
		Supplier<String> str1 = () -> "더조은";
		System.out.println("이름 : " + str1.get());
		
		str1 = () -> "종로구 관철동";
		System.out.println("주소 : " + str1.get());
		
		IntSupplier intS1 = () -> (int)(Math.random() * 6) + 1;
		System.out.println("주사위 던진 결과 : " + intS1.getAsInt());
		
		DoubleSupplier doubleS1 = () -> Math.PI;
		System.out.println("원주율 : " + doubleS1.getAsDouble());
		
	}

}



