package week1;

public class OperatorDemo {

	public static void main(String[] args)
	{
		// Arithmatic operator
		
		int a=50, b=10;
		
		System.out.println("the reult is "+(a+b));
		System.out.println("the reult is "+(a-b));
		System.out.println("the reult is "+(a*b));
		System.out.println("the reult is "+(a/b));
		System.out.println("the reult is "+(a%b));

		
		// increment and decrement
//		     ++            ---
//		
//		post increment   
//		a++  (a= a+1)
//		
//		pre increment
//		++a   (a= a+1)
		
		System.out.println("a  =" + a);
		System.out.println("a++ = "+(a++));
		System.out.println("a  =" + a);
		System.out.println("a  =" + a);
		System.out.println("a++ = "+(a++));
		System.out.println("a = "+a);
		System.out.println("++a = "+(++a));
		System.out.println("++a = "+(++a));
		
		
		int c = 90;
		int d = c++;
		
		System.out.println(d); //90
		System.out.println(c); // 91
		
		int f = 159;
		int g = ++f;
		System.out.println(g); //160
		System.out.println(f); //160
		
		int h=57;
		System.out.println(h); //57
		System.out.println(h--); //57
		System.out.println(h); //56
		
		int j=44;
		System.out.println(j); //44
		System.out.println(--j); //43
		System.out.println(j); //43
	}
	
}
