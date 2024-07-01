package j_20240701;

public class Ex08 {
  public static void main(String[] args) {
  	String str1 = new String("abc");
  	String str2 = new String("abc");
  	
  	/*
  	  String 클래스에서는
  	  hashCode() 를 문자열로 생성하도록 overriding 했기 때문에
  	  문자열이 같으면 같은 hashCode 를 반환함
  	  System 클래스의 static 메소드인
  	  identityHadhCode() 로 hashCode 를 출력하면
  	  주솟값으로 hashCode 를 생성하기 때문에 
  	  같은 문자열이라도 주소가 다르면 서로 다른 hashCode 를 반환함
  	*/
  	System.out.println("str1.hashCode() : " + str1.hashCode());   
  	System.out.println("str2.hashCode() : " + str2.hashCode());
  	
  	System.out.println(System.identityHashCode(str1));
  	System.out.println(System.identityHashCode(str2));
  }
}
