package String_Programs_practice;

import java.util.Iterator;

public class Toupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder result= new StringBuilder();
       String s ="siva rama";//ex o/p Siva Rama
       String []k =s.split("/s");
       for (String w : k) {
		if(!w.isEmpty()) {
			char fl =Character.toUpperCase(w.charAt(0));
			String b= w.substring(1).toLowerCase();
			result.append(fl).append(b).append(" ");
		}
	}
		System.out.println(result);
		
	}

}
