package j_20240620;

/*
  변수의 scope : 메모리에서 변수를 인식하는 범위
  
  좁은(속) scope 에서는 더 넓은(밖) scope 있는 변수를 인식함
  넓은(밖) scope 에서는 더 좁은(속) scope 있는 변수를 인식 못함
  
  밖에서는 속을 못 봄
  속에서는 밖을 봄
*/
public class Ex08 {
	// 49 page
	static int number;
	
	public static void main(String args[]) {
		String name = "자바";
		
		System.out.println("number : " + number);
		System.out.println("name   : " + name);
		
		// 50 page
		if (true) {
			name = "더조은";
			String email = "the@joeun.com";
			
			System.out.println("name   : " + name);
			System.out.println("email   : " + email);
		}
		// email = "the@joeun.com";
		name = "아이티";
		
		System.out.println("name   : " + name);
		// System.out.println("email   : " + email);
	}
}








