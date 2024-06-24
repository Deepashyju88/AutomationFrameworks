package oop.polymorphism;

public class StringMethords {
	
	

	public static void main(String[] args) {
		
		String ss = "Hallo";
		
		String aa = "Welcome To All";
		String bb = "welcome to all";
		
		String cc = "HALLO EVERYONE";
		
		System.out.println("length of the string is  : "+ ss.length());
		System.out.println("the character at 4th place is : "+ ss.charAt(3));
		System.out.println("check aa is equal to bb : "+aa.equals(bb));
		System.out.println("check aa is equalant in all aa and bb : "+ aa.equalsIgnoreCase(bb));
		System.out.println("convert into lowercase : " + cc.toLowerCase());
		System.out.println("conert to uppercase : " + bb.toUpperCase());
		
		//partial string match
		String act = "Selenium webdriver is apis";
		System.out.println(act.contains("apis")); //true
		System.out.println(act.contains("Apis")); //false
		
		//trim() to avoid white space before and after the centance
		
		String dd = "      Welcome students       ";
		System.out.println(dd.trim());
		
		//startsWth()   and endsWith()
		String ee = "items the string starts with tool";
		System.out.println(ee.startsWith("items"));//true
		System.out.println(ee.startsWith("ITems"));//false	
		System.out.println(ee.startsWith("it"));//true
		
		System.out.println(ee.endsWith("tool"));//true
		System.out.println(ee.endsWith("ol"));//true
		System.out.println(ee.endsWith("brt"));//false
		System.out.println(ee.endsWith("l"));//true
		System.out.println(ee.endsWith("OL"));//false
		System.out.println(ee.endsWith("ol "));//false  - space is also considered
		
		
		//split regular expression
		
		String doc = "API,sellanium,postman,jmeter";
		String docArray[] = doc.split(",");
		
		
		
		for (int i = 0; i<=3;i++)
		{
			System.out.println(docArray[i]);
		}
		


		
		
		
		
		
		
		
		
	}

}
