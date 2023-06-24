package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList names = new LinkedList();
		names.add("ashwini");
		names.add("priyanka");
		names.add("hema");
		names.add("sangeetha");
		names.add("anjali");
		names.add("ajitha");
		names.add("penasir");
		names.add("basima");
//		System.out.println(names);
		
		/* convert obj-->string
		 * collect start at a names
		 * print names start at a.
		 * 
		 */
		for(Object ss:names) 
		{
			
			String s = (String)ss;
			if( s.charAt(0)=='a')
			{
//			System.out.println(s);
			}
			
		}
//		Collections.sort(names);
//		  System.out.println(names);
//		names.addFirst("ashu");//new methods
//		names.addLast("names");//new
//          System.out.println(names);
//          names.clone();
//          System.out.println(names);
 
// System.out.println(names.clone()+"copy");
// System.out.println(names.element());//new
 
//	System.out.println(names.getClass());	
//	
//	System.out.println(names.peek());//new
//	System.out.println(names.peekLast());//new
//	
//	System.out.println(names.poll());//new
//	System.out.println(names.pop());//new
		names.push("siva");
		System.out.println(names);
	}

}
