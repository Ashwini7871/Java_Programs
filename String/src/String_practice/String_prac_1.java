package String_practice;

import java.util.Scanner;

public class String_prac_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String_prac_1 sp = new String_prac_1();
//		sp.starts_with();//add ignore case
//		sp.ends_with();//add ignore case
//		sp.find_vowels();//pending
//		sp.create_space();
//		sp.remove_space();
//		sp.find_evencharecter();
//		sp.eliminating_last_spaces();//strip trailing
//		sp.reverse_string();
//		sp.check_contains();
//		sp.frequency_of_each_character();
		
	}

	private void frequency_of_each_character() {
		// TODO Auto-generated method stub
	    String n = "sivasabaribala";
	    int[] cc = new int[n.length()];
	 for(int j=0;j<n.length();j++) {
	    int count = 1; 
	    char ch = n.charAt(j);
	    	for(int i=j+1; i<n.length();i++)
	           {
	             if(ch == n.charAt(i))
	              {
	            	 cc[i]=-1;
	               count++; 
	              }
	          }
	    	if(cc[j]!=-1)
		    {
		      cc[j] = count;
		    }
	    	if(cc[j]>0)
		    {
		    System.out.println(ch + " appears for " + cc[j] + 
		        " times");
		    }

	    }
	}

	private void check_contains() {
		// TODO Auto-generated method stub
		 String sen="it is too hot here today";
		    System.out.println(sen.contains("hot")); //default method
		    
	}

	private void reverse_string() {
		// TODO Auto-generated method stub
		  String name="Siva Rama Krishnan";
		    
		    String[] s=name.split(" ");
		    
		    for(int i=0;i<s.length;i++)
		    {
		      System.out.println(s[i]);
		    }
		    int space=0;
		    for(int j=s.length-1;j>=0;j--)
		    {
		      System.out.print(s[j]);
		      for( space=1;space<=1;space++)
		      {
		        System.out.print(" ");
		      }
		    }
	}

	private void eliminating_last_spaces() {
		// TODO Auto-generated method stub
	    String name="amal raj   ";                                                                         
	    
	    String name2="";
	    char[] ch=name.toCharArray();
	    boolean alphabet=false;
	    
	    for(int i=ch.length-1;i>=0;i--)
	    {
	      char letter=ch[i];
	      if(letter==' ' && alphabet==false )
	      {
	        
	      }
	      else
	      {
	        alphabet= true;
	        name2=name2+letter;
	      }
	      }
	    System.out.println(name2);
	    
	    for(int i=name2.length()-1;i>=0;i--)
	    {
	      char[] cc=name2.toCharArray();
	      System.out.print(cc[i]);
	    }
	    
	}

	private void find_evencharecter() {
		// TODO Auto-generated method stub
		  String name="mukilan";
		    
		    
		    for(int i=0;i<name.length();i+=2)
		    {
		      char letter=name.charAt(i);
		      
		      
		      System.out.print(letter);    
		    }
	}

	private void remove_space() {
		// TODO Auto-generated method stub
		String name="I Am Going Now";
		String name2="";
	    
	    char[] ch = name.toCharArray();
	    for(int i=0; i<ch.length;i++)
	    {
	      char letter = ch[i];
	      if (letter==' ' )
	      {
	  
	      }
	      else {
	        
	      //System.out.print(ch[i]);
	      name2 = name2 + letter; //amal
	      }
	    }
	    System.out.println(name2); 
		
	}

	

	private void create_space() {
		// TODO Auto-generated method stub
		String name="IAmGoingNow";//ex.output:IAm
//		System.out.println(name);
		for(int i=0;i<name.length();i++) {
			char letter=name.charAt(i);
		if(letter>='A' && letter<='Z') {
			
				if(letter==name.charAt(0)||letter==name.charAt(1))
				{
				System.out.print(name.charAt(i));
				}
				else 
				{
				System.out.print(" "+name.charAt(i));
				}
			
			
											}
		else {
				System.out.print(name.charAt(i));
			 }
			
		}
	}

	private void find_vowels() {
		// TODO Auto-generated method stub
		
	    System.out.println("Enter your name:");
	    Scanner sc=new Scanner(System.in);
	    String n=sc.next();
	    int count=0;
	    for(int i=0;i<n.length();i++)
	    {
//	    if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o'||n.charAt(i)=='u')
	    		char ch = n.charAt(i);
	    		
	    	if(n.charAt(i)=='a' ||
	    			//n.charAt(i)== ||
	    			//n.charAt(i)=='i' ||
	    			n.charAt(i)=='o' ||
	    			n.charAt(i)=='u' ||
	    			n.charAt(i)=='A' ||
	    			n.charAt(i)=='E' ||
	    			n.charAt(i)=='I' ||
	    			n.charAt(i)=='O' ||
	    			n.charAt(i)=='U' )  	
	    {
	      System.out.println("The vowels are: "+ n.charAt(i));
	      count++;
	    }
	    
	    }
	    System.out.println("count of vowels: "+count);
	    	}

	private void ends_with() {
		// TODO Auto-generated method stub
		
		String name1="ashwini";
		String name2 ="ni";
		
		boolean ends = true;
		int len1 = name1.length()-1; 
		for(int len2 = name2.length()-1; len2>=0;len2--)
		{
		  if(name1.charAt(len1)== name2.charAt(len2))//
		  {
		    len1--;
		    continue; 
		  }
		  else
		  {
		    System.out.println("No, not ends with");
		    ends = false; 
		    break; 
		  }
		}  
		if(ends == true)
		{
		  System.out.println("yes, ends with "+name2);
		}


}

	private void starts_with() {
		// TODO Auto-generated method stub
//		System.out.println(name);
		
		String name1="Ashwini";
		String name2="ash";
		boolean starts = true;
		 name1 = name1.toLowerCase();
		for(int i=0;i<name2.length();i++) {
			
			if(name1.charAt(i)==name2.charAt(i)) {
				continue;
			
			}
			else {
				starts=false;
				break;
			}
			
		}
		if(starts==true) {
			System.out.println("yes, starts with "+name2);
		}
		else {
			System.out.println("no,not start with "+name2);
		}
		
		
		
	}
}
