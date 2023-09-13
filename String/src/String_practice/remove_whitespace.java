package String_practice;

public class remove_whitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "   Remove   Spaces   ";
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
		    char c = input.charAt(i);
		    if (c != ' ') {
		        result.append(c);
		    }
		}
		System.out.println(result.toString()); // Output: "RemoveSpaces"

	}

}
