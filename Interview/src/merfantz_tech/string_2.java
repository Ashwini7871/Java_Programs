package merfantz_tech;

public class string_2 {
	public static void main(String[] args) {
		
	
/*
 * 3. How can we count length of a string without using length().
 */
	
	String s= "ashwini";
//	System.out.println(s.length());
	int count=0;
	char []a=s.toCharArray();
      for (char c : a) 
      {
	count++;
            }
	System.out.println(count);
		
}
}