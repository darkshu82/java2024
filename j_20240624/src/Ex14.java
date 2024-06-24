
public class Ex14 {
	public static void main(String[] args) {
		
		int[][] matrix = new int[5][3];
		
		matrix = new int[][] {
														{100, 100, 100},
														{98, 72, 86}, 
														{76, 98, 82},
														{95, 88, 100},
														{100, 76, 84}
													};
		
		System.out.println("matrix.length : " + matrix.length);
		System.out.println("matrix[0].length : " + matrix[0].length);
		System.out.println("matrix[1].length : " + matrix[1].length);
		System.out.println("matrix[2].length : " + matrix[2].length);
		System.out.println("matrix[3].length : " + matrix[3].length);
		System.out.println("matrix[3][2].length : " + matrix[3][2]);
		
		
		for(int out = 0; out < matrix.length; out++) {
  		for(int in = 0; in < matrix[0].length; in++) {
  			System.out.print(matrix[out][in] + " ");
  		}
  		System.out.println("\n==============================================");
		}
		
		for(int out = 0; out < matrix.length; out++) {
  		for(int in = 0; in < matrix[out].length; in++) {
  			System.out.print(matrix[out][in] + " ");
  		}
  		System.out.println("\n==============================================");
		}
		
		
		System.out.println("\n==============================================");		
		
		
		for(int i = 0; i < matrix[0].length; i++) {
			System.out.println(matrix[0][i] + " ");
		}
		System.out.println("\n==============================================");

		for(int i = 0; i < matrix[1].length; i++) {
			System.out.println(matrix[1][i] + " ");
		}
		System.out.println("\n==============================================");
		
		for(int i = 0; i < matrix[2].length; i++) {
			System.out.println(matrix[2][i] + " ");
		}
		System.out.println("\n==============================================");
		
		for(int i = 0; i < matrix[3].length; i++) {
			System.out.println(matrix[3][i] + " ");
		}
		System.out.println("\n==============================================");
		
		
		
		
		
		
	}
}
