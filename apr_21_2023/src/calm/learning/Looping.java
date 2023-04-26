package calm.learning;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Looping ll = new Looping();
//      ll.addition_of_n_numbers();
//      ll.find_common_divisors(100,120);
//      ll.find_greatest_common_divisor(100,120);
//      ll.find_least_common_multiple(3,9);
//      ll.find_least_common_multiples(4,10);
//      ll.learn_while_break();
//      ll.sum_of_digits(1234);
//      ll.find_factorial(5);
      
	}
	
	private void sum_of_digits(int cake) {while(cake>0)
    {
        System.out.print(cake%10+" ");
        cake=cake/10;
    }
    System.out.println();
		
		// TODO Auto-generated method stub
		
	}
	private void learn_while_break() {
		  // TODO Auto-generated method stub
		  int no1 = 10, no2 = 12; 
		  int no = 1; 
		  while(true) // 10 == 12
		  {
		    System.out.println("Hi");
		    no=no+1;
		    if(no==5)
		      break;
		  }
		  
		}
	private void find_least_common_multiples(int no1, int no2) 
	{
	  // TODO Auto-generated method stub
	  int div = 2; 
	  int big = no1>no2?no1:no2;
	  while(true) {
	  if(big%no1 ==0 && big%no2==0)
	  {
	    System.out.println("LCM is "+ big);
	    break;
	  }
	  big = big+1; 
	  }
	}
	private void find_least_common_multiple(int no1, int no2) {
		  // TODO Auto-generated method stub
		  int div = 2; 
		  int big = no1>no2?no1:no2;
		  if(big%no1 ==0 && big%no2==0)
		  {
		    System.out.println("LCM is "+ big);
		  }
		  
		}	
	
	private void find_greatest_common_divisor(int no1, int no2) {
		  // TODO Auto-generated method stub
		  int div = 2; int gcd = 0; 
		  int small = no1 < no2 ? no1: no2; 
		  while(div<small)
		  {
		    if(no1%div==0 && no2%div==0)
		    {
		      gcd = div; 
		    }
		    div = div +1; 
		  }
		  System.out.println("GCD is "+ gcd);
		  
		}

	private void find_common_divisors(int no1, int no2) {
		  // TODO Auto-generated method stub
		  int div = 2; 
		  int small = no1 < no2 ? no1: no2; 
		  while(div<small)
		  
		  {
		    if(no1%div==0 && no2%div==0)
		    {
		      System.out.println(div);
		    }
		    div = div +1; 
		  }
		  
		}
	

	private void addition_of_n_numbers() {
	
		// TODO Auto-generated method stub
		int box = 0;
		int no = 1;
		while(no)
		
	}

	private void print_11111() {
		// TODO Auto-generated method stub
		int no = 1;
		while(no<=5)
		{
			System.out.print(1+"");
		no = no+1;
		}
	}

}
