package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		hm.put("chennai", 45889);
		hm.put("Nagpur", 45899);
		hm.put("Sriputhur", 45786);
		hm.put("nand", 45231);
		System.out.println(hm.size());
		
		System.out.println(hm.isEmpty());
		System.out.println(hm.containsKey("nand"));
		System.out.println(hm.containsValue(45231));
		System.out.println(hm.get("Nagpur"));
		System.out.println("***********************************");
		
		//**********Itration in map*****************88
		//Entry is an interface in Map
		
		for (Entry<String, Integer> i:hm.entrySet() )
		{
			//System.out.println(i);
			
			System.out.println(i.getKey()+ " : "+ i.getValue());
		}
		
		
		//Iterator is available in collections
		//if u want to use iterator in Map, then use EntrySet() 
		//convert map to set
		
		System.out.println("#######################################");
		
		Set<Entry<String,Integer>> ent = hm.entrySet();
		
		Iterator<Entry<String,Integer>> ir = ent.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
