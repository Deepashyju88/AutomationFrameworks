package oopInterface;

public class HDFC implements RBI,FRC
{

	public void customerDetails()
	{
		System.out.println("HDFC............customerDetails");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("HDFC.........deposit");
		
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		System.out.println("HDFC.........withdraw");

	}

	@Override
	public void interestRate() {
		// TODO Auto-generated method stub
		System.out.println("HDFC.........interest rate is 7%");

	}

	@Override
	public void forex() {
		System.out.println("HDFC.........forex");
		
	}

	@Override
	public void BG() {
		System.out.println("HDFC.........BG");
		
	}

	@Override
	public void coreBanking() {
		// TODO Auto-generated method stub
		System.out.println("HDFC.........core banking");

	}
}
