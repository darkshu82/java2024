
public class Ex04 {
	
	public static void main(String args[]) {
		
		// 44 page
		char a ='A';
		System.out.println("a : " + a);
		
		int b = a;
		System.out.println("b : " + b);		
		
		char c = 66;
		System.out.println("c : " + c);
		
		/*
		  int type 이하의 값들이 
		  연산을 하게 되면
		  모두 int type 으로 자동으로
		  형변환되어서 연산됨
		  
		  피연산자에 int type 보다
		  큰 자료형의 값이 섞여있으면
		  모두 가장 큰 type 으로 자동으로
		  형변환되어서 연산됨
		   
		 
		*/
		int d = a + b;
		System.out.println("d : " + d);
	}

}
