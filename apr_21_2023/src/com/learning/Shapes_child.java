package com.learning;

public class Shapes_child extends Shapes {

	@Override
	void calculate_area() {
		// TODO Auto-generated method stub
	
	}
       public static void main(String[] args) {
	Shapes_child sc = new Shapes_child();
	
	sc.calculate_area(0);
	sc.calculate_area(10,20);
       }
}

