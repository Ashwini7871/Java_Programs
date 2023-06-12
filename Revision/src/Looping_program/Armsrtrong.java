package Looping_program;

import java.util.Scanner;

public class Armsrtrong {
	/*
	 * step1 :find count of given number.
	 * step 2: the count is power value.
	 * step3 :find each number of power.
	 * step4: add the power values.
	 * step 5:given input no==total,its armstrong.
	 * else., not a armstrong.
	 * eg:153
	 * 1^3+5^3+3^3=1+125+27=153
	 * 153==153(armstrong)
	 */
     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
           
         Armsrtrong am = new Armsrtrong();
        int count= am.find_count_of_digits(no);

         int result=am.find_armstrong(no,count);
         if(no==result) {
        	 System.out.println("its armstrong");
         }
         else {
        	 System.out.println("not a armstrong");
         }
	}

	private int find_armstrong(int no, int count) {
		// TODO Auto-generated method stub
		int sum=0;
		for(;no>0;no/=10)//153
		{
			int rem=no%10;//3,5,1
			sum=sum+find_power(rem,count);//3,3..,sum=27,5,3...,sum=125,sum=1
		}
		return sum;
	}

	private int find_power(int no,int power) {
		// TODO Auto-generated method stub
		int mul=1;
		for(;power>0;power--) 
		//
		{
			mul=mul*no;//2,4,8
			
			
		}
//		System.out.println(mul);
		return mul;
	}

	private int find_count_of_digits(int no) {
		// TODO Auto-generated method stub
		int count =0;
for(;no>0;no/=10) 
{
	count++;
}
return count;
	}
}
