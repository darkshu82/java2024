import java.util.Arrays;

public class Ex01 {

  public static void main(String args[]) {

    // 참조형 자료형 : 137 page
    // 참조형 변수가 올라간 메모리 공간에
    // data 의 주솟값이 저장됨
    // 이때, data 는 HEAP 메모리 공간에 저장되고
    // 참조형 변수는 일반적으로 Call Stack 메모리 공간에 올라감

    // cf. 기본형 자료형은
    // 기본형 변수가 올라간 메모리 공간에
    // data 가 직접 저장됨
    // 기본형 변수도 일반적으로 Call Stack 메모리 공간에 올라감

    // 139 page
    // 문자열을 기본형 자료형 형태로 메모리에 올리면
    // constant pool (상수풀) 에 저장되고
    // 기본형 자료형 변수가 올라간 메모리 공간에는
    // constant pool (상수풀) 에 저장된
    // literal data 가 복사되어서 저장(할당)됨
    // 할당 : 복사 붙여넣기
    String name1 = "홍길동";
    String name2 = "홍길동";

    // == 비교연산자 : data 의 주솟값을 비교함
    System.out.println("name1 == name2 : " + (name1 == name2));
    // String 의 equals() 메소드 : 문자열 자체를 비교함
    System.out.println("name1.equals(name2) : " + name1.equals(name2));

    System.out.println("----------------------------");

    // 문자열을 참조형 자료형 형태로 메모리에 올리면
    // HEAP 메모리 영역에 저장되고
    // 참조형 자료형 변수가 올라간 메모리 공간에는
    // HEAP 메모리 영역에 저장된
    // 문자열의 주솟값만 저장(할당)됨
    // 할당 : 복사 붙여넣기
    String name3 = new String("홍길동");
    String name4 = new String("홍길동");

    // == 비교연산자 : data 의 주솟값을 비교함
    System.out.println("name3 == name4 : " + (name3 == name4));
    // String 의 equals() 메소드 : 문자열 자체를 비교함
    System.out.println("name3.equals(name4) : " + name3.equals(name4));

    System.out.println("----------------------------");

    int[] arr1 = new int[] { 1, 2, 3 };
    int[] arr2 = new int[] { 1, 2, 3 };
    System.out.println("arr1 == arr2 : " + (arr1 == arr2));

    // 140 page
    int[] arr3 = arr1;
    System.out.println("arr1 == arr3 : " + (arr1 == arr3));

    System.out.println("arr1.length : " + arr1.length);
    System.out.println("arr3.length : " + arr3.length);

    System.out.println("arr3[0] : " + arr3[0]);
    System.out.println("arr3[1] : " + arr3[1]);
    System.out.println("arr3[2] : " + arr3[2]);

    System.out.println("arr1[0] : " + arr1[0]);
    System.out.println("arr1[1] : " + arr1[1]);
    System.out.println("arr1[2] : " + arr1[2]);

    // 참조변수를 출력하면 대부분 해당 참조변수에 저장된
    // (참조변수에 저장된 data (정수로 이루어진 주솟값)) 의
    // Hash Code 값이 출력됨
    // arr1 : [I@2d363fb3
    // arr3 : [I@2d363fb3
    // arr2 : [I@7d6f77cc
    System.out.println("arr1 : " + arr1);
    System.out.println("arr3 : " + arr3);
    System.out.println("arr2 : " + arr2);

    System.out.println("arr3[0] = 100 전");
    System.out.println("arr3 : " + Arrays.toString(arr3));
    System.out.println("arr1 : " + Arrays.toString(arr1));

    arr3[0] = 100;
    System.out.println("arr3[0] = 100 후");
    System.out.println("arr3 : " + Arrays.toString(arr3));
    System.out.println("arr1 : " + Arrays.toString(arr1));

    // 140 ~ 141 page
    int[] arr4 = new int[] { 1, 2, 3 };
    // Arrays.copyOf(arr4, 3) : arr4 에 저장된 data 를 순서대로 3 개를 복사함
    // data 를 복사하면 복사본이 새롭게 메모리에 올라가므로
    // ㄴ 원본과 같은 복사본이 새롭게 메모리에 올라감
    // ㄴ 주소가 달라짐
    // 복사 & 붙여넣기 <-- 원본은 원본대로 있고, 복사본이 하나 만들어짐
    // ㄴ 주소가 달라짐
    int[] arr5 = Arrays.copyOf(arr4, 3);
    System.out.println("arr4 : " + arr4);
    System.out.println("arr5 : " + arr5);
    System.out.println("arr4 == arr5 : " + (arr4 == arr5));

    // arr4 (의 공간에 저장된 주소를 복사해서 arr5 의 공간에 붙여넣음)
    // <-- 주소가 같음
    arr5 = arr4;
    System.out.println("arr4 : " + arr4);
    System.out.println("arr5 : " + arr5);
    System.out.println("arr4 == arr5 : " + (arr4 == arr5));

  }

}
