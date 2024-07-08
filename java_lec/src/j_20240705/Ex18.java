package j_20240705;
import java.io.FileReader;
import java.io.IOException;

// 515 page : 문자 기반 입력 스트림

public class Ex18 {
	
	public static void main(String[] args) {
		
		int data = 0;
		
		// try-catch-with-resource 구문
		
		try (FileReader fr =new FileReader("C:/workspace/java/j_20240705/src/Ex18.java");) {
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
