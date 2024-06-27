
public class Ex02 {
  public static void main(String[] args) {
    
    GrandParent gp = new GrandParent();
    Parent p = new Parent();
    Child ch = new Child();
    
    System.out.println(gp instanceof Object);
    System.out.println(p instanceof Object);
    System.out.println(ch instanceof Object);
    
    System.out.println(p instanceof GrandParent);
    System.out.println(ch instanceof Parent);
    
  }
}

class GrandParent extends Object { }

class Parent extends GrandParent { }

class Child extends Parent { }

