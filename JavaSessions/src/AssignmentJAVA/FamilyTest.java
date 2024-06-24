package AssignmentJAVA;

public class FamilyTest {

	public static void main(String[] args) {
		
		Child_1 ch1= new Child_1();
		ch1.Write();
		ch1.Read();
		ch1.Play();
		ch1.singing();
		ch1.dancing();
		ch1.poemWritting();
		ch1.football();
		ch1.painting();
		
		System.out.println("**********************************");
		
		Parant_1 pr1= new Child_1();
		pr1.Read();
		pr1.Write();
		pr1.painting();
		pr1.football();
		
		System.out.println("**********************************");
		
		Parant_2 pr2 = new Child_1();
		pr2.dancing();
		pr2.singing();
		pr2.poemWritting();
		
		
		System.out.println("**********************************");

		Child_2 ch2 = new Child_2();
		ch2.poemWritting();
		ch2.Sleep();
		ch2.dancing();
		ch2.singing();
		
		System.out.println("**********************************");
		
		Parant_2 pr3 = new Child_2();
		pr3.dancing();
		pr2.singing();
		pr2.poemWritting();
		

	}

}
