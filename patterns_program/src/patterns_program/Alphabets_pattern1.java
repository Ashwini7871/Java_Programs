package patterns_program;

public class Alphabets_pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabets_pattern1 p = new Alphabets_pattern1();
//		p.pattern_A();
		p.pattern_B();
//		p.pattern_C();
//		p.pattern_D();//pen
//		p.pattern_E();
//		p.pattern_F();
//		p.pattern_G();//pen
//		p.pattern_H();
//		p.pattern_I();
//		p.pattern_J();
//		p.pattern_K();
//		p.pattern_L();
//		p.pattern_M();
//		p.pattern_N();
//		p.pattern_O();
//		p.pattern_P();
//		p.pattern_Q();
//		p.pattern_R();
//		p.pattern_S();
//		p.pattern_T();
//		p.pattern_U();
//		p.pattern_V();
//		p.pattern_W();
//		p.pattern_X();
//		p.pattern_Y();
//		p.pattern_Z();

	}


		private void pattern_E() {
		// TODO Auto-generated method stub
			for(int col=1; col<=7; col++)
		      {
				
		          System.out.print("* "); 
		      }
		    System.out.println();
			 for(int star=1; star<=7; star++)
		      {
		      System.out.print("* "); 
		      System.out.println();
		      }
			 for(int col=1; col<=7; col++)
		      {
		          System.out.print("* "); 
		      }
		    System.out.println();
		    for(int star=1; star<=7; star++)
		      {
		      System.out.print("* "); 
		      System.out.println();
		      }
		    for(int col=1; col<=7; col++)
		      {
				
		          System.out.print("* "); 
		      }
		
	}


		private void pattern_H() {
		// TODO Auto-generated method stub
			
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
	       
	          System.out.print("* "); 
	      }
//	    System.out.println();
	    for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
			 
		
	}


		private void pattern_F() {
		// TODO Auto-generated method stub
			for(int col=1; col<=7; col++)
		      {
				
		          System.out.print("* "); 
		      }
		    System.out.println();
			 for(int star=1; star<=7; star++)
		      {
		      System.out.print("* "); 
		      System.out.println();
		      }
			 for(int col=1; col<=7; col++)
		      {
		          System.out.print("* "); 
		      }
		    System.out.println();
		    for(int star=1; star<=7; star++)
		      {
		      System.out.print("* "); 
		      System.out.println();
		      }
		
	}


		private void pattern_C() {
		// TODO Auto-generated method stub
			for(int col=1; col<=7; col++)
		      {
				if(col==1) {
					System.out.print(" ");
				}
		          System.out.print("* "); 
		      }
		    System.out.println();
			 for(int star=1; star<=7; star++)
		      {
		      System.out.print("* "); 
		      System.out.println();
		      }
			 for(int col=1; col<=7; col++)
		      {
				 if(col==1) {
						System.out.print(" ");
					}
		          System.out.print("* "); 
		      }
		    System.out.println();
		
	}


		private void pattern_B() {
		// TODO Auto-generated method stub
			for(int col=1; col<=7; col++)
		      {
		    
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
		      
		          System.out.print("* "); 
		      }
		
	}


		private void pattern_A() {
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
	       
	          System.out.print("* "); 
	      }
//	    System.out.println();
	    for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
		
	}


		private void pattern_Z() {
			// TODO Auto-generated method stub
			int num=1;
			for(int col=1; col<=9; col++)
		    {
		    System.out.print("*"+" ");
		    }
		System.out.println(); 
		for(int star=1; star<=7; star++)
		    {
		    for(int space=1; space<9-num; space++)
		        {
		        System.out.print("  ");
		        }
		    System.out.println("*"); 
		    num++;
		    
		}
		for(int col=1; col<=9; col++)
	    {
	    System.out.print("*"+" ");
	    }
	System.out.println(); 
		}

}
