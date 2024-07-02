import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Ex12 {
	
	public static void main(String[] args) {
		
		// 392 page
		try {
			Properties pr = new Properties();
			
			FileInputStream reader = 
					new FileInputStream("C:\\workspace\\java\\j_20240702\\src\\test.properties");
			
			// reader 를 Properties 객체의 load() 메소드의 argument 로 넣어줌
			pr.load(reader);
			System.out.println("pr : " + pr);
			System.out.println("이름 : " + pr.get("name"));
			
			// Properties 에 키, 밸류 추가하기
			pr.put("subject", "자바");
			System.out.println("pr : " + pr);
			
			pr.store(new FileOutputStream("C:\\workspace\\java\\j_20240702\\src\\test.properties"), "#save");
			
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
