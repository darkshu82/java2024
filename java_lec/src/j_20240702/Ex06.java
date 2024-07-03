package j_20240702;
import java.util.ArrayList;
import java.util.List;

public class Ex06 {
	
	public static void main(String[] args) {
		
		// 365 page
		List list = new ArrayList();
		
		list.add(new Circle(3.0));
		list.add(new Rectangle(3, 4));
		list.add(new Circle(5));
		list.add(new Rectangle(5, 6));
		
		System.out.println("전체 도형의 면적의 합 : " + sumArea(list));
		System.out.println("전체 도형의 둘레의 합 : " + sumLength(list));
	}
	
	// 전체 도형의 면적의 합을 return 하는 메소드
	private static double sumArea(List list) {
		double sumArea = 0;
		for(int i = 0; i < list.size(); i++) {
			// 리스트에 저장되는 객체는 모두 Object type 으로 저장됨
			// list.get(i) 이렇게만 하면 Object type 이라서 area() 를 호출하지 못함
			// Shape s = (Shape)list.get(i);
			// sumArea += s.area();
			// 위의 두 줄은 아래의 한 줄과 같은 의미임
			sumArea += ((Shape)list.get(i)).area();
		}
		return sumArea;
	}
	
	// 전체 도형의 둘레의 합을 return 하는 메소드
  private static double sumLength(List list) {
  	double sumLength = 0;
  	for (int i = 0; i < list.size(); i++) {
  		// sumLength += ((Shape)list.get(i)).length();
  		// 위의 한 줄은 아래의 두 줄의 code 와 같은 의미임
  		Shape s = (Shape)list.get(i);
  		sumLength += s.length();
  	}
  	return sumLength;  	
  }
	
	
	
	
}

abstract class Shape{
	
  int x, y;
  
  Shape() { this(0, 0); }
  Shape(int x, int y){
  	this.x = x;
  	this.y = y;
  }
	
  abstract double area();
  abstract double length();
  
  public String getLocation() {
  	return "x : " + x + ", y : " + y;
  	
  }
}

class Circle extends Shape{
	
	double radius;
	
	Circle(){ this(1); }
	Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	double area() {
		return (radius * radius) * Math.PI;
	}
	
	@Override
	double length() {
		return (radius * 2) * Math.PI;
	}
                            
}

class Rectangle extends Shape{
	
	int width, height;
	
	Rectangle() { this(1, 1); }
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	@Override
	double area() {
		return width * height;
	}
	
	@Override
	double length() {
		return (width + height) * 2;
	}
	
}














