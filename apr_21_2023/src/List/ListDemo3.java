package List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList(); 
		  a.add(10);
		  a.add(20);
		  a.add(30);
		  a.add(40); 
		  
		  ArrayList b = new ArrayList(); 
		  b.add(50.2f);
		  b.add(60);
		  b.add(70);
		  b.add(80); 
		  
		  a.addAll(b);
		  System.out.println(a);
		  a.retainAll(b);
		  System.out.println(a);
		  //---------//
		  List c = a.subList(0, 2);
		  System.out.println(c);
		  
		  Object[] ob = a.toArray(); 
		  for(Object val:ob)
		  {
		    System.out.println(val);
		  }
	}

}
