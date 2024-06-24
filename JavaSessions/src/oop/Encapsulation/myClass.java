package oop.Encapsulation;

public class myClass {

	public static void main(String[] args) {

		MyPrivateClass myPrivateClass = new MyPrivateClass();
		
		System.out.println(myPrivateClass.getStr());
		
		myPrivateClass.setStr("This is the new string usinf myclass");

		System.out.println(myPrivateClass.getStr());
		
		
	}

}
