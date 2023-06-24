package MapDemo;

import java.util.LinkedHashMap;

public class MapDemmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedHashMap hm = new LinkedHashMap(); 
/*	    hm.put('a',1);
	    hm.put('m',1);
	    hm.put('a',1);
	    hm.put('l',1);
	    hm.put('r',1);
	    hm.put('a',1);
	    hm.put('j',1);
	    System.out.println(hm);*/
		
		LinkedHashMap hm = new LinkedHashMap(); 
	    System.out.println(hm);
	String name = "sivaramakrishnan";
	for(int i=0; i<name.length();i++)
	{
	  if(hm.containsKey(name.charAt(i)))
	  {
	    int count = (Integer)hm.get(name.charAt(i));
	    hm.put(name.charAt(i),count+1);
	  }
	  else
	  {
	    hm.put(name.charAt(i),1);
	  }
	}
	    System.out.println(hm);
		
		
		
	}

}
