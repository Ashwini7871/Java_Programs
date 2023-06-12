package patterns_program;

public class pattern_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern_practice pp = new pattern_practice();
//		pp.pattern1();
//		pp.pattern2();
//		pp.pattern3();
//		pp.pattern4();
//		pp.pattern5i();
//		pp.pattern5ii();
//		pp.pattern6();
//		pp.pattern7i();
//		pp.pattern7ii();
//		pp.pattern8i();
//		pp.pattern8ii();
//		pp.pattern8iii();
//		pp.pattern9();
		
	}

	private void pattern9() {
		/*TODO Auto-generated method stub
		 * 1   2   3   4   5
	6   7   8   9   10
	11  12  13  14  15
		 */
		for(int col=1;col<=15;col++) {
			System.out.print(col+" ");
			if(col%5==0) {
				System.out.println();
			}
		}
		
	}

	private void pattern8iii() {
		/* TODO Auto-generated method stub
		 * pattern_7()
	*   *   *   *   *
	*   *   *   *
	*   *   *
	*   *
	*
		 */
		int num=15;
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print("*"+" ");
				num--;
			}
			System.out.println();
		}
	}

	private void pattern8ii() {
		/* TODO Auto-generated method stub
		 * pattern_6()
	15  14  13  12  11
	10  9   8   7
	6   5   4
	3   2
	1

		 */
		int num=15;
	for(int row=5;row>=1;row--) {
		for(int col=1;col<=row;col++) {
			System.out.print(num+" ");
			num--;
		}
		System.out.println();
	}
	}

	private void pattern8i() {
		/* TODO Auto-generated method stub
		 * pattern_5()
	1   2   3   4   5   
	6   7   8   9
	10  11  12
	13  14
	15
		 */
		int num=1;
	for(int row=5;row>=1;row--) {
		 for(int col=1;col<=row;col++) {
			 System.out.print(num+" ");
			 num++;
		 }
		 System.out.println();
	      
	}
	}
	

	private void pattern7ii() {
		/* TODO Auto-generated method stub
		 * pattern_4()
		5   4   3   2   1
		4   3   2   1
		3   2   1
		2   1
		1
		 */
	for(int row=5;row>=1;row--) {
		for(int col=row;col>=1;col--) {
			System.out.print(col+" ");
		}
		System.out.println();
		
	}
	}

	private void pattern7i() {
		/* TODO Auto-generated method stub
		 * pattern_3()
	1   2   3   4   5
	2   3   4   5
	3   4   5
	4   5
	5
		 */
//		int rows =5;
	for(int row=1;row<=5;row++) {
		for(int col=row;col<=5;col++) {
			System.out.print(col+" ");
		}
		System.out.println();
	}
	}

	private void pattern6() {
		/* TODO Auto-generated method stub
		 * pattern 2()
		5   4   3   2   1
		5   4   3   2
		5   4   3
		5   4
		5
		 */
	for(int row=1;row<=5;row++) {
		for(int col=5;col>=row;col--) {
			System.out.print(col+" ");
			
		}
	System.out.println();
		
	}
	}

	private void pattern5ii() {
		// TODO Auto-generated method stub
        
for(int line=1;line<=5;line++) {


for(int i=1;i<=line;i++)
{
	System.out.print(i+" ");
}
System.out.println();

}
}
		
	

	private void pattern5i() {
		// TODO Auto-generated method stub
//		expect o/p: 1 2 3 4 5
//		            1 2 3 4
//		            1 2 3
//		            1 2 
//		            1
	for(int line=5;line>=1;line--) {

		
		for(int i=1;i<=line;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
	}

	private void pattern4() {
		// TODO Auto-generated method stub
//		exp o/p:1 2 3 4 5 
//		        6 7 8 9 10
//		        11 12 13 14 15 
//		        16 17 18 19 20
		
		
		for(int i=1;i<=20;i++) {
			System.out.print(i+" ");
			if(i%5==0) {
				System.out.println();
			}
		}
		
	}

	private void pattern3() {
		// TODO Auto-generated method stub
//		expect o/p :1 3 5 7 9
//		            1 3 5 7 9
//		            1 3 5 7 9
	for(int count=0;count<=2;count++) {
		
		
		for(int no=1;no<10;no+=2)
		{
			System.out.print(no+" ");
		}
		System.out.println();
		
	}
	}

	private void pattern2() {
		// TODO Auto-generated method stub
		//expecto/p:5 4 3 2 1
		        //  5 4 3 2 1 
		for(int count=1;count<=2;count++) {
		
		for(int i=5;i>0;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	}

	private void pattern1() {
		// TODO Auto-generated method stub
		//expect out;1 2 3 4 5 
		           //1 2 3 4 5
	for(int count=1;count<=2;count++) {	
		
	for(int i=1;i<=5;i++) 
	{
		System.out.print(i+" ");
	}
		
		System.out.println();
	}
	}

}
