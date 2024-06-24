package oop.Encapsulation;

class employee {
	
	private int id = 102;
	private String name = "sarang";
	
	public void show()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	//right click from private and go to source then to getter and setter 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class Encapsulation {
public static void main(String[] args)
{
	employee ss = new employee();
	
	// to access private datas
	
	ss.setId(777);
	ss.setName("manu");
	
	System.out.println("using setter and getter" + ss.getId()+ ss.getName());
	
//	ss.id = 555;
//	ss.name = "arthi";
	
	ss.show();
	
}
}