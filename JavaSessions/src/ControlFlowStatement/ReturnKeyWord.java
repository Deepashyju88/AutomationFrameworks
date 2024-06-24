package ControlFlowStatement;

public class ReturnKeyWord {
	
	public void add()
	{
		int a =100, b= 200;
		System.out.println(a+b);
	}
	
	public int sub()
	{
		int c = 400, d= 250;
		return c-d;
	}

	public static void main(String[] args) {
		ReturnKeyWord s1 = new ReturnKeyWord();
		s1.add();
		int result = s1.sub();
		System.out.println("Sub function returns " + result);
	}

}
