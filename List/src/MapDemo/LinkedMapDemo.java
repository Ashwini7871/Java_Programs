package MapDemo;
import java.util.*;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap hm = new LinkedHashMap(); 
	    hm.put("Idli", 20);
	    hm.put("Dosai", 30);
	    hm.put("Poori", 30);
	    hm.put("Pongal", 40);
	    hm.put("Dosai", 45);
	    System.out.println(hm);
	    System.out.println(hm.containsKey("Poori"));
	    System.out.println(hm.get("Poori"));
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


