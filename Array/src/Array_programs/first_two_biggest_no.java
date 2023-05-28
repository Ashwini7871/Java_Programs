package Array_programs;

public class first_two_biggest_no {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first_two_biggest_no fd = new first_two_biggest_no();
		int[] marks = {92, -78,-89, -99, -96};
		fd.first_two_highest(marks);
}

	private void first_two_highest(int[] marks) {
		// TODO Auto-generated method stub
		int big =Integer.MIN_VALUE, sbig =Integer.MIN_VALUE; 
	    int i =0; 
	    while(i<marks.length)
	    {
	    if(marks[i]>big)//92>0,78>92false
	    {
	      sbig = big; 
	      big = marks[i]; //92,
	    }
	    else if(marks[i]>sbig)//78>0
	    {
	    sbig = marks[i]; 
	    }
	    i++; 
	    }
	    System.out.println("Biggest is "+big);
	    System.out.println("Second Biggest is "+sbig);
	    
	  }
		

	}

