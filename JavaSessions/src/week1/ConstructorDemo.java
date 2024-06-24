package week1;

public class ConstructorDemo {
	
	int id;
	String name;
	//constructor default
	public ConstructorDemo()
	{
		System.out.println("the id is "+id);
		System.out.println("the name is "+name);
	
	}
	
	public ConstructorDemo(int x, String n)
	{
		id = x;
		name = n;
		System.out.println("the new param "+id);
		System.out.println("the name param "+name);
	}
	
	public static void main(String[] args)
	{
		ConstructorDemo s1 = new ConstructorDemo(); //default constructor
		ConstructorDemo s2 = new ConstructorDemo(201, "Amith");
		
	}

}
