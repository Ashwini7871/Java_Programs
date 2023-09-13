package Learn_String;

import java.util.Scanner;

public class comparebleMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comparebleMethods c = new comparebleMethods();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your String");
		String s1 = sc.nextLine();
		//3 Predefined methods 
//       c.equals_(s1);
//		c.compare_to(s1);
//		c.equals_opearator(s1);
	}

	private void equals_opearator(String s1) {
		// TODO Auto-generated method stub
		
		String s2="ashwini";
		if(s1==s2) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
	}

	private void compare_to(String s1) {
		// TODO Auto-generated method stub
		String s2 ="ashwini";
		// return 0,+ve,-ve , to check two string objects are equal or not in lexicographically.
        System.out.println(s2.compareTo(s1));
		// return 0,+ve,-ve , to check two string objects are equalIgnoreCase or not in lexicographically.
        System.out.println(s2.compareToIgnoreCase(s1));
        
		
		
	}

	private void equals_(String s) {
		// they are two methods in equals
		String s2="ashwini";
		// return boolean , to check two string objects are equal or not
		System.out.println(s.equals(s2));
		// return boolean , to check two string objects are equalsIgnorCase or not
        System.out.println(s.equalsIgnoreCase(s2));
       
        
	}

}
