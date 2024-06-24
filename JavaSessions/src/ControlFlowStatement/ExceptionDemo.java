package ControlFlowStatement;

import java.util.Scanner;

public class ExceptionDemo {
	
	public void m1() throws InterruptedException
	{
		System.out.println("m1 ia calling");
		m2();
		
	}
	
	public void m2() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("m2 is calling");
	}

	public static void main(String[] args) throws InterruptedException {
		
		ExceptionDemo es = new ExceptionDemo();
		es.m1();

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try
		{
			System.out.println(a/b);
		}catch(Exception e)
		{
			System.out.println("The number should not be zero");
		}
		
		
		String s1 = "100Abc";
		try
		{
		int num = Integer.parseInt(s1);
		System.out.println(num);
		}catch (Exception e)
		{
			System.out.println("u should enter a valid number");
		}
		
		try 
		{
			System.out.println(9/0);
		}catch(ArithmeticException exp)
		{
			System.out.println("catch block");
		}
		finally
		{
			System.out.println("finally code ");
		}
		
		System.out.println("progarm complted");
		
		
		
	}

}
