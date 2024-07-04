import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Ex14 {
  public static void main(String[] args) {
    
    int[] arrInt = new int[100];
    for(int i = 0; i < arrInt.length; i++) {
      arrInt[i] += i + 1;
      System.out.print(arrInt[i] + ", ");
    }
    System.out.println();
    
    System.out.print(Arrays.toString(arrInt));
    
    long count = Arrays.stream(arrInt).count();
    System.out.println("요소들의 개수 : " + count + " 개");
    
    int sum = Arrays.stream(arrInt).sum();
    System.out.println("요소들의 합 : " + sum + " 개");
    
    OptionalInt first = Arrays.stream(arrInt).findFirst();
    System.out.println("요소들 중 첫 번째 값 : " + first + " 개");
    
    OptionalInt any = Arrays.stream(arrInt).findAny();
    System.out.println("요소들 중 첫 번째 값 : " + any + " 개");
    
    List<Integer> intList = new ArrayList<>();
    System.out.println("intList.size() : " + intList.size());
    
    long count2 = intList.stream().count();
    System.out.println("intList.stream().count() : " + intList.stream().count());
    
    OptionalDouble average2 = intList.stream().mapToInt(Integer::intValue).average();
    System.out.println("요소들의 평균 값 : " + average2);
    
    int max2 = intList.stream().mapToInt(Integer::intValue).max().orElse(100);
    System.out.println("요소들 중 최대 값 : " + max2);
    
    int min2 = intList.stream().mapToInt(Integer::intValue).min().orElse(-10);
    System.out.println("요소들 중 최소 값 : " + min2);
    
    
    
    
    
    
    
    
    
  }
}
