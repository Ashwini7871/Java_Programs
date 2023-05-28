package Array_programs;

public class find_odd_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find_odd_index fi = new find_odd_index();
		fi.find_odd_index_array();
		
	}

	private void find_odd_index_array() {
		// TODO Auto-generated method stub
		int []a= {10,20,30,40,50,60};
		int oddindex =a.length/2;
		int[]b=new int[oddindex];
		int j=0;
		for(int i=1;i<a.length;i+=2) { //1<6 1+2=3<6 5<6 
			b[j]=a[i];//b[0] =22,b[1]=44,b[2]=66
			j++;
		}
		System.out.println("Printing Odd index");
		for(int k=0;k<b.length;k++) {
			System.out.print(b[k]+" ");
		}
		
		
		
		
		
	}

}
