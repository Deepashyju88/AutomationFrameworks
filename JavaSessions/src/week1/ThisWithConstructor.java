package week1;

public class ThisWithConstructor {

	public ThisWithConstructor()
	{
		//this(500);
		System.out.println(" is default constructor");
	}
	
	public ThisWithConstructor(int xx)
	{
		this();
		System.out.println("this is parameterised constructor : "+xx);
	}
	
	public static void main(String[] args) {
		ThisWithConstructor t1 = new ThisWithConstructor(33);
	}
}
