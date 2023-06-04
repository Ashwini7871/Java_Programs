package com.learning;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {98,95,100,94};
		try {
		ExceptionDemo2.display(marks);
		}
		catch(ArrayIndexOutOfBoundsException aa)
		{
		  System.out.println("Check array ");
		}
	}

}
