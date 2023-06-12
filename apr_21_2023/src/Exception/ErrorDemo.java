package Exception;

public class ErrorDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int[] ms=new int[-1];
//		int[] marks = {100,90,97, 96, 92};
		display(ms);
		

		  }

	public static void display(int[] ar)
	throws ArrayIndexOutOfBoundsException,ArithmeticException,Exception
	{
			    int total = 0; 
			    for(int i=0; i<5;i++)
			    {
			      total = total + ar[i];//100+90+97+96+92
			    }
			    
			  System.out.println("total "+ total);
			  }
}