package List;

import java.util.ArrayList;
import java.util.Scanner;

public class ListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 ArrayList marks = new ArrayList(); 
//
//		    Scanner sc = new Scanner(System.in); 
//		    while(true)
//		    {
//		      System.out.println("Enter mark: ");
//		    int mark = sc.nextInt(); 
//		    marks.add(mark); 
//		    System.out.println("Enter N to stop"); 
//		    char ch = sc.next().charAt(0); 
//		    if(ch =='N')
//		        break; 
		    //------------------//
		ArrayList marks = new ArrayList(); 
	    int total = 0; 
	    Scanner sc = new Scanner(System.in);
	    int i =0; //
	    while(true)
	    {
	      System.out.println("Enter mark: ");
	    int mark = sc.nextInt(); 
	    marks.add(mark); 
	    total = total + (int) marks.get(i);//0
	    //System.out.println(marks.get(i));
	    i++;
	    System.out.println("Enter 'STOP' to stop"); 
	    String ch = sc.next();
//	    if(ch =='N' || ch=='n')
	    if(ch.equalsIgnoreCase("STOP"))
	        break; 
	    }
	    System.out.println(total);
		
	}
}
	


