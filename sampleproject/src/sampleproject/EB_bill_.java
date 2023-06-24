package sampleproject;

import java.time.LocalDate;
import java.util.Scanner;

public class EB_bill_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("EB Bill Calculation");
		LocalDate date = LocalDate.now();
		System.out.println("Current Date: "+date);
	    System.out.println("Month: "+ date.getMonth());
		System.out.println("***********************************");
		System.out.println();
		for(int j=0;j<6;j++)
		{
			System.out.println("Options");
		System.out.println(" 1.Person-in-home\n 2.Door-locked\n 3.Meter-not-working\n 4.Cash-Depoist\n 5.Exit\n");
		System.out.println("Press the number for your options");
		
		int option=sc.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("Enter your previous month reading");
			int previous_reading=sc.nextInt();
			System.out.println("Enter your current month reading");
			int current_reading=sc.nextInt();
			int results=current_reading-previous_reading;
			System.out.println("This month reading "+results+" Units");

//			double totalBill = 0;

//	        // Tariff rates for different slabs in Tamil Nadu
//	        double slab1Rate = 4.50;
//	        double slab2Rate = 6.00;
//	        double slab3Rate = 8.00;
//	        double slab4Rate = 9.00;
//	        double slab5Rate = 10.00;
//	        double slab6Rate = 11.00;
//
//	        // Slab limits for different units // 0-100 free unints 
//	        int slab1Limit = 101;//101-400
//	        int slab2Limit = 401;//401-500
//	        int slab3Limit = 501;//501-600
//	        int slab4Limit = 601;//601-800
//	        int slab5Limit = 801;//801-1000
//	        int slab6Limit = 1000;
//	        if (units <= slab1Limit) {
//	            totalBill = units * slab1Rate;
//	        } else if (units <= slab2Limit) {
//	            totalBill = (slab1Limit * slab1Rate) + ((units - slab1Limit) * slab2Rate);
//	        } else if (units <= slab3Limit) {
//	            totalBill = (slab1Limit * slab1Rate) + ((slab2Limit - slab1Limit) * slab2Rate) + ((units - slab2Limit) * slab3Rate);
//	        } else if (units <= slab4Limit) {
//	            totalBill = (slab1Limit * slab1Rate) + ((slab2Limit - slab1Limit) * slab2Rate) + ((slab3Limit - slab2Limit) * slab3Rate) + ((units - slab3Limit) * slab4Rate);
//	        } else if (units <= slab5Limit) {
//	            totalBill = (slab1Limit * slab1Rate) + ((slab2Limit - slab1Limit) * slab2Rate) + ((slab3Limit - slab2Limit) * slab3Rate) + ((slab4Limit - slab3Limit) * slab4Rate) + ((units - slab4Limit) * slab5Rate);
//	        } else if (units <= slab6Limit) {
//	            totalBill = (slab1Limit * slab1Rate) + ((slab2Limit - slab1Limit) * slab2Rate) + ((slab3Limit - slab2Limit) * slab3Rate) + ((slab4Limit - slab3Limit) * slab4Rate) + ((slab5Limit - slab4Limit) * slab5Rate) + ((units - slab5Limit) * slab6Rate);
//	        } else {
//	            totalBill = (slab1Limit * slab1Rate) + ((slab2Limit - slab1Limit) * slab2Rate) + ((slab3Limit - slab2Limit) * slab3Rate) + ((slab4Limit - slab3Limit) * slab4Rate) + ((slab5Limit - slab4Limit) * slab5Rate) + ((slab6Limit - slab5Limit) * slab6Rate) + ((units - slab6Limit) * slab6Rate);
//	        }
//	        System.out.println("Your bill amount is :"+totalBill);
	      //Step 1: 700-100 =600
	        int unit=results; //600 -done
            double amt=0;
			if(unit<=100) //600<=100 //
			{
				unit=unit-100;//200
		        System.out.println("0 to 100 Units Free.");
				System.out.println("Bill amount = "+amt);
			}
  else if(unit>=101 && unit<=400) { 
	  unit=unit-100;//600
	  amt=unit*4.50;
    System.out.println("Bill amount = "+amt);
  }
  else  {
	  unit=unit-100;
	    amt=100*4.50+(unit-100)*6;
    System.out.println("Bill amount = "+amt);
  }
//  else if(unit>=501 && unit<=600)
//  {
//	    amt=100*4.50+200*6+(unit-200)*10;
//    System.out.println("Bill amount = "+amt);
//  }
//  else if(unit>=601 && unit<=800) {
//	    amt=100*4.50+200*6+(unit-200)*10;
//	    System.out.println("Bill amount = "+amt);
//
//  }
//  else if(unit>=801 && unit<=1000) {
////	  amt=100*4.50+
//	    System.out.println("Bill amount = "+amt);
//
//  }
//  else {
//	    System.out.println("Bill amount = "+amt);
//
//  }
	        break;
		case 2:
			System.out.println("Enter your previous month EB-bill amount");
			int prebill=sc.nextInt();
			System.out.println("Your payable amount for this month: "+prebill+"Rs");
			System.out.println("--------------------------------------");
			break;
		case 3:
			System.out.println("Enter your last 2 month bill-amount");
			int fmonth=sc.nextInt();
			int smonth=sc.nextInt();
			int payable_amount1=fmonth+smonth;
			System.out.println("Your payable amount is "+payable_amount1+" Rs");
			System.out.println("--------------------------------------");
			
			break;
		case 4:
			System.out.println("Enter your past 6 month paid amount");
			int[] cc=new int[6];
			int total=0;
			for(int i=0;i<cc.length;i++)
			{
				cc[i]=sc.nextInt();
				total=total+cc[i];
			}
			System.out.println("Total Eb-bill amount for last year "+total+" Rs");
			int value=total/12;
			int deposit_value=value*3;
			System.out.println("Your deposit value for this year "+deposit_value+" Rs");
			System.out.println("--------------------------------------");
			break;
		case 5:
		       
			System.out.println("You are exited");
			System.out.println("Thank you!");
			j=6;
			    break;

	}
		

		}
	}
}
