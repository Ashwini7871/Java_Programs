package String_practice_4_jun_23;

import java.util.ArrayList;

public class howManyVowels_charat {
	ArrayList<Character> al;  //constructer
	howManyVowels_charat()  
	{  
	al = new ArrayList<Character>();    
	al.add('A'); al.add('E');  
	al.add('a'); al.add('e');  
	al.add('I'); al.add('O');  
	al.add('i'); al.add('o');  
	al.add('U'); al.add('u');  
	}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating an object of the class CharAtExample6  
		howManyVowels_charat obj = new howManyVowels_charat();  
		  
		String str = "Javatpoint is a great site for learning Java.";    
		  
		int noOfVowel = obj.countVowels(str);  
		  
		System.out.println("String: " + str);  
		  
		System.out.println("Total number of vowels in the string are: "+ noOfVowel + "\n");    
		  
		str = "One apple in a day keeps doctor away.";  
		  
		System.out.println("String: " + str);  
		  
		noOfVowel = obj.countVowels(str);  
		  
		System.out.println("Total number of vowels in the string are: "+ noOfVowel);   
		} 
	
	
	public int countVowels(String s)  
	{  
	int countVowel = 0; // store total number of vowels  
	int size = s.length(); // size of string  
	for(int j = 0; j < size; j++)  
	{  
	char c = s.charAt(j);  
	if(isVowel(c))  
	{  
	// vowel found!  
	// increase the count by 1  
	countVowel = countVowel + 1;  
	}  
	}  
	  
	return countVowel;  
	}    
	
	
	private boolean isVowel(char c)  
	{  
	for(int i = 0; i < al.size(); i++)  
	{  
	if(c == al.get(i))  
	{  
	return true;  
	}  
	}  
	return false;  
	}  

}
