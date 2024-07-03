package j_20240702;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Ex10 {
	
	public static void main(String[] args) {
		
		// 382 page
		
		Vector v = new Vector();
		for (int i = 1; i <= 5; i++) {
			v.add(i);
		}
		System.out.println("v : " + v);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
		}
		System.out.println("\n=============================================");
		
		Iterator iter = v.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println("\n=============================================");
		
		
	}

}
