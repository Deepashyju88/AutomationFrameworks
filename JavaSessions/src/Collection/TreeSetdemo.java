package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSetdemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(40);
		ts.add(60);
		ts.add(40);
		ts.add(100);
		ts.add(20);
		
		System.out.println(ts.isEmpty());
		System.out.println(ts.size());
		System.out.println(ts.contains(60));
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		
		System.out.println("**********************************************");
		
		List<Integer> l2 = Arrays.asList(40,50,70,20,10,80,20);
		
		System.out.println(l2);
		
		TreeSet<Integer> ts2 = new TreeSet<Integer>(l2);
		
		System.out.println(ts2.descendingSet());
		System.out.println(ts2);
		
		
	}

}
