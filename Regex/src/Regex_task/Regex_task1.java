package Regex_task;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex_task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s =" ";
         String input ="Sunday Is Holiday";
         Pattern p = Pattern.compile(s);// - 
		String[] arr =p.split(input);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
         /*String output1 =input.replaceAll("\\s", "");
         System.out.println(output1);*/
		System.out.println();
//		String input = "SundayIsHoliday";
		String output = input.replaceAll("([a-z])([A-Z])", "$1 $2");
		System.out.println(output);		
	}
	

}
