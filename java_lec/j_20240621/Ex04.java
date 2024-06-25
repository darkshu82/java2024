
public class Ex04 {
	
	public static void main(String args[]) {
		
		// 59 page
		int number1 = 10;
		System.out.println("number1 : " + number1);
		
    number1 = number1 + 1;		
    System.out.println("number1 : " + number1);
    
    number1 += 1;		
    System.out.println("number1 : " + number1);

    number1 += 2;		
    System.out.println("number1 : " + number1);
    
    // number1 = number1 - 1;
    number1 -= 1;		
    System.out.println("number1 : " + number1);

    // number1 = number1 * 2;
    number1 *= 2;		
    System.out.println("number1 : " + number1);
    
    // number1 = number1 / 2;
    number1 /= 2;		
    System.out.println("number1 : " + number1);

    // number1 = number1 % 3;
    number1 %= 3;		
    System.out.println("number1 : " + number1);
    
    
    int number2 = 10;
    int number3 = 8;
    
    // 1.25 (X)
    // 몫 (정수 부분)
    int result = number2 / number3;
    System.out.println("result : " + result);
    
    // 나머지
    result = number2 % number3;
    System.out.println("result : " + result);
    
    // 1.25 
    double result2 = number2 / number3;
    System.out.println("result2 : " + result2);
    
    result2 = (double)number2 / (double)number3;
    System.out.println("result2 : " + result2);
    
    result2 = (double)number2 / number3;
    System.out.println("result2 : " + result2);
    
    result2 = number2 / (double)number3;
    System.out.println("result2 : " + result2);
	}

}



