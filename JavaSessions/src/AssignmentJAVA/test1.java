package AssignmentJAVA;

public class test1 {

	public static void main(String[] args) {
		String value = "My Name is Deepa";
		
		String newvalue[]= value.split(" ");
		System.out.println("Outout:");
		for(String i: newvalue)
		{
			System.out.println(i);
		}
		
		
		
		int uu[][] = {{10,20},{30,40},{50,60}};
		
//		int uu[][] = new int[2][2];
//		
//		uu[0][0] = 10;
//		uu[0][1] = 20;
//		
//		uu[1][0] = 30;
//		uu[1][1] = 40;
		
		for (int i=0; i<uu.length;i++)
		{
			for(int j=0;j<uu[i].length;j++)
			{
				System.out.print(uu[i][j]+ " ");
			}
			System.out.println();
		}
		
		for (int i[]: uu)
		{
			for (int j :i)
			{
				System.out.println("check : "+ j);
			}
		}
		
		
		
		String ff = "hallo";
		
		StringBuilder gh = new StringBuilder(ff);
		StringBuffer bf = new StringBuffer(ff);
		
		System.out.println(gh.reverse());
		System.out.println(bf.reverse());
		
		for (int i=4; i>=0; i--)
		{
			System.out.print(ff.charAt(i));
		}
		
		
		
		
		
	}

}
