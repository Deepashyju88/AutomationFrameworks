package week1;

public class TypeCasting {

	public static void main(String[] args) {

		
		// primitive to primitive
		//implicit way of conversion
		
		int i1 = 90;
		long x = i1;
		System.out.println(x);
		
		char c1 = 'd';
		int i2 = c1;
		System.out.println(i2);
		
		int z = 4785;
		float f2 = z;
		System.out.println(f2);
	
	
	
		long l4 = 98654554655485L;
		float f3 = l4;
		System.out.println(f3);
		
		//explicit way of conversion
		//double -> float -> long -> int ->short -> char-> byte
		
		double d4 = 5654475.584;
		float f4 = (float) d4;
		System.out.println(f4);
		
		byte b3 = (byte) d4;
		System.out.println("byte to double " + b3);
	
		int i4 = (int) d4;
		System.out.println(i4);
	
		int i5 = 97;
		char c5 = (char) i5;
		System.out.println(c5);
	
	
	}

}
