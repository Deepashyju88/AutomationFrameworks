package week1;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args)
	{
		Scanner S1= new Scanner(System.in);
		System.out.println("enter the name");
		String name = S1.nextLine();
		System.out.println(name);
		System.out.println("enter the ph no");
		Long phno = S1.nextLong();
		System.out.println(phno);
	}

}
