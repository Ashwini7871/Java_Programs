package hacker_rank;

import java.math.BigInteger;
import java.util.Scanner;

public class biginteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ex o/p a+b and a*b using big integer
		/*BigInteger big1, big2, big3;   // create 3 BigInteger objects  
		big1=new BigInteger ("10000000000000000");   //assign value to big1  
		big2=new BigInteger ("1");//assign value to big2  
		big3=big1.add (big2); // perform add operation on big1 using big2  
		  
//		String str= "Result of addition is" + big3;  
		System.out.println(big3); */      //print big3 value  
		
Scanner scanner = new Scanner(System.in);
        
        // Read input numbers as strings
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        
        // Create BigInteger objects from input strings
        BigInteger bigNum1 = new BigInteger(num1);
        BigInteger bigNum2 = new BigInteger(num2);
        
        // Perform addition and multiplication
        BigInteger sum = bigNum1.add(bigNum2);
        BigInteger product = bigNum1.multiply(bigNum2);
        
        // Print the results
        System.out.println(sum);
        System.out.println(product);
        
        scanner.close();
    }

	}
	
