package patterns_program;

public class patterns_21_05_23 {
	/*21/05/2023
	   * pattern 1 :
	   1
	   2  3
	   4  5  6
	   7  8  9  10
	   11 12 13 14 15
	   * pattern 2 :
	   1
	   2 2
	   3 3 3
	   4 4 4 4
	   5 5 5 5 5
	   * pattern 3:
	   5
	   4 4
	   3 3 3
	   2 2 2 2
	   1 1 1 1 1
	   * pattern 4:
	   5
	   5 4
	   5 4 3
	   5 4 3 2
	   5 4 3 2 1
	   * pattern 5 :
	   15
	   14 13
	   12 11 10
	   9  8  7  6
	   5  4  3  2  1
	   ------------------------
	   1 0 1 0 1
	   1 0 1 0
	   1 0 1
	   1 0
	   1
	_______
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5
	   _______
	   * pattern 6 :
	               1
	             1 2
	           1 2 3
	         1 2 3 4
	       1 2 3 4 5
	     * pattern 7:
	              1
	           2  3
	        4  5  6
	     7  8  9 10
	 11 12 13 14 15
	     * pattern 8 :
	             5
	           5 4
	         5 4 3
	       5 4 3 2
	     5 4 3 2 1
	     * pattern 9:
	             5
	           4 4
	         3 3 3
	       2 2 2 2
	     1 1 1 1 1
	     * pattern 10 :
	             1
	           1 1
	         1 1 1
	       1 1 1 1
	     1 1 1 1 1
	   */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			patterns_21_05_23 p =new patterns_21_05_23();
			p.pattern1();
//			p.pattern2();
//			p.pattern3();
//			p.pattern4();
//			p.pattern5();
//			p.pattern5i();
//			p.pattern5ii();
//			p.pattern6();//
//			p.pattern7();
//			p.pattern8();//pending
//			p.pattern9();
//			p.pattern10();
			
			
	}

	private void pattern10() {
		/* TODO Auto-generated method stub
		 *       1
	           1 1
	         1 1 1
	       1 1 1 1
	     1 1 1 1 1
		 */
		for(int row=5;row>=1;row--) {
			for(int col=1;col<row;col++) {
				System.out.print("  ");
			}
			for(int i=1;i<=6-row;i++) {
				System.out.print(1+" ");
			}	
			System.out.println();
			
		}
		
	}

	private void pattern9() {
		/*TODO Auto-generated method stub
		 *       5
	           4 4
	         3 3 3
	       2 2 2 2
	     1 1 1 1 1
		 */
	for(int row=5;row>=1;row--) {
		for(int col=1;col<row;col++) {
			System.out.print("  ");
		}
		for(int i=1;i<=6-row;i++) {
			System.out.print(row+" ");
		}	
		System.out.println();
		
	}
	}
	

	private void pattern8() {
		/* TODO Auto-generated method stub
		 *       5
	           5 4
	         5 4 3
	       5 4 3 2
	     5 4 3 2 1

		 */
		for(int row=5;row>=1;row--) {
		for(int star=1;star<row;star++) {
			System.out.print("  ");
		}
		for(int col=5;col>=row;col--) {
			System.out.print(col+" ");}
		System.out.println();
		}
		
		
	}
		

	private void pattern7() {
		/* TODO Auto-generated method stub
		 *        1
	           2  3
	        4  5  6
	     7  8  9 10
	 11 12 13 14 15
		 */int num=1;
		for(int row=5;row>=1;row--) {
			int col=1;
		for(;col<row;col++) {
			System.out.print("  ");
			
		}
		for(int i=1;i<=6-row;i++)
		{
		System.out.print(num+" ");
		num++;
		}
		System.out.println();
	}
		
	}

	private void pattern6() {
		/* TODO Auto-generated method stub
		 *  	   1
	             1 2
	           1 2 3
	         1 2 3 4
	       1 2 3 4 5
		 */
		
		for(int row=5;row>=1;row--) {
			int col=1;
		for(;col<row;col++) {
			System.out.print("  ");
			
		}
		for(int i=1;i<=6-row;i++)
		{
		System.out.print(i+" ");
		}
		System.out.println();
	}
	}

	private void pattern5ii() {
		/* TODO Auto-generated method stub
		 *  1 
			1 2 
			1 2 3 
			1 2 3 4 
			1 2 3 4 5
		 */
		for(int row=1;row<=5;row++) {
		for(int col=1;col<=row;col++) {
			System.out.print(col+" ");
		}
		System.out.println();
	}
}

	private void pattern5i() {
		/* TODO Auto-generated method stub
	   1 0 1 0 1
	   1 0 1 0
	   1 0 1
	   1 0
	   1
		 */
		for(int row=5;row>=1;row--) {
		 for(int col=1;col<=row;col++) {
			 if(col%2!=0) {
			 System.out.print(1+" ");
			 }
			 else {
				 System.out.print(0+" ");
			 }
		 }
		 System.out.println();
		}
		
		
	}

	private void pattern5() {
		/* TODO Auto-generated method stub
		 * pattern 5 :
	   15
	   14 13
	   12 11 10
	   9  8  7  6
	   5  4  3  2  1
		 */
		int num=15;
		for(int row=1;row<=5;row++ ) {
			for(int col=1;col<=row;col++) {
				System.out.print(num+"\t");
				num--;
			}
			System.out.println();
		}
		
	}

	private void pattern4() {
		/*TODO Auto-generated method stub
		 *  pattern 4:
	   5
	   5 4
	   5 4 3
	   5 4 3 2
	   5 4 3 2 1
		 */
		
		for(int row=5;row>=1;row--) {
			for(int col=5;col>=row;col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		
		
	}

	private void pattern3() {
		/*TODO Auto-generated method stub
		 * pattern 3:
	   5
	   4 4
	   3 3 3
	   2 2 2 2
	   1 1 1 1 1
		 */
	for(int row=5;row>=1;row--) {	
		for(int col=row;col<=5;col++) {
			System.out.print(row+" ");
		}
		System.out.println();
		
		 
		
	}
	}
	private void pattern2() {
		/* TODO Auto-generated method stub
		 * pattern 2 :
	   1
	   2 2
	   3 3 3
	   4 4 4 4
	   5 5 5 5 5
		 */
	for(int row=1;row<=5;row++) {
		 for(int col=1;col<=row;col++) {
			 System.out.print(row+" ");
		 }
		System.out.println();
	}
	}

	private void pattern1() {
		/* TODO Auto-generated method stub
		pattern 1 :
			   1
			   2  3
			   4  5  6
			   7  8  9  10
			   11 12 13 14 15*/
		int num=1;
	for(int row=1;row<=5;row++) {
		for(int col=1;col<=row;col++) {
			System.out.print(num+" \t");
			num++;
		}
		System.out.println();
	}
	}

}
