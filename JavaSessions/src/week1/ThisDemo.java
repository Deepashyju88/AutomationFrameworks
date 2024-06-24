package week1;

public class ThisDemo {
	
	int id;
	String name;
	
	public void show()
	{
		System.out.println("this is id "+id);
		System.out.println("this is Name "+name);

	}
	
	public ThisDemo(int ids, String names)
	{
		this.id=ids;
		this.name=names;
		
	}

	public static void main(String[] args) {
		ThisDemo s1 = new ThisDemo(101,"amith");
		s1.show();
		
	}

}
