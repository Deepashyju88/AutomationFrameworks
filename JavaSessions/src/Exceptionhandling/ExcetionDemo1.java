package Exceptionhandling;

import java.util.Scanner;

public class ExcetionDemo1 {
	
	int id = 102;

	public static void main(String[] args) {
		
		ExcetionDemo1 ex = new ExcetionDemo1(); 
		ex= null;
		try
		{
			System.out.println(ex.id);//NullPointerException
		}catch(NullPointerException e)
		{
			System.out.println("the ex is a null");
		}

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter two numbers");
//		int a = sc.nextInt();
//	    int b = sc.nextInt();
//	    System.out.println(a+b);
//	    System.out.println(a-b);
//
//	    try {
//		    System.out.println(a/b);
//	    }catch(ArithmeticException obj)
//	    {
//	    	System.out.println("Enter other than 0");
//	    }
//	    System.out.println(a*b);
		
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("enter the index between 0 to 4");
//		int index = sc1.nextInt()
//;		
//		int arr[] = {20,50,40,80,90};
//		try {
//			System.out.println(arr[index]);
//		}catch(Exception e)
//		{
//			System.out.println("Enter only a number b/w 0 to 4");
//		}
//	    
	    
		
//		String s1 = "200";
//		try
//		{
//			int num = Integer.parseInt(s1);
//			System.out.println(num);
//
//		}catch(NumberFormatException e)
//		{
//			System.out.println("the entered number format is wrong");
//		}
		
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
	    
	}

}
