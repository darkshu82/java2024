package j_20240702;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Ex05 {
	
	public static void main(String[] args) {
		
		// 362 page
		List list = new ArrayList();
		
		System.out.println("list.size() : " + list.size());
		
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    
    System.out.println("list.size() : " + list.size());
    System.out.println("list : " + list);
    
    for(int i = 0; i < list.size(); i++) {
    	System.out.println(i + " : " + list.get(i));
    }
    
    /*
      Vector : ArrayList 의 이전 버전
               기본적으로 synchronized 가 되어 있음
      ArrayList :  기본적으로 synchronized 가 되어 있지 않고
                   필요할 때 설정할 수 있음
    */
    
    Vector vector = new Vector();
    vector.add(1.2);
    vector.add(Math.PI);
    vector.addElement(3.4);
    
    System.out.println("vector : " + vector);
    
    for(Object obj : vector) {
    	System.out.println(obj);
    }
    
    double number = 3.4;
    // number 의 index
    int idx = vector.indexOf(number);
    if(idx >= 0) {
    	System.out.println(number + " 의 위치 : " + idx);
    }else {
    	System.out.println(number + " 는 vector 에 없습니다");
    }
    
    number = 1.2;
    // vector 에 number 값이 있는지 확인하기
    if(vector.contains(number)) {
    	// 삭제함
    	vector.removeElement(number);
    	System.out.println("삭제됨");
    }
    
    // number 값이 vector 안에 없으면 -1 을 반환함
    System.out.println(vector.indexOf(number));
    System.out.println(vector);
    
    
	}

}




