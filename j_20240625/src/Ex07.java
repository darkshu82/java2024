
public class Ex07 {
  public static void main(String args[]) {
  	
    // 객체 생성 이전
  	// static 멤버변수에 접근하려면
  	// 클래스 이름으로 접근함
  	System.out.println("Avante.company : " + Avante.company);
  	
  	// instance 변수는 객체 생성 이후에 메모리에 올라가므로
  	// 객체 생성 이전에는 접근할 방법이 없음
  	// System.out.println("Avante.color : " + Avante.color);
  	
  	// 객체 생성
  	Avante a1 = new Avante();
  	
  	System.out.println("a1.color : " + a1.color);
  	
  	// 객체 생성 이후
  	// static 멤버변수에 접근하려면
  	// instance 참조변수 이름으로 접근할 수 있음
  	System.out.println("a1.company : " + a1.company);
  	
  	// 그러나... static 멤버변수는 해당 클래스에서
  	// 하나만 있고, 객체별로 따로 있는 변수가 아니라서
  	// 객체에서(instance 참조변수 이름으로) 접근하기 보다는
  	// 클래스 이름으로 접근하는 것을 권장함
  	System.out.println("Avante.company : " + Avante.company);
  	
  	System.out.println("-----------------------------------");
  			
  			
  	/*
  	  instance 변수는 객체가 생성될 때마다 
  	  객체별로 메모리에 새로 올라감 (객체별로 초기화 됨)
  	                                       
  	*/
  	Avante a2 = new Avante();
  	Avante a3 = new Avante();
  	
  	a1.color = "white";
  	a2.color = "blue";
  	a3.color = "orange";
  	
  	System.out.println("a1.color : " + a1.color);
  	System.out.println("a2.color : " + a2.color);
  	System.out.println("a3.color : " + a3.color);
  	System.out.println("-----------------------------------");
  	
  	a1.color = "skyblue";
  	System.out.println("a1.color : " + a1.color);
  	System.out.println("a2.color : " + a2.color);
  	System.out.println("a3.color : " + a3.color);
    System.out.println("-----------------------------------");
  	
  	a3.color = "pink";
  	System.out.println("a1.color : " + a1.color);
  	System.out.println("a2.color : " + a2.color);
  	System.out.println("a3.color : " + a3.color);
    System.out.println("-----------------------------------");
  	
    /* 
       Avante 클래스의 company 멤버변수는 static 멤버변수임
       static 멤버변수는 해당(Avante) 클래스에서 단 하나만 생성됨
       해당(Avante) 클래스의 각 객체(a1, a2, a3 )에서   
       static 멤버변수에 접근할 수 있음 <-- 모두 같은 값을 확인하게 됨
       
    */
    System.out.println("a1.company : " + a1.company);
  	System.out.println("a2.company : " + a2.company);
  	System.out.println("a3.company : " + a3.company);
  	System.out.println("-----------------------------------");
  	
  	a1.company = "기아";
  	System.out.println("a1.company : " + a1.company);
  	System.out.println("a2.company : " + a2.company);
  	System.out.println("a3.company : " + a3.company);
  	System.out.println("-----------------------------------");
  	
  	a2.company = "벤츠";
  	System.out.println("a1.company : " + a1.company);
  	System.out.println("a2.company : " + a2.company);
  	System.out.println("a3.company : " + a3.company);
  	System.out.println("-----------------------------------");
  	
  	a3.company = "쌍용";
  	System.out.println("a1.company : " + a1.company);
  	System.out.println("a2.company : " + a2.company);
  	System.out.println("a3.company : " + a3.company);
  	
  }
}

class Avante{
	// instance 변수
	String color;
	// static(class) 변수
	static String company = "현대";
}
