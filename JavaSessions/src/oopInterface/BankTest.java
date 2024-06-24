package oopInterface;

public class BankTest {

	public static void main(String[] args) {

		HDFC h1 = new HDFC();
		
		h1.customerDetails();
		h1.deposit();
		h1.withdrawal();
		h1.interestRate();
		h1.BG();
		h1.forex();
		h1.coreBanking();
		
		System.out.println("*****************************");
		
		
		// invalid - RBI r1 = new RBI();// Cannot instantiate the type RBI no parant ref and paratnt methord
		
	//	HDFC r1 = new RBI();//invalid
		
		RBI r2 = new HDFC();
		
		r2.deposit();
		r2.withdrawal();
		r2.interestRate();
		r2.coreBanking();
		
	
		System.out.println("*****************************");

		FRC f1 = new HDFC();
		f1.BG();
		f1.forex();
		f1.coreBanking();
	}

}
