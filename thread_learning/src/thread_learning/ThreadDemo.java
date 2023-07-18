package thread_learning;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadChild tc1 = new ThreadChild();
	    System.out.println(tc1.getId()); 
	    System.out.println(tc1.getName()); 
	    System.out.println(tc1.getPriority());
	    System.out.println(tc1.isDaemon());
	    System.out.println(tc1.isAlive());
	    tc1.setName("ashu");
	    System.out.println(tc1.getName()); 
//	    tc1.setPriority(11);
	    System.out.println(tc1.getPriority());
         ThreadChild tc = new ThreadChild();
         tc.start();
//         tc.start();//
         for(int no=1; no<=5; no++)
 	    {
 	      System.out.println("ThreadDemo "+ no);
 	    }

	}

}
