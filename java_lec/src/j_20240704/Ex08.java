package j_20240704;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

// 450 ~ 451 page : Mapping

public class Ex08 {
	
	public static void main(String[ ] args) {
		
		// 문자열을 공백으로 분리해서 매핑
		List<String> list1 = Arrays.asList("동해물과","백두산이","마르고 닳도록");
		System.out.println("list1 : " + list1);
		
		list1.stream().flatMap(data -> Arrays.stream(data.split(" ")))
		              .forEach(word -> System.out.print(word + " "));
		System.out.println("\n===================================");
		
		// 문자열을，로 분리해서 double 자료형으로 변환해서 매핑
		List<String> list2 = Arrays.asList("1.1, 2.2, 3.3", "4.5, 5.5, 6.6");
		DoubleStream dstr = list2.stream().flatMapToDouble(data -> {
                                					String[] arrStr = data.split(",");
                                					double[] arrDbl = new double[arrStr.length];
                                					for(int i = 0; i < arrDbl.length; i++) {
                                						arrDbl[i] = Double.parseDouble(arrStr[i].trim());
                                					}
                                					return Arrays.stream(arrDbl);
                                				});
		dstr.forEach(number -> System.out.print(number + " "));
		System.out.println("\n===================================");
		
		// 문자열을，로 분리해서 int 자료형으로 변환해서 매핑
		List<String> list3 = Arrays.asList("1, 2, 3", "4, 5, 6");
		IntStream istr =  list3.stream().flatMapToInt(data -> {
                            					String[] arrStr = data.split(",");
                            					int[] arrInt = new int[arrStr.length];
                            					for(int i = 0; i < arrInt.length; i++) {
                            						arrInt[i] = Integer.parseInt(arrStr[i].trim());
                            					}
                            					return Arrays.stream(arrInt);
                            				});
		istr.forEach(number -> System.out.print(number + " "));
		System.out.println("\n===================================");
	}

}
 