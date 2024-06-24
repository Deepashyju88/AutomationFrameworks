package oop.Encapsulation;

public class LoginTest {

	public static void main(String[] args) {

		LoginDemo ss1 = new LoginDemo();
		
		ss1.setUserId("arthi");
		ss1.setPassword("rtuf123");
		
		ss1.loginpage(ss1.getUserId(), ss1.getPassword());
		System.out.println("***********************************************");
        LoginDemo ss2 = new LoginDemo();
		
		ss2.setUserId("jathyu");
		ss2.setPassword("jat456");
		
		ss2.loginpage(ss2.getUserId(), ss2.getPassword());
	}

}
