import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex02 {
  public static void main(String[] args) {
    
    String[] nameArr = new String[] {"이순신","강감찬", "안중근", "유관순"};
    List<String> nameList = Arrays.asList(nameArr);
    
    System.out.println("nameArr : " + Arrays.toString(nameArr));
    System.out.println("nameList : " + nameList);
    
    System.out.println("nameArr의 타입 : " + nameArr.getClass().getName());
    System.out.println("nameList의 타입 : " + nameList.getClass().getName());
    
    System.out.println("== for문 반복 ==");
    System.out.print("nameList : [");
    for(int i = 0; i < nameArr.length; i++) {
      if(i != nameArr.length -1) {
        System.out.print(nameArr[i] + ", ");
      } else {
        System.out.print(nameArr[i]);
      }
    }
    System.out.print("]");
    System.out.println("\n================================================================================");
    //향상된 for문
    System.out.println("== 향상된 for문 사용 반복 ==");
    System.out.print("nameList : [");
    int i = 0;
    for(String name : nameList) {
      System.out.print(name);
      if (i < nameList.size() -1) {
        System.out.print(", ");
        i++;
      }
    }
    System.out.print("]");
    System.out.println("\n================================================================================");
    
    //Iterator사용
    
    
    Iterator<String> iter = nameList.iterator();
    System.out.println("== Iterator 사용 반복 ==");
    System.out.print("nameList : [");
    while(iter.hasNext()) {
      System.out.print(iter.next());
      if(iter.hasNext()) {
        System.out.print(", ");
      }
    }
    System.out.print("]");
    System.out.println("\n================================================================================");

    
    
    // stream() 사용
    nameList.stream().forEach(name -> System.out.print(name + ", "));
    
    
    
    
    
    
  } //main
}











