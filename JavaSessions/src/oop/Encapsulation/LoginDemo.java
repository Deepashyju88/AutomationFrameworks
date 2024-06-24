package oop.Encapsulation;

public class LoginDemo {
	
	private String userId;
	private String password;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void loginpage(String user, String pw)
	{
		System.out.println("login sucessfully");
		System.out.println("login user name " + user);
	}

}
