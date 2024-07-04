import java.util.Arrays;
import java.util.List;

public class Ex07 {
  public static void main(String[] args) {
    
    List<String> nameList = Arrays.asList("이순신", "강감찬", "유관순", "안중근", "장보고", "대조영", "안중근", "장보고", "대조영");
    
    System.out.println("nameList : " + nameList);
    
    System.out.println("===================distinct===================");
    nameList.stream().distinct().forEach(name -> System.out.print(name + " "));
    
    System.out.println("\\n===================filter=====================");
    nameList.parallelStream().filter(name -> name.startsWith("안")).forEach(name -> System.out.print(name + " "));
    System.out.println("\n===============================================");
    
    System.out.println("============distinct + filter==================");
    nameList.parallelStream().filter(name -> name.startsWith("안")).forEach(name -> System.out.print(name + " "));
    System.out.println("\n===============================================");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}
