
public class Ex17 {
  public static void main(String[] args) {
    
    Gen1 g1 = new Gen1();
    Gen2 g2 = new Gen2();
    Gen3 g3 = new Gen3();

    Generic5<? super Gen2> gen2 = new Generic5<Gen1>(g1);
    Generic5<? super Gen2> gen2_0 = new Generic5<Gen2>(g2);
    Generic5<? super Gen2> gen2_1 = new Generic5<Gen2>(g3);
//    Generic5<? super Gen2> g2_2 = new Generic5<Gen3>(g3);

    Gen1 gen10 = (Gen1) gen2.get();
    Gen2 gen20 = (Gen2) gen2_0.get();
    Gen3 gen30 = (Gen3) gen2_1.get();
    
    System.out.println(gen10.getName());
    System.out.println(gen20.getName());
    System.out.println(gen30.getName());
    
    
  }
}

class Gen1 {
  String name = "Gen1";

  String getName() {
    return this.name;
  }
}

class Gen2 extends Gen1 {
  String name = "Gen2";

  String getName() {
    return this.name;
  }
}

class Gen3 extends Gen2 {
  String name = "Gen3";

  String getName() {
    return this.name;
  }
}

class Generic5<T> {
  T obj;

  Generic5(T obj) {
    this.obj = obj;
  }

  void set(T obj) {
    this.obj = obj;
  }

  T get() {
    return this.obj;
  }
}
