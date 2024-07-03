
public class T1 {
  public static void main(String[] args) {
    int[] numbers = new int[] {1, 2, 3, 4, 5};
    
    int count = 0;
    System.out.print("{ ");
    for(int number : numbers) {
      count++;
      if(count < numbers.length ) {
        System.out.print(number + ", ");    
    } else {
      System.out.print(number + "");
      }
    }
    System.out.print(" }\n");
    
    System.out.print("{ ");
    for(int i = 0; i < numbers.length; i++) {
      if(i < numbers.length - 1) {
        System.out.print(numbers[i] + ", ");
      } else {
        System.out.print(numbers[i] + "");
      }
    }
    System.out.print(" }\n");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }  
}
