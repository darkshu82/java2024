
public class Ex10 {
  public static void main(String args[]) {
    sayHello();
    addTwoNumber(100, 200);
    
    String str1 = sayHello2();
    System.out.println("sayHello2() : " + sayHello2());
    System.out.println("str1 : " + str1);
    
    double resultNumber = addNumbers(10, 23.56, 20);
    System.out.println("addNumbers(10, 23.56, 20) : " + addNumbers(10, 23.56, 20));
    System.out.println("resultNumber : " + resultNumber);
  }
  public static void sayHello() { 
    System.out.println("안녕하세요, 여러분 !!!");
    return;
  } 
    
  public static void addTwoNumber(int num1, int num2) {
    int result = num1 + num2;
    System.out.println("result : " + result);
    return;
  } 
  public static String sayHello2() {
    String greeting = "안녕하세요, 반갑습니다";
    System.out.println("greeting : " + greeting);
    return greeting;
  }
  public static double addNumbers(int n1, double d1, int n2) {
    double result = n1 + d1 + n2;
    return result;
  }
}
