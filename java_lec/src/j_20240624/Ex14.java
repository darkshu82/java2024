package j_20240624;

public class Ex14 {
	
	public static void main(String args[]) {
		
		// 126 page
		// 다차원 배열 
		// new int[5][3] : 5 행 3 열의 이차원 행렬
		// *******************************************
		//   이차원 배열의 한 줄(행)이 일차원 배열임
		// *******************************************		
		// 일차원 배열 변수는 일차원 배열의 주소를 저장함
		// 이차원 배열 변수는 이차원 배열의 주소를 저장함
		
		int[][] matrix = new int[5][3];
		
		/* 5명의 국어, 영어, 수학 점수를 저장한 이차원 배열 */
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
	  System.out.println("matrix[4].length : " + matrix[4].length);
	  System.out.println("matrix[3][2] : " + matrix[3][2]);
	  System.out.println("matrix[3][1] : " + matrix[3][1]);
	  System.out.println("-----------------------------");
	  
	  /*
       0 :   {100, 100, 100}, 
       1 :   { 98,  72,  86}, 
       2 :   { 76,  98,  82},
       3 :   { 95,  88, 100}, 
       4 :   {100,  76,  84}	
	  */
	  
	  for(int out = 0; out < matrix.length; out++) {
  	  for(int in = 0; in < matrix[0].length; in++) {
  	  	System.out.print(matrix[out][in] + " ");
  	  }
	  }
	  System.out.println("\n-----------------------------");
	  /*
	    2 차원 배열의 for 문
	  */
	  for(int out = 0; out < matrix.length; out++) {
  	  for(int in = 0; in < matrix[out].length; in++) {
  	  	System.out.print(matrix[out][in] + " ");
  	  }
	  }
	  System.out.println("\n-----------------------------");
	  
	  /*
      2 차원 배열의 for 문
    */
    for(int row = 0; row < matrix.length; row++) {
  	  for(int column = 0; column < matrix[row].length; column++) {
  	  	System.out.print(matrix[row][column] + " ");
  	  }
    }
    System.out.println("\n-----------------------------");
    
	  /*
	    구구단의 for 문 (2 차원 배열의 for 문과 유사함)
	   */
	  for(int dan = 0; dan < 10; dan++) {
	  	for(int number = 0; number < 10; number++) {
	  		System.out.printf("%d X %d = %d", dan, number, dan*number);
	  	}
	  	System.out.println();
	  }
	  System.out.println("\n-----------------------------");
	  
	  // matrix[0].length
	  for(int i = 0; i < matrix[0].length; i++) {
	  	System.out.print(matrix[0][i] + " ");
	  }
	  System.out.println("\n-----------------------------");
	  
	  for(int i = 0; i < matrix[1].length; i++) {
	  	System.out.print(matrix[1][i] + " ");
	  }
	  System.out.println("\n-----------------------------");
	  
	  for(int i = 0; i < matrix[2].length; i++) {
	  	System.out.print(matrix[2][i] + " ");
	  }
	  System.out.println("\n-----------------------------");
	  
	  for(int i = 0; i < matrix[3].length; i++) {
	  	System.out.print(matrix[3][i] + " ");
	  }
	  System.out.println("\n-----------------------------");
	  
	  for(int i = 0; i < matrix[4].length; i++) {
	  	System.out.print(matrix[4][i] + " ");
	  }
	  System.out.println("\n-----------------------------");
	  
	  
	  
	  
	}

}
