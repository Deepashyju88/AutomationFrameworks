package ControlFlowStatement;

public class ForLoop {

	public static void main(String[] args) {

		for(int i=1; i<=5;i++)
		{
			//System.out.println("Hallo");
			System.out.println(i);
		}
		
		//print 10 to 1
		
		for (int i=5; i>=1; i--)
		{
			System.out.println(i);
		}
		
		//code will execute infinit time
//		for(;;)
//		{
//			//System.out.println("Hi");
//		}
		
		int e =1;
		while (e<=5)
		{
			System.out.println("Welcome all");
			e++;
		}
		
		// sum of digits in a number 
		// here the number is 123, sum is 6
		
		int num = 555, r, sum= 0;
		
		while(num>0)
		{
			r = num%10;
			num = num/10;
			sum = sum+r;
			
		}
		System.out.println(sum);
		
		
//		//do while
//		int j=1;
//		do
//		{
//			System.out.println("hallo");
//			j++;
//		}while(j>=5);
	}

}
