package LoopDemo;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fibonacci_series fs = new Fibonacci_series();
		fs.print_fibonacci();//with third variable
		
	}

	private void print_fibonacci() {
		// TODO Auto-generated method stub
		int p1=0,p2=1;
		while(p1<=8) {
			System.out.println(p1);
			int p3=p1+p2;//1
			p1=p2;
			p2=p3;
		}
		
		
		
	}

}
