package oop.polymorphism;

public class Array2Ddemon {

	public static void main(String[] args) {

		int arr[][] = new int [2][3];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		System.out.println("totsl length of the row is : " + arr.length);
		System.out.println("coloum length is : " + arr[1].length);
		System.out.println(arr[1][2]);
		System.out.println("*****************itration using for loop ****************************************");
		
		for (int i = 0; i<arr.length; i++)// raw
		{
			for (int j=0; j<arr[i].length;j++) //column
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("********************itration using for each***************************************");

		
		for (int i[]:arr)
		{
			for (int j:i) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		System.out.println("******************** literal way ***************************************");

		
		int sid[][] = {{10,20},{30,40},{50,60}};
		
		System.out.println(sid.length); // 3
		System.out.println(sid[1].length); // 2
		System.out.println(sid[1][0]);//30
		
		for (int i[] : sid)
		{
			for (int j : i)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		String plc[][]= {{"chennai","padi"}, {"banglore","jangi"},{"mangalore","jothi"}};
		
		for (String i[] :plc)
		{
			for (String j:i)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
		Object login[][] = {{"Admin","Admin@123"}, {"test","test123"},{"raju","raji123"},{"soor","soor123"},{"bachn","bachn123"}};
		
		for (int i=0; i<login.length;i++)
		{
			for(int j=0;j<login[i].length;j++)
			{
				System.out.print(login[i][j]+"   ");
			}
			System.out.println();
		}
		
		System.out.println("*******************************************************");
		
		for (Object i[]:login)
		{
			for (Object j:i)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
		
		// String is non mutable class so there is no reverse() method
		// to revert java provide 
		// String Buffer 					String Builder
		//synchronize 						non synchronize
		//at a time one process					multiple process
		
		// only new key word can be used. no literal way
		
		StringBuilder ss = new StringBuilder("Hallo");
		
		ss.append("All");
		
		System.out.println(ss);
		
		System.out.println(ss.reverse());

		String res = "";
		String gg = "Hallooo";
		for (int i = (gg.length()-1); i>=0;i--)
		{
			res = res + (gg.charAt(i));
		}
		
		
		System.out.println(res);
				
	}

}
