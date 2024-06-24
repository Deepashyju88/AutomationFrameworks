package week1;

public class wrapper {
	public static void main (String args[])
	{
		String s1="100";
		 System.out.println(s1+100);

		/* To store primitive data in the form of object
		 * &
		 * To convert object into primitive we use wrapperclass
		 */
		 
		 String S2 = "200";
		 System.out.println(S2+100);
		 
		 //String to int ---> integer wrapperclass
		 
		 int num = Integer.parseInt(S2);
		 System.out.println(num+100);
		 
		 
		 String S3 = "22.75";
		 System.out.println(S3+11.11);
		 
		 double d = Double.parseDouble(S3);
		 System.out.println(d+11.11);
		 
		 String S4 = "True";
		 boolean b = Boolean.parseBoolean(S4);
		 System.out.println("boolean value " + b);
		 
		 
		 /* String is a class in java
		  * string is collection of charactor
		  * specific character from string use --  charAt(index)
		  * 
		  * 
		  */
		 
		 int a = 100;
		 Integer bb= a;
		 System.out.println(bb.parseInt());
		 
		 String S5 = "deep";
		 char p = S5.charAt(0);
		 System.out.println(p);
		 
		 
		 String S6 = "w";
		 char q = S6.charAt(0);
		 System.out.println(q);
		 
		 
		 /* Primitive to string (String --------- valueOf())
		  *
		  * 
		  */
		 
		 
		 int x = 1000;
		 String numm = String.valueOf(x);
		 System.out.println("this is valur of" + numm+100);
		 
		 
		 
		 float y = 33.22f;
		 String numfloat = String.valueOf(y);
		 System.out.println(numfloat+11.11);
		 
		 
		 
		 
		 //System.out.println(****************************************);
		 
		 /* Student class
		  * class and object
		  */
		 
		 
		 //data
		 
		 int id;
		 String name;
		 
		 
	}
	
	

}
