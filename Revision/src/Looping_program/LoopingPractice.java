package Looping_program;

import java.util.Scanner;

public class LoopingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoopingPractice lp = new LoopingPractice();
//		lp.print_3_tables();
//		lp.mul_3and5();
//		lp.mul_3or5();
//		lp.find_diviors();
		//lp.find_div_count();
//		lp.prime_number();
//		lp.Reverse_Printing_a_number();
//		lp.Count_of_Digits();
//		lp.Sum_of_Digits();
//		lp.Reverse_the_number();
//		lp. Palindrome();
//		lp.Armstrong_number();//pending
//		lp.Neon_number();//pending
//		lp.Strong_number();//pending
		
		
	}

	private void Strong_number() {
		// TODO Auto-generated method stub
		/*
		 * step1: find factorial of given each input number
		 * step2: add all factorial answers.
		 * step3 : compare given input ==total.its strong
		 * else not a strong number.
		 * eg:
		 * 145=>1!+4!+5!=1+24+120=145
		 * 145==145(strong number).
		 * 
		 */
	}

	private void Neon_number() {
		// TODO Auto-generated method stub
		/*
		 * step1 : square the given input number.
		 * step2 : add square values.
		 * step3 : compare input==total,its neon,
		 * else,not a neon number.
		 * eg:
		 * 9=> 81=>8+1=9
		 * so , 9==9(neon).
		 */
	}

	private void Armstrong_number() {
		// TODO Auto-generated method stub
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
		         }
         System.out.println(count);
	       Looping_practice2_power ll = new Looping_practice2_power();
	       int total=0;
	       for(;no1>0;no1/=10) {
	    	   total=total+ ll.find_power(no1, count);
		       
	       }
	       if(no2==total) {
	    	   System.out.println("armstrong");
	       }
	       else {
	    	   System.out.println("not a armstrong");
	       }
	      
		
	

	private void Palindrome() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		int no1=no;
		int reverse=0;
		for(;no>0;) {
			reverse=(reverse*10)+(no%10);
			no=no/10;
		}
		if(no1==reverse) {
			System.out.println("it's palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
	}

	private void Reverse_the_number() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		int reverse=0;
		for(;no>0;) {
			reverse =(reverse*10)+(no%10);//4,43
			no=no/10;//123,12
		}
		System.out.println("reverse the number :"+reverse);
		
	}

	private void Sum_of_Digits() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		int total=0;
		for(;no>0;no/=10) {
			total=total+(no%10);
		}
		System.out.println("sum of digit is :"+total);
	}

	private void Count_of_Digits() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		 int count =0;
		 for(;no>0;no/=10) {
//			 System.out.print(no%10);
			 count++;
		 }
		 System.out.println("count of digit is : "+count);
	}

	private void Reverse_Printing_a_number() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		for(;no>0;no/=10) //
			{
			System.out.print(no%10);
			
		}
		
	}

	private void prime_number() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		int count=0;
        for(int div=2;div<no;div++) {
        	if(no%div==0) {
        		count++;
        		
        	}
        	
        }
        if(count==0) {
        	System.out.println("prime number");
        }
        else {
        	System.out.println("not a prime");
        }
		
		
	}

	private void find_div_count() {
		// TODO Auto-generated method stub
		//8) Count of Divisors of given number
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		int count=0;
		for(int div=2;div<=no;div++) {
			if(no%div==0) {
				count++;
				System.out.println(div);
			}
		}
		System.out.println("count of divisor : "+count);
		
		
	}

	private void find_diviors() {
		// TODO Auto-generated method stub
		//7) Divisors of given number
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your no :");
		int no = sc.nextInt();
		int div=2;
		for(;div<=no;div++) {
			if(no%div==0) {
				System.out.println(div);
			}
			
		}
		
		
	}

	private void mul_3or5() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%3==0|| i%5==0) {
				System.out.println(i);
			}
		}
		
		
	}

	private void mul_3and5() {
		// TODO Auto-generated method stub
		//5) Multiples of 3 and 5
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
		
		
	}

	private void print_3_tables() {
		// TODO Auto-generated method stub
		
		for(int no=3;no<=15;no+=3) {
			System.out.print(no+" ");
		}
	}

}
}
