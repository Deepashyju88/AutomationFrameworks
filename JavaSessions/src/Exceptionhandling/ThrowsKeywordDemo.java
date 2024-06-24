package Exceptionhandling;

public class ThrowsKeywordDemo {
	
	public void m1() throws InterruptedException
	{
		System.out.println("m1 is calling");
		m2();
		
	}

	public void m2 () throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println("m2 is calling");
	}
	public static void main(String[] args) throws InterruptedException {
		ThrowsKeywordDemo td= new ThrowsKeywordDemo();
		td.m1();
		

	}

}
