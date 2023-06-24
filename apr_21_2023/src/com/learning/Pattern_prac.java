package com.learning;

public class Pattern_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern_prac pp = new Pattern_prac();
//		pp.pattern1();
//		pp.pattern2();
		pp.pattern3();
		
		
		
	}

	private void pattern3() {
		// TODO Auto-generated method stub
		
		for(int col=1;col<=15;col++) {
			System.out.print(col);
		}
		System.out.println();
	}

	private void pattern2() {
		// TODO Auto-generated method stub
	for(int row=5;row>=1;row--) {
		for(int col=5;col>=row;col--) {
			System.out.print(col+" ");
		}
		System.out.println();
	}
	}

	private void pattern1() {
		// TODO Auto-generated method stub
	for(int row=1;row<=5;row++) {	
	for(int col=1;col<=row;col++) 
	{
		
		System.out.print(col+" ");
	}
	System.out.println();
}
	}
}