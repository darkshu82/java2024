package j_20240705;
import java.io.FileReader;
import java.io.IOException;

// 515 page : 문자 기반 입력 스트림

public class Ex17 {
	
	public static void main(String[] args) {
		
		FileReader fr = null;
		int data = 0;
		
		try {
			fr = new FileReader("C:/workspace/java/j_20240705/src/Ex17.java");
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) { fr.close(); }
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
