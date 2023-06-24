package List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
public static void main(String[] args) {
//	ArrayList grocery = new ArrayList();
//	grocery.add("shampoo");
//	grocery.add("soap");
//	grocery.add("toothpaste");
//	grocery.add("toothbrush");
//	System.out.println(grocery);
//	
//	ArrayList veg = new ArrayList();
//	veg.add("tomato");
//	veg.add("brinjal");
//	veg.add("apple");
//	veg.add("banana");
//	veg.add("tomato");
//	System.out.println(veg);
//	
//	grocery.addAll(veg);
//	System.out.println(grocery);
//	System.out.println(grocery.contains("tomato"));
//	
//	grocery.removeAll(veg);
//	System.out.println(grocery);
	
	
	 ArrayList   a = new ArrayList(); 
	    a.add(10);
	    a.add(true);
	    a.add(30);
	    a.add("Yogesh Balaji"); 
	    
	    ArrayList b = new ArrayList(); 
	    b.add(50);
	    b.add(60.3f);
	    b.add(false);
	    b.add(80.5); 
	    
	    a.addAll(b);
	    System.out.println(a);
	    //  [10, 20, 30, 40, 50, 60, 70, 80]
	    a.retainAll(b);
	  //  [50, 60, 70, 80]
	    System.out.println(a);
	    List c = a.subList(0, 2);
	    System.out.println(c);
	    
	    Object[] ob = a.toArray(); 
	    for(Object val:ob)
	    {
	      System.out.println(val);
	}
}
}
