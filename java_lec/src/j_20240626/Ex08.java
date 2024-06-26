package j_20240626;
/*
    final 
    
    1) 변수에 사용하는 경우   : 변수를 상수로 만듬 - 초기화 이후에는 값이 할당되지 않음
    2) 메소드에 사용하는 경우 : overriding 이 안 됨
    3) 클래스에 사용하는 경우 : 다른 클래스의 부모 클래스가 될 수 없음
                                  ㄴ 상속해 줄 수 없음
    
*/
class FinalTest{
	
	int number1;
	int number2 = 20;
	
	// final 을 사용해서 선언하면 상수가 됨
	// 상수는 반드시 초기화해야 됨
	final int number3 = 30;
	
	// 바로 초기화해 주지 않는 경우에는
	// 생성자를 통해서 초기화함
	final int number4;
	
	FinalTest(int number4){
		this.number4 = number4;
	}
	
}


public class Ex08 {
	
	public static void main(String[] args) {
		
	}

}
