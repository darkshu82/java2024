package j_20240628;

interface Fax2{
	String FAX_NUMBER = "02-1234-5678";
	void send(String tel);
	void receive(String tel);
}

// Fax2 인터페이스를 상속하는 클래스
class Complexer2 implements Fax2{
	@Override
	public void send(String tel) {
		System.out.println("Complexer2 클래스의 send() 메소드");
	}
	@Override
  public void receive(String tel) {
		System.out.println("Complexer2 클래스의 receive() 메소드");
	}
}

public class Ex07 {
	
	public static void main(String[] args) {
		
		Complexer2 c2 = new Complexer2();
		c2.send("010-985-6532");
		c2.receive("010-985-6532");
		
		// 익명 클래스 작성하기 : 
		// 이름이 없으므로 생성자 이름음 부모의 이름으로 사용함
		// 익명 클래스를 정의한 code 가
		// 익명 클래스의 객체를 생성하는 code 가 됨
		Fax2 f2 = new Fax2(){
            			@Override
            			public void send(String tel) {
            				System.out.println("Fax2 를 구현한 익명클래스의 send() 메소드");
            			}
            			@Override
            		  public void receive(String tel) {
            				System.out.println("Fax2 를 구현한 익명클래스의 receive() 메소드");
            			}
		            };
		
		            f2.send("01023665547");
		            f2.receive("01023665547");
	}
}

