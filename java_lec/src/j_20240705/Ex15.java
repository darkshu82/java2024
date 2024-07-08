package j_20240705;
import java.io.FileInputStream;
import java.io.IOException;

// 512 page
public class Ex15 {
	
	public static void main(String[] args) {
		
		int data = 0;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:/workspace/java/j_20240705/src/Ex14.java");
			byte[] buf = new byte[fis.available()];
			while((data=fis.read(buf)) != -1) {
				String strData = new String(buf, 0, data);
				System.out.print(strData);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) { fis.close(); };
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
