package Array_programs;

public class find_biggest_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find_biggest_no fb = new find_biggest_no();
		fb.biggest_no();
	}

	private void biggest_no() 
	{
		// TODO Auto-generated method stub
		
		int[] marks= {10,-78,99,-99,92};
		int highest=marks[0];
		int smallest = marks[0];
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>highest) {
				highest=marks[i];
			}
			if(marks[i]<smallest) {
				smallest=marks[i];
			}
			i++;
		}
		System.out.println("Highest values is : "+highest);
		System.out.println("smallest value is :"+smallest);
	}
	

}

