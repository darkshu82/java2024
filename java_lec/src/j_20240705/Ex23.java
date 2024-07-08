package j_20240705;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

// 523 page

public class Ex23 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		PrintStream ps = null;
		
		try {
			fos = new FileOutputStream("print.txt", true);
			ps  = new PrintStream(fos);
			
			ps.println("더조은");
			ps.println(1111);
			ps.println(true);
			ps.println(3.14);
			ps.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) { ps.close(); }
				if(fos != null) { fos.close(); }
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}


