
public class Ex16 {
  public static void main(String[] args) {
    
    String str1 = "안녕하세요. ";
    
    System.out.println(str1);
    System.out.println(str1.hashCode());
    System.out.println(str1 + "이순신 님");
    System.out.println((str1 + "이순신 님").hashCode());
    
    StringBuffer sb1 = new StringBuffer ("안녕하세요. ");
    System.out.println(sb1.hashCode());
    sb1.append("이순신 님");
    System.out.println(sb1.hashCode());
    
    sb1.append(" 반가워요").append(" 1234567890").append(" abcd");
    System.out.println(sb1);
    
    sb1.delete(sb1.indexOf(" "), sb1.indexOf("님")+1);
    System.out.println(sb1);
    
//    sb1.deleteChar(sb1.);
//    System.out.println(sb1);
    
    sb1.insert(sb1.indexOf("a"), "/");
    System.out.println(sb1);

    
    
    
    
    
  }
}
