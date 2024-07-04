import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ex05 {
  public static void main(String[] args) {
    Path path = Paths.get("C:\\workspace\\java\\j_20240704\\src\\Ex04.java");
    File file = path.toFile();
    
    try( Stream<String> stream = Files.lines(path, Charset.defaultCharset());
         FileReader fr = new FileReader(file);
         BufferedReader br = new BufferedReader(fr);)
    
    {
      stream.forEach(str -> System.out.println(str));
      System.out.println("=============================================");
      
      br.lines().forEach(str -> System.out.println(str));
      System.out.println("=============================================");
      
    }catch(Exception e){
      System.out.println(e.getMessage());
    }finally {
      if(br != null) { stream.close(); }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  } // main
}















