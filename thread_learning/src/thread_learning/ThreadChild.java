package thread_learning;

public class ThreadChild extends Thread{
	public void run()//thread job
	  {
	    for(int no=1; no<=5; no++)
	    {
	      System.out.println("ThreadChild "+ no);
	    }
	 
	  }
	
}
