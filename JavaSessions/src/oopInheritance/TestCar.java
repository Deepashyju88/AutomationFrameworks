package oopInheritance;

public class TestCar {

	public static void main(String[] args) {
System.out.println("***************************************************");
		Car c1 = new Car();
		c1.Start();
		c1.Refuel();
		c1.Stop();
		c1.Break();
		System.out.println("***************************************************");

		
		Audi a1 = new Audi();
		a1.DecelEngin();
		a1.Start();
		a1.Refuel();
		a1.Stop();
		a1.Break();
		
		System.out.println("***************************************************");
		BMW b1 = new BMW();
		b1.AutoEngin();
		b1.Start();
		b1.Stop();
		b1.Refuel();
		b1.Break();
	}

}
