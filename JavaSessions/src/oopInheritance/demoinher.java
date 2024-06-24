package oopInheritance;


	
	class A{
	public void m1()
	{
		
		System.out.println("call from m1");
	}
	}
	
	class B extends A
	{
		public void m2() {
			System.out.println("call from m2");
		}
	}
	public class demoinher {
	public static void main(String[] args) {
		A a1 = new A();
		a1.m1();
		
		B b1 = new B();
		b1.m2();
		b1.m1();

	}

}
