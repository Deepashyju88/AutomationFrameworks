package week1;

import java.io.IOException;
import java.util.Scanner;

public class InputFromUser {
	
	public static void main(String[] args) throws IOException
	{
		
//		//Scanner
//		System.out.println("Enter your age");
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		System.out.println("age is : "+age);
//		
//		
		
		
		
		
		/* bufferReader type and sysytem in are not in use 
		System.out.println("Enter your age");
		int age= System.in.read();	
		System.out.println("the age is : "+ age );
		*/
//	     int a = 5;
//	        int b = 10;
//	        
//	        int temp = a;
//	        a = b;
//	        b = temp;
//	        
//	        System.out.println("After swapping, a = " + a + " and b = " + b);
		
		
		int a =5;
		int b= 8;
		
		int x = a;
		
		System.out.println(x); // 5
		
		 a = b;
		
		System.out.println(a);//8
		
		 b = x;
		
		System.out.println(b);//5
	}

}
