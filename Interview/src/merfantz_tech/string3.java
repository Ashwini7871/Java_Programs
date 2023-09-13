package merfantz_tech;

public class string3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *       4. How can you break this statement without using break after printed 5.
 */
		 /*boolean shouldBreak = false;

	        for (int i = 1; i <= 10; i++) {
	            System.out.println(i);

	            if (i == 5) {
	                shouldBreak = true;
	            }

	            if (shouldBreak) {
	                break;
	            }
	        }*/
		for (int i = 1; i <= 10; i++) {
		    System.out.println(i);
		    if (i == 5) {
		        i=11; // This will exit the entire method or block containing the loop.
		    }
		}
		
	}

}
