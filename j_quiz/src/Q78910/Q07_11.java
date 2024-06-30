package Q78910;

public class Q07_11 {
  public static void main(String[] args) {

    int[] arr = { 9, 5, 24, 13, 3, 21 };
    
    Math m = new Math();
    
    int max = m.max(arr);
    int min = m.min(arr);

    System.out.println("배열의 최대값 : " + max);
    System.out.println("배열의 최소값 : " + min);

  }
}

class Math {

  public int max(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public int min(int[] arr) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

}