package LoopingPrac;

public class Loop_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Loop_prac lp = new Loop_prac();
//		lp.count_of_digits();
//		lp.sum_of_digits();
//	    lp.reverse_num();
	}

	private void reverse_num() {
		// TODO Auto-generated method stub
		
	}

	private void sum_of_digits() {
		// TODO Auto-generated method stub
		int no =1234;
		int sum =0;
		while(no>0) {
			sum= sum+(no%10);
			no=no/10;
		 }
		System.out.println(sum);
		
	}

	private void count_of_digits() {
		// TODO Auto-generated method stub
		int no = 1234;
		int count =0;
		while(no>0)
		{
			
			count++;//1,2,3
			no =no/10;
		}
		System.out.println(count);
	}

}
