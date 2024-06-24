package week1;

public class DataType {
	public static void main (String args[])
	{
	 boolean status = true;
	 System.out.println(status);
//	 
	 status = false;
	 System.out.println("The new status of boolean is  " + status);
	 
	 // from 65 to 90 the ASCII value will start from A
	 // 97 to 122 a to z
	 //0 to 9 48 to 57
	 char c1 = 67;
	 System.out.println("The character value of c1 is  " + c1);
	 char c2 = '$';
	 System.out.println(c2);
	 
	 //Integral ----> intiger
	 // byte, shot, int, Long
	 
	 //byte -128 to 127
	 // byte size is 1 byte
	 byte c3 = 120;
	 System.out.println(c3);

	 //short size is 2 byte
	 //int size is 4 byte
	 //long size is 8 byte
	 long l1 = 99999999999999L;
	 System.out.println(l1);

		 
	 //Floating point
	 //float 4 byte 
	 //Double (default) - 8 byte
	 
	 float f1 = 25.65F;
	 System.out.println(f1);
	 
	 double d1 = 562.589;
	 System.out.println(d1);
	 
	 long x1 = 1234567812345678L;
	 int r1 = (int)x1;
	 System.out.println("test vale of r1 : "+ r1);
	 long t1 = (long)r1;
	 System.out.println("test value of t1 : "+ t1);
	 
	 String r5 = "100";
	 int t6 = Integer.parseInt(r5);
	 System.out.println(t6+100);
	 
	 int a3 = 100;
	 long l8 = a3;
	 System.out.println("the long data vale i s: "+ l8);
	 
	 char c6 = 'b';
	 int i8= c6;
	 System.out.println(i8);
	 
	 
	 double d7 = 8754.85;
	 float f7 = (float)d7;
	 System.out.println(f7);
	 
	 int b7 = 98;
	 char c7 = (char) b7;
	 System.out.println(c7);
			 
	 String s9 = "100";
	 System.out.println(s9+100);
	 int s7 =Integer.parseInt(s9);
	 System.out.println(s7+100);
	 
	 String d3 = "56.58";
	 double g6 = Double.parseDouble(d3);
	 System.out.println(g6+11.11);
	 
	 
	 int i7= 200;
	 String i9= String.valueOf(i7);
	 System.out.println(i9+100);
	 
	 
	 
	}
}
