import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ex08 {
  public static void main(String[] args) {

    SortedSet<String> set = new TreeSet();

    String from = "bat";
    String to = "d";

    set.add("ant");
    set.add("alias");
    set.add("batman");
    set.add("aha");
    set.add("cola");
    set.add("ddr");
    set.add("dance");
    set.add("dEEE");
    set.add("ever");
    set.add("giant");
    set.add("zoo");

    System.out.println("set : " + set);
    System.out.println("from : " + from + ", to : " + to);

    System.out.println(set.subSet(from, to));
    System.out.println(set.subSet(from, to + "zzz"));

    SortedSet<String> descendingSet = new TreeSet(new Descend());

    descendingSet.addAll(set);

    System.out.println("descendingSet : " + descendingSet);
    System.out.println("from : " + from + ", to : " + to);

    System.out.println(descendingSet.subSet(to, from));
    System.out.println(descendingSet.subSet(to + "zzz", from));

  }

}

class Descend implements Comparator<String> {
  @Override
  public int compare(String s1, String s2) {
    return s2.compareTo(s1);
  }
}