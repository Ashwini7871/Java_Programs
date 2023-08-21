package pattern_prac;

public class Pattern_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern_40 p = new Pattern_40();
//		p.pattern();
//		p.pattern1();
//		p.pattern2();
//		p.pattern3();
//		p.pattern4();
//		p.pattern5();
//		p.pattern6(); 
//		p.pattern7();
//		p.pattern8();
//		p.pattern9();
//		p.pattern10();
//		p.pattern11();//wrong
//		p.pattern12();
//		p.pattern13();
//		p.pattern14();
//		p.pattern15();
//		p.pattern16();
//		p.pattern17();
//		p.pattern18();
//		p.pattern19();
//		p.pattern20();

		
	}

	

	private void pattern20() {
		// TODO Auto-generated method stub
//		 ex o/p
		/*
		 * E 
		 * E D
		 * E D C
		 * E D C B
		 * E D C B A
		 */
		for(char row='E';row>='A';row--) {
		for(char col='E';col>=row;col--) {
			System.out.print(col+" ");
		}
		System.out.println();
		}
	}

	private void pattern19() {
		// TODO Auto-generated method stub
//		ex o/p
		/*
		 * E D C B A
		 * E D C B
		 * E D C
		 * E D
		 * E
		 */
		for(char row='A';row<='E';row++) {
		
		for(char col='E';col>=row;col--) {
			System.out.print(col+" ");
		}
		System.out.println();
		}
		
	}

	private void pattern18() {
		// TODO Auto-generated method stub
//		ex o/p
		/*
		 * A B C D E
		 * A B C D
		 * A B C
		 * A B
		 * A
		 */
		for(char row='E';row>='A';row--) {
		for(char col ='A';col<=row;col++) {
			System.out.print(col+" ");
		}
		System.out.println();
		}
	}

	private void pattern17() {
		// TODO Auto-generated method stub
//		ex o/p
		/*
		 * 1 
		 * 2   3
		 * 4   5  6
		 * 7   8  9  0
		 * 11 12 13 14 15
		 */
		int no=1;
		for(int row=5;row>=1;row--) {
			for(int col=5;col>=row;col--) {
				System.out.print(no+" ");
				no++;
			}
			System.out.println();
		}
	}

	private void pattern16() {
		// TODO Auto-generated method stub
//		ex o/p 
		/*
		 * 5
		 * 5 4
		 * 5 4 3
		 * 5 4 3 2
		 * 5 4 3 2 1
		 */
		for(int row=5;row>=1;row--) {
		for(int col=5;col>=row;col--) {
			System.out.print(col+" ");
		}
		System.out.println();
		}
	}

	private void pattern15() {
		// TODO Auto-generated method stub
//		ex o/p 
		/*
		 * 5 4 3 2 1
		 * 5 4 3 2
		 * 5 4 3
		 * 5 4
		 * 5
		 */
		for(int row=1;row<=5;row++) {
		for(int col=5;col>=row;col--) {
			System.out.print(col+" ");
		}
		System.out.println();
		}
	}

	private void pattern14() {
		// TODO Auto-generated method stub
//		ex o/p 
		/*
		 * 1 2 3 4 5
		 * 1 2 3 4
		 * 1 2 3
		 * 1 2
		 * 1
		 */
		for(int row=5;row>=1;row--) {
		for(int col=1;col<=row;col++) {
			System.out.print(col+" ");
		}
		System.out.println();
		}
	}

	private void pattern13() {
		// TODO Auto-generated method stub
//		ex o/p
		/*
		 *          A
		 *         B B
		 *        C C C
		 *       D D D D
		 *      E E E E E
		 *     
		 *     * * * * A
		 *     * * * B B
		 *     * * C C C
		 *     * D D D D 
		 *     E E E E E
		 *     
		 */
		for(char row='A';row<='E';row++) {
			for(char space='E';space>row;space--) {
				System.out.print(" ");
			}
			for(char col='A';col<=row;col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

	private void pattern12() {
		// TODO Auto-generated method stub
//		 ex o/p
		/*
		 *         1
		 *        2 2
		 *       3 3 3
		 *      4 4 4 4
		 *     5 5 5 5 5
		 *     
		 *     * * * * 1
		 *     * * * 2 2
		 *     * * 3 3 3
		 *     * 4 4 4 4
		 *     5 5 5 5 5 
		 */
		for(int row=1;row<=5;row++) {
			for(int space=5;space>row;space--) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

	private void pattern11() {
		// TODO Auto-generated method stub
		
//		ex o/p
		/*
		 *           *
		 *         * * *
		 *        * * *
		 *       * * * *
		 *      * * * * *
		 *    
		 */
		for(int row=1;row<=5;row++) {
			for(int space=5;space>row;space--) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

	private void pattern10() {
		// TODO Auto-generated method stub
//		ex o/p
		/*
		 *          E
		 *         D E
		 *        C D E
		 *       B C D E
		 *      A B C D E
		 *      
		 *      
		 */
		int alpha=64;// A
		
      for(int row=5;row>=1;row--) {
			
			for(int space=1;space<row;space++) {
				System.out.print("*");
			}
			for(int col=row;col<=5;col++) {
				System.out.print((char)(alpha+col)+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern9() {
		// TODO Auto-generated method stub
//		ex o/p
		/*
		 *          A
		 *         A B
		 *        A B C
		 *       A B C D
		 *      A B C D E
		 *      
		 *      * * * * A
		 *      * * * A B
		 *      * * A B C
		 *      * A B C D
		 *      A B C D E
		 *      
		 */
		for(char row='A';row<='E';row++) {
			for(char space ='E';space>row;space--) {
				System.out.print(" ");
			}
			for(char col='A';col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern8() {
		// TODO Auto-generated method stub
//		ex o/p    
		/*
		 *         5
		 *        4 5
		 *       3 4 5
		 *      2 3 4 5
		 *     1 2 3 4 5 
		 *     
		 *         
		 *     * * * * 5
		 *     * * * 4 5
		 *     * * 3 4 5
		 *     * 2 3 4 5
		 *     1 2 3 4 5 
		 *     
		 */
          
		/*for(int row=5;row>=1;row--) {
			for(int space=1;space<row;space++) {
				System.out.print("*");
			}
			for(int col=5;col>=row;col-- ) {
				System.out.print(col+" ");
			}
			System.out.println();
		}*/
		for(int row=5;row>=1;row--) {
			
			for(int space=1;space<row;space++) {
				System.out.print("*");
			}
			for(int col=row;col<=5;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	
	}

	private void pattern7() {
		// TODO Auto-generated method stub
//		ex o/p  
		/*
		 *         1
		 *        1 2
		 *       1 2 3 
		 *      1 2 3 4
		 *     1 2 3 4 5
		 *     
		 *     * * * * 1
		 *     * * * 1 2
		 *     * * 1 2 3
		 *     * 1 2 3 4
		 *     1 2 3 4 5 
		 */
		for(int row=1;row<=5;row++) {
			for(int space=5;space>row;space--) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		
	}

	private void pattern6() {
		// TODO Auto-generated method stub
//		ex o/p
		/*
		 *         *
		 *       * *
		 *     * * *
		 *   * * * *
		 * * * * * *
		 */
		
		for(int row=1;row<=5;row++) {
			for(int space=5;space>row;space--) {
				System.out.print(" "+" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("*"+" ");
//				System.out.print(" ");
			}
			System.out.println();
		}
		/* int rows = 5;
		  
		  for (int i = 1; i <= rows; i++) 
		               { 
		                        for (int j = rows; j > i; j--)
		   {
		    System.out.print(" ");
		   }

		   for (int k = 1; k <= i; k++)
		   {
		    System.out.print("* ");
		   }
		   System.out.println();
		  }*/
		/*for(int row = 1;row<=5;row++)
	    {
	      for(int col1 = 5;col1>row;col1--)
	      {
	        System.out.print(" "+" ");
	      }
	      for(int col2 = 1;col2<=row;col2++)
	      {
	        System.out.print("*"+" ");
	      }
	      System.out.println();
	    }*/
	}

	private void pattern5() {
		// TODO Auto-generated method stub
		
//		ex o/p 
		/*
		 * A 
		 * B B
		 * C C C
		 * D D D D
		 * E E E E E
		 */
		for(char row='A';row<='E';row++) {
			for(char col='A';col<=row;col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

	private void pattern4() {
		// TODO Auto-generated method stub
//		ex o/p
		/*
		 *  1 
		 *  2 2
		 *  3 3 3
		 *  4 4 4 4
		 *  5 5 5 5 5
		 */
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

	private void pattern3() {
		// TODO Auto-generated method stub
//		ex o/p 
		/*
		 *   *
		 *   * *
		 *   * * *
		 *   * * * *
		 *   * * * * *
		 */
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private void pattern2() {
		// TODO Auto-generated method stub
		
//		ex o/p 
		/*
		 * A
		 * A B
		 * A B C
		 * A B C D
		 * A B C D E
		 */
		for(char row ='A';row<='E';row++) {
			for(char col='A';col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void pattern() {
		// TODO Auto-generated method stub
//		ex o/p    
		/*
		 *   1 2 3 4 5
		 *    1 2 3 4
		 *     1 2 3 
		 *      1 2
		 *       1
		 *   1 2 3 4 5
		 *   * 1 2 3 4
		 *   * * 1 2 3
		 *   * * * 1 2
		 *   * * * * 1    
		 */
		 for(int row=5;row>=1;row--) {
			 
			 for(int space=5;space>row;space--) {
				 System.out.print(" ");
			 }
			 for(int col=1;col<=row;col++) {
					System.out.print(" "+col);
				}
			 System.out.println();
		 }
		
		
		
		
	}

	private void pattern1() {
		// TODO Auto-generated method stub
//		ex o/p
		/*
		 *   1
		 *   1 2 
		 *   1 2 3
		 *   1 2 3 4 
		 *   1 2 3 4 5
		 */
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}

}
