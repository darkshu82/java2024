
public class Ex14 {
  public static void main(String[] args) {

    int score = 90;
    System.out.println("당신의 점수는 " + score + " 점 입니다");

    String strScore = score + "";

    strScore = String.valueOf(score);
    System.out.println("당신의 점수는 " + strScore + " 점 입니다");

    System.out.println("=================================");

    String number = "";

    for (int i = 0; i <= 5; i++) {
      number += " " + i;
    }
    System.out.println("number : " + number);
    System.out.println("=================================");

    String text = "Hello My Name is Hong Gil Dong";
    System.out.println("길이 :" + text.length());
    System.out.println(text.charAt(29));
    System.out.println(text.charAt(text.length() - 1));

    System.out.println(text.lastIndexOf(text.charAt(29)));
    System.out.println(text.indexOf(text.charAt(29)));

    for (int i = 0; i < text.length(); i++) {
      System.out.print(text.charAt(i));
    }

    String str1 = "G";
    System.out.println("str1 : " + str1);
    char ch = str1.charAt(0);
    System.out.println("ch : " + ch);

    System.out.println("".length());

  }

}
