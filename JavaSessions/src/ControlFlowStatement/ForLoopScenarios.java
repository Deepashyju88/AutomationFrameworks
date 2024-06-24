package ControlFlowStatement;

public class ForLoopScenarios {

	public static void main(String[] args) {
		//For loop with if condition
		
		
		for (int i=1; i<=20; i++)
		{
			if (i%2==0)
			{
				System.out.println("data %" + i);
			}
		}
		
		//for loop with nested
		
		for (int i=1; i<=10;i++)
		{
			for (int j=1;j<=10;j++)
			{
			
				System.out.print((i*j)+"\t");

			}
			System.out.println();
		}
		
		
		String data = "elephantlion";
		
		for (int i=(data.length()-1);i>=0; i--)
		{
			System.out.print(data.charAt(i));
		}
		
		
		
	}

}
