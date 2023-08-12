package Looping_program;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathClass mc = new MathClass();
//		mc.find_power(4,4);
//		mc.print_1_8_27_64();
//		mc.print_squares();
//		mc.print_1_4_27_256();
	}

	private void print_1_4_27_256() {
		// TODO Auto-generated method stub
		//concept: 1 2^2 3^3 4^4
		int no=1;
		while(no<=5) {
			System.out.print((int)Math.pow(no, no)+" ");
			no++;
		}
		
	}

	private void print_squares() {
		// TODO Auto-generated method stub
		//o/p: 1 4 9 16 25 36 49 64 81 100
		int no=1;
		while(no<=10) {
			System.out.print((int)Math.pow(no, 2)+" ");
			no++;
		}
	}

	private void print_1_8_27_64() {
		// TODO Auto-generated method stub
		//concept 1 2^3 3^3 4^3
		int no=1;
		while(no<=5) {
			System.out.print((int)Math.pow(no, 3)+" ");
			no++;
		}
		
	}

	private void find_power(int base,int power) {
		// TODO Auto-generated method stub
		System.out.println((int)Math.pow(base, power));
	}

}
