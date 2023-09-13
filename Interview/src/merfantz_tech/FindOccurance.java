package merfantz_tech;

import java.util.Scanner;

public class FindOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  Scanner in=new Scanner(System.in);
		  
		  System.out.println("Enter the String : ");
		  String s1=in.nextLine();
		  
		  System.out.println("find out the occurance of:");
		  String s2=in.nextLine();
		  
		  System.out.println(split_word(s1, s2));
		 }

		 static int len(String s)
		 {
		  int c=0;
		  
		  while(true)
		  {
		   try 
		   {
		    
		    s.charAt(c);
		    c++;
		    
		   } catch (Exception e)
		   {
		    // TODO: handle exception
		    break;
		   }
		  }
		  return c;
		 }
		 
		 
		 static int split_word(String s1, String s2)
		 {
		  s1+=" ";
		  
		  int l1=len(s1);
		  
		  int c=0;
		  
		  String temp="";
		  
		  for(int i=0; i<l1; i++)
		  {
		   char ch=s1.charAt(i);
		   
		   if(ch!=' ')
		   {
		    temp+=ch;
		   }
		   else
		   {

		   c=c+find_occurance(temp, s2);
		   temp="";
		    
		   }
		    
		     }
		  return c;
		 }
		 
		 static int find_occurance(String s1, String s2)
		 {
		  int l1=len(s1);
		  int l2=len(s2);
		  
		  int x=0 , count=0;
		  
		  if(l1>=l2)
		  {
		   try 
		   {
		    
		    for(int i=0; i<l1; i++)
		    {
		     for(int j=i; j<l2+i; j++)
		     {
		      char s1Char=s1.charAt(j);
		      char s2Char=s2.charAt(x);
		      
		      if(s1Char==s2Char)
		      {
		       x++;
		      }
		      else
		      {
		       break;
		      }
		      
		      int check=(l2+i)-1;
		      
		      if(j==check)
		      {
		       count++;
		      }
		     }
		     x=0;
		    }
		    
		   } catch (Exception e) 
		   {
		    // TODO: handle exception
		   }
		  }
		  return count;
		 }

	}



