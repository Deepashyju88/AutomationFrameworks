package oop.polymorphism;

public class Comptimepoly {
	public void add()
	{
		System.out.println("the addition result is "+ (100+200));
	}

	public void add(int a, int b)
	{
		System.out.println("the addition result is "+ (a+b));
	}
	
	public void add(int a, int b, int c)
	{
		System.out.println("the addition result is "+ (a+b+c));
	}
	
	public void add(int a, double b)
	{
		System.out.println("the addition result is "+ (a+b));
	}
	
	public void add(double a, int b)
	{
		System.out.println("the addition result is "+ (a+b));
	}
	
	Comptimepoly() // constructor 
	{
		System.out.println("this is default constructor ");
	}
	
	Comptimepoly(int id) // constructor 
	{
		System.out.println("this is parameterised constructor "+ id);
	}
	
	Comptimepoly(int id, String name) // constructor 
	{
		System.out.println("this is parameterised constructor "+ id +" & "+ name);
	}
	public static void main(String[] args) {
		Comptimepoly s2 = new Comptimepoly();
		
		s2.add();
		s2.add(55.54, 80);
		s2.add(66,100.25);
		s2.add(70,90);
		s2.add(5,8, 4);
		
		
		Comptimepoly s3 = new Comptimepoly(58);

		Comptimepoly s4 = new Comptimepoly(77, "fida");

	}

}
