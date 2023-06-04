package calm.learning;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "Ashwini";
        findVowels(str);
	}

	private static void findVowels(String str) {
		// TODO Auto-generated method stub
        // Convert the string to lowercase to simplify vowel checking
        str = str.toLowerCase();

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e'||  ch == 'i'||  ch == 'o'||  ch == 'u') {
                System.out.println(ch);
            }
        }
	}   
	}
