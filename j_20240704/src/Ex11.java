import java.util.Arrays;
import java.util.List;

public class Ex11 {
  public static void main(String[] args) {
    
    String name = new String("더조은");
    
    List<String> nameList = Arrays.asList("이순신", "강감찬", "유관순", "안중근", "윤봉길");
    
    System.out.println("-- 기본 정렬 (오름 차순) --");
    nameList.stream().sorted().forEach(System.out::println);
    System.out.println();
    
    System.out.println("-- 기본 정렬 (내림 차순) --");
    nameList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    System.out.println();
    
    
    
    
  }

}
