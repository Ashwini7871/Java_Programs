package merfantz_tech;

import java.util.Scanner;

public class reverseString_removeSpacce {

public static void main(String[] args) {
	  // TODO Auto-generated method stub
	
	
	  Scanner in=new Scanner(System.in);
	  System.out.println("Enter String:");
	  String str=in.nextLine();
	  
	  System.out.println("Before Removing Extra Space:\n"+str);
	  System.out.println("After removing Extra Space:\n"+removeSpace(str));
	  System.out.println("Reversed Sentance:\n"+reverseSentance(removeSpace(str)));
	  
	 }

	 static int find_length(String s)
	 {
	       int c=0;
	  
	  while(true)
	  {
	   try 
	   {
	    s.charAt(c);
	    c++;
	   } 
	   catch (Exception e) 
	   {
	    // TODO: handle exception
	    break;
	   }
	  }
	  return c;
	 }
	 
	 
	 
	 static String removeSpace(String s)
	 {
	  String sCopy="";
	  int c=find_length(s);
	  boolean ok=false;
	  
	  for(int i=0; i<c; i++)
	  {
	   try 
	   {
	    if(s.charAt(i)!=' ')
	    {
	     sCopy+=s.charAt(i);
	     ok=true;
	    }
	    else
	    {
	     if(ok)
	     {
	      if(s.charAt(i+1)==' ')
	      {
	       continue;
	      }
	      else
	      {
	       sCopy+=s.charAt(i);
	      }
	     }
	    }
	   } 
	   catch (Exception e) 
	   {
	    // TODO: handle exception
	    break;
	   }
	  }
	  return sCopy;
	 }
	 
	 
	 
	 static String reverseSentance(String s)
	 {
	  s=s+" ";//hello welcome home 
	  int c=find_length(s);
	  String temp="" , rev="";
	  
	  
	  for(int i=0; i<c; i++)
	  {
	   char ch=s.charAt(i);
	   
	   if(ch!=' ')
	   {
	    temp=temp+ch;//hello welcome
	   }
	   else
	   {
	    rev=temp+" "+rev; //hello ,welcome hello
	    temp="";
	   }
	  }
	  return removeSpace(rev);
	 }
	}


