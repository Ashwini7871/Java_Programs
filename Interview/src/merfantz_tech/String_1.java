package merfantz_tech;

public class String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         /*
          * 2)  remove extra space given string
              example:
                 Payilagam       is       a   training center

                      Sample output:
                           Payilagam is a training center
                           
                           
                           
                          * Remove Spaces from this input without using trim ().
          */
		
		   String in= "    Payilagam       is       a   training center";
		   String out=in.replaceAll("\\s+"," "); 
		System.out.println(out);
		
		   //--------------------------//
//		String[] a=in.split(" ");
//		for (String string : a) {
//			System.out.println(string);
//		}
	}

}
