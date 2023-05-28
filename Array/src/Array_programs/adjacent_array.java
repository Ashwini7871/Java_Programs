package Array_programs;

public class adjacent_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adjacent_array a = new adjacent_array();
		int[] arr= {10,20,30,40};
		a.adjacent_two_arrays(arr);
		
	}

	private void adjacent_two_arrays(int[]arr) {
		// TODO Auto-generated method stub
	    int fn=arr[0];// 10 
	    int sn=arr[3];// 40
	    for(int i=fn;i<=sn;i++)//
	    {
//	    	if(fn<sn) {
	      System.out.println(fn);
	      fn++;
	    }
	}
}
