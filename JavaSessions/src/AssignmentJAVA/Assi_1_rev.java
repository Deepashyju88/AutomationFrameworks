//1. Write a Java program to reverse a string with and without reverse() function

package AssignmentJAVA;

import java.util.Scanner;

public class Assi_1_rev {

	public static void main(String[] args) {
		
		System.out.println("Enter the string value");
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		System.out.println("The entered string value is : "+ data);
		
		StringBuilder sb = new StringBuilder(data);
		System.out.println("The reversed string value is : "+sb.reverse());	

	
	}
	
}
