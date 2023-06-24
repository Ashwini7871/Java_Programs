package MapDemo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap(); 
	    hm.put("Idli", 20);
	    hm.put("Dosai", 30);
	    hm.put("Poori", 30);
	    hm.put("Pongal", 40);
	    hm.put("Dosai", 45);
	    System.out.println(hm);
	    
	    System.out.println(hm.keySet());
	    System.out.println(hm.entrySet());
	    System.out.println(hm.values());
	    
	    Set s = hm.entrySet();
	    for(Object ob: s)
	    {
	 /*   Entry entry = (Entry) ob; //entry
	     int price = (Integer)entry.getValue(); 
	          if(price==45)
	      System.out.println(entry.getKey());*/
	    	
	    	
	    	 /*Entry entry = (Entry) ob; 
	    	  String item = (String)entry.getKey(); 
	    	  if(item.equals("Dosai"))
	    	      System.out.println(entry.getValue());*/
	    	
	    	Entry entry = (Entry) ob; 
	    	  
	    	  String item = (String)entry.getKey(); 
	    	  if(item.equals("Dosai"))
	    	  {
	    	    entry.setValue(50);
	    	      System.out.println(entry.getValue());
	    	  }
	    }	
	    }

}
