package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistIterator {

	public static void main(String[] args) {
			ArrayList<Integer> a1 = new ArrayList<Integer>();
			
			a1.add(20);
			a1.add(30);
			a1.add(40);
			a1.add(50);
			
			System.out.println(a1);
			
			for (int i=0;i<a1.size();i++)
			{
				System.out.println(a1.get(i));
			}
			
			//  ********* for each loop***********
			
			for (Integer i : a1)
			{
				System.out.println(i);
			}
			
			//************ iterator*****************
			
			//itereator()  is a method  in the Iterator interface
			// hadNext() methrd will confirm is there an element in the list
			// next() methrd will return the element and incriment the next element in the list
			
			
			Iterator<Integer> ir= a1.iterator();
			
			
			while(ir.hasNext())
			{
				System.out.println("iterator has " +ir.next());
			}
			
			
			ArrayList<Integer> ds = new ArrayList<Integer>();
			
			ds.add(55);
			ds.add(11);
			ds.add(88);
			ds.add(22);
			
			System.out.println(ds);
			
			Collections.sort(ds);
			
			System.out.println(ds);
			
			
			
			
			
			
			
			
;	}

}
