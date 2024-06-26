package j_20240624;

// 81 page
// 4 장 연습문제 6 번

public class Ex04 {
	
	public static void main(String args[]) {
		/*
  		지불해야할 금액이 187,000 원인데, 
      5 만원권과 1 만원권, 5천원권, 1 천원권 지폐를 
      가장 적은 지폐수량으로 지불하는 코드를 작성하시오.
		*/
		
		int price = 187000;
		int remainPrice = 0;
		
		int oman = price / 50000;
		remainPrice = price % 50000;
		int ilman = remainPrice / 10000;
		remainPrice = remainPrice % 10000;
		int ochun = remainPrice / 5000;
		remainPrice = remainPrice % 5000;
		int ilchun = remainPrice / 1000;
		remainPrice = remainPrice - (1000 * ilchun);
		
		System.out.println("5 만원 권 : " + oman + " 장");
		System.out.println("1 만원 권 : " + ilman + " 장");
		System.out.println("5 천원 권 : " + ochun + " 장");
		System.out.println("1 천원 권 : " + ilchun + " 장");
		System.out.println("남은 금액 : " + remainPrice + " 원");
		
		
	}

}
