package j_20240705;
import java.io.FileOutputStream;
import java.io.IOException;

// 519 ~ 520 page : byte 기반 출력 스트림

public class Ex21 {
	
	public static void main(String[] args) {
		
		FileOutputStream fos = null; 
		
		try{
			// 같은 파일에 write 하는 경우에는 기존 내용을 덮어씀
			// fos = new FileOutputStream("C:/IOtest/test02.txt");
			// FileOutputStream 클래스의 생성자에 
			// 파일 이름과 함께 두 번째 argument 를 true로 지정하면
			// 두 번째 parameter boolean append 에 전달되어서
			// 기존 내용을 덮어쓰지 않고 보존하면서
			// 그 뒤에 새로운 문자를 추가함 <-- 521 page
			fos = new FileOutputStream("C:/IOtest/test02.txt", true);
			fos.write(65);
			fos.write(66);
			fos.write(67);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) { fos.close(); }
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
