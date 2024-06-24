package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class ArrayListDemo {

	
	//add() size() get(index) add(index, value) remove(index) isEmpty()clear()contains()
	public static void main(String[] args) {
//this is a no generic way, not type sensitive and it need type casting
//		ArrayList a1= new ArrayList();
//		
//		a1.add(100);
//		a1.add("sarang");
//		a1.add(56.98);
//		a1.add(5464659655464l);
//		a1.add("w");
//		
//		System.out.println(a1.size());
//		a1.get(2);
//		a1.add(1,"pranav");
//		
//		
//		int number = (int) a1.get(0);
//		System.out.println(number);
//		
		
		//this is generic way
		
		System.out.println("******************************************************************");
		int ggg[]= {10,55,4,89,1005};
		System.out.println(ggg);
		System.out.println(ggg);
		
		ArrayList<String> as = new ArrayList<String>();
		as.add("gggg");
		as.add("jjjjj");
		as.add("zzzzz");
		as.add("bbbbbb");
		
		System.out.println(as);
	//	Collections.sort(as);
		Collections.sort(as,Collections.reverseOrder());
		System.out.println(as);
		
		as.add(null);
		
		System.out.println(as);
		System.out.println("******************************************************************");


		ArrayList<Integer> ss = new ArrayList<Integer>();
		ss.add(20);
		ss.add(30);
		ss.add(50);
		
		for(int i=0; i<ss.size(); i++)
		{
			System.out.println(ss.get(i));
		}
		
		for (Integer i : ss)
		{
			System.out.println(i);
		}
		
		Iterator<Integer> aii = ss.iterator();
		if(aii.hasNext())
		{
			System.out.println(aii.next());
		}
		
		System.out.println(ss);
		
		int newno = ss.get(1);
		System.out.println(newno);
		
		ArrayList<String> dd = new ArrayList<String>();
		dd.add("pune");
		dd.add("chennai");
		System.out.println(dd);
		
		
//		System.out.println("is the array empty " + a1.isEmpty()); // false
//		
//		System.out.println("the size of array - " + a1.size());
//		 ss.add(0, 44);
//		 System.out.println(ss);
//		 
//		 System.out.println("contains - "+ ss.contains(44));
//
//		 
//		 ss.remove(3);
//		System.out.println(ss);
//		
//		ss.clear();
//		System.out.println(ss);
//		
//		ss.add(null);
//		System.out.println(ss);
//		
//		ArrayList<Object> obj = new ArrayList<Object>();
//		obj.add("sarang");
//		obj.add(522);
//		obj.add(56.58);
//		obj.add("R");
//		
//		System.out.println(obj);
//		
//		
//		ArrayList<Integer> ele = new ArrayList<Integer>();
//		ele.add(200);
//		ele.add(300);
//		System.out.println(ele);
//		
//		String str = "hallo-all";
//		String rr[]=str.split("-");
//		
//		for (String i : rr) {
//			System.out.println("This i" + i);
//		}
//		
//		System.out.println("");
//		
//		
//		String gg = "hallo all this is good";
//		String hh[]= gg.split(" ");
//		
//		
//		String hy= "100";
//		int gj = Integer.parseInt(hy);
//		System.out.println(gj+100);
//		
//		
//		String hhhh = "200";
//		int jjjj = Integer.parseInt(hhhh);
//		System.out.println(jjjj+300);
//		
//		String kkk = "55.11";
//		double rrr = Double.parseDouble(kkk);
//		System.out.println(rrr+11.11);
//		
//		String pp = "True";
//		boolean bb = Boolean.parseBoolean(pp);
//		System.out.println(bb);
//		
//		String sse = "T";
//		char ggt = sse.charAt(0);
//		System.out.println(ggt);
//		
//		
//		int yy =  200;
//		String g4 = String.valueOf(yy);
//		System.out.println(g4+100);
//		
//		
//		String fr = "100";
//		int hju = Integer.parseInt(fr);
//		System.out.println(hju+150);
//	
//	
//		ArrayList<Integer> g6 = new ArrayList<Integer>();
//	
//		g6.add(50);
//		g6.add(60);
//		g6.add(70);
//		System.out.println(g6);
//		
//		int ghj =1;
//		for (int i = 1; i<=5;i++)
//		{
//			System.out.println(ghj*i);
//			ghj++;
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		int ssd = sc.nextInt();
//	
//		System.out.println("this is ssd " + ssd);
		
		System.out.println("*******************************************************************************");
		
		HashSet<Integer> hss = new HashSet<Integer>();
		hss.add(66);
		hss.add(44);
		hss.add(77);
		hss.add(22);
		
		System.out.println(hss);
		
		System.out.println(hss.isEmpty());
		hss.add(null);
		
		System.out.println(hss.size());
		System.out.println(hss.contains(22));
		
		
		Iterator<Integer> it = hss.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		hss.remove(null);
		System.out.println(hss);
		List<Integer> list1 = new ArrayList<Integer>(hss);
		System.out.println(list1);
		
		//hss.remove(null);
		
		Collections.sort(list1);
		
		System.out.println(list1);
		
		
		
		
		
		
		
		
		
		
		
		
	}
 
	
	
	
}
