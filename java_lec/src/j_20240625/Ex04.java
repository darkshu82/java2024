package j_20240625;

public class Ex04 {
	
	public static void main(String args[]) {
		
		// Car 클래스의 객체 생성하기
		// new 클래스이름();
		Car tico  = new Car();
		Car pride = new Car();

		tico.name = "티코";
		tico.color = "화이트";
		tico.company = "대우";
		tico.type = "경차";

		pride.name = "프라이드";
		pride.color = "블랙";
		pride.company = "기아";
		pride.type = "소형";
		
		tico.go();
		tico.back();

		System.out.println("---------------------------------");
		
		pride.go();
		pride.back();
		
		System.out.println("---------------------------------");
		
		System.out.println(tico.name + "의 이름 : " + tico.name);
		System.out.println(tico.name + "의 색상 : " + tico.color);
		System.out.println(tico.name + "의 회사 : " + tico.company);
		System.out.println(tico.name + "의 타입 : " + tico.type);
		
		System.out.println("---------------------------------");
		
		System.out.println(pride.name + "의 이름 : " + pride.name);
		System.out.println(pride.name + "의 색상 : " + pride.color);
		System.out.println(pride.name + "의 회사 : " + pride.company);
		System.out.println(pride.name + "의 타입 : " + pride.type);
		
	}

}
// 152 page
class Car{
	
	// 클래스 = 멤버변수 + 멤버메소드
	// 필드 (멤버변수)
	String name;
	String color;
	String company;
	String type;
	
	// 멤버메소드
	public void go() {
		System.out.println(name + " 가 전진하다");
	}
	public void back() {
		System.out.println(name + " 가 후진하다");
	}
	
}




