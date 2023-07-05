package Regex_prac;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String input = "My mobile number is 9884010000";
	    Pattern patternObj = Pattern.compile("\\d{10}");
	    Matcher matcherObj = patternObj.matcher(input);
	    while(matcherObj.find())
	    {
	      System.out.println(matcherObj.group());
	      System.out.println(matcherObj.start());
	      System.out.println(matcherObj.end());

	    }*/
		
		/*String input = "My mobile number is 9884010000";
		Pattern patternObj = Pattern.compile("[0123456789]");	  
		Matcher matcherObj = patternObj.matcher(input);
	    while(matcherObj.find())
	    {
	      System.out.println(matcherObj.group());
	      System.out.println(matcherObj.start());
	      System.out.println(matcherObj.end());

	    }*/
		
		
		/*String input = "My mobile number is 9884010000";
		Pattern patternObj = Pattern.compile("[0-9]");
		Matcher matcherObj = patternObj.matcher(input);
	    while(matcherObj.find())
	    {
	      System.out.println(matcherObj.group());
//	      System.out.println(matcherObj.start());
//	      System.out.println(matcherObj.end());

	    }*/
		
		
		/*String input = "My mobile number is 9884010000";
		//Pattern patternObj = Pattern.compile("[0-9]");
		Pattern patternObj = Pattern.compile("[a-zA-Z]");
		Matcher matcherObj = patternObj.matcher(input);
		while(matcherObj.find())
		{
		  System.out.print(matcherObj.group());
//		  System.out.println(matcherObj.start());
//		  System.out.println(matcherObj.end());

		}*/
		
		/*String input = "abcd@abcd1234.com";
		//Pattern patternObj = Pattern.compile("[0-9]");
		Pattern patternObj = Pattern.compile("[^a-zA-Z0-9]");//^-->it means not
		Matcher matcherObj = patternObj.matcher(input);
		while(matcherObj.find())
		{
		  System.out.print(matcherObj.group());
		//  System.out.println(matcherObj.start());
		//  System.out.println(matcherObj.end());

		}*/
		
		
		
		/*String password = "Chennai is the capital of TamilNadu";
		  Pattern patternObj = Pattern.compile("TamilNadu$");//$--> ends with
		    Matcher matcherObj = patternObj.matcher(password);
		    while(matcherObj.find())
		    {
		      System.out.print(matcherObj.group());
		    }*/
		
		
		/*String password = "Chennai is the capital city";
		  Pattern patternObj = Pattern.compile("\\S");//remove space
		    Matcher matcherObj = patternObj.matcher(password);
		    int count = 0;
		    while(matcherObj.find())
		    {
		      count++;
		      System.out.print(matcherObj.group());
		    }
		    System.out.println(count);*/
		
		
		/*String password = "Chennai is the capital city";
		  Pattern patternObj = Pattern.compile("\\s");//s-->space
		    Matcher matcherObj = patternObj.matcher(password);
		    int count = 0;
		    while(matcherObj.find())
		    {
		      count++;
		      System.out.print(matcherObj.group());
		    }
//		    System.out.println(count);*/
		    
		   /* String password = "Chennai 600047";
		    Pattern patternObj = Pattern.compile("\\D");
		      Matcher matcherObj = patternObj.matcher(password);
		      int count = 0;
		      while(matcherObj.find())
		      {
		        count++;
		        System.out.print(matcherObj.group());
		      }
//		      System.out.println(count);*/
		
		
		/*String password = "Chennai 600057 .";
		  Pattern patternObj = Pattern.compile("\\d");//print only numbers
		    Matcher matcherObj = patternObj.matcher(password);
		    int count = 0;
		    while(matcherObj.find())
		    {
		      count++;
		      System.out.print(matcherObj.group());
		    }
//		    System.out.println(count);*/
		
		/*String mobile = "98840128101";
		  Pattern patternObj = Pattern.compile("[6-9][0-9]{9}");
		    Matcher matcherObj = patternObj.matcher(mobile);
		    while(matcherObj.find())
		    {
		      System.out.print(matcherObj.group());
		    }*/
		
		
		
		
		
		/*String mobile = "09884012810";
		Pattern patternObj = Pattern.compile("(0|91)?[0-9]{10}");
		    Matcher matcherObj = patternObj.matcher(mobile);
		    while(matcherObj.find())
		    {
		      System.out.print(matcherObj.group());
		    }
		*/
		
		String pattern = "-";
	       String input = "28-March-2023";
	            Pattern patternObj = Pattern.compile(pattern);
	            String[] items = patternObj.split(input);
	            for(int i=0;i<items.length;i++)
	            {
	              System.out.println(items[i]);
	            }
		
		
		
		
		
		
		
		    
		
	    
	    
		
	}

}
