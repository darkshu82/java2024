
public class Ex04 {
  public static void main(String args[]) {
    int num1 = 10;
    System.out.println("num1 : " + num1);
    
    num1 = num1 + 1;
    System.out.println("num1 : " + num1);
    
    num1 += 1;
    System.out.println("num1 : " + num1);
    
    num1 += 2;
    System.out.println("num1 : " + num1);
    
    num1 -= 1;
    System.out.println("num1 : " + num1);
    
    num1 *= 2;
    System.out.println("num1 : " + num1);
    
    num1 /= 2;
    System.out.println("num1 : " + num1);
    
    num1 %= 3;
    System.out.println("num1 : " + num1);
    
    int num2 = 10;
    int num3 = 8;
    
    int result = num2 / num3;
    System.out.println("result : " + result);
    
    result = num2 % num3;
    System.out.println("result : " + result);    
    
    double result2 = (double)num2 / (double)num3;
    System.out.println("result2 : " + result2);
    
    result2 = (double)num2 / num3;
    System.out.println("result2 : " + result2);
    
    result2 = num2 / (double)num3;
    System.out.println("result2 : " + result2);
		
	}
}



