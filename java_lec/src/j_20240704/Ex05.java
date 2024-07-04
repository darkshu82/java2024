package j_20240704;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// 445 page : 파일에서 스트림 생성하기

public class Ex05 {
	
	public static void main(String[] args) {
		Path path = Paths.get("C:/workspace/java/j_20240704/src/Ex03.java");
		File file = path.toFile();
		
		try(Stream<String> stream = Files.lines(path, Charset.defaultCharset());
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);)
		{
		  // Paths.get() 사용
			stream.forEach(str -> System.out.println(str));
			System.out.println("==================================");
			
			// BufferedReader 의  lines() 메소드 사용
			br.lines().forEach(str -> System.out.println(str));
			System.out.println("==================================");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
