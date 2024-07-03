
interface Inter01{
  int sum(int number1, int number2);
}

@FunctionalInterface
interface Inter02{
  void print();
}

@FunctionalInterface
interface Inter03{
  void print(String name);
}

public class Ex04 {
  public static void main(String[] args) {
    
    Inter03 i5 = (String name) -> System.out.println("이름 : " + name);
    i5.print("이순신");
    
    
    
    Inter02 i3 = new Inter02() {
                    public void print() {
                      System.out.println("Inter02 인터페이스를 implements한 익명클래스");
                    }
                  };
    i3.print();
    
    Inter02 i4 = () -> System.out.println("Inter02 인터페이스를 implements한 익명클래스");
    i4.print();
    
    
    Inter01 i1 = new Inter01() {
                    @Override
                    public int sum(int number1, int number2) {
                      int result = number1 + number2;
                      return result;
                    }
                  };
    int sumResult = i1.sum(10, 20);
    System.out.println("sumResult : " + sumResult);
   
    Inter01 i2 = (int number1, int number2) -> number1 + number2;
    int sumResult2 = i2.sum(10, 20);
    System.out.println("sumResult2 : " + sumResult2);
    
    
    
    
    
    
    
    
    
    
    
    
  }
}
