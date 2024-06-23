
public class Ex08 {
  public static void main(String args[]) {
    
    int a = 10;
    int b = 5;
    
    System.out.println("test() :" + test());
    System.out.println(a == b & test());
    System.out.println(a == b && test());
    System.out.println(a != b & test());
    System.out.println(a != b && test());
    System.out.println(a == b & (10 <= 20));
    System.out.println(a == b & (10 <= 20));
    System.out.println("================================");
    
    System.out.println(a == b | test());
    System.out.println(a == b || test());
    System.out.println(a != b | test());
    System.out.println(a != b || test());
    
    a = 10;
    b = 0;
    
    System.out.println(b > 0 && (a / b > 0));    
  }
  public static boolean test() {
    return true;
  }
}



