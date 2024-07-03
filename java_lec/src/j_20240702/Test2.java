package j_20240702;

public class Test2 {
	
	public static void main(String[] args) {
		InterfaceEx ie = new InterfaceEx() {
                  			@Override
                  			public int sum(int x, int y) {
                  				return x + y;
                  			}
                  		};
    System.out.println(ie.sum(10, 20));
    
    InterfaceEx ie2 = (int x, int y) -> x + y;
    System.out.println(ie2.sum(10, 20));
    
    LambdaInterface li = () -> {
    	String str = "함수형인터페이스";
    	System.out.println(str);
    };
    
    li.print();
    
    
    
    
	}

}

// 메소드가 하나 뿐인 interface : 함수형 interface
@FunctionalInterface
interface InterfaceEx{
	public int sum(int x, int y);
}
@FunctionalInterface
interface LambdaInterface{
	void print();
}