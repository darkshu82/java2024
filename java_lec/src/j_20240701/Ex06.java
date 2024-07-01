package j_20240701;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex06 {
	
	public static void main(String[] args) {
		
		try(FileInputStream is = new FileInputStream("파일이름");
				BufferedInputStream bis = new BufferedInputStream(is)) {
			int data = -1;
			while((data = bis.read()) != -1) {
				System.out.println((char)data);
			}
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("IO 예외가 발생했습니다");
		}
		
	}
}


