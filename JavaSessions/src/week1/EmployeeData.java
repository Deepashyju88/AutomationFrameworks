package week1;

public class EmployeeData {
	
	int empid;
	String empname;
	
	
	public void display() {
		
		
		System.out.println("The Employee id   : "+empid);
		System.out.println("The Employee name : "+empname);
		System.out.println("");
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Employee Details");
		System.out.println("***************************");
		
		EmployeeData E1 = new EmployeeData();
		E1.empid = 52001;
		E1.empname = "Anatony";
		E1.display();
		
		EmployeeData E2 = new EmployeeData();
		E2.empid = 52002;
		E2.empname = "Bineesh";
		E2.display();
		
		EmployeeData E3 = new EmployeeData();
		E3.empid = 52003;
		E3.empname = "Dinesh";
		E3.display();

		EmployeeData E4 = new EmployeeData();
		E4.empid = 52004;
		E4.empname = "Ganesh";
		E4.display();
		
		EmployeeData E5 = new EmployeeData();
		E5.empid = 52005;
		E5.empname = "Varun";
		E5.display();
	}
}
