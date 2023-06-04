package patterns_program;

public class Alphabets_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabets_pattern ap = new Alphabets_pattern();
//		ap.print_A();
		ap.print_B();
//		ap.print_C();
//		ap.print_D();
//		ap.print_E();
//		ap.print_F();
//		ap.print_O();
//		ap.print_v();
//		ap.print_I();
//		ap.print_T();
//		ap.print_H();
//		ap.print_Y();
//		ap.print_X();//pending
		
		
	}

	private void print_B() {
		// TODO Auto-generated method stub
		
		
	}

	private void print_A() {
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

	private void print_X() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++) { //2
			if(row>=5) 
			{//1<=5,2<=5
				for(int col=1;col<=9;col++) 
				{
					if(col==row||col==10-row) //1==1,2==1...9==9; 1==2,2==2...8==8
					{
						if(row==2 && row==8) {
							System.out.print("*");//*        *
						}
						System.out.print("* ");//*        *
					}
					
					else 
						System.out.print("  "); // *
					
				}
				System.out.println();
			}
		}
	}

	private void print_Y() {
		// TODO Auto-generated method stub
	for(int row=1;row<=9;row++) { //2
		if(row<=9) 
		{//1<=5,2<=5
			for(int col=1;col<=9;col++) 
			{
				if(col==row||col==10-row) //1==1,2==1...9==9; 1==2,2==2...8==8
				{
					System.out.print("* ");//*        *
				}
				else 
					System.out.print("  "); // *
				
			}
			System.out.println();
		}
		else {
			for(int space=1;space<=4;space++) 
			{
				System.out.print("  ");
			}
			System.out.println("*");
		}
	}
	}

	private void print_H() {
		// TODO Auto-generated method stub
//		for(int col=1;col<=7;col++) {
//			System.out.print("* ");
//		}
	
		for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
		for(int col=1;col<=7;col++) {
			
			System.out.print("* ");
		}

		for(int star=1; star<=8; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	}

	private void print_T() {
		// TODO Auto-generated method stub
	for(int col=1;col<=7;col++) {
			
			System.out.print("* ");
		}
		System.out.println();
		for(int star=1;star<=7;star++) {
			for(int sp=1;sp<4;sp++) {
			System.out.print("  ");}
			System.out.println("* ");
		}
	}

	private void print_I() {
		// TODO Auto-generated method stub
		for(int col=1;col<=7;col++) {
			
			System.out.print("* ");
		}
		System.out.println();
		for(int star=1;star<=7;star++) {
			for(int sp=1;sp<4;sp++) {
			System.out.print("  ");}
			System.out.println("* ");
		}
		for(int col=1;col<=7;col++) {
			
			System.out.print("* ");
		}
		
		
	}

	private void print_v() {
		// TODO Auto-generated method stub
		for(int row=1; row<=9;row++)
		{
			if(row<=5) {
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

	private void print_F() {
		// TODO Auto-generated method stub
		for(int col=1;col<=5;col++) 
		{
			System.out.print("* ");
		}
		System.out.println();
		for(int star=1;star<=4;star++) {
			System.out.println("* ");
		}
		for(int col=1;col<=5;col++) 
		{
			System.out.print("* ");
		}
		System.out.println();
		for(int star=1;star<=4;star++) {
			System.out.println("* ");
		}
	}

	private void print_E() {
		// TODO Auto-generated method stub
		
		for(int col=1;col<=5;col++) {
			System.out.print("* ");
		}
		System.out.println();
		for(int star=1;star<=4;star++) {
			System.out.println("* ");
		}
		for(int col=1;col<=5;col++) {
			System.out.print("* ");
		}
		System.out.println();
		for(int star=1;star<=4;star++) 
		{
			System.out.println("* ");
		}
		for(int col=1;col<=5;col++) {
			System.out.print("* ");
		}
	}

	private void print_D() {
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
	}

	private void print_C() {
		// TODO Auto-generated method stub
		
		for(int col=1;col<=7;col++) {
			if(col==1) {
				System.out.print(" ");
			}
			System.out.print("* ");
		}
		System.out.println();
		for(int star=1;star<=7;star++) {
			System.out.println("* ");
		}
		for(int col=1;col<=7;col++) {
			if(col==1) {
				System.out.print(" ");
			}
			System.out.print("* ");
		}
		
		

	}
	
	
	
}
