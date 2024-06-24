package Collection;

import java.util.Scanner;

public class staticBlockDemo {
	
	static String cname = "dsfgfda";
	static
	{
		System.out.println("This is from Static block");
		cname = "CMSIMS";
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int dd = sc.nextInt();
		System.out.println("the new no  is "+ dd);

		System.out.println("This is from main method");
		System.out.println(cname);
		
		System.out.println("enter a and b");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a%2==0)
		{
			System.out.println("show an even no :  "+a);
		}else
		{
			System.out.println("a is an odd no : "+ a);
		}
		
		String gg = "Hallo All";
		String uu = "hallo All";
		
		System.out.println(gg.equals(uu));
		System.out.println(gg.equalsIgnoreCase(uu));
	}

}
