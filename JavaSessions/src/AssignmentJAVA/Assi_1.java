//1. Write a Java program to reverse a string with and without reverse() function

package AssignmentJAVA;

import java.util.Scanner;

public class Assi_1 {
	public static void main(String[] args) {
		System.out.println("Enter the string value to be reversed");
		Scanner sc=new Scanner(System.in);
		String data = sc.next();
		System.out.println("The string value is : " + data);
		System.out.print("Reverse of the string value is : ");
		for (int i=(data.length()-1);i>=0; i--)
		{
			System.out.print(data.charAt(i));
		}
		System.out.println(" ");
	}
}
