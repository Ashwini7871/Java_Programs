package Set;

import java.util.ArrayList;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		Players_set mahi = new Players_set("MSd",+100);
	    Players_set virat = new Players_set("VK",+90); 
	    Players_set rohit = new Players_set("RS",+110);
	    
	ArrayList al = new ArrayList(); 
	al.add(mahi);
	al.add(virat);
	al.add(rohit);
	System.out.println(al);
		
	TreeSet ts = new TreeSet(al);
	System.out.println(ts);
		
	}
	
}
