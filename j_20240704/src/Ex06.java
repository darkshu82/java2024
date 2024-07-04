import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ex06 {
  public static void main(String[] args) {
    
    try {
      System.out.println("list() 메소드를 이용해서 스트림 생성하기");
      Path path = Paths.get("src");
      Stream<Path> stream1 = Files.list(path);
      stream1.forEach(p-> System.out.println(p.getFileName()));
      System.out.println("==================================================");
      
      System.out.println("list() 메소드를 이용해서 스트림 생성하기");
      <Path> stream1 = Files.find(path, 10, (p, basicFileAttributes) -> {
        File file = p.toFile();
        return !file.isDirectory() && file.getName().contain
      };
      stream1.forEach(p-> System.out.println(p.getFileName()));
      
      
    }catch(Exception e) {
      
    }
    
    
    
    
  }
}
