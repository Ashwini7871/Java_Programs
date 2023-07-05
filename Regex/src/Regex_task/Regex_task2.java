package Regex_task;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex_task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] input = {"MSD","SK","VJS","STR","Vijay","Ajith"};
		Pattern p = Pattern.compile("([A-Z]){3}");
		for(String s : input) {
			Matcher m = p.matcher(s);
		
	    while(m.find())
	    {
	      System.out.println(m.group());
	      
	    }
		}
	}

}
