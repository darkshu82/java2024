package j_20240628;

public class Ex14 {
	
	public static void main(String[] args) {
		
		// 288 page
		// 예외 던지기 : 예외가 발생한 부분에서 
		//               바로 예외처리를 하지 않고
		//               호출한 곳으로 예외처리를 떠넘김

		try {
			first();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	} // main method
	
	static void first() throws Exception{
		second();
	}
	
	static void second() throws Exception{
		throw new Exception("예외 발생 !!!");
	}

}






