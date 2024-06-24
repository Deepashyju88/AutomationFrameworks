package oop.Encapsulation;

public class MyPrivateClass {
	
	private String str = "my str in my Private class";
	
	public String getStr()
	{
		return str;
	}
	
	public void setStr(String str)
	{
		this.str = str;
	}
	
	
	private void mymethod()
	{
		System.out.println("my private method");
	}

}
