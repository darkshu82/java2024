package j_20240702;
import java.util.ArrayList;
import java.util.List;

public class Ex14 {
	
	public static void main(String[] args) {
		
		// 403 page
		List list = new ArrayList();
		
		Member m1 = new Member();
		m1.setName("홍길동");
		m1.setId("tjoeun");
		m1.setPassword("1234");
		m1.setAge(36);
		list.add(m1);
		
		Member m2 = new Member();
		m2.setName("이순신");
		m2.setId("turtle");
		m2.setPassword("9875");
		m2.setAge(46);
		list.add(m2);
		
		Member m3 = new Member();
		m3.setName("정약용");
		m3.setId("korea");
		m3.setPassword("875421");
		m3.setAge(30);
		list.add(m3);
		
		System.out.println("list.size() : " + list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("idx : %d, 이름 : %s, 아이디 : %s, 비밀번호 : %s, 나이 : %d%n", 
					              i,  
					              ((Member)list.get(i)).getName(),
					              ((Member)list.get(i)).getId(),
					              ((Member)list.get(i)).getPassword(),
					              ((Member)list.get(i)).getAge());
			System.out.println("========================================================================");
		}
		
		List<Member> list2 = new ArrayList<>();
		list2.add(m1);
		list2.add(m2);
		list2.add(m3);
		
		System.out.println("list2.size() : " + list2.size());
		
		for(int i = 0; i < list2.size(); i++) {
			System.out.printf("idx : %d, 이름 : %s, 아이디 : %s, 비밀번호 : %s, 나이 : %d%n", 
					              i,  
					              list2.get(i).getName(),
					              list2.get(i).getId(),
					              list2.get(i).getPassword(),
					              list2.get(i).getAge());
			System.out.println("========================================================================");
		}
		
	}

}

class Member{
	private String name;
	private String id;
	private String password;
	private int age;
	
	// setter : 멤버변수의 값을 설정(setting)함
	// set + 멤버변수이름
	public void setName(String name) {
		if(name.length() >= 3) {
		  this.name = name;
		}else {
			System.out.println("이름이 너무 짧습니다");
		}
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
  // getter	: 멤버변수의 값을 반환함
	// get + 멤버변수이름
	public String getName() {
		return this.name;
	}
	public String getId() {
		return this.id;
	}
	public String getPassword() {
		return this.password;
	}
	public int getAge() {
		return this.age = age;
	}
	
	
}




