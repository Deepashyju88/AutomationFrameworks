package ControlFlowStatement;

import java.util.Scanner;

public class AssignmentMark {
	public static void main(String[] args)
	{
		System.out.println("Enter the Score");
		
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	
	
	if ((m>90) && (m<95))
	{
		System.out.println("The Grade is A");
	}else if( (m>95))
	{
		System.out.println("The Grade is A++");
		
	}else if (m<90)
	{
		System.out.println("The Grade is B");

	}
	}
}
