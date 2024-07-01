package j_20240701;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex05 {
	
	public static void main(String[] args) {
		
		FileInputStream is = null;
		BufferedInputStream bis = null;
		
		try {
			is = new FileInputStream("파일이름");
			bis = new BufferedInputStream(is);
			int data = -1;
			while((data = bis.read()) != -1) {
				System.out.println((char)data);
			}
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("IO 예외가 발생했습니다");
		}finally{
			// 생성된 Stream 객체를 HEAP 메모리에서 삭제함 : 메모리 해제
			// 생성된 순서 반대 순서로 삭제함
			try {
  			if (bis != null) { bis.close();}
        if (is != null) {	is.close(); }
			}catch(Exception e) { }
		}
		
	}
}


