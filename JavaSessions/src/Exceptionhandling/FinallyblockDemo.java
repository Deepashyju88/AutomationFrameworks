package Exceptionhandling;

public class FinallyblockDemo {

	public static void main(String[] args) {

		System.out.println("Start a program");
		
		try
		{
			System.out.println(9/0);
		}catch(Exception e)
		{
			System.out.println("do not enter 0");
		}finally
		{
			System.out.println("the code runn");
		}
		
		System.out.println("code ented.........");
	}

}
