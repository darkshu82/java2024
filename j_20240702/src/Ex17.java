
public class Ex17 {
  public static void main(String[] args) {
    
    Gen1 g1 = new Gen1();
    Gen2 g2 = new Gen2();
    Gen3 g3 = new Gen3();

    Generic5<? super Gen2> gen2_1 = new Generic5<Gen1>(g1);
    Generic5<? super Gen2> gen2_2 = new Generic5<Gen2>(g2);
    Generic5<? super Gen2> gen2_3 = new Generic5<Gen2>(g3);
//  Generic5<? super Gen2> gen3_1 = new Generic5<Gen3>(g3);

    Gen1 gen1 = (Gen1) gen2_1.get();
    Gen2 gen2 = (Gen2) gen2_2.get();
    Gen3 gen3 = (Gen3) gen2_3.get();
    
    System.out.println(gen1.getName());
    System.out.println(gen2.getName());
    System.out.println(gen3.getName());
    
    System.out.println(gen1);
    System.out.println(gen2);
    System.out.println(gen3);
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
