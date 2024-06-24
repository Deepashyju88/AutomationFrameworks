package week1;

import oop.polymorphism.AccessModifier;

public class FirstCode {
	
	public static void main(String args[])
	{
		System.out.println("Hallo All!");
		MethordType.staticApp();
		
		AccessModifier ss = new AccessModifier();
		System.out.println(ss.name); // only public data can be 
	}

}
