import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex16 {
  public static void main(String[] args) {
    
    List<Integer> intList = new ArrayList<>();
    
    for(int i = 0; i < 100; i++) {
      intList.add(i + 1);
      if(intList.get(i) % 10 == 0) {
        System.out.printf("%2d \n", intList.get(i));
      }else {
        System.out.printf("%2d ",intList.get(i));
      }
    }
    System.out.println("\nintList : " + intList);
    System.out.println("==============================================================================");
    
    long start = System.nanoTime();
    intList.stream().forEach(a -> {
      try {
        Thread.sleep(1);
      }catch(InterruptedException e) {
        e.printStackTrace();
      }
    });
    long end = System.nanoTime();
    System.out.println("순차적 스트림 수행시간 : " + (end - start) + "(nano second)");
    
    long start2 = System.nanoTime();
    intList.parallelStream().forEach(a -> {
      try {
        Thread.sleep(1);
      }catch(InterruptedException e) {
        e.printStackTrace();
      }
    });
    long end2 = System.nanoTime();
    System.out.println("병렬적 스트림 수행시간 : " + (end2 - start2) + "(nano second)");
    
    // 스트림 연결하기
    // 문자열 스트림 객체
    Stream<String> streamStr = Stream.of("이순신", "강감찬", "안중근", "윤봉길");
    // 정수 스트림 객체
    Stream<Integer> streamInt = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // concat() 메소드
    Stream<Object> streamConcat = Stream.concat()
   
    
    
    
    
    
    
    
    
    
    
    
    
    
  }

}
