package oopInheritance;

public class child extends parant
{
	
	int cid = 555;
	public void colour()
	{
		System.out.println("yellow");
		System.out.println(cid);
		System.out.println(super.pid);
		super.colour();
	}

}
