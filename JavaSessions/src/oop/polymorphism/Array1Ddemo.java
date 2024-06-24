package oop.polymorphism;

public class Array1Ddemo {

	public static void main(String[] args) {

		int sid[] = new int[5];
		sid[0] = 101;
		sid[1] = 102;
		sid[2] = 103;
		sid[3] = 104;
		sid[4] = 105;
		
		System.out.println("length of sid = " + sid.length);
		System.out.println(sid[3]);
		//System.out.println(sid[5]); //ArrayIndexOutOfBoundsException:
		System.out.println("**************************************************** ");
		for (int i=0; i<sid.length; i++)
		{
			System.out.println(sid[i]);
		}
		
		String student[] = new String[4];
		student[0] = "Priya";
		student[1] = "ammuth";
		student[2] = "chaki";
		student[3] = "ram";
		
		for (int i=0; i <student.length; i++)
		{
			System.out.println(student[i]);
		}
		
		
		Double mark[] = new Double[3];
		
		mark[0] = 56.5;
		mark[1] = 45.2;
		mark[2] = 77.32;
		
		for (Double i : mark)
		{
		
		System.out.println(i);
		}
		System.out.println("total mark : " + (mark[1] + mark[2]));
		
		
		String s2 = "Nov 2023";
		String arr[] = s2.split(" ");
		System.out.println(arr[0]);
		
		for (String i : arr)
		{
			System.out.println(i);
		}
		
		
		System.out.println("********************************************");

		Object employee[] = {"suresh","pune",45,9865678954l, 58.56};
		for (Object i : employee)
		{
			System.out.println(i);
		}
		
		
	}

}
