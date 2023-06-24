package hacker_rank;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		task1 ts = new task1();
//		ts.fizz_buzz();
		ts.task2();
	}

	private void task2() {
		// TODO Auto-generated method stub
		/*Problem

Read different types of data from standard input, process them as shown in output format and print the answer to standard output.

Input format:

First line contains integer N..

Second line contains string S

Output format:

First line should contain Nx 2

Second line should contain the same string S

Constraints:

0≤ N ≤10
0<=S<=15
sample input:
5
helloworld
output:
10
helloworld
*/	Scanner sc = new Scanner(System.in);	
	int N =sc.nextInt();
	sc.nextLine();
	String S = sc.nextLine();
	System.out.println(N*2);
	System.out.println(S);
	}

	private void fizz_buzz() {
		// TODO Auto-generated method stub
		for(int i=1;i<=15;i++) {
//			System.out.println(i);
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			}
			
		}
	}

}
