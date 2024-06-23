
public class Ex19 {
  public static void main(String args[]) {
    
    int score = 98;
    char grade = ' ';
    char plmi = ' ';
    
    if (0 <= score && score <= 100) {
      switch(score/10) {
        case 10: case 9:
          grade = 'A';
          if ( 98 <= score) {
            plmi = '+';
          } else if ( 94 <= score) {
            plmi = '0';
          } else {
            plmi = '-';
          } break;
        case 8:
          grade = 'B';
          if (88 <= score) {
            plmi = '+';
          } else if (84 <= score) {
            plmi = '0';
          } else {
            plmi = '-';
          } break;
        case 7:
          grade = 'C';
          if (78 <= score) {
            plmi = '+';
          } else if (74 <= score) {
            plmi = '0';
          } else {
            plmi = '-';
          } break;
        case 6:
          grade = 'D';
          if (68 <= score) {
            plmi = '+';
          } else if (64 <= score) {
            plmi = '0';
          } else {
            plmi = '-';
          } break;
         default:
           grade = 'F';
           break;
      } 
      System.out.printf("당신은 %c%c 학점입니다.%n", grade, plmi);
    } else {
      System.out.println("성적을 올바르게 입력해 주세요.");
    }
  }
}
