
public class Ex08 {
  static int num1 = 200;
  static int num2;
  static boolean b1;
  static boolean b2 = true;
  
  public static void main(String[] args) {
    
    System.out.println("num1 : " + num1);
    System.out.println("num2 : " + num2);
    
    System.out.println("b1 : " + b1);
    System.out.println("b2 : " + b2);
    
    int number = 100;
    System.out.println("number : " + number);
    
    Product p1 = new Product();
    Product p2 = new Product();
    Product p3 = new Product();
    
  }  
}

class Product{
  static int count = 0;
  int serialNumber;
  {
    ++count;
    serialNumber = count;
  }
  public Product() { }
}