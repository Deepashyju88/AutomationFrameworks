//3. Write a Java Program to handle given uncheck exception
//
//                       a.ArrayIndexOutOfBoundsException
//
//                        b.NullPointerException

package AssignmentJAVA;

import java.util.Scanner;

public class Assi_3 {
	
	int num = 565;

	public static void main(String[] args) {
		
		Assi_3 newNum = new Assi_3();
			
		newNum = null;
		try {
			System.out.println(newNum.num);
		}catch(NullPointerException e)
		{
			System.out.println("The value of num is null ");
		}
		
		
		System.out.println("**********************************************");

		int arr[] = {40,50,60,70,80,90};
		
		System.out.println("Enter the index value of the array");
		
		Scanner sc = new Scanner(System.in);
		
		int index = sc.nextInt();
		try
		{
		System.out.println(arr[index]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter only value between 0 to 5");
		}
		
		System.out.println("**********************************************");

		
	}

}
