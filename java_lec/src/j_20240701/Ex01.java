package j_20240701;
import java.util.Arrays;

public class Ex01 {
	
	public static void main(String[] args) {
		
		// 7 장 연습문제
		// 205 page
		// 11 번
    int[] nums = new int[10];
    for(int i = 0 ; i < nums.length; i++){
    	nums[i] = (int)(Math.random() * 100) + 1;
    }
    System.out.println("nums : " + Arrays.toString(nums));
    int maxNumber = Mathematics.max(nums);
    System.out.println("최댓값 : " + maxNumber);
    int minNumber = Mathematics.min(nums);
    System.out.println("최솟값 : " + minNumber);
		
	}

}

// 3 번
class Person{
	String name;
	String gender;
	int age;
	int height;
	int weight;	
}

// 9 번
class Exercise{
	
	private static Exercise exercise = null;
	
	private Exercise() { }
	
	public static Exercise getInstance() {
		if (exercise == null) {
			exercise = new Exercise();
		}
		return exercise;
	}
	
}


// 11
class Mathematics{
	
  public static int max(int[] numbers){
    int max = 0;
    for(int i = 0; i < numbers.length; i++){
      if(i == 0){
        max = numbers[i];
      }else{
        if (max <= numbers[i]){
          max = numbers[i];
        } 
      }
    } 
    return max;
    
  }

  public static int min(int[] numbers){
    int min = 0;
    for(int i = 0; i < numbers.length; i++){
      if(i == 0){
        min = numbers[i];
      }else{
        if (min >= numbers[i]){
          min = numbers[i];
        } 
      }
    } 
    return min;
  }

}




