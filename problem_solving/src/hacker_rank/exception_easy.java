package hacker_rank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		try {
		int c = a/b;
		System.out.println(c);
		
		}
		catch(ArithmeticException ae) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
		catch(InputMismatchException aa) {
			System.out.println("java.util.InputMismatchException");
		}
	}

}
