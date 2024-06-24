package AssignmentJAVA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {

//		String data = "elephantlion";
//		System.out.println("The string value is " + data);
//		System.out.print("Reverse of the string value is ");
//
//		for (int i=(data.length()-1);i>=0; i--)
//		{
//			System.out.print(data.charAt(i));
//		}
//		System.out.println(" ");

		System.out.println("************************************************");
		
//		int r = 855;
//		int t = r%5;
//		System.out.println(t);
		
		//Prime number between 1 to 100

//		for (int i=1; i<=100;i++)
//		{
//			int count=0;
//			for (int j=1;j<=100;j++)
//
//			{
//				
//				if(i%j==0)
//				{
//					
//					count++;
//					
//				}
//				
//			}
//			if(count<=2)
//			{
//				System.out.println(i);
//			}
//		}
//		
//		System.out.println("**********************************************");
//		ArrayList<Integer> ds = new ArrayList<Integer>();
//		
//		ds.add(55);
//		ds.add(11);
//		ds.add(88);
//		ds.add(22);
//		
//		System.out.println(ds);
//		
//		Collections.sort(ds);
//		
//		System.out.println(ds);
//		
//		System.out.println("**********************************************");
//
		int arr[] = {40,50,60,70,80,90};
		System.out.println("Enter the index value of the array");
		Scanner sc2 = new Scanner(System.in);
		int index = sc2.nextInt();
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
