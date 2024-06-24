package Collection;

import java.lang.reflect.Array;
import java.util.Scanner;

public class revision {
	
	int id;
	String name;
	int sid = 555;
	
	
	public void show(int id, String name) {
		
		//System.out.println("show method");
		System.out.println(id);
		System.out.println(name);
		System.out.println(sid);
	}

	public static void main(String[] args) {
		
		System.out.println("main method first");
		revision r1 = new revision();
		r1.show(101, "sarang");
		
		revision r2 = new revision();
		r2.show(102,"Deepa");

		System.out.println("main method last line");
		
		System.out.println(r2.id);
		System.out.println(r2.sid);
		
//		
//		int h = 45;
//		int j = 66;
//		System.out.println(h>j);
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter the char");
//		String data = sc.nextLine();
//		char ch = data.charAt(0);
//		String vovel = "aeiou";
//		if (ch=='a' || ch=='i'|| ch=='e'||ch=='o'||ch=='u')
//		{
//			System.out.println("it is  vovel");
//		}else
//		{
//			System.out.println("not a vovel");
//		}
//	
//
//	
//	int mark = 98;
//	
//	if (mark>90)
//	{
//		if(mark>95)
//		{
//			System.out.println("A++");
//		}else
//		{
//			System.out.println("A");
//		}
//	}else if(mark>80)
//	{
//		System.out.println("B");
//	}
//
//	
//	System.out.println("Enter the number");
//	
//	int ss = sc.nextInt();
//	
//	switch (ss)
//	{
//	case 1:
//		System.out.println("one");
//		break;
//		
//	case 2:
//		System.out.println("two");
//		break;
//		
//	default:
//		System.out.println("not exp no");
//	}
//	
//	
//	
//	for (int i=1; i<=5;i++)
//	{
//		System.out.println("hallo");
//	}
//	
//	int k = 1;
//	while (k<=5)
//	{
//		System.out.println("this is while loop");
//		k++;
//	}
//	
//	
//	int num = 183;
//	int r =0;
//	
//	while (num >0)
//	{
//		int tt = num%10;
//		num = num/10;
//		r = r+tt;
//	}
//	
//	System.out.println(r);
//	
//	
//	
//	for (int i=0; i<=20; i++ ) {
//	if (i%2==0)
//	{
//		System.out.println(i);
//	}
//	}
//	
//	for (int i = 1; i<=5;i++)
//	{
//		for (int n =1;n<=5; n++)
//		{
//			System.out.print(i*n+ " ");
//		}
//		System.out.println();
//	}
	
	int nu = 1;
	for (int i =5;i>0;i--)
	{
		System.out.println(nu=nu*i);
	}
	
	
	for (int i =1;i<=25;i++)
	{
		if (i%2!=0) {
		System.out.print(i+ " ");
		}
	}
	
	int no =123;
	
	while(no >0)
	{
		int r = no%10;
		 no = no/10;
		 
	}
	
	System.out.println("*****************************");
	int aa =200;
	int bb = 100;
	
	
	int cc = aa;
	aa = bb;
	bb = cc;
	
	System.out.println(aa + "new value " + bb);
	
	aa = aa+bb; //300
	bb = aa-bb; // 200
	aa = aa-bb; // 100
	int h = 1;
	for (int i = 4; i>=0; i--)
	{
		for (int j = 0; j<=i; j++)
		{
	
			System.out.print(h);
			h++;
		}
	
	System.out.println();
	
	for (int l= 1; l<=10; l++) {
		
		if (l==5) {
			continue;
		}else
		{
			System.out.print(l);
		}
		}
	}
	
	String jk = "Hallo All I am here";
	String exp = "Hallo all I am here";
	
	System.out.println("the length of string " + jk.length());
	System.out.println(jk.charAt(12));
	
	System.out.println(jk.equals(exp));
	System.out.println(jk.equalsIgnoreCase(exp));
	
	System.out.println(jk.toUpperCase());
	
	System.out.println(exp.toLowerCase());
	
	System.out.println(jk.contains("Here"));
	System.out.println(jk.contains("margin"));
	
	
	String hhh = "   hall kjhg     ";
	System.out.println(hhh.trim());
	
	String lk[]= jk.split(" ");
	
	for (String i : lk)
	{
		System.out.println(i);
	}
	
	int sid[] = new int[3];
	sid[0]= 100;
	sid[1]= 200;
	sid[2]= 300;
//	sid[3]= 400;
//	sid[4]= 500;
	
	System.out.println(sid.length);
	
	
	String sap = "this is the good part";
	String gg[]= sap.split(" ");
	
	for (String i : gg)
	{
		System.out.println(i);
	}
	
	//int uu[][] = {{10,20},{30,40},{50,60}};
	
	int uu[][] = new int[2][2];
	
	uu[0][1] = 10;
	uu[0][2] = 20;
	
	uu[1][1] = 30;
	uu[1][2] = 40;
	
	for (int i=0; i<=uu.length;i++)
	{
		for(int j=0;j<=uu[i].length;j++)
		{
			System.out.println(uu[i][j]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	}
	

	
	
	}
