package com.learning;

public class Lenova extends Laptop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lenova lenova = new Lenova();
		lenova.browse();
		lenova.doProgram();
		lenova.touch_screen();
		System.out.println(lenova.harddisk);
		
	}
	void touch_screen()
	{
		System.out.println("Touch screen");
	}

}
