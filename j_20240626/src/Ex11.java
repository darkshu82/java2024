
public class Ex11 {
  public static void main(String[] args) {

    Calc4 c1 = new Calc4(10, 8);
    System.out.println("덧셈결과 : " + c1.addNum());
    System.out.println("뺄셈결과 : " + c1.subNum());
    System.out.println("곱셈결과 : " + c1.multiNum());
    System.out.println("나눗셈결과 : " + c1.divNum());

    Calc4 c2 = new Calc4(12, 7);
    System.out.println("덧셈결과 : " + c2.addNum());
    System.out.println("뺄셈결과 : " + c1.subNum());
    System.out.println("곱셈결과 : " + c2.multiNum());
    System.out.println("나눗셈결과 : " + c2.divNum());

    Calc4 c3 = new Calc4(15, 9);
    System.out.println("덧셈결과 : " + c3.addNum());
    System.out.println("뺄셈결과 : " + c3.subNum());
    System.out.println("곱셈결과 : " + c3.multiNum());
    System.out.println("나눗셈결과 : " + c3.divNum());

    Calc5 c5 = new Calc5(35, 6);
    System.out.println("덧셈결과 : " + c5.addNum());
    System.out.println("뺄셈결과 : " + c5.subNum());
    System.out.println("곱셈결과 : " + c5.multiNum());
    System.out.println("나눗셈결과 : " + c5.divNum());
    System.out.println("나머지결과 : " + c5.modNum());
  }
}

class Calc5 extends Calc4 {
  public Calc5(int number1, int number2) {
    super(number1, number2);
  }
  public double modNum() {
    result = number1 % number2;
    return result;
  }
}

class Calc4 {
  int number1;
  int number2;
  double result;

  public Calc4() { }

  public Calc4(int number1, int number2) {
    this.number1 = number1;
    this.number2 = number2;
  }

  public double addNum() {
    result = number1 + number2;
    return result;
  }

  public double subNum() {
    result = number1 - number2;
    return result;
  }

  public double multiNum() {
    result = number1 * number2;
    return result;
  }

  public double divNum() {
    result = number1 / (double) number2;
    return result;
  }
}


