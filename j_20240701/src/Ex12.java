
public class Ex12 {
  public static void main(String[] args) {
    
    Point point = new Point(2, 4);
    Circle c1 = new Circle(new Point(2, 4), 5.0);    
    Circle c2 = (Circle) c1.shallowCopy();
    
    System.out.println("c1 : " + c1);
    System.out.println("c2 : " + c2);
    
    System.out.println("c1 : " + c1.hashCode());
    System.out.println("c2 : " + c2.hashCode());
    
    c1.point.x = 3;
    c1.point.y = 6;
    System.out.println("c1 : " + c1);
    System.out.println("c2 : " + c2);
    System.out.println("===============================================");
    
Circle c3 = (Circle) c1.deepCopy();
    
    System.out.println("c1 : " + c1);
    System.out.println("c2 : " + c3);
    
    System.out.println("c1 : " + c1.hashCode());
    System.out.println("c3 : " + c3.hashCode());
    
    c1.point.x = 4;
    c1.point.y = 8;
    System.out.println("c1 : " + c1);
    System.out.println("c3 : " + c3);
    
  }
}

class Circle implements Cloneable{
  Point point;
  double radius;
  public Circle(Point point, double radius) {
    this.point = point;
    this.radius = radius;
  }
  
  public Circle shallowCopy() {
    Object obj = null;
    try {
      obj = super.clone();
    }catch(CloneNotSupportedException e) { }
    return (Circle)obj;
  }
  
  public Circle deepCopy() {
    Object obj = null;
    try {
      obj = super.clone();
    }catch(CloneNotSupportedException e) { }
    
    Circle c = (Circle)obj;
    c.point = new Point(this.point.x, this.point.y);
    return (Circle)obj;
  }
  
  public String toString() {
    return String.format("point : %s - r : %.2f", this.point, this.radius);
  }
  
}











