package ControlFlowStatement;

import java.util.Scanner;

public class IfElseDemo {

	
	
	public static void main(String[] args) {
		System.out.println("Enter a nd b");
		//int b=555;
		//Scanner sc = new Scanner(System.in);
		Scanner ff = new Scanner(System.in);
		int a = ff.nextInt();
		int b = ff.nextInt();
		

		if(a> b)
		{
		System.out.println(a +" is greater than "+ b);
		}else
		{
		System.out.println(b +" is greater than "+ a);
		}	
	}

}
