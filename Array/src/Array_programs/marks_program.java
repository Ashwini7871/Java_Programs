package Array_programs;

public class marks_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marks_program mp = new marks_program();
		mp.find_high_lowest();
	}

	private void find_high_lowest() {
		// TODO Auto-generated method stub
		int[] marks = {96, 78, 89, 99, 92}; 
		String[] sub = {"Tamil", "English", "Maths", "Science",
		        "Social"}; 
		int index_h = 0; 
		int index_l =0; 
		int highest = marks[0]; //highest = 96
		int lowest = marks[0];
		int i=1; 
		while(i<marks.length)
		{
		  if(marks[i]>highest)
		  {
		    highest = marks[i];
		    index_h = i; 
		  }
		  if(marks[i]<lowest)
		  {
		    lowest = marks[i];
		    index_l = i; 
		  }
		  i++;
		}

		System.out.println("Highest mark is "+ highest + " from "+ sub[index_h]);
		System.out.println("Lowest mark is "+ lowest + " from "+ sub[index_l]);
		
	}

}
