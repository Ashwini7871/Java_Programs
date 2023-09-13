package merfantz_tech;

public class rmv_all_accurance {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "geeksforgeeks";
        char ch = 'e';
        System.out.println(removechar(word, ch));
	}

	    public static String removechar(String word, char ch)
    {
        StringBuilder s = new StringBuilder(word);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                s.deleteCharAt(i);
               
                i--;
            }
        }
 
        return s.toString();
    }
}
