
public class Ex24 {
	public static void main(String args[]) {
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n-------------------------");
		
		for(int i = 1; i <= 10; i++) {
			if(i == 5) { break; }
			System.out.print(i + "");
		}
		System.out.println("\n-------------------------");
		
		for(int i = 1; i <= 10; i++) {
			if(i == 5) { continue; }
			System.out.print(i + "");
		}
		System.out.println("\n-------------------------");
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + "");
			if(i == 5) { continue; }
		}
		System.out.println("\n-------------------------");
		
	}
}
