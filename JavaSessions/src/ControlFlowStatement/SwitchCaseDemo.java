package ControlFlowStatement;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num from 0 to 4 for the same in words");
		int num = sc.nextInt();
	
		switch (num){
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
				System.out.println("Two");
				break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		default:
			System.out.println("not in the range");
			break;
		}
	
	}

}
