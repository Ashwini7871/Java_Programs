package sampleproject;

import java.util.Iterator;
import java.util.Scanner;

public class Creditcard_number_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Based on the Luhn algorithm, let's check the validity of the credit card number "4532 0151 1283 36" using the steps I explained earlier:

		1. Remove any non-digit characters and consider only the digits: "45320151128336".

		2. Starting from the right, double every second digit:

		   - The second-to-last digit is "3". Doubling it gives us 3 * 2 = 6.
		   - The fourth-to-last digit is "8". Doubling it gives us 8 * 2 = 16. Since 16 is greater than 9, we subtract 9 to get 16 - 9 = 7.
		   - The sixth-to-last digit is "1". Doubling it gives us 1 * 2 = 2.
		   - The eighth-to-last digit is "5". Doubling it gives us 5 * 2 = 10. Again, since 10 is greater than 9, we subtract 9 to get 10 - 9 = 1.
		   - The tenth-to-last digit is "1". Doubling it gives us 1 * 2 = 2.
		   - The twelfth-to-last digit is "2". Doubling it gives us 2 * 2 = 4.

		   After applying the doubling operation, the modified number becomes: "4 5 6 2 0 1 5 1 1 2 8 3 3 6".

		3. Sum up all the digits:

		   4 + 5 + 6 + 2 + 0 + 1 + 5 + 1 + 1 + 2 + 8 + 3 + 3 + 6 = 47.

		4. Check if the total sum is divisible by 10:

		   In this case, 47 is not divisible by 10.

		Therefore, according to the Luhn algorithm, the credit card number "4532 0151 1283 36" is not considered valid.*/
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter length of numbers : ");
	    int n = sc.nextInt();
	    int[] cardno=new int[n];
	    System.out.println("Enter the card number");
	    for( int i=0;i<cardno.length;i++)
	    {
	     cardno[i]=sc.nextInt();
	    //System.out.println(cardno[i]);
	    }
	    int checksum=cardno[cardno.length-1];
	    System.out.println("The cheksum is "+ checksum);
	   
	    
	    // for finding even position from right side to left side
	    
	    int[] b=new int[n];
	    for(int j=cardno.length-1;j>=0;j--)
	    {
	      if(j%2==0)
	      {
	        b[j]=cardno[j]*2;
	        if(b[j]>9)
	        {
	          int rem=b[j]%10;
	          int quo=b[j]/10;
	          b[j]=rem+quo;
//	          System.out.println(b[j]);
	          }
	        }
	      else
	    {
	      b[j]=cardno[j];
	    }
	      System.out.print(b[j]+" ");
	    }
	    System.out.println();
	    int sum=0;
	    for(int k=b.length-1;k>=0;k--)
	    {
	      sum=sum+b[k];
	    }
	    System.out.println("The sum of total number is "+ sum); 
//	    int c=10-(sum%10);
//	    
//	    if(c==checksum )
//	    {
//	    System.out.println("credit card number is valid");
//	    }
//	    else {
//	      System.out.println("credit card number is Invalid");
//	    }
	    if(sum%10==0) {
	    	System.out.println("credit card number is valid");
	    }
	    else {
	      System.out.println("credit card number is Invalid");
	    }
}
}

