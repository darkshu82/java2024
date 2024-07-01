
public class Ex15 {
  public static void main(String[] args) {
    
    String str = "Java is the best programming language";
    System.out.println("5번째 index에 있는 문자 : " + str.charAt(5));
    System.out.println("best 문자열의 index에 있는 문자 : " + str.indexOf("best"));
    System.out.println("b 문자열의 index에 있는 문자 : " + str.indexOf("b"));
    
    int lengthOfProgramming = "programming".length();
    
//    System.out.println(str.substring(str.indexOf("p"), str.indexOf("p") + str.indexOf(lengthOfProgramming)));
    
    System.out.println(str.substring(17, 28));
    System.out.println(str.substring(str.indexOf("p")));
    System.out.println(str.substring(str.indexOf("p"), 28));
    
    System.out.println(str.toLowerCase());
    System.out.println(str.toUpperCase());
    System.out.println(str.startsWith("Java"));
    System.out.println(str.startsWith("Hello"));
    System.out.println(str.endsWith("language"));
    System.out.println(str.endsWith("Hello"));
    
    System.out.println(str.replace("the best", "a good"));
    
    System.out.println(str.replace("g", "q"));
    System.out.println(str.replaceAll("g", "q"));
    
    System.out.println(str.replaceAll("g", "q"));
    System.out.println(str.replaceAll("g", "q"));
    
    System.out.println(str);
    System.out.println(str.toString());
    
    
    String str1 = "       Java is the best programming language        ";
    System.out.println(str1.trim());
    
    System.out.println(str1.replace(" programming", "").trim());
    
    
    String str2 = "";
    
    
    
  }

}











