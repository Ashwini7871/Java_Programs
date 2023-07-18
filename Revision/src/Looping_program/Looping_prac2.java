package Looping_program;

public class Looping_prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping_prac2 lp = new Looping_prac2();
		lp.divisor_of_no();//50
		
	}

	private void divisor_of_no() {
		// TODO Auto-generated method stub
		int no=50;
		int div =2;
		int count=0;
		while(div<=50) {
			if(no%div==0) {
				System.out.println(div+" ");
				count++;
			}
			div++;
			
		}
		System.out.println("the count of div is :"+count);
	}

}
