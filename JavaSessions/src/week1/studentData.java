package week1;

public class studentData {
	
	//id
	//name
	
	int id;
	String name;
	
	//function
	
	public void show() {
		
		System.out.println("student is is "+id);
		System.out.println("student name is "+name);
}
	
	public static void main(String[] args)
	{
		studentData S1= new studentData();
		S1.id = 101;
		S1.name= "Anupama";
		S1.show();
		
		System.out.println("***********************************");
		
		
		studentData S2=new studentData();
		S2.id = 102;
		S2.name = "Sunina";
		S2.show();
		
		System.out.println("************************************");
	}
	

}
