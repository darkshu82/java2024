
public class Ex05 {
	
	public static void main(String args[]) {
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();

		tv1.name = "tv1";
		tv2.name = "tv2";

		tv1.onOff();
		System.out.println("tv1 의 채널 : " + tv1.channel);
		tv1.upChannel();
		System.out.println("tv1 의 채널 : " + tv1.channel);
		tv1.upChannel();
		System.out.println("tv1 의 채널 : " + tv1.channel);
		tv1.downChannel();
		System.out.println("tv1 의 채널 : " + tv1.channel);
		tv1.onOff();

		System.out.println("---------------------------------");
		tv2.onOff();
		System.out.println("tv2 의 채널 : " + tv2.channel);
		tv2.upChannel();
		System.out.println("tv2 의 채널 : " + tv2.channel);
		tv2.upChannel();
		System.out.println("tv2 의 채널 : " + tv2.channel);
		tv2.upChannel();
		System.out.println("tv2 의 채널 : " + tv2.channel);
		tv2.downChannel();
		System.out.println("tv2 의 채널 : " + tv2.channel);
		tv2.onOff();		

		// Tv tv3 = tv1;
		
	}

}

class Tv{
	
	// 멤버변수를 명시적으로 초기화하지 않으면
	// 각 data type 의 기본값으로 자동으로 초기화됨
	// cf. 지역변수는 자동으로 초기화가 안 되므로
	//     반드시 명시적으로 초기화를 해야 함
	String name;
	String color;
	int channel;
	boolean power;
	
	public void onOff() {
		if(power == false) {
		  System.out.println(name + " 을(를) 켭니다");
		}else {
			System.out.println(name + " 을(를) 끕니다");
		}
		power = !power;
	}
	public void upChannel() {
		System.out.println(name + " 의 채널을 올립니다");
		channel++;
	}
	public void downChannel() {
		System.out.println(name + " 의 채널을 내립니다");
		channel--;
	}
	
	
}



