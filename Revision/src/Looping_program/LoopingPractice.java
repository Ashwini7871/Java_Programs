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
//		lp.find_div_count();
//		lp.prime_number();
//		lp.Reverse_Printing_a_number();
//		lp.Count_of_Digits();
//		lp.Sum_of_Digits();
//		lp.Reverse_the_number();
//		lp. Palindrome();
//		lp.Armstrong_number();//pending
//		lp.Neon_number();
//		lp.Strong_number();
//		lp.print_11_table();
//		lp.print_1_8_27_64();
//		lp.find_power(4,3);
//		lp.print_squares();
//		lp.print_1_4_27_256();
//		lp.factorial(5);
//		lp.spy_number();
//		lp.print_tables();
//		lp.binary_to_decimal();
//		lp.gcd();//once recheck
//		lp.lcm();//once check
//		lp.fibanocci_without();
//		lp.fibanacci_with();
//		lp.swap_with();
//		lp.swap_without();
//		int prime =lp.first_10_prime();//pending
//		lp.sum(109);
//		lp.square_root();//check
//		lp.decimal_to_binary();
//		lp.print1_11_111_1111();//pending
		
		
	}

	private void print1_11_111_1111() {
		// TODO Auto-generated method stub
		String no="1";
//		for(;no<=1200;no++) {
			System.out.println(no+" ");
		
//		}
	}

	private void decimal_to_binary() {
		// TODO Auto-generated method stub
		
		int decimal=18;
		String binary="";
		while(decimal>0) {
			int rem=decimal%2;
			binary=rem+binary;
			decimal=decimal/2;
		}
		System.out.println(binary);
	}

	private void square_root() {
		// TODO Auto-generated method stub
		int no=9;
		int div=2;
		while(div<no) {
			if(no/div==div) {
				System.out.println(div);
				break;
			}
			div++;
		}
	}

	private void sum(int no) {
		// TODO Auto-generated method stub
		
		int sum=0;
		while(no>0) {
			sum=sum+(no%10);
			no=no/10;
		}
//		System.out.println(sum);
		if(sum>9) {
			sum(sum);
		}
		else {
			System.out.println(sum);
		}
	}

	private int first_10_prime() {
		// TODO Auto-generated method stub
		int no=11,count=0,div=2,prime=0;
		while(div<no) {
			if(no%div==0) {
				count++;
			}
			div++;
		}
		if(count==0) {
			System.out.println("prime number");
			return no;
		}
		else {
			System.out.println("not a prime");
			return 0;
		}
		
		
		
		
	}

	private void swap_without() {
		// TODO Auto-generated method stub
		
		int a=10,b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}

	private void swap_with() {
		// TODO Auto-generated method stub
		int a=10,b=20,c=0;
		System.out.print("before"+a+" "+b+" "+c);
		c=b;
		b=a;
		a=c;
		System.out.println("after"+" "+a+" "+b);
		
	}

	private void fibanacci_with() {
		// TODO Auto-generated method stub
		int p1=0,p2=1;
		while(p1<=10) {
			System.out.println(p1);
			int p3=p1+p2;
			p1=p2;
			p2=p3;
		}
	}

	private void fibanocci_without() {
		// TODO Auto-generated method stub
		
		int no1=0,no2=1;
		while(no1<=10) {
			System.out.println(no1);
			no2=no1+no2;
			no1=no2-no1;
			
		}
	}

	private void lcm() {
		// TODO Auto-generated method stub
		int no1=13,no2=17,lcm=0,div=2;
		int max=no1>no2?no1:no2;
		while(div<max) {
			if(no1%div==0&&no2%div==0) {
				lcm=div;
				break;
			}
			div++;
		}
		System.out.println(lcm);
		
		
	}

	private void gcd() {
		// TODO Auto-generated method stub
		int no1=10,no2=100,div=2,gcd=0;
		int min =no1<no2?no1:no2;
//		System.out.println(min);
		while(div<=min) {
			if(no1%div==0 && no2%div==0) {
				gcd=div;
			}
			div++;
		}
		System.out.println(gcd);
	}

	private void binary_to_decimal() {
		// TODO Auto-generated method stub
		int binary=1100;
		int decimal=0;
		int i=0;
		while(binary>0) {
			int rem=binary%10;//0
			decimal=decimal+(rem*(int)Math.pow(2, i));	
			binary/=10;
			i++;
		}
		System.out.println(decimal);
		
	}

	private void print_tables() {
		// TODO Auto-generated method stub
		//ex o/p: 1*10 2*9 3*8 4*7 5*6
		int no=1;
		int no1=10;
		while(no<=5) {
			System.out.println(no+"*"+no1+"="+(no1*no));
			no++;
			no1--;
		}
		
	}

	private void spy_number() {
		// TODO Auto-generated method stub
		int no=132;
		int sum=0;
		int mul=1;
		
		while(no>0) {
			int rem=no%10;
			sum=sum+rem;
			mul=mul*rem;
			no=no/10;
		}
		System.out.println(sum);
		System.out.println(mul);
		if(sum==mul) {
			System.out.println("its spy number");
		}
		else {
			System.out.println("not a spy");
		}
		
	}

	private void factorial(int no) {
		// TODO Auto-generated method stub
		//5! = 1*2*3*4*5
	
		int fact=1;
		while(no>0) //5>0
		{
			fact=fact*no;
			no--;
		}
		System.out.println(fact);
	}

	private void print_1_4_27_256() {
		// TODO Auto-generated method stub
		//ex o/p:1 4 27 256
//		concept  1 2^2 3^3 4^4
		int no=1;
		while(no<=4) {
			int ans=find_power(no,no);
			System.out.print(ans+" ");
			no++;
		}
		System.out.println();
	}

	private void print_squares() {
		// TODO Auto-generated method stub
		//ex o/p:1 4 9 16 25 36 49 64 81 100
		int no=1;
		int power=2;
		while(no<=10) {
			int ans=find_power(no,power);
			System.out.print(ans+" ");
			no++;
		}
		System.out.println();
	}

	private int find_power(int base,int power) {
		// TODO Auto-generated method stub
		int box=1;
		while(power>=1) {
			box=box*base;
			power--;
		}
//		System.out.print(box+" ");
		return box;
	}

	private void print_1_8_27_64() {
		// TODO Auto-generated method stub
		
		//ex o/p:1 8 27 64
		//concept1^3 2^3 3^3 4^3
		int no=1;
		int power=3;
		while(no<=4) {
			int answer=find_power(no,power);
			System.out.print(answer+" ");
			no++;
		}
		System.out.println();
		
	}

	private void print_11_table() {
		// TODO Auto-generated method stub
		//ex o/p:1 11 121
		int no=1;
		while(no<=121) {
			System.out.print(no+" ");
			no=no*11;
		}
		System.out.println();
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
		int no=9;
		int sum=0;
		int sqr=(int)Math.pow(no, 2);
//		System.out.println(sqr);
		while(sqr>0) {
			int rem=sqr%10;
			 sum=sum+rem;
			 sqr =sqr/10;
			
		}
//		System.out.println(sum);
		if(sum==no) {
			System.out.println("given number is neon");
		}
		else {
			System.out.println("not a neon");
		}
	}
		

	private void Armstrong_number() {
		
		
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

