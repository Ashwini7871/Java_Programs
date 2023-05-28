package com.learning;

public abstract class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shapes square = new Shapes();
//		Shapes rectangle = new Shapes();
//		Shapes cone = new Shapes();
//		
//		square.calculate_area(40);
//		rectangle.calculate_area(40,30);
	}
	abstract void calculate_area();

	 void calculate_area(int len, int bre) {
		// TODO Auto-generated method stub
		System.out.println(len*bre);
	}

	void calculate_area(int a) {
		// TODO Auto-generated method stub
		System.out.println(a*a);
	}

}
