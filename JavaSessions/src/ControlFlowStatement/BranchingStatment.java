package ControlFlowStatement;

public class BranchingStatment {
	
	public void GmailDetails()
	{
		String email = "test@gmail.com";
		String pass = "Test123";
		System.out.println("the email id is :"+ email);
		System.out.println("password is : "+ pass);
		
	}
	
	public void GmailDetails(String email, String pass)
	{
		System.out.println("email 2 =" + email);
		System.out.println("password 2 " + pass);
	}

	public static void main(String[] args) {
		BranchingStatment s1 = new BranchingStatment();
		s1.GmailDetails();
		s1.GmailDetails("appu@gmail.com", "appi344");
		
		
		
		for(int i=1;i<=10;i++)
		{
			if(i>=5)
			{
				break;
			}else
			{
				System.out.println(i);

			}
			
		}
	}

}
