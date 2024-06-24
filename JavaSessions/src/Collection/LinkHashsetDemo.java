package Collection;

import java.util.LinkedHashSet;

public class LinkHashsetDemo {

	//Linked hashSet is set interface
	//Underlined data structure is doubly linked list
	//it has featurs of list (it is ordered collection ) and set (it is maintais unique elements)
	//it is  child class for hashSet
	public static void main(String[] args) {

		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		
		hs.add(20);
		hs.add(40);
		hs.add(100);
		hs.add(60);
		hs.add(40);
		
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		System.out.println(hs.contains(40));
		hs.remove(60);
		System.out.println(hs);
		
	}

}
