package j_20240702;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		// 333 page
		
		Random r1 = new Random(42);
		Random r2 = new Random(42);
		
		System.out.println("r1");
		for(int i = 0; i < 10; i++) {
			System.out.print(r1.nextInt() + " ");
		}
		System.out.println("\n------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("r2");
		for(int i = 0; i < 10; i++) {
			System.out.print(r2.nextInt() + " ");
		}
		System.out.println("\n------------------------------------------------------------------------------------------------------------------");
		
		// 334 page
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			System.out.print(rand.nextInt(6)+1 + " " );
		}
		System.out.println("\n------------------------------------------------------------------------------------------------------------------");
		
		// 335 page
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(true) {
			System.out.print("이름을 입력하세요 \n(종료하려면 엔터하세요) : ");
			String name = sc.nextLine();
			
			if("".contentEquals(name)) { break; }
			
			System.out.println(name + " 님, 안녕하세요 ~~~");
			count ++;
		}
		System.out.println("이름이 입력된 총 횟수 : " + count + " 회");

		
		
		
	}

}





