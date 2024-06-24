package oop.polymorphism;

public class AmazonPayment {
	
	public void payment(int price)
	{
		System.out.println("Payment on delivary as cash of Rs -" + price);
	}
	
	public void payment(String cardName, String debit,long cardNumber, int cvv, int price )
	{
		System.out.println("Payment in Debit card with " + "Price : "+ price+ ",card type : " + debit+ " ,card name : " + cardName+ ", Card Number : " +cardNumber + ", CVV Number : " + cvv);
	}
	
	public void payment(String cardName,long cardNumber, int cvv, int price,String credit  )
	{
		System.out.println("Payment in Credit card with " + "Price : "+ price+ ",card type : " + credit+ " ,card name : " + cardName+ ", Card Number : " +cardNumber + ", CVV Number : " + cvv);
	}
	
	public void payment(int price, String UpiId)
	{
		System.out.println("Payment in UPI with price : " +price+ ", UPI id : " + UpiId);
	}
	
	public void payment(String bankName, int userId,String password )
	{
		System.out.println("Payment in Net banking with Bank : " + bankName+ ", userId : "+ userId+ ",Password : " + password);
	}
	
}
