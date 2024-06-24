package ControlFlowStatement;

import java.util.Scanner;

public class NestedIfBrowser {
	public static void main(String[] args)
	{
		System.out.println("Enter the Browser name");
		Scanner sc = new Scanner(System.in);
		String bname = sc.nextLine();

		
		if (bname.equalsIgnoreCase("Chrome"))
		{
			System.out.println("open in chrome");
		}else if(bname.equalsIgnoreCase("firefox"))
		{
			System.out.println("open in firefox");
		}else if(bname.equalsIgnoreCase("edge"))
		{
			System.out.println("open in edge");
		}else
		{
			System.out.println("not matching");
		}
	}

}
