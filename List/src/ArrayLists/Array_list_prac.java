package ArrayLists;

import java.util.*;

public class Array_list_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add(10);//return type; boolean//add (object)
		a.add(70);
//		System.out.println(a);
	    a.add(1, 20);//add(index,element or object)//return type : void
//	    System.out.println(a);
	    a.clear();
	 ArrayList b = new ArrayList();
	 b.add(40);
	 b.add(50);
	 b.add(60);
	 ArrayList c = new ArrayList();
	 c.addAll(a);
	 c.addAll(0,b);
	 System.out.println(c);
	 
	 
	 
	 System.out.println(a.contains(30));//return type:boolean
	 System.out.println(c.containsAll(a));//return type:boolean
	 
	 System.out.println(b.size());
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
