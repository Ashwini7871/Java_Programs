package task;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Problem Description:

			Sajid was booking a train ticket from 
			Chennai to Delhi for his family.

			Two of the relatives was interested
			 in joining that journey from different places 
			 with their family members

			So, Sajid booked tickets for those persons
			also along with his family members.

			He wants to know the total number of tickets
			for this travel.

			Can you help him in finding the total number
			of passengers?

			Constraint:

			1 < num1 ≤ 15

			1 ≤ num2s 15

			1 < num3 s 15

			Input Format.

			Only Line of input has three integers num1, num2 and num3 separated by a space representing the numbers of ticket booked by Sajid at three different interval of time.

			Output Format:

			Print the total number of tickets booked by Sajid.*/
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
//		int total=num1+num2+num3;
		System.out.println(num1+num2+num3 );
	}

}
