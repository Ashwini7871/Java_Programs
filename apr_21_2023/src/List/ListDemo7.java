package List;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
	    al.add("priyanka");
	    al.add("Ashwini");
	    al.add("balaji");
	    al.add("jayasurya");
	    al.add(true);
	    al.add(5.4f);
	    al.add(45);
	  //  System.out.println(al);
	    
	    for(Object ob:al)
	    {
	      try {
	      String s = (String)ob; 
	    String s2 = s.substring(0, 1);
	      if(s2.equalsIgnoreCase("a"))
	        System.out.println(ob);
	      }
	      catch(ClassCastException cc)
	      {
	        
	      }
	    }
	}

}
