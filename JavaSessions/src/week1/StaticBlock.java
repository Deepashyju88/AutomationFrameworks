package week1;

public class StaticBlock {

	static String collageName = "ccc";
	static
	{
		System.out.println("this is from static block");
		System.out.println("static block is used to initialise static veriable");
		collageName = "cms ims";
	}
	
	public static void main(String[] args)
	{
		System.out.println("this is from main.....");
		System.out.println(collageName);
	}
}
