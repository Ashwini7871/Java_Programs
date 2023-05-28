package Array_programs;

public class find_smallest_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find_smallest_no fs = new find_smallest_no();
		fs.find_smallest();
	}

	private void find_smallest() {
		// TODO Auto-generated method stub
		int marks[]= {10,-30,-35,68,99};
		int smallest= marks[0];
		int i=0;
		while(i<marks.length)
		{
			if(marks[i]<smallest) {
				smallest=marks[i];
			}
			i++;
		}
		System.out.println("smallest number is "+smallest);
	}

}
