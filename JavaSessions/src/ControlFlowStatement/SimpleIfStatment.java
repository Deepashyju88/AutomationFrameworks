package ControlFlowStatement;

import java.util.Scanner;

public class SimpleIfStatment {

	public static void main(String[] args) {
		
		System.out.println("Enter ur age");
		
		Scanner S1 = new Scanner(System.in);
		int age = S1.nextInt();
		
		if (age>=18) 
		{
		System.out.println("the age is valid to vote");
		
		}
		System.out.println("program ends");

	}

}
