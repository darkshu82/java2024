
public class Ex10 {
  public static void main(String args[]) {
    
    System.out.println(Integer.toBinaryString(2));
    System.out.println(Integer.toBinaryString(3));
    System.out.println(Integer.toBinaryString(64));
    System.out.println(Integer.toBinaryString(10));
    System.out.println(Integer.toBinaryString(5));
    
    int num1 = 2;
    int num2 = 3;
    
    int result = num1 & num2;
    System.out.println("result : " + result);
    
    result = num1 | num2;
    System.out.println("result : " + result);
    
    result = num1 ^ num2;
    System.out.println("result : " + result);
    
    result = ~num1 & num2;
    System.out.println("result : " + result);
    
    System.out.println("~3 : " + ~3);
    System.out.println("=================================================");
    
    System.out.println(Integer.toBinaryString(3));
    System.out.println(Integer.toBinaryString(~3));
    System.out.println(Integer.toBinaryString(3).length());
    System.out.println(Integer.toBinaryString(~3).length());
    
    System.out.println(Integer.parseInt("1100", 2));
    System.out.println(Integer.parseInt("1010", 2));
    System.out.println(Integer.parseInt("0010", 2));
    System.out.println(Integer.parseInt("0101", 2));
    
    System.out.println(Integer.parseInt("A", 16));
    System.out.println(Integer.parseInt("12", 8));
    
  }
}



