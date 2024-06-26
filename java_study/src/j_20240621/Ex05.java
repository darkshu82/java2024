package j_20240621;

public class Ex05 {
	
	public static void main(String args[]) {
		
		// 증가연산자(++), 감소연산자(--) : 증감연산자
		//  ㄴ 변수 공간의 값을 1 증가(감소) 시킴
		
		int number1 = 10;
		
		System.out.println("number1 : " + number1);
		System.out.println("number1 + 10 : " + (number1 + 10));
		System.out.println("number1 : " + number1);
		
		number1 = number1 + 10;
		System.out.println("number1 : " + number1);
		
		int num = 12;
		System.out.println("num : " + num);
		System.out.println("num++ : " + num++);
		System.out.println("++num : " + ++num);
		System.out.println("num : " + num);
		
		System.out.println("num-- : " + num--);
		System.out.println("--num : " + --num);
		System.out.println("num : " + num);
		
		System.out.println("===================================");
		
	  // 63 page
		// 전위연산 ++(--) 연산자가 변수 앞에 있는 형태 --> ++num
		// 후위연산 ++(--) 연산자가 변수 뒤에 있는 형태 --> num++
		//   ㄴ 단독으로 사용하면 결과가 같음
		//      다른 연산자(출력 포함)와 같이 사용하면
		//      전위연산의 경우, ++(--) 연산자가 먼저 실행됨
		//      후위연산의 경우, ++(--) 연산자가 나중에 실행됨
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 + (++num2));
		System.out.println(num2);
		System.out.println(num1 + (num2++));
		System.out.println(num2);
		
		System.out.println("===================================");
		
		//  63 page 밑 부분
	  int a = 10;
	  System.out.println("전위연산전 a : " + a);
	  
	  int b = ++a;
	  System.out.println("전위연산결과 : " + b);
	  System.out.println("전위연산후 a : " + a);
	  
	  int x = 10;
	  System.out.println("후위연산전 x : " + x);

	  int y = x++;	  
	  System.out.println("후위연산결과 : " + y);
	  System.out.println("후위연산후 x : " + x);
		
    System.out.println("===================================");
		
		
    int figure1 = 10;
    System.out.printf("%d %d %d %d %d %d%n", figure1++, --figure1, ++figure1, figure1++, figure1--, figure1);
		
    figure1 = 10;
    figure1++;
    System.out.printf("%d %d %d %d %d %d%n", figure1++, --figure1, ++figure1, figure1++, figure1--, figure1);
		
	}

}






