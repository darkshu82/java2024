package j_20240704;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// 446 page 폴더에서 스트림 생성하기

public class Ex06 {
  
	public static void main(String[ ]args) {
		
		try {
  		System.out.println("list() 메소드를 이용해서 스트림 생성하기");
  		// src 디렉토리로 Path 객체 생성
  		// Path path = Paths.get("C:/workspace/java/j_20240704/src"); 
  		Path path = Paths.get("src"); 
  		// src 경로의 모든 디렉토리와 파일 Stream 객체로 생성
  		Stream<Path> stream1 = Files.list(path);
  		stream1.forEach(p -> System.out.println(p.getFileName()));
  		System.out.println("===============================================");
  		
  		System.out.println("list() 메소드를 이용해서 스트림 생성하기");
  	  // src 디렉토리로 시작해서 10단계까지의 디렉토리 깊이까지 탐색
      Stream<Path> stream2 = Files.find(path, 10,
      		                   (p, basicFileAttributes) -> {
      		                  	 File file = p.toFile();
      		                  	 // 디렉토리가 아니고 파일이름에 Stream이 포함된 파일명
      		                  	 return !file.isDirectory() && file.getName().contains("Stream");
      		                   });
      stream2.forEach(p -> System.out.println(p.getFileName()));		
  		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}




