package week1;

public class MethordType {
	
	public void instanceApp()
	{
		System.out.println("instance methord");
	}
	
	public static void staticApp() {
		System.out.println("static methord");
	}
	public static void main(String[] args) {
		
		staticApp();
		MethordType.staticApp();
		
		MethordType y1 = new MethordType();
		y1.instanceApp();

	}

}
