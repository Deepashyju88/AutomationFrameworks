package Revision;

public class NobleHos implements IMA, USMA

{
	public void bloodbankNoble()
	{
		System.out.println("noble bloodbank");
	}

	@Override
	public void generalmedicin() {
		System.out.println("noble .............generalmedicin");
		
	}

	@Override
	public void heartTest() {
		System.out.println("noble .............heart");
		
	}

	@Override
	public void lungsTest() {
		System.out.println("noble .............lungs");
		
	}

}
