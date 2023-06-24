package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet hs = new LinkedHashSet();
	    hs.add("Siva");
	    hs.add("Praveen");
	    hs.add("Thiyagu");
	    hs.add("Prabakaran");
	    hs.add("Stalin");

	    System.out.println(hs);
	    LinkedHashSet hs2 = new LinkedHashSet(); 
	    hs2.add(10);
	    hs2.add(20);
	    hs2.add(45);
	    System.out.println(hs2);
	    hs2.addAll(hs);
	    System.out.println(hs2);
	    
	    System.out.println(hs);
	    
	    hs.remove("Thiyagu");
	    System.out.println(hs);
	}

}
