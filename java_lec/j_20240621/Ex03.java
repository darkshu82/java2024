
public class Ex03 {
	
	public static void main(String args[]) {
		
		// java 에서 출력 방법
		// System.out (표준출력)
		// 1) print : 자동으로 줄바꿈하지 않음
		//            줄바꿈하려면 \n (줄바꿈문자) 를 사용함
		System.out.print("안녕하세요");
		System.out.print("여러분\n");
		System.out.print("\n반갑습니다");
		
		System.out.println("\n=============================");
		
		// 2) println : 자동으로 줄바꿈함
		System.out.println("안녕하세요");
		System.out.println("여러분");
		System.out.println("반갑습니다");
		
		System.out.println("\n=============================");
		// 3) printf : 자동으로 줄바꿈하지 않음
		//             줄바꿈하려면 \n (줄바꿈문자) 를 사용함
		// f - 출력 format 
		// 서식문자(변환문자)
		// %d  정수형으로 format 함
		// %f  실수형으로 format 함 : 기본적으로 소숫점 이하 6 째자리까지 출력함
		// %s  문자열형으로 format 함
		// %c  문자형으로 format 함
		// %b  논리형(boolean)으로 format 함
		// %n  줄바꿈 기능
		System.out.printf("%d\n", 10);		
		// System.out.printf("%f%n", 10);		
		System.out.printf("%f%n", 10F);		
		System.out.printf("%f%n", 10D);		
		
		System.out.println("\n=============================");
		System.out.printf("국어 : %d 점, 수학 : %d 점%n", 100, 92);
		
		// 출력할 전체 자릿수 지정하기 : 양수 - 오른쪽 정렬
		System.out.printf("국어 : %5d 점, 수학 : %5d 점%n", 100, 92);
		
		// 출력할 전체 자릿수 지정하기 : 음수 - 왼쪽 정렬
		System.out.printf("국어 : %-5d 점, 수학 : %-5d 점%n", 100, 92);
		
		
		
	}

}
