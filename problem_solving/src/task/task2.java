package task;

import java.util.Scanner;

public class task2 {
	/*Problem Description:

		Ramesh is working in an engineering college
		 hostel as a Mess supervisor.

		There are different messes are available 
		based on the years.

		Every day students count is varying in 
		all the hostels due to continuous holidays.

		Since ramesh is in charge of the
		 cooking team. He had trouble with calculating
		 the quantity of food that needs to be prepared
		 because of the varying student count.

		Even if a small quantity of food is prepared by the
		cooking team, it should be divided equally among 
		the number of Mess

		Ramesh needs an automated software to identify the amount of food available (in number of packets) and Mess count.

		Can you help him to divide the food equally and also calculating the remaining quantity of food that will be available after sharing the food equally?

		Constraints:

		1s alvqntoffood s10000

		1≤ messcnt ≤20

		Input Format:

		Only line of input has two integers (alvqntoffood, messcnt] separated by space representing the available number of food packets and the available number of messes respectively

		Output Format:

		In the only line of output print two values separated by a space representing the number of food packets that are equally shared by "n" number of messes and the remaining number of food packets

		available.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quaoffood =sc.nextInt();
		int mescont = sc.nextInt();
		System.out.println(quaoffood/mescont+" "+quaoffood%mescont);
	}
	
}
