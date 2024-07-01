package j_20240701;

// 얕은 복사, 깊은 복사

class Circle implements Cloneable{
	// 원의 중심점
	Point point;
	// 반지름
	double radius;
	
	// 생성자
	public Circle(Point point, double radius) {
		this.point = point;
		this.radius = radius;
	}
	
	// 얕은 복사 메소드
	public Circle shallowCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {}
		return (Circle)obj;
	}
	
	// 깊은 복사 메소드
	public Circle deepCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {}
		
		Circle c = (Circle)obj;
		c.point = new Point(this.point.x, this.point.y);
		
		// return (Circle)obj;
		// 현재, (Circle)obj 나 c 나 똑같은 복제된 Circle 객체의 주소입니다
		// return (Circle)obj; 이렇게 하나, return c; 이렇게 하나 똑같습니다
		// 논리적 흐름으로 보면 return c; 이 code 가 더 나을 수도 있습니다
		return c;
	}	
	
	public String toString() {
		return String.format("point : %s - r : %.2f%n", this.point, this.radius);
	}
	
}

public class Ex12 {
  public static void main(String[] args) {
    // Point point = new Point(2, 4);
  	Circle c1 = new Circle(new Point(2, 4), 5.0);
  	Circle c2 = c1.shallowCopy();

  	System.out.println("c1 : " + c1);
  	System.out.println("c2 : " + c2);
  	
  	System.out.println("c1 : " + c1.hashCode());
  	System.out.println("c2 : " + c2.hashCode());
  	
  	c1.point.x = 3;
  	c1.point.y = 6;  	
  	System.out.println("c1 : " + c1);
  	System.out.println("c2 : " + c2);
  	
  	/*
  	    shallowCopy
  	    c1 - 3, 6 
  	    c2 - 3, 6
  	 */
  	
  	System.out.println("===============================");
  	
  	Circle c3 = c1.deepCopy();
  	
  	System.out.println("c1 : " + c1);
  	System.out.println("c3 : " + c3);
  	
  	System.out.println("c1 : " + c1.hashCode());
  	System.out.println("c3 : " + c3.hashCode());
  	
  	c1.point.x = 4;
  	c1.point.y = 8;  	
  	System.out.println("c1 : " + c1);
  	System.out.println("c3 : " + c3);
  	
  	/*
      deepCopy
      c1 - 4, 8
      c2 - 3, 6
   */
  }
}






