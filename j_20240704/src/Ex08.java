import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Ex08 {
  public static void main(String[] args) {
    
    List<String> list1 = Arrays.asList("동해물과", "백두산이", "마르고 닳도록");
    System.out.println("list1 : " + list1);
    
    list1.stream().flatMap(data -> Arrays.stream(data.split(" ")))
                  .forEach(word -> System.out.print(word + " "));
    System.out.println();
    
    List<String> list2 = Arrays.asList("1.1, 2.2, 3.3", "4.5, 5.5, 6.6");
    DoubleStream dstr = list2.stream().flatMapToDouble(data -> {
      String[] arrStr = data.split(",");
      double[] arrDbl = new double[arrStr.length];
      for(int i = 0; i < arrDbl.length; i++) {
        arrDbl[i] = Double.parseDouble(arrStr[i].trim());
      }
      return Arrays.stream(arrDbl);
    });
    System.out.println();
    
    List<String> list3 = Arrays.asList("1, 2, 3", "4, 5, 6");
    IntStream istr = list3.stream().flatMapToInt(data -> {
      String[] arrInt = data.split(",");
      int[] arrDbl = new int[arrInt.length];
      for(int i = 0; i < arrDbl.length; i++) {
        arrDbl[i] = Integer.parseInt(arrInt[i].trim());
      }
      return Arrays.stream(arrDbl); 
    });
    
    
    
    
    
    
    
    
    
    
    
    
  }

}
