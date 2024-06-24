package Revision;

public class TestHoap {

	public static void main(String[] args) {

		NobleHos nh = new NobleHos();
		
		nh.bloodbankNoble();
		nh.heartTest();
		nh.lungsTest();
		nh.generalmedicin();
		nh.covid19Test();
		
		
		IMA im = new IMA();
		im.heartTest();
		im.lungsTest();
		im.covid19Test();
		
		
		IMA imnb = new NobleHos();
		imnb.lungsTest();
		imnb.heartTest();
		imnb.covid19Test();
	
	
	
	
	
	
	}

}
