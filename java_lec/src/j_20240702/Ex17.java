package j_20240702;

public class Ex17 {
	
	public static void main(String[] args) {
		
		// 410 page
		Gen1 g1 = new Gen1();
		Gen2 g2 = new Gen2();
		Gen3 g3 = new Gen3();
		
		// ? super Gen2 : ? 는 Gen2 와 같거나 더 상위 클래스가 올 수 있음
		Generic5<? super Gen2> gen2 = new Generic5<Gen1>(g1);
		Generic5<? super Gen2> gen2_0 = new Generic5<Gen2>(g2);
		Generic5<? super Gen2> gen2_1 = new Generic5<Gen2>(g3);
		// Generic5<? super Gen2> g2_2 = new Generic5<Gen3>(g3);
		
		System.out.println("gen2_0.get() : " + gen2_0.get());
		
		Gen1 gen1 = (Gen1) gen2_0.get();
		
		/*
		Gen2 gen2 = g2.get();
		Gen3 gen3 = g2.get();
		*/
	}

}
class Generic5<T>{
	T obj;
	Generic5(T obj){
		this.obj = obj;
	}
	void set(T obj) {
		this.obj = obj;
	}
	T get() {
    return this.obj;		
	}
}
class Gen1{
  String name = "Gen1";
  String getName() {
  	return this.name;
  }
}
class Gen2 extends Gen1{
  String name = "Gen2";
  String getName() {
  	return this.name;
  }
}
class Gen3 extends Gen2{
  String name = "Gen3";
  String getName() {
  	return this.name;
  }
}







