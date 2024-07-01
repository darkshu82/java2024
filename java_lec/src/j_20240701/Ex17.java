package j_20240701;

public class Ex17 {
	
	public static void main(String[ ]args) {
		
		// Math 클래스 : 325 page
		
		System.out.println("Math.abs(10)=" + Math.abs(10));
		System.out.println("Math.abs(-10)=" + Math.abs(-10));
		System.out.println("Math.abs(3.1415)=" + Math.abs(3.1415));
		System.out.println("Math.abs(-3.1415)=" + Math.abs( 3.1415));
		System.out.println("Math.ceil(5.4)=" + Math.ceil(5.4));
		System.out.println("Math.ceil(-5.4)=" + Math.ceil(-5.4));
		System.out.println("Math.floor(5.4)=" + Math.floor(5.4));
		System.out.println("Math.floor(-5.4)=" + Math.floor(-5.4));
		System.out.println("Math.max(5,4)=" + Math.max(5,4));
		System.out.println("Math.max(5.4,5.3)=" + Math.max(5.4,5.3));
		System.out.println("Math.min(5,4)=" + Math.min(5,4));
		System.out.println("Math.min(5.4,5.3)=" + Math.min(5.4,5.3));
		System.out.println("Math.random()=" + Math.random());
		System.out.println("Math.rint(5.4)=" + Math.rint(5.4));
		System.out.println("Math.rint(-5.4)=" + Math.rint(-5.4));
		System.out.println("Math.round(5.4)=" + Math.round(5.4));
		System.out.println("Math.round(5.5)=" + Math.round(5.5));
		
		System.out.println("====================");
		
		System.out.println(Math.PI);
		// 원주율을 반올림해서 소수점 3 째자리까지 출력하기System.out.println(
		double v1 = Math.PI * 1000;
		double v2 = Math.round(v1);
		double v3 = v2 / 1000.0;
		System.out.println(v1);
		System.out.println(Math.round(v1));
		System.out.println(v2);
		System.out.println(v3);
				
		
		// 한줄로 출력
		System.out.println(Math.round(Math.PI * 1000)/1000.0);
		System.out.println(Math.round(Math.PI * 1000)/1000);
		
		
	}
}




