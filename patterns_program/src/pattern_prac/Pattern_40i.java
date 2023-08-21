package pattern_prac;

public class Pattern_40i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern_40i p = new Pattern_40i();
//		p.pattern21();
//		p.pattern22(); 
//		p.pattern23();
//		p.pattern24();
//		p.pattern25();
		
		/**
		 * ## Printing the pattern26 ##
              * 
              * * 
              * * * 
              * * * * 
              * * * * * 
              * * * * 
              * * *  
              * *   
              *
		 */
//		p.pattern26();
		
		/**
		 * ## Printing the pattern27 ##
		 			* 
        		  * * 
      			* * * 
    	      * * * * 
    		* * * * * 
    		  * * * * 
    		  	* * * 
    		  	  * * 
    		  	    *
		 */
//		p.pattern27();
		
		/**
		 * ## Printing the pattern28 ##
		 1 2 3 4 5 
		 1 2 3 4 
		 1 2 3 
		 1 2 
		 1 
		 1 2 
		 1 2 3 
		 1 2 3 4 
		 1 2 3 4 5
		 */
//		p.pattern28();
		
		/**
		 * ## Printing the pattern29 ##
		 5 4 3 2 1 
		 4 3 2 1 
		 3 2 1 
		 2 1 
		 1 
		 2 1 
		 3 2 1 
		 4 3 2 1 
		 5 4 3 2 1
		 */
//		p.pattern29();
		
		/**
		 * ## Printing the pattern30 ##
		 A B C D E 
		 A B C D 
		 A B C 
		 A B 
		 A 
		 A B 
		 A B C 
		 A B C D 
		 A B C D E
		 */
//		p.pattern30();
		
		/*## Printing the pattern31 ##
		E D C B A 
		D C B A 
		C B A 
		B A 
		A 
		B A 
		C B A 
		D C B A 
		E D C B A
				 */
//				p.Pattern31();
				
				/**
				 * 
		## Printing the pattern32 ##
		* * * * * 
		* * * * 
		* * * 
		* * 
		* 
		* * 
		* * * 
		* * * * 
		* * * * * 
				 */
//				p.pattern32();

				/**
				 * 
		## Printing the pattern33 ##
		        1 
		      1 2 1 
		    1 2 3 2 1 
		  1 2 3 4 3 2 1 
		1 2 3 4 5 4 3 2 1
				 */
//				p.pattern33();
				
				/**
				 * 
		## Printing the pattern34 ##
		        A 
		      A B A 
		    A B C B A 
		  A B C D C B A 
		A B C D E D C B A 
				 */
//				p.pattern34();
				
				/**
				 * 
		## Printing the pattern35 ##
		1 0 0 0 0 
		0 2 0 0 0 
		0 0 3 0 0 
		0 0 0 4 0 
		0 0 0 0 5
				 */
//				p.pattern35();
				
				/**
				 * 
		## Printing the pattern36 ##
		1 1 1 1 1 
		1 1 1 2 2 
		1 1 3 3 3 
		1 4 4 4 4 
		5 5 5 5 5 
				 */
//	p.pattern36();
				
				/**
				 *
		## Printing the pattern37 ##
		A A A A A 
		A A A B B 
		A A C C C 
		A D D D D 
		E E E E E
				 */
//		p.pattern37();
				
				/**
				 * 
		## Printing the pattern38 ##
		    1 
		   1 2 
		  1 2 3 
		 1 2 3 4 
		1 2 3 4 5 
		 1 2 3 4 
		  1 2 3 
		   1 2 
		    1
				 */
//				p.pattern38();
				
				/**
				 * 
		## Printing the pattern39 ##
		     A 
		    A B 
		   A B C 
		  A B C D 
		 A B C D E 
		  A B C D 
		   A B C 
		    A B 
		     A
				 */
//				p.pattern39();
				
				/**
				 * 
		## Printing the pattern40 ##
		    *
		   ***
		  *****
		 *******
		*********
		 *******
		  *****
		   ***
		    *
				 */
				p.pattern40();
//p.pattern41();
//		p.pattern42();
//		
		/*
	    1
      1 2 3 
    1 2 3 4 5 
  1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 9 
  1 2 3 4 5 6 7 
    1 2 3 4 5 
      1 2 3 
        1 

		 */
		
		
	}
	private void pattern42() {
		// TODO Auto-generated method stub
		
		/*
	    1
      1 2 3 
    1 2 3 4 5 
  1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 9 
  1 2 3 4 5 6 7 
    1 2 3 4 5 
      1 2 3 
        1 

		 */
		
		for(int row=1;row<=5;row++) {
			for(int space=5;space>row;space--) 
			{
				System.out.print("  ");
			}
			for(int col=1;col<=(row*2)-1;col++) {
				System.out.print(col+" ");
			}
			
		
			System.out.println();
		}
		for(int row=4;row>=1;row--) {
			for(int space=5;space>row;space--) {
				System.out.print("  ");
			}
			for(int col=1;col<=(row*2)-1;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	private void pattern41() {
		// TODO Auto-generated method stub
		/*
		 *                 
           1 
         1 2 3
       1 2 3 4 5
     1 2 3 4 5 6 7
   1 2 3 4 5 6 7 8 9
		 */ 
		for(int row=1;row<=5;row++) {
			for(int space=5;space>row;space--) 
			{
				System.out.print("  ");
			}
			for(int col=1;col<=(row*2)-1;col++) 
			// 1<=(1*2)-1=>1<=1,2<=1 X
//			   1<=(2*2)-1=> 1<=3,
//				1<=(3*2)-1=>1<=5;
//				1<=(4*2)-1=>1<=7
//				1<=(5*2)-1=>1<=9:
				
			{
				System.out.print(col+" ");
			}
		
			System.out.println();
		}
		

	}
	private void pattern40() {
		// TODO Auto-generated method stub
		/**
		 * 
## Printing the pattern40 ##
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
           1 
         1 2 3
       1 2 3 4 5
     1 2 3 4 5 6 7
   1 2 3 4 5 6 7 8 9
		 */
		for(int row=1;row<=5;row++) {
			for(int space=5;space>row;space--) 
			{
				System.out.print(" ");
			}
			for(int col=1;col<=(row*2)-1;col++) {
				System.out.print("*");
			}
			
		
			System.out.println();
		}
		for(int row=4;row>=1;row--) {
			for(int space=5;space>row;space--) {
				System.out.print(" ");
			}
			for(int col=1;col<=(row*2)-1;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
	private void pattern34() {
		// TODO Auto-generated method stub
		/**
		 * 
## Printing the pattern34 ##
        A 
      A B A 
    A B C B A 
  A B C D C B A 
A B C D E D C B A 
		 */
		int alpha=64;
		for(int row=1;row<=5;row++) {
			for(int space=5;space>row;space--) {
				System.out.print("  ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print((char)(alpha+col)+" ");
			}
			for(int rows=row-1;rows>=1;rows--) {
				System.out.print((char)(alpha+rows)+" ");
			}
			System.out.println();
		}
	}
	private void pattern39() {
		// TODO Auto-generated method stub
		/**
		 * 
## Printing the pattern39 ##
     A 
    A B 
   A B C 
  A B C D 
 A B C D E 
  A B C D 
   A B C 
    A B 
     A
		 */
		
		int alpha=64;
		for(int row=1;row<=5;row++) {
			for(int space=5;space>row;space--) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print((char)(alpha+col)+" ");
			}
			System.out.println();
		}
		for(int row=4;row>=1;row--) {
			for(int space=5;space>row;space--) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print((char)(alpha+col)+" ");
			}
			System.out.println();
		}
	}
	private void pattern38() {
		// TODO Auto-generated method stub
		/**
		 * 
## Printing the pattern38 ##
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 1 2 3 4 
  1 2 3 
   1 2 
    1
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
		for(int row=4;row>=1;row--) {
			for(int space=5;space>row;space--) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	private void pattern37() {
		// TODO Auto-generated method stub
		/*
## Printing the pattern37 ##
A A A A A 
A A A B B 
A A C C C 
A D D D D 
E E E E E
		 */
		int alpha=64;
		for(int row=1;row<=5;row++) {
			for(int space=5;space>row;space--) {
				System.out.print("A ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print((char)(alpha+row)+" ");
			}
			System.out.println();
		}

		

	}
	private void pattern36() {
		// TODO Auto-generated method stub
		/**
		 * 
## Printing the pattern36 ##
1 1 1 1 1 
1 1 1 2 2 
1 1 3 3 3 
1 4 4 4 4 
5 5 5 5 5 
		 */
		for(int row=1;row<=5;row++) {
			for(int space=5;space>row;space--) {
				System.out.print("1 ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}
	private void pattern35() {
		// TODO Auto-generated method stub

		/*
## Printing the pattern35 ##
1 0 0 0 0 
0 2 0 0 0 
0 0 3 0 0 
0 0 0 4 0 
0 0 0 0 5
		 */
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==col) {
					System.out.print(col+" ");
				}
				else {
				System.out.print("0 ");
				}
			}
			System.out.println();
		}

	}
	private void pattern33() {
		// TODO Auto-generated method stub
		/*
		  
## Printing the pattern33 ##
        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1
		 */
		for(int row=1;row<=5;row++) {
			for(int space=5;space>row;space--) {
				System.out.print("  ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			
			for(int rows=row-1;rows>=1;rows--)
				// r=1-1=>0: 
//				r=2-1=>1:
//				r=3-1=>2:
			{
				System.out.print(rows+" ");
			}
			System.out.println();
		}
		
		
		
	}
	private void pattern32() {
		// TODO Auto-generated method stub
		/*
## Printing the pattern32 ##
* * * * * 
* * * * 
* * * 
* * 
* 
* * 
* * * 
* * * * 
* * * * * 
		 */
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
			}
			for(int row=2;row<=5;row++) {
				for(int col=1;col<=row;col++) {
					System.out.print("* ");
				}
				System.out.println();
			}

		
	}
	private void Pattern31() {
		// TODO Auto-generated method stub
		/*## Printing the pattern31 ##
		E D C B A 
		D C B A 
		C B A 
		B A 
		A 
		B A 
		C B A 
		D C B A 
		E D C B A
				 */
		int alpha=64;
		for(int row=5;row>=1;row--) {
		for(int col=row;col>=1;col--) {
			System.out.print((char)(alpha+col)+" ");
		}
		System.out.println();
		}
		for(int row=2;row<=5;row++) {
			for(int col=row;col>=1;col--) {
				System.out.print((char)(alpha+col)+" ");
			}
			System.out.println();
		}
		
	}
	private void pattern30() {
		// TODO Auto-generated method stub
		/**
		 * ## Printing the pattern30 ##
		 A B C D E 
		 A B C D 
		 A B C 
		 A B 
		 A 
		 A B 
		 A B C 
		 A B C D 
		 A B C D E
		 */
		int alpha=64;
		for(int row=5;row>=1;row--) {
		for(int col=1;col<=row;col++) {
			System.out.print((char)(alpha+col)+" ");
		}
		System.out.println();
		}
		for(int row=2;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print((char)(alpha+col)+" ");
			}
			System.out.println();
		}
	}
	private void pattern29() {
		// TODO Auto-generated method stub

		/**
		 * ## Printing the pattern29 ##
		 5 4 3 2 1 
		 4 3 2 1 
		 3 2 1 
		 2 1 
		 1 
		 2 1 
		 3 2 1 
		 4 3 2 1 
		 5 4 3 2 1
		 */
	for(int row=5;row>=1;row--) {	
	for(int col=row;col>=1;col--) {
		System.out.print(col+" ");
	}
	System.out.println();
	}
	for(int row=2;row<=5;row++) {
		for(int col=row;col>=1;col--) {
			System.out.print(col+" ");
		}
		System.out.println();
	}
	}
	private void pattern28() {
		// TODO Auto-generated method stub
		/**
		 * ## Printing the pattern28 ##
		 1 2 3 4 5 
		 1 2 3 4 
		 1 2 3 
		 1 2 
		 1 
		 1 2 
		 1 2 3 
		 1 2 3 4 
		 1 2 3 4 5
		 */
		
		for(int row=5;row>=1;row--) {
		for(int col=1;col<=row;col++) {
			System.out.print(col+" ");
		}
		System.out.println();
		}
		for(int row=2;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	private void pattern27() {
		// TODO Auto-generated method stub
		/**
		 * ## Printing the pattern27 ##
		 			* 
        		  * * 
      			* * * 
    	      * * * * 
    		* * * * * 
    		  * * * * 
    		  	* * * 
    		  	  * * 
    		  	    *
		 */
		for(int row=1;row<=5;row++) {
			for(int space=5;space>row;space--) 
			{
				System.out.print("  ");			
				}
			for(int col=1;col<=row;col++)
			{
				System.out.print("* ");			
				}
			System.out.println();
		}
		for(int row=4;row>=1;row--) {
			for(int space=5;space>row;space--) {
				System.out.print("  ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	private void pattern26() {
		// TODO Auto-generated method stub
		/**
		 * ## Printing the pattern26 ##
              * 
              * * 
              * * * 
              * * * * 
              * * * * * 
              * * * * 
              * * *  
              * *   
              *
		 */
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int row=4;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	private void pattern25() {
		// TODO Auto-generated method stub
		/**
		 * ## Printing the pattern25 ##
		 A 
		 A B 
		 A B C 
		 A B C D 
		 A B C D E 
		 A B C D 
		 A B C 
		 A B 
		 A
		 */
		int alpha=64;
       for(int row=1;row<=5;row++) {
    	   for(int col=1;col<=row;col++) {
    		   System.out.print((char)(alpha+col)+" ");
    	   }
    	   System.out.println();
       }
       for(int row=4;row>=1;row--) {
    	   for(int col=1;col<=row;col++) {
    		   System.out.print((char)(alpha+col)+" ");
    	   }
    	   System.out.println();
       }
		
	}
	private void pattern24() {
		// TODO Auto-generated method stub
		/**
		 * ## Printing the pattern24 ##
		 1 
		 1 2 
		 1 2 3 
		 1 2 3 4 
		 1 2 3 4 5 
  		 1 2 3 4 
		 1 2 3 
		 1 2 
		 1
		 */
		for(int row=1;row<=5;row++) {
			
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		for(int row=4;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}
	private void pattern23() {
		// TODO Auto-generated method stub
//		ex o/p   
		/*
		 *            A
		 *           A A
		 *          A B A
		 *         A C C A
		 *        A D F D A
		 *        
		 *        * * * * A
		 *        * * * A A
		 *        * * A B A
		 *        * A C C A
		 *        A D F D A
		 *        
		 */
		int alpha=64;
		for (int row = 1; row <= 5; row++) {
			
			for(int space=5;space>row;space--) {
				System.out.print(" ");
			}
			int temp=1;
			
			for(int col=1;col<=row;col++) {
				System.out.print((char)(alpha+temp)+" ");
				temp=temp*(row-col)/col;
			}
			System.out.println();
		}
		
		
		
	}

	private void pattern22() {
		// TODO Auto-generated method stub
//		ex o/p
		/*
		 *           1
		 *          1 1
		 *         1 2 1
		 *        1 3 3 1
		 *       1 4 6 4 1
		 *       
		 *       * * * * 1
		 *       * * * 1 1
		 *       * * 1 2 1
		 *       * 1 3 3 1
		 *       1 4 6 4 1
		 */
          for(int row=1;row<=5;row++) {
        	  for(int space=5; space>row;space--) {
        		  System.out.print(" ");
        	  }
        	  int temp=1;
        	  for(int col=1;col<=row;col++)// 2<=1,1<=2,2<=2;1<=3,2<=3 3<=3;1<=4,2<=4 3<=4 4<=4
        	  {
        		  System.out.print(temp+" ");//1,1 1,1 2 1, 1 3 3 1,
        		  temp=temp*(row-col)/col;
        	//    temp=1*(1-1)/1 => 1*(0/1)
//        		  temp=1*(2-1)/1 => 1;1*(2-2)
//        		  temp=1*(3-1)/1 => 2; 2*(3-2)/2=>2*0.5=1;
//        		  temp=1*(4-1)/1=> 3; 3*(4-2)/2=>3*1; 3*(4-3)/3 =>0.3333*3=>1
        		  
        		  }
        	  System.out.println();
          }
		
	}

	private void pattern21() {
		// TODO Auto-generated method stub
//		ex o/p
		/*
		 * A
		 * B C
		 * D E F
		 * G H I J 
		 * K L M N O
		 */
		char alph='A';
		for(char row='E';row>='A';row--) {
			for(char col='E';col>=row;col--) {
				System.out.print(alph+" ");
				alph++;
			}
			System.out.println();
			}

		
	}

}
