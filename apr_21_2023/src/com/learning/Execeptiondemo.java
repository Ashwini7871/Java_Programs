package com.learning;
import java.util.Scanner;

public class Execeptiondemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Execeptiondemo ed =new Execeptiondemo();
//    Scanner sc = new Scanner (System.in);
//      System.out.println("Enter Numbers: ");
//      int no1 = sc.nextInt();
//      int no2 = sc.nextInt(); 
      int no1=10,no2=0;
      ed.divide(no1,no2);
      ed.subtract(no1,no2);
  }
  private void subtract(int no1, int no2) {
    // TODO Auto-generated method stub
    System.out.println(no1-no2);
    
  }
  public void divide(int no1, int no2) {
    // TODO Auto-generated method stub
	  try {
   System.out.println(no1/no2);
	  }
	  catch(ArithmeticException e) {
		  System.out.println("abcd");
	  }
	  finally{
		System.out.println("cccc");  
	  }
   
}
  
}

