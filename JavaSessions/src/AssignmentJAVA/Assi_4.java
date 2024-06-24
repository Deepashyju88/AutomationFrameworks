//4. Write a Java Program to sort the ArrayList in Ascending order

package AssignmentJAVA;

import java.util.ArrayList;
import java.util.Collections;

public class Assi_4 {

	public static void main(String[] args) {
	ArrayList<Integer> ds = new ArrayList<Integer>();
		
		ds.add(55);
		ds.add(11);
		ds.add(88);
		ds.add(22);
		ds.add(50);
		
		System.out.println("The ArrayList : " +ds);
		
		Collections.sort(ds);
		
		System.out.println("ArrayList afer sort : "+ ds);
	}
}
