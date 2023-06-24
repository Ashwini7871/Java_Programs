package MapDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	HashSet hs = new HashSet(); 
	    hs.add("abcd");
	    hs.add("bcd");
	    hs.add("xyz");
	    hs.add("pqrs");
	    System.out.println(hs);*/
		//---//
		/* LinkedHashSet hs = new LinkedHashSet(); 
	    hs.add("abcd");
	    hs.add("bcd");
	    hs.add("xyz");
	    hs.add("pqrs");
	    System.out.println(hs);*/
		//------------------//
		 
		TreeSet hs = new TreeSet();
		//homogenius element
		hs.add("abcd");
	    hs.add("bcd");
	   // hs.add(123);
	    hs.add("xyz");
	    hs.add("pqrs");
	    System.out.println(hs);
	}

}
