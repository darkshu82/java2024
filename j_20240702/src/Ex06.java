import java.util.ArrayList;
import java.util.List;

public class Ex06 {
  public static void main(String[] args) {

    List list = new ArrayList();

    list.add(new Circle(3.0));
    list.add(new Rectangle(3, 4));
    list.add(new Circle(5.0));
    list.add(new Rectangle(5, 6));

    System.out.println("전체 도형의 면적의 합 : " + sumArea(list));
    System.out.println("전체 도형의 둘레의 합 : " + sumLength(list));

  } // main

  private static double sumArea(List list) {
    double sumArea = 0;
    for (int i = 0; i < list.size(); i++) {
      sumArea += ((Shape) list.get(i)).area();
    }
    return sumArea;
  }

  private static double sumLength(List list) {
    double sumLength = 0;
    for (int i = 0; i < list.size(); i++) {
      Shape s = (Shape) list.get(i);
      sumLength += s.length();
    }
    return sumLength;
  }
}
  abstract class Shape {
    int x, y;

    Shape() {
      this(0, 0);
    }

    Shape(int x, int y) {
      this.x = x;
      this.y = y;
    }

    abstract double area();

    abstract double length();

    public String getLocation() {
      return "x : " + x + ", y : " + y;
    }
  }

  class Circle extends Shape {
    double radius;

    Circle() {
      this(1);
    }

    Circle(double radius) {
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
  
  Rectangle(){ this(1, 1); }
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
