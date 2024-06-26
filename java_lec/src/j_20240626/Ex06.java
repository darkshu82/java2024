package j_20240626;
// static import
import static package01.PackageTest1.staticMethod1;

// import package01.PackageTest1;
// import package01.PackageTest3;
import package01.*;
import package02.pac.PackageTest2;

public class Ex06 {
	
	public static void main(String[] args) {
		
		// package01.PackageTest1 pt1 = new package01.PackageTest1();
		PackageTest1 pt1 = new PackageTest1();
		PackageTest3 pt3 = new PackageTest3();
		
		PackageTest2 pt2 = new PackageTest2();
		
  	// static import 하지 않으면 클래스 이름을 생략할 수 없음
		PackageTest1.staticMethod1();
		// static import 한 경우 클래스 이름을 생략할 수 있음
		staticMethod1();
		
		pt1.instanceMethod1();
		
		
	}

}
