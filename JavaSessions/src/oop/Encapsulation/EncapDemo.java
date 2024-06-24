package oop.Encapsulation;

import javax.annotation.processing.AbstractProcessor;

class student {
	
	private int id = 101;
	private String name = "sarang";
	
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

	
	
	public void Shoe() {
		System.out.println(id);
		System.out.println(name);

	}
}
public class EncapDemo {

	public static void main(String[] args) {
		
		student st = new student();
		//st.id=102;
		//System.out.println(st.id);
		st.Shoe();
		
		st.setId(103);
		st.setName("Adti");
		
		System.out.println(st.getId());
		System.out.println(st.getName());
	}

}
