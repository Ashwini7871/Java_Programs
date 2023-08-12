
public class Paterns_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paterns_practice pp = new Paterns_practice();
		pp.pattern1();
		
		
	}

	private void pattern1() {
		// TODO Auto-generated method stub
//		ex o/p:  
		       /* 1
		          1 2
		          1 2 3
		          1 2 3 4
		          1 2 3 4 5*/
		for(int row=1;row<=5;row++) {
		for(int col=row;col<=5;col++ )
		{
			System.out.println(col);
		}
		System.out.println();
		}
	}

}
