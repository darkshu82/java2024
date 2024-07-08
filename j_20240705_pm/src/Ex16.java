import java.io.FileInputStream;
import java.io.IOException;

// 512 page
public class Ex16 {
	
	public static void main(String[] args) {
		
		int data = 0;
		try (FileInputStream fis = new FileInputStream("C:/workspace/java/j_20240705/src/Ex14.java");)
		{
			// fis.available() : 684 (현재파일 - 파일을 다른 것으로 지정하면 달라짐)
			// System.out.println("fis.available() : " + fis.available());
			byte[] buf = new byte[fis.available()];
			while((data=fis.read(buf)) != -1) {
				String strData = new String(buf, 0, data);
				System.out.print(strData);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
