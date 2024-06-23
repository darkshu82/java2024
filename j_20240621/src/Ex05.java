
public class Ex05 {
  public static void main(String args[]) {
    int num1 = 10;
    
    System.out.println("num1 : " + num1);
    System.out.println("num1 + 10 :" + num1 + 10);
    System.out.println("num1 + 10 :" + (num1 + 10));
    
    num1 = num1 + 10;
    System.out.println("num1 : " + num1);
    
    int num2 = 12;
    System.out.println("num2 : " +num2);
    System.out.println("num2++ : " +num2++);
    System.out.println("++num2 : " + ++num2);
    System.out.println("num2-- : " + num2--);
    System.out.println("--num2 : " + --num2);    
    System.out.println("========================================");
    
    int num3 = 10;
    int num4 = 20;
    
    System.out.println(num3 + (++num4));
    System.out.println(num4);
    System.out.println(num3 + (num4++));
    System.out.println(num4);    
    System.out.println("========================================");
  
    int a = 10;
    System.out.println("전위연산전 a : " + a);
    
    int b = ++a;
    System.out.println("전위연산결과 : " + b);
    System.out.println("전위연산후 a : " + a);
    
    int x = 10;
    System.out.println("후위연산전 x : " + x);
    int y = x++;
    System.out.println("후위연산결과 : " + y);
    System.out.println("후위연산후 x : " + x);
    System.out.println("========================================");

    int num = 10;
    System.out.printf("%d %d %d %d %d %d%n", num++, --num, ++num, num++, num--, num);
    
    num =10;
    num++;
    System.out.printf("%d %d %d %d %d %d%n", num++, --num, ++num, num++, num--, num);
   
  }
}






