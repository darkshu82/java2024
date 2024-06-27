
public class Q07_08 {
 public static void main(String[] args) {
   String number = "123";
   System.out.println("출력값 : " + add(number));
   
   System.out.println(getAverage(getTotal(getScore())));
 }
 public static String add(String number) {
   return number + "456";
 }
}
