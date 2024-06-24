package oopInheritance;

public class test {

	public static void main(String[] args) {

		parant pr = new parant();
		pr.colour();
		
		
		child ch = new child();
		ch.colour();
		
		parant pc = new child();
		pc.colour();
		
		//child cp = new parant();

	}

}
