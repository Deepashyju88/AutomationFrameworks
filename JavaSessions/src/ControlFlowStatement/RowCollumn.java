package ControlFlowStatement;

public class RowCollumn {
	public static void main(String[] args)
	{
//		for (int r=1; r<=4; r++)
//		{
//			for (int c =1; c<=4; c++)
//			{
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}
//	
//	
//	for (int r= 1; r<=4; r++)
//	{
//		for (int c=1; c<=r; c++)
//		{
//			System.out.print("*"+ " ");
//		}
//		System.out.println();
//	}
	System.out.println("********************************************");
	for (int r= 1; r<=4; r++)
	{
		for (int c=1; c<=r; c++)
		{
			System.out.print(c+ " ");
		}
		System.out.println();
	}
	System.out.println("********************************************");

	for (int r= 1; r<=4; r++)
	{
		for (int c=1; c<=r; c++)
		{
			System.out.print(r+ " ");
		}
		System.out.println();
	}
	System.out.println("********************************************");
	
	int a=1;
	for (int r= 1; r<=4; r++)
	{
		for (int c=1; c<=r; c++)	
		{
		System.out.print(a + " ");
		a++;
		}
		System.out.println();
	}
	System.out.println("********************************************");
	int g = 1;
	for (int r= 1;r<=5;r++)
	{
		if (r<5)
		{
		System.out.println(g+ " ");
		g++;
		}
		if (r==5)
		{
			for (int c=1;c<=6;c++)
			{
			System.out.print(g + " ");
			g++;
			}
		}	
	}
	
	
	
	
	
	
	
	

}
}
