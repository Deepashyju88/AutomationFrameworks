package oopInheritance;

class A
{
	public void m1()
	{
	System.out.println("from class A methord m1");
	}
}

class B extends A// parant A extended to B
{
	public void m2()
	{
	System.out.println("from class B methord m2");
	}
}


class C extends B
{
	public void m3()
	{
		System.out.println("from class C methord m3");
	}
}
public class Inheritance {
	
	public static void main(String[] args)
	{
	A a1 = new A();
	System.out.println("parant class reference and parant class object");
// reference will get a high priority that object called
	a1.m1();
	
	B b1 = new B();
	System.out.println("child class reference and child class object");

	b1.m2();
	b1.m1(); // extended from class A 
	
	System.out.println("parant class reference and child class object");
	A a2 = new B();
	a2.m1();// only parant class methord can access
	
	System.out.println("child class reference and parant class object");
	//B b2 = new A(); //Type mismatch: cannot convert from A to B
	
	
	
	C c1 = new C();

	c1.m3();
	c1.m2();
	c1.m1();
	
	
	
	}
	

}
