import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// 13 장 3 번
class MemberEx{
	String id;
	String name;
	int age;
	
	MemberEx(String id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	// getter
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	// setter
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s - %d", this.id, this.name, this.age);
	}
	
}

// 연습문제 풀이 : 11 장 ~ 17 장
public class Ex01 {
	
	/*
	  12 장 2 번
	  
	  @Override
    public String toString(){
      return this.company + " : " + this.name;
    }
	  
	  12 장 3 번
	  
    int num1 = Integer.parseInt(num1);
    int num2 = Integer.parseInt(num2);
    int result = num1 + num2;
    
    System.out.println(num1 + num2);
    System.out.println(result);

  */
	
	public static void main(String[ ]args) {
		
		// 	  12 장 4 번
		String[] member = {"hong,홍길동,30","lee,이순신,40","kim,김유신,50"};
		
		// 이름 출력
		for(int i = 0; i < member.length; i++) {
			System.out.println(member[i].split(",")[1]);
		}
		
		// 평균 나이 출력
		int ageSum = 0;
		for(int i = 0; i < member.length; i++) {
			ageSum += Integer.parseInt(member[i].split(",")[2]);
		}
		
		System.out.println("평균나이 : " + (double)ageSum/member.length);
		System.out.println("=====================================");
		
		// 13 장 3 번
		MemberEx me1 = new MemberEx("hong","홍길동",30);
		MemberEx me2 = new MemberEx("lee","이순신",40);
		MemberEx me3 = new MemberEx("kim","김유신",50);
		
		List<MemberEx> memberList = new ArrayList<>();
		memberList.add(me1);
		memberList.add(me2);
		memberList.add(me3);
		
		// 전체 회원 출력 1 - getter 호출
		System.out.println("==  전체 회원 출력 1 - getter 호출  ==");
		for(int i = 0; i < memberList.size(); i++) {
			// Generics(Type Parameter) 를 지정하지 않은 경우에는 형변환 필수
			// MemberEx me = (MemberEx)memberList.get(i);
			MemberEx me = memberList.get(i);
			System.out.println(me.getId() + ", " + me.getName() + ", " + me.getAge());
		}
		
		System.out.println("==  전체 회원 출력 2 - toString() 활용  ==");
  	// 전체 회원 출력 2 - toString() 활용
		for(int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i));
		}
		
		System.out.println("=====================================");
		// 15 장 2 번
		InterfaceLambda il1 = new InterfaceLambda() {
                      			@Override
                      			public int sum(int x, int y) {
                      				return x + y;
                      			}
                      		};
                      		
    InterfaceLambda il2 =  (int x, int y) -> { return x + y; };
    InterfaceLambda il3 =  (int x, int y) -> x + y;
    		
		System.out.println(il1.sum(1, 2));
    System.out.println(il2.sum(1, 2));
    System.out.println(il3.sum(1, 2));
		
    System.out.println("=====================================");
		// 16 장 2 번
    
    String[] arr = new String[] {"a","b","c","d","e","f"};
    
    for(int i = 0; i < arr.length; i++) {
    	System.out.print(arr[i] + " ");
    }
    System.out.println("\n=====================================");
    
    for(String alphabet : arr) {
    	System.out.print(alphabet + " ");
    }
    System.out.println("\n=====================================");
    
    Stream<String> streamStr = Arrays.stream(arr);
    streamStr.forEach(alphabet -> System.out.print(alphabet + " "));
    System.out.println("\n=====================================");
    
    // String[] arr = new String[] {"a","b","c","d","e","f"};
    // arr 
    // parallelStream() - 병렬처리 Stream
    //                    CPU core 가 1 개인 경우, stream() 이 더 빠름
    streamStr = Arrays.asList(arr).parallelStream();
    streamStr.forEach(alphabet -> System.out.print(alphabet + " "));
    System.out.println("\n=====================================");
    
    
	} // main
}



// 15 장 2 번
@FunctionalInterface
interface InterfaceLambda{
	public int sum(int x, int y);
	/*
	abstract int sum2(int x, int y);
	int sum3(int x, int y);
	public abstract int sum4(int x, int y);
	*/
}









