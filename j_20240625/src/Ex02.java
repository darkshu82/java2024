
public class Ex02 {
<<<<<<< HEAD
  public static void main(String[] args) {

    A a = new A();
    B b = new B();

    Member member1 = new Member();
    Member member2 = new Member();
    Member member3 = new Member();
    Member member4 = new Member();
    Member member5 = new Member();

    System.out.println("member1 : " + member1);
    System.out.println("member2 : " + member2);
    System.out.println("member3 : " + member3);
    System.out.println("member4 : " + member4);
    System.out.println("member5 : " + member5);

    System.out.println("member1 == member2 : " + (member1 == member2));

    Member member6 = member5;
    System.out.println("member5 == member6 : " + (member5 == member6));

    if (member1 == member2) {
      System.out.println("member1 객체와 member2 객체는 같다");
    } else {
      System.out.println("member1 객체와 member2 객체는 다르다");
    }

    if (member5 == member6) {
      System.out.println("member1 객체와 member2 객체는 같다");
    } else {
      System.out.println("member1 객체와 member2 객체는 다르다");
    }

  }
=======
	
	public static void main(String args[]) {
		A a = new A();
		B b = new B();

		
		// 149 page
		Member member1 = new Member(); 
		Member member2 = new Member(); 
		Member member3 = new Member(); 
		Member member4 = new Member(); 
		Member member5 = new Member(); 
		
		System.out.println("member1 : " + member1);
		System.out.println("member2 : " + member2);
		System.out.println("member3 : " + member3);
		System.out.println("member4 : " + member4);
		System.out.println("member5 : " + member5);
		
		System.out.println("member1 == member2 : " + (member1 == member2));
		
		Member member6 = member5;
		System.out.println("member5 == member6 : " + (member5 == member6));
		
		if (member1 == member2) {
			System.out.println("member1 객체와 member2 객체는 같다");
		}else {
			System.out.println("member1 객체와 member2 객체는 다르다");
		}
		
		if (member5 == member6) {
			System.out.println("member5 객체와 member6 객체는 같다");
		}else {
			System.out.println("member5 객체와 member6 객체는 다르다");
		}
		
	}

>>>>>>> 3b86a5c898fb7ad7b8373024edaf3cc1f828033e
}
