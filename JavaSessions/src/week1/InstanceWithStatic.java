package week1;

public class InstanceWithStatic {
	int count = 1;
	
	public InstanceWithStatic()
	{
		count++;
		System.out.println(count);
		count++;
		
	}
	
	public static void main(String[] args)
	{
		InstanceWithStatic t1 = new InstanceWithStatic();
		InstanceWithStatic t2 = new InstanceWithStatic();	
	}
}

