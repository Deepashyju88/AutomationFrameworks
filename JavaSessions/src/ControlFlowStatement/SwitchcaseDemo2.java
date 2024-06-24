package ControlFlowStatement;

import java.util.Scanner;

public class SwitchcaseDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browserName = sc.nextLine();
		
//		
//		String class provides conversion methords
//		
//		toUpperCase
//		
//		toLowerCase
		
		
		switch (browserName.toLowerCase()) {
		case "chrome":
			System.out.println("this is chrome");
			break;
		case "edge":
			System.out.println("this is edge");
			break;
		case "firefox":
			System.out.println("this is firefox");
			break;
		default:
			System.out.println("this is appropriate browser");

			break;
		}
		
	
	}

}
