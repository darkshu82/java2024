package j_20240628;

public class Ex02 {
  public static void main(String[] args) {
  	Complexer com = new Complexer();
  	System.out.println("잉크 : " + Complexer.INK);
  	System.out.println("팩스번호 : " + Complexer.FAX_NUMBER);

  	com.print();
  	com.scan();
  	com.send("02-8754-6532");
  	com.receive("02-8754-5421");
  }
}


// 246 page
interface Printer{
	
	int INK = 100;
	void print();
	
}
interface Scanner{

	void scan();
	
}
interface Fax{
	
	String FAX_NUMBER = "02-1234-5678";
	void send(String tel);
	void receive(String tel);
	
}



class Complexer implements Printer, Scanner, Fax{
  @Override
  public void send(String tel){
    System.out.println(FAX_NUMBER + "에서 " + tel + "로 FAX 전송");
  }

  @Override
  public void receive(String tel){
    System.out.println(FAX_NUMBER + "에서 " + tel + "로 FAX 수신");
  }

  @Override
  public void print(){
    System.out.println("출력 실행");
  }

  @Override
  public void scan(){
    System.out.println("스캔 실행");
  }

}

