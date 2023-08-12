package calm.learning;

public class LoopingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopingDemo2 ld = new LoopingDemo2();
//		ld.print_fibo();
//		ld.print_fibo_without_third();
//		ld.print_sqr_root(81);
//		ld.factorial();
		
		

	}

	private void factorial() {
		// TODO Auto-generated method stub
		int no=5;
		int fact=1;
		while(no>0) {
		fact=fact*no;
		no--;
		}
		System.out.println(fact);
		}
		
	

	private void print_sqr_root(int no) {
		// TODO Auto-generated method stub
		int div = 2;
		while(div<no)
		{
			if(no/div==div) {
				System.out.println(div);
				break;
			}
			div++;
		}
		
	}

	private void print_fibo_without_third() {
		// TODO Auto-generated method stub
		int p1 = 0,p2 = 1;
		while(p1<=21) {
			System.out.print(p1+" ");
			p2 = p1 + p2;
			p1 = p2 - p1;
		}
		
	}

	private void print_fibo() {
		// TODO Auto-generated method stub
		int p1 = 0,p2 = 1;
		while(p1<=8) {
			System.out.print(p1 + " ");
			int p3 = p1 + p2;
			p1=p2;
			p2=p3;
		}
		
	}

}
