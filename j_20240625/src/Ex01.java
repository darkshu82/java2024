import java.util.Arrays;

public class Ex01 {
  public static void main(String[] args) {

    String name1 = "홍길동";
    String name2 = "홍길동";

    System.out.println("name1 == name2 : " + (name1 == name2));
    System.out.println("name1.equals(name2) : " + name1.equals(name2));
    System.out.println("-----------------------------");

    String name3 = new String("홍길동");
    String name4 = new String("홍길동");

    System.out.println("name3 == name4 : " + (name3 == name4));
    System.out.println("name1.equals(name4) : " + name3.equals(name4));
    System.out.println("-----------------------------");

    int[] arr1 = new int[] { 1, 2, 3 };
    int[] arr2 = new int[] { 1, 2, 3 };    
    System.out.println("arr1 == arr2 : " + (arr1 == arr2));
    
    //140 page
    int[] arr3 = arr1;
    System.out.println("arr1 == arr3 : " + (arr1 == arr3));
    
    System.out.println("arr1.length : " + arr1.length);
    System.out.println("arr1.length : " + arr3.length);
    
    System.out.println("arr3[0] : " + arr3[0]);
    System.out.println("arr3[1] : " + arr3[1]);
    System.out.println("arr3[2] : " + arr3[2]);
    
    System.out.println("arr3[0] : " + arr3[0]);
    System.out.println("arr3[1] : " + arr3[1]);
    System.out.println("arr3[2] : " + arr3[2]);
    
    System.out.println("arr1 : " + arr1);
    System.out.println("arr3 : " + arr3);
    System.out.println("arr2 : " + arr2);
    
    System.out.println("arr3[0] = 100 전");
    System.out.println("arr3 : " + Arrays.toString(arr3));
    System.out.println("arr1 : " + Arrays.toString(arr1));
    
    int[] arr4 = new int[] {1, 2, 3};
    int[] arr5 = Arrays.copyOf(arr4, 3);
    
    System.out.println("arr4 : " + arr4);
    System.out.println("arr5 : " + arr5);
    System.out.println("arr4 == arr5 : " + (arr4 == arr5));
    
    arr5 = arr4;
    System.out.println("arr4 : " + arr4);
    System.out.println("arr5 : " + arr5);
    System.out.println("arr4 == arr5 : " + (arr4 == arr5));
    
  }
}
