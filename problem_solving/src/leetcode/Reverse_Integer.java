package leetcode;

public class Reverse_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// eg= -143  o/p =-341
		//eg 12 o/p 21
		
		  int num=-143;
		  
		  int s= num>=0 ? 1 : -1;//-1
		  
		  int sum=0;
		  
		  if(num<0)//-143<0
		  {
		   num=(-1*num);//143
		  }
		  
		  
		  while(num>0)
		  {
		   int rem =num%10;
		   
		   sum=(sum*10)+rem;
		   num=num/10;
		  }
		  
		  System.out.println(s*sum);
		 }
		
	}


