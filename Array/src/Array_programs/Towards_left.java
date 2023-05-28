package Array_programs;

public class Towards_left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Towards_left tl = new Towards_left();
		
		int[] ar= {10,20,30,40,50};
//				   20,30,40,50,10
		
//		tl.Moving_All_Element_Towards_Left(ar);
		tl.Moving_All_Element_Towards_Left_Twice(ar);
	}

	private void Moving_All_Element_Towards_Left_Twice(int[] ar) {
		// TODO Auto-generated method stub
		for(int j=0;j<2;j++) {
			
			int i=0;
			int temp = ar[i];
			for(;i<ar.length-1;i++) {
				ar[i]=ar[i+1];
				System.out.print(ar[i]+" ");
			}
			ar[i]=temp;
			System.out.println(ar[i]+" ");
			
			
			}
		
	}

	private void Moving_All_Element_Towards_Left(int[] ar) {
		// TODO Auto-generated method stub
		
		int i=0;
		int temp=ar[i];//0th valueis 10;
		while(i<ar.length-1) {
			ar[i]=ar[i+1];
			System.out.print(ar[i]+" ");
			i++;
		}
		ar[i]=temp;
		System.out.print(ar[i]+" ");
		
	}

}
