package Collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		//Linklist is a class impliments list interface
		//underline data is doubly linkedList
		//Linked list is non synchronize
		//Frequent operation is data insertion and data deletion
		//extra methords in link list are addFirst() addLast() getFirst()  getLast()
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(20);
		l1.add(40);
		l1.add(60);
		l1.add(10);
		l1.add(40);
		
		System.out.println(l1);
		
		l1.remove(2);
		
		System.out.println(l1);
		
		l1.addFirst(50);
		l1.addLast(50);
		
		System.out.println(l1);
		
		for (Integer i:l1)
		{
			System.out.println(i);
		}
		
	}

}
