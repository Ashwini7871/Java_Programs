package pattern_prac;


public class Paterns_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paterns_practice pp = new Paterns_practice();
		// pp.pattern1();
		// pp.pattern2();
		// pp.pattern3();
		// pp.pattern4();
		// pp.pattern4i();
		// pp.pattern5();
        // pp.pattern6();
		// pp.pattern7();
        // pp.pattern8();
		// pp.pattern8i();
		// pp.pattern9();
		// pp.pattern10();
//		   pp.pattern11();

	}
	private void pattern11() {
		// TODO Auto-generated method stub
//		ex o/p 
		/*
		 * 
		 * 
		 */
		
		
	}
	private void pattern10() {
		// TODO Auto-generated method stub
//		ex o/p   
		/** * * * 5
		  * * * 5 4
		  * * 5 4 3
		  * 5 4 3 2
		  5 4 3 2 1*/
		
		for (int row =5;row>=1;row--) {
			for (int space=row;space>1;space--) {
				System.out.print(" ");
			}
			for(int col=5;col>=row;col--) {
				System.out.print(col+"");
			}
			System.out.println();
		}

		
		
}  
		
	
	private void pattern9(){
    // ex o/p 
	/*
	 * 1
	 * 2   3
	 * 4   5  6
	 * 7   8  9 10
	 * 11 12 13 14 15
	 * 
	 */int no=1;
	for(int row=1;row<=5;row++){
	 for(int col=1; col<=row;col++){
		System.out.print(no+" ");
		no++;
	 }
	 System.out.println();
	}

	}
	private void pattern8i(){
      // ex o/p
	  /*  5 4 3 2 1 
	   *  5 4 3 2
	   *  5 4 3 
	   *  5 4
	   *  5
	   */
	  for(int row=1;row<=5;row++){
	   for(int col=5;col>=row;col--){
		System.out.print(col+" ");
	   }
	   System.out.println();
	}

	}
	private void pattern8(){
//  ex o/p
/*  1 2 3 4 5
    1 2 3 4 
	1 2 3
	1 2
	1
 */
   for(int row=5;row>=1;row--){ 
 for(int col=1;col<=row;col++){
	System.out.print(col+" ");
 }
 System.out.println();
   }
	}
	private void pattern7(){
		//ex o/p  
		/*
		           1 
				  2 2
				 3 3 3
				4 4 4 4
			   5 5 5 5 5
		*/

		for(int row=1;row<=5;row++){
           for(int space=5;space>row;space--){
			System.out.print(" ");
		   }
		   for(int col=1;col<=row;col++){
			System.out.print(row+" ");
		   }
             System.out.println();
		}
		         
	}
	private void pattern4i(){
//ex o/p
/*    
 *         5
 *        4 5
 *       3 4 5
 *      2 3 4 5
 *     1 2 3 4 5
 * 
 *   * * * * 5
 *   * * * 4 5
 *   * * 3 4 5
 *   * 2 3 4 5
 *   1 2 3 4 5
 *     
 */
for(int row=5;row>=1;row--){
 for(int space=1;space<row;space++){
	System.out.print(" ");
 }
 for(int col=row;col<=5;col++){
	System.out.print(col+" ");
 }
 System.out.println();

}


	}
	private void pattern6(){
    //  ex o/p  
	 /*5
	   4 4
	   3 3 3
	   2 2 2 2
	   1 1 1 1 1
	*/
	for(int row=5;row>=1;row--){
		for(int col=5;col>=row;col--){
			System.out.print(row+" ");
		}
		System.out.println();
	}



	}
	private void pattern5(){
//ex o/p
      /*
	   * 5
	   * 5 4
	   * 5 4 3
	   * 5 4 3 2
	   * 5 4 3 2 1
	   */
	  for(int row=5;row>=1;row--){
		for(int col=5;col>=row;col--){
			System.out.print(col+" ");
		}
		System.out.println();
	  }


	}
    private void pattern4(){
       //ex o/p 
	   /*
		*       
		       1
              2 2
			 3 3 3
			4 4 4 4
		   5 5 5 5 5
		    

	    */
	for (int row = 1; row <=5; row++) {
		for(int space=5;space>row;space--){
			System.out.print(" ");
		}
		for(int col=1;col<=row;col++){
			System.out.print(" "+row);
		}
		System.out.println();
		
	}

	}

	private void pattern3(){
//ex o/p  
            /*
			 *      1    
			 *     1 2
			 *    1 2 3
			 *   1 2 3 4
			 *  1 2 3 4 5
			 */
			/*
			 * * * * * 1
			 * * * * 1 2
			 * * * 1 2 3
			 * * 1 2 3 4 
			 * 1 2 3 4 5 
			 * 
			 */
			for(int row=1;row<=5;row++){
				for(int space=5;space>row;space--){
					System.out.print(" ");
				}
				for(int col=1;col<=row;col++){
					System.out.print(" "+col);
				}
				System.out.println();
			}

	}
	private void pattern2()
	{
    //   ex o/p
	        /*1
			  2 2
			  3 3 3
			  4 4 4 4
			  5 5 5 5 5*/
			  for(int row=1;row<=5;row++){
                  for(int col=1;col<=row;col++){
				    System.out.print(row+" ");
			      }
			        System.out.println();
			       }
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
		for(int col=1;col<=row;col++ )
		{
			System.out.print(col+" ");
		}
		System.out.println();
		}
	}

}



