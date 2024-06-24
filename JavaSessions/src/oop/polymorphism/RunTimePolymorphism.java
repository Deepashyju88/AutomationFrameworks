package oop.polymorphism;

public class RunTimePolymorphism {

	public static void main(String[] args) {

		Parant p1  = new Parant();
		p1.color();
		
		Child c1 = new Child();
		c1.color();
		
		Parant p2 = new Child();
		p2.color();
	
	}

}
