package patterns_program;
public class Patterns_Practice {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patterns_Practice pp = new Patterns_Practice();
//		pp.pattern1();
//		pp.pattern1i();
		pp.pattern2();
		pp.pattern3();
		}
       private void pattern3() {
		// TODO Auto-generated method stub
//		System.out.println();
		int row=4;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(" ");	
			}
			for(int k=row;k>=i;k--) {
				System.out.print(" *"+"");
			}
			System.out.println();
		}
		   }

	private void pattern2() {
		// TODO Auto-generated method stub
//	      *	
//	    *  *
//	   *  *  *
//	 *  *  *  *	
//		
//		
//		
//		
//		
//	
		     int row =5;
		     for(int i=1;i<=5;i++) {
		    	 for(int j=row;j>=i;j--) {
		    		 System.out.print(" ");
		    	 }
		    	 for(int k=1;k<=i;k++) {
		    		 System.out.print("*"+" ");
		    	 }
//		    	 for(int s=6;s<=row;s++) {
		    		 
		    		 System.out.print(" ");
//		    	 }
		    	 System.out.println();
		     }
		
		
	}

	private void pattern1i() {
		// TODO Auto-generated method stub
		//ex o/p:
		/*15 
		14  13 
		12  11  10  
		9   8    7   6      
		5   4    3   2   1*/
		
		int num=15;
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(num+"\t");
				num--;
			}
			System.out.println();
		}
	
	}

	private void pattern1() {
		// TODO Auto-generated method stub
		//ex o/p:  
	/*	1
		2  3 
		4  5  6 
		7  8  9  10
		11 12 13 14 15*/
		int no=1;
		for(int row =1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(no+"\t");
				no++;
			}
			System.out.println();
		}
	}

}
