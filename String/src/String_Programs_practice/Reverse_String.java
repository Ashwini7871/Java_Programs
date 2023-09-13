package String_Programs_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_String rs = new Reverse_String();
//		rs.method1();// normal
//		rs.method2();// using string builder
//		rs.method3();//swap 
//		rs.method4();//try catch
		rs.method5();
	}

	private void method5() {
		// TODO Auto-generated method stub
		
	}

	private void method4() {
		// TODO Auto-generated method stub
	
		
		String input="";
        System.out.println("Enter the input string");
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();
            char[] try1= input.toCharArray();
            for (int i=try1.length-1;i>=0;i--)
            System.out.print(try1[i]);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
}
	

	private void method3() {
		// TODO Auto-generated method stub
		String s = "Ashwini";
		char[] temparray= s.toCharArray();
	    int left=0;
	    int right=temparray.length-1;
	    for (left=0; left < right ; left++ ,right--)
	    {
	     // Swap values of left and right 
	     char temp = temparray[left];
	     temparray[left] = temparray[right];
	     temparray[right]=temp;
	    }
	    for (char c : temparray) 
	    {
	     System.out.print(c);
	    }
	    System.out.println();
	    
	   }
	

	private void method2() {
		// TODO Auto-generated method stub
		String s = "Ashwini";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());
	}

	private void method1() {
		// TODO Auto-generated method stub
		String s = "Ashwini";
		char ch[] =s.toCharArray();
		for (int i = ch.length-1; i >=0; i--) {
			System.out.print(ch[i]);
		}
	}

}
