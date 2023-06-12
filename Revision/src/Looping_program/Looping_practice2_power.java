package Looping_program;

import java.util.Scanner;

public class Looping_practice2_power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
       Looping_practice2_power ll = new Looping_practice2_power();
       System.out.println("enter no :");
       int no=sc.nextInt();
//       System.out.println("enter power value :");
//       int power= sc.nextInt();
       System.out.println("enter fact value :");

       int fact=sc.nextInt();
//       ll.find_power(no,power);
       ll.find_factorial(fact);
	}

	private void find_factorial(int fact) {
		// TODO Auto-generated method stub
		int mul=1,no=1;
		for(;no<=fact;no++ ) {
			mul=mul*no;
		}
		System.out.println(mul);
		
	}

	public int find_power(int no,int power) {
		// TODO Auto-generated method stub
		int mul=1;
		for(;power>0;power--) 
		//
		{
			mul=mul*no;//2,4,8
			
			
		}
		System.out.println(mul);
		return mul;
	}
	

}
