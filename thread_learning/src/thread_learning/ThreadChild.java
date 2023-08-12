package thread_learning;

public class ThreadChild extends Thread{
	public void run()//thread job
	  {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	    for(int no=1; no<=5; no++)
	    {
	      System.out.println("ThreadChild "+ no);
	    }
	 
	  }
	
}
