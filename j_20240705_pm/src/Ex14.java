import java.io.FileReader;
import java.io.IOException;

public class Ex14 {
	
	public static void main(String[] args) {
		int data = 0;
		
		try {
			// FileInputStream fis = new FileInputStream("C:/workspace/java/j_20240705/src/Ex14.java");
			// byte 기반이라서 한글이 깨짐
			// FileInputStream fis = new FileInputStream("C:/workspace/java/j_20240705/src/test01.txt");
			// 문자 기반 스트림은 한글도 처리함
			FileReader fis = new FileReader("C:/workspace/java/j_20240705/src/test01.txt");
			while((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
