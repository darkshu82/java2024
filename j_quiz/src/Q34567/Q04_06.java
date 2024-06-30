package Q34567;

public class Q04_06 {
  public static void main(String[] args) {
//    int price = 187000;
//    int oman =  price / 50000;
//    int ilman =  price % 50000 / 10000;
//    int ochun =  price % 50000 % 10000 / 5000;
//    int ilchun = price % 50000 % 10000 % 5000 /1000;
//    
//    System.out.println("5만원권 : " + oman + "장");
//    System.out.println("1만원권 : " + ilman + "장");
//    System.out.println("5천원권 : " + ochun + "장");
//    System.out.println("1천원권 : " + ilchun + "장");
        
    int price = 187000;
    int remain;
    
    int oman =  price / 50000;
    remain = price % 50000;
    
    int ilman =  remain / 10000;
    remain %= 10000;
    
    int ochun =  remain / 5000;
    remain %= 5000;
    
    int ilchun = remain /1000;
    remain %= 1000;
    
    System.out.println("5만원권 : " + oman + "장");
    System.out.println("1만원권 : " + ilman + "장");
    System.out.println("5천원권 : " + ochun + "장");
    System.out.println("1천원권 : " + ilchun + "장");

  }
}
