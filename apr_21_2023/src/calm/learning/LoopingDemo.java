package calm.learning;

import com.learning.Looping_Practice2;

public class LoopingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopingDemo ld = new LoopingDemo();
//		ld.swap(10,100);
		ld.find_binary_to_decimal(101);
		

	}
 
	private void find_binary_to_decimal(int no) {
		// TODO Auto-generated method stub
		int po = 0;
		int decimal = 0;
		Looping_Practice2 lp = new Looping_Practice2();
		while(no>0)
		  {
		  int rem = no%10; 
		  decimal = decimal + (rem * lp.find_power(2,po)); 
		  no = no/10; 
		  po = po+1; 
		  }
		  System.out.println("Decimal value is "+decimal);
		    
		  }
	

	private void swap(int no1, int no2) {
	    // TODO Auto-generated method stub
	    System.out.println("Before Swapping"); 
	    System.out.println(no1+" and "+no2);
	    no1 = no1 + no2; //no1 = 110;
	    no2 = no1 - no2; //no2 = 10; 
	    no1 = no1 - no2; //no1 = 100; 
	    System.out.println("After Swapping"); 
	    System.out.println(no1+" and "+no2);
	    
	  }
	
}
