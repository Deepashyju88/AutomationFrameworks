package Revision;

import java.util.Scanner;

public class testpract {

	public static void main(String[] args) {

		
		int num = 1234562234;
		
		int count = 0;
		
		while(num>0) 
		{
			
			num = num/10;
			count++;
			
		}
		
		System.out.println(count);
	
		String dd = "nmbf jhdkjf kjkd";
		
		String ff[] = dd.split(" ");
			
		for (int i=0; i<3; i++)
		{
			System.out.println(ff[i]);
		}
		System.out.println("***************************************************************************************");

		int nu[] = {50,60,80,20,100,140};
		
		int min = nu[0];
		
		for(int i=0; i<nu.length;i++)
		{
			if( min> nu[i])
			{
				min = nu[i];
				
			}
			
		}
		System.out.println(min);
	
		System.out.println("***************************************************************************************");

	int line[] = {40,60,80,7,77};
	
	boolean flag = false;
	
	int result = 7;
	
	for (int i=0; i<line.length; i++)
	{
		if(line[i]==result)
		{
			System.out.println(line[i]);
			flag = true;
		
			break;
		}
	}
	System.out.println(flag);
	
	System.out.println("***************************************************************************************");

	
	String newLine[] = {"humm", "java","java", "too", "fiht", "too", "humm", "humm"};
	
	int countt = 0;
	for (int i =0; i<newLine.length; i++)
	{
		for(int j = 0; j<i; j++)
		{
			if(newLine[i].equals(newLine[j]))
			{
				countt++;
				break;
			}
		}
	}
	System.out.println(countt);
	
	
	System.out.println("***************************************************************************************");

	
	int nummm[] = {20,5,7,8,2,6};
	
	for(int i=0; i<nummm.length; i++)
	{
		if(nummm[i]%2==0)
		{
			System.out.println(nummm[i]);
		}
	}
	
	for(int i=0; i<nummm.length; i++)
	{
		if(nummm[i]%2!=0)
		{
			System.out.println(nummm[i]);
		}
	}
	
	
	System.out.println("***************************************************************************************");

	String sent = "nirupamai";
	int countr = 0;
	for (int i=0; i<sent.length(); i++)
	{
		for (int j=0; j<i; j++)

			{
			if(sent.charAt(i)== sent.charAt(j))
			{
				countr++;
			}
			}
	}
	
	
	System.out.println(countr);
	
	System.out.println("***************************************************************************************");

	
	String letr = "java is a coding language";
	int cont = 0;
	for (int i =0; i<letr.length(); i++)
	{
		if(letr.charAt(i) == 'a')
		{
			cont++;
		}
	}
	
	System.out.println(cont);
	
	
	
	System.out.println("***************************************************************************************");

	int factoral = 6;
	int nmm = 1;
	
	for (int i =1; i<=factoral; i++)
			{
		 nmm = nmm*i;
		
			}
	
	System.out.println(nmm);
	System.out.println("***************************************************************************************");

	Scanner sc =new Scanner(System.in);
	System.out.println("enter a, b and c");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	if(a<b)
	{
		if(b<c)
		{
			System.out.println(c);
		}else
		{
			System.out.println(b);
		}
	}else
	{
		if(a<c)
		{
			System.out.println(c);
		}else
		{
			System.out.println(a);
		}
	}
	System.out.println("***************************************************************************************");

	
//	String mulwords = "Java is a language";
//	
//	String mult[] = mulwords.split(" ");
//	
//	for (int i = 3; i >=0; i--)
//	{
//		for(int j = mult[i].length(); j>= 0; )
//		System.out.print(mult[i].charAt(min));
//	}
	System.out.println("***************************************************************************************");

	
  String s8 = "100";
  int s9 = Integer.parseInt(s8);
  
  System.out.println(s9+100);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
