package ControlFlowStatement;

import java.util.Scanner;
public class vovalsAssignment {

	public static void main(String[] args) {
		System.out.println("enter character");
		
		char[] vowel= {'a','e','i','o','u'};
		Scanner sc = new Scanner(System.in);
		String letter = sc.nextLine();
		char newLetter = letter.charAt(0);
		
		if(newLetter==(vowel[0]))
		{
			System.out.println(newLetter + " is a vowel");
		}else if(newLetter==(vowel[1]))
		{
			System.out.println(newLetter + " is a vowel");
		}else if(newLetter==(vowel[2]))
		{
			System.out.println(newLetter + " is a vowel");
		}else if(newLetter==(vowel[3]))
		{
			System.out.println(newLetter + " is a vowel");
		}else if(newLetter==(vowel[4]))
		{
			System.out.println(newLetter + " is a vowel");
		}else
		{
			System.out.println("not a vowel");
		}
	
	}

}
