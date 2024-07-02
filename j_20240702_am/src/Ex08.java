import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ex08 {
	
	public static void main(String[ ]args) {
		
		// 375 page
		SortedSet set = new TreeSet();
		
		String from = "bat";
		String to = "d";
		
		set.add("ant"); set.add("alias"); set.add("batman"); set.add("aha"); set.add("cola"); 
		set.add("Cola"); set.add("ddr"); set.add("dance"); set.add("dEEE"); set.add("deee"); 
		set.add("ever"); set.add("giant"); set.add("zoo"); 
		
		System.out.println("set : " + set);
		System.out.println("from : " + from + ", to : " + to);
		
		System.out.println(set.subSet(from, to));
		System.out.println(set.subSet(from, to+"zzz"));
		
		SortedSet descdingSet = new TreeSet(new Descend());
		descdingSet.add("ant"); descdingSet.add("alias"); descdingSet.add("batman"); descdingSet.add("aha"); descdingSet.add("cola"); 
		descdingSet.add("Cola"); descdingSet.add("ddr"); descdingSet.add("dance"); descdingSet.add("dEEE"); descdingSet.add("deee"); 
		descdingSet.add("ever"); descdingSet.add("giant"); descdingSet.add("zoo");  descdingSet.add("d"); descdingSet.add("bat");
		
		System.out.println("descdingSet : " + descdingSet);
		System.out.println("from : " + from + ", to : " + to);
		System.out.println(descdingSet.subSet(to, from));
	}
	
	

}

// 내림차순으로 정렬하는 클래스
class Descend implements Comparator{
  @Override
  public int compare(Object o1, Object o2) {
  	Comparable c1 = (Comparable)o1;
  	Comparable c2 = (Comparable)o2;
  	return c1.compareTo(c2) * -1;
  }
}






