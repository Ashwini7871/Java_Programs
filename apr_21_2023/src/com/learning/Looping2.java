package com.learning;

public class Looping2 {

	public static void main(String[] args) {
		Looping2 ll = new Looping2();
//		ll.print_1_10();
		

	}

	private void print_1_10() {
		// TODO Auto-generated method stub
		int no1 = 1, no2 = 10; 
		while(no1<=5)
		{
		System.out.println(no1 * no2);  
		no1 = no1 + 1; 
		no2 = no2 - 1; 
		}
	}

}
