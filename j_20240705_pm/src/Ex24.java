import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

// 523 page

public class Ex24 {

	public static void main(String[] args) {
		
		// try-with-resources
		try (FileOutputStream fos = new FileOutputStream("print.txt", true);
			   PrintStream ps  = new PrintStream(fos);) 
		{
			ps.println("더조은");
			ps.println(1111);
			ps.println(true);
			ps.println(3.14);
			ps.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}


