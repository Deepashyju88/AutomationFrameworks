package oop.polymorphism;

public class AmazonPaymentTest {

	public static void main(String[] args) {
		AmazonPayment s1 = new AmazonPayment();
		
		s1.payment("Arjun", "debit", 1234569878965412L, 458, 8700);
		s1.payment("Varun", 1235456625897852l, 897, 9000, "credit");
		s1.payment(9500, "amith324@okhdfcbank");
		s1.payment("ICICI Bank", 4754821, "anil@456");
	}

}
