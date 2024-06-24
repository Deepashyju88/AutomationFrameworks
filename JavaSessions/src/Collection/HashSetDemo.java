package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(100);
		hs.add(20);
		hs.add(50);
		
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs.contains(30));
		
		
		hs.add(null);// null always in 0th position
		System.out.println(hs);
		
		for (Integer i : hs)
		{
			System.out.println(i);
		}
		
		System.out.println("********************************************");
		Iterator<Integer> ir = hs.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		hs.remove(null);
		//SORT (SET to list) 
		// set can not sort so convert to list and then sort
		
		
		//using constructor methord convert from set to list
		List<Integer> List1 = new ArrayList<Integer>(hs);
		
		System.out.println(List1);
		Collections.sort(List1);
		System.out.println(List1);
		
		
		//using addAll() convert set to list
		
		List<Integer> List2 = new ArrayList<Integer>();
		
		List2.addAll(hs);
		
		System.out.println("List 2 is : "+List2);
		
		List2.add(99);
		
		List2.add(66);
		
		System.out.println(List2);
		
		List<Integer> List3 = Arrays.asList(45,88,99,66,33,22,66,11,44,55);
		
		System.out.println("List3 is : "+List3);
		
		
		Set<Integer>List4 = new HashSet<Integer>(List3);
		
		System.out.println("List 4 is : " + List4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}
