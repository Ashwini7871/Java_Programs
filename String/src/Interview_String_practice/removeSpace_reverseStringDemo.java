package Interview_String_practice;

import java.util.Scanner;

public class removeSpace_reverseStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  Scanner sc = new Scanner(System.in);
  System.out.println("enter your String ");
  String input =sc.nextLine();
  char[] c = input.toCharArray();
  int len=0;
  for (char a : c) {
	len++;
	System.out.print(a);
     }
 System.out.println(len);
 
	

	
	 String s = "";
     boolean ok = false;

    for (int i = 0; i < len; i++) { // Use c.length instead of len
         try {
             if (input.charAt(i) != ' ') {
                 s += input.charAt(i); // Append non-space characters to s
                 ok = true;
            } else {
                 if (ok) {
                     if ( input.charAt(i + 1) == ' ') {
                         continue; // Skip consecutive spaces
                     } else {
                         s += input.charAt(i); // Append a single space
                     }
                 }
             }
         } catch (Exception e) {
             // Handle exception (you can add appropriate error handling here)
         }
     }

     System.out.println("After Removing Extra Space:" + s);
     System.out.println("after reverse :"+reverseString(s));
     
     
 }

	private static String reverseString(String s) {
		// TODO Auto-generated method stub
		char[] ch= s.toCharArray();
		int len=0;
		for (char c : ch) {
			len++;
		}
		String s1="";
		for (int i = 0; i < len; i++) {
			if(ch[i]!=' ') {
				s1=s1+ch[i];
			}
			else {
				
			}
		}
		return null;
	}
     
}
	  

