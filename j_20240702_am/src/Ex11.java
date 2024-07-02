import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11 {
	
	public static void main(String []args) {
		
		Map map = new HashMap();
		
		String[] names = new String[] {"홍길동","김유신","이순신","강감찬","김유신"};
		int[] scores = new int[] {98, 85, 92, 76, 88};
		
    // map.put(키, 밸류);
		for(int i = 0; i < names.length; i++) {
			map.put(names[i], scores[i]);
		}
		
		System.out.println("map : " + map);
		System.out.println("홍길동 성적 : " + map.get("홍길동") + " 점");
		System.out.println("김유신 성적 : " + map.get("김유신") + " 점");
		System.out.println("이순신 성적 : " + map.get("이순신") + " 점");
		
		System.out.println("==============================");
		// 388 page
		// Map 객체에서 key 들만 조회하기
		Set<String> keys = map.keySet();
		for(String name : keys) {
			System.out.println(name + " : " + map.get(name));
		}
		System.out.println("==============================");
		
		// keys <-- names
		Iterator iter = keys.iterator();
		while(iter.hasNext()) {
			String name = (String)iter.next();
			System.out.println(name + " : " + map.get(name));
		}
		
		System.out.println("==============================");
		
		System.out.println("map : " + map);
		
		// value 들만 조회하기
		// Collection values = map.values();
		// Collection<Integer> values = map.values();
		Collection values = map.values();
		System.out.println("values : " + values);
		
		// Generics 를 사용하지 않은 경우
		for(Object score : values) {
			Integer intScore = (Integer)score;
			System.out.print(score + " ");
		}
		System.out.println("\n==============================");
		
		// Generics 를 사용한 경우
		Collection<Integer> values2 = map.values();
		for(Integer score : values2) {
			System.out.print(score + " ");
		}
		System.out.println("\n==============================");
		
		// {홍길동=98, 김유신=88, 강감찬=76, 이순신=92}
		System.out.println("map : " + map);
		
		// 391 page
		// (키, 값) 쌍으로 조회하기
		Set entry = map.entrySet();
		for(Object obj : entry) {
		  Map.Entry m = (Map.Entry)obj;
		  System.out.println("key : " + m.getKey() + ", value : " + m.getValue()
		  );
		}
		
		
	}

}



