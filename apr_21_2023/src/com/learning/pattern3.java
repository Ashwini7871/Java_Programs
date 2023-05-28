package com.learning;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern3 pa = new pattern3();
//		pa.patternc();
//		pa.print_E();
//		pa.print_O();
//		pa.print_8();
//		pa.print_T();//pending
		pa.print_Y();
	}

	private void print_Y() {
		// TODO Auto-generated method stub
		 for(int row=1; row<=9;row++)
		    {
		      if(row<=5) 
		      {
		        for(int col=1; col<=9;col++)
		        {
		          if(col==row || col==10-row)
		          {
		            System.out.print("* ");
		          }
		          else
		            System.out.print("  ");
		        }
		        System.out.println();
		      }
		      else
		      {
		        for(int space=1; space<=4; space++)
		        {
		          System.out.print("  ");
		        }
		      System.out.println("*");
		      }
		      
		    }
		    
		  
	}

	private void print_T() {
		// TODO Auto-generated method stub
		for(int star=1;star<=9;star++) {
			System.out.println("*"+" ");
		}
		System.out.println();
		
	}

	private void print_8() {
		// TODO Auto-generated method stub
		 for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	    for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	    for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	}

	private void print_O() {
		// TODO Auto-generated method stub
		
		    for(int col=1; col<=7; col++)
		      {
		      if(col==1)
		          System.out.print("  "); 
		      else
		          System.out.print("* "); 
		      }
		    System.out.println();
		  for(int star=1; star<=7; star++)
		      {
		      System.out.print("* "); 
		      for(int space=1; space<=6;space++)
		        {
		        System.out.print("  ");
		        }
		      System.out.println("*"); 
		      }
		  for(int col=1; col<=7; col++)
		      {
		       if(col==1)
		          System.out.print("  "); 
		      else
		          System.out.print("* "); 
		      }
		    
		  
		
	}
	

	private void print_E() {
		// TODO Auto-generated method stub
		for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.println("* "); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	    for(int star=1; star<=7; star++)
	      {
	      System.out.println("* "); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    
		
	}

	private void patternc() {
		// TODO Auto-generated method stub
		  for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.println("* "); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    
		
	}

}
