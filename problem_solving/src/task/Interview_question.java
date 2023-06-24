package task;

public class Interview_question {
public static void main(String[] args) {
	 int no=display();
	System.out.println(no);
}

private static int display() {
	// TODO Auto-generated method stub
	  try
	    {
	     // System.exit(0);// it stops jvm 
	      return 100;
	    }
	    catch(Exception e)
	    {
	      return 10; 
	    }
	    finally
	    {
	      System.out.println("hi");
	    }
	  }
}

