package week1;

public class Thiskeyword {

	public void m1()
	{
		System.out.println("m1 is calling.........");
		this.m2();  // methord using this key word
	}
	
	public void m2()
	{
		System.out.println("m2 is calling ...........");
	}
	public static void main(String[] args) {
		
		Thiskeyword t1 = new Thiskeyword();
		t1.m1();

	}

}
