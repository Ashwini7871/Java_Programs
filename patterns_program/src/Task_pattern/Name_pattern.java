package Task_pattern;

public class Name_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name_pattern np = new Name_pattern();
//		np.print_A();
		System.out.println();
//		np.print_S();
		System.out.println();
//		np.print_H();
		System.out.println();
		np.print_W();//pending
		System.out.println();
//		np.print_I();
		System.out.println();
//		np.print_N();
		System.out.println();
//		np.print_I();
	}

	private void print_N() {
		// TODO Auto-generated method stub
		int no1=0,no2=0;
		for(int row=1;row<=9;row++) {
		for(int col=1;col<=9;col++) {
			if(col==1 || col==9 || (col==no1) && row<=9)
			{
			System.out.print("* ");}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
		if(row==1) {
			no1=1;
		}
		no1++;
		}
		System.out.println();

	}

	private void print_I() {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			System.out.print("* ");
		}
		System.out.println();
		for(int i=1;i<=9;i++) {
			
			for(int sp=1;sp<=4;sp++) {
				System.out.print("  ");
				
			}
			System.out.println("* ");
		}
		for(int i=1;i<=9;i++) {
			System.out.print("* ");
		}
		System.out.println();
	}

	private void print_W() {
		// TODO Auto-generated method stub
		for(int row=1;row<=4;row++)
		{
			if(row<=5)
			{
			for(int col=1;col<=8;col++)
			{
				if((col==1)||(col==8)&& (row<=4))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
				System.out.println();
			}
		}
		int no=4,no2=5;
			
			for(int row=5;row<=8;row++)
			{
				for(int col=1;col<=8;col++)
				{
					if((col==1)||(col==8)||(col==no )||( col==no2))
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
				no--;
					no2++;
					}
		
	}

	private void print_H() {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			System.out.print("* ");
			for(int sp=1;sp<=7;sp++) {
				System.out.print("  ");
			}
			System.out.println("* ");
		}
		for(int j=1;j<=9;j++) {
			System.out.print("* ");
		}
		System.out.println();
		for(int i=1;i<=9;i++) {
			System.out.print("* ");
			for(int sp=1;sp<=7;sp++) {
				System.out.print("  ");
			}
			System.out.println("* ");
		}
		System.out.println();
	}

	private void print_S() {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			if(i==1) {
				System.out.print(" ");
			}else {
			System.out.print("* ");}
		}
		System.out.println();
		for(int j=1;j<=9;j++) {
			System.out.println("* ");
		}
		for(int i=1;i<=9;i++) {
			if(i==1) {
				System.out.print(" ");
			}
			else {
			System.out.print("* ");
			}
		}
		System.out.println();
		for(int j=1;j<=9;j++) {
//			System.out.print("* ");
			for(int space=1;space<=8;space++) {
				System.out.print("  ");
			}
			System.out.println("* ");
		}
		for(int i=1;i<=9;i++) {
			if(i==9) {
				System.out.print("  ");
			}else {
			System.out.print("* ");
			}
		}
		System.out.println();
	}

	private void print_A() {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			if(i==1) {
				System.out.print(" ");
			}
			else {
			System.out.print("* ");
			}
		}
		System.out.println();
		for(int j=1;j<=9;j++) {
			System.out.print("* ");
			for(int space=1;space<=7;space++) {
				System.out.print("  ");
			}
			System.out.println("* ");
		}
		for(int i=1;i<=9;i++) {
			System.out.print("* ");
		}
		System.out.println();
		for(int j=1;j<=9;j++) {
			System.out.print("* ");
			for(int space=1;space<=7;space++) {
				System.out.print("  ");
			}
			System.out.println("* ");
		}
		System.out.println();
	}

}
