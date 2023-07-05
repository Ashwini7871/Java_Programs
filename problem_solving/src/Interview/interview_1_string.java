package Interview;

import java.util.Scanner;

public class interview_1_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int a[]=new int[n.length()];
		
	for (int j = 0; j < n.length(); j++) {
        int count =1;
        char ch = n.charAt(j);
        
        for(int k=j+1;k<n.length();k++) {
        	if(ch==n.charAt(k)) //a==s
        	{
//        		System.out.println(ch);
        		a[k]=-1;

        		count++;
//        		System.out.println(count);
        		
        	}
        }
        	if(a[j]!=-1) {
        		a[j]=count;
        	}
        	if(a[j]>0)
        	{        	
        		System.out.println(ch+" appers for "+a[j]+ " times");
        	}
        	
        
        
		}
	
		
	}
	/*
	 *      for(int i= 0; i<n.length(); i++)
      {
        int count = 1; 
        char ch = n.charAt(i);
        for(int j=i+1; j<n.length();j++)
        {
          if(ch == n.charAt(j))
          {
            a[i] = -1; 
            count++; 
          }
        }
        if(a[i]!=-1) 
        {
          a[i] = count;
        }
        if(a[i]>0) {
        System.out.println(ch + " appears for " + a[i] +" times");
	 */

}
