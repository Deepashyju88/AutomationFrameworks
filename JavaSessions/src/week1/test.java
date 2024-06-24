package week1;

public class test {
	
	int id;
	String name;
	
	public void disply()
	{
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) {

//			test e1= new test();
//			e1.id = 101;
//			e1.name = "depas";
//			e1.disply();
//			
//			
//			test e2 = new test();
//			e1.id = 102;
//			e1.name = "fgdfhgjhkdepas";
//			e1.disply();
		
		
		String ss = "hallow";
		StringBuffer rr = new StringBuffer(ss);
		
		System.out.println(rr.reverse());
	}

}
