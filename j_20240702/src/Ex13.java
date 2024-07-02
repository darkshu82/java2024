class NoGeneric {
  Object[] v;

  void set(Object[] n) {
    this.v = n;
  }

  Object[] get() {
    return this.v;
  }

  void print() {
    for (Object obj : this.v) {
      System.out.print(obj + " ");
    }
    System.out.println();
  }
}

class Generic<T> {
  T[] v;

  void set(T[] n) {
    this.v = n;
  }

  T[] get() {
    return this.v;
  }

  void print() {
    for (T t : this.v) {
      System.out.print(t + " ");
    }
    System.out.println();
  }
}

public class Ex13 {
  public static void main(String[] args) {

    NoGeneric nogen = new NoGeneric();
    String[] ss = new String[] { "홍길동", "이순신", "김유신" };

    nogen.set(ss);
    nogen.print();

    Object[] objs = nogen.get();

    Integer[] ii = new Integer[] { 1, 2, 3 };

    nogen.set(ii);
    objs = nogen.get();
    for (Object obj : objs) {
      Integer i = (Integer) obj;
      System.out.println(i);
    }
    System.out.println("====================================");

    Generic<String> gen = new Generic<>();
    ss = new String[] { "홍길동", "이순신", "김유신" };

    gen.set(ss);
    gen.print();

    for (String name : gen.get()) {
      System.out.println(name);
    }

    ii = new Integer[] { 1, 2, 3, 4, 5 };
    Generic<Integer> genInt = new Generic<>();

    genInt.set(ii);
    genInt.print();

    for (Integer i : genInt.get()) {
      System.out.print(i + " ");
    }

  }
}
