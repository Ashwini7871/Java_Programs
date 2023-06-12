package com.learning;

public class LowAttendanceException extends RuntimeException{

	  public LowAttendanceException(String msg) {
		    // TODO Auto-generated constructor stub
		    System.out.println(msg);
		  }

		  public LowAttendanceException() {
		    // TODO Auto-generated constructor stub
		  }

		  public void allowForExams(int attendance)
		  {
		    //100/0
		    //-5
		    //
		    if(attendance>=75)
		    {
		      System.out.println("Permit Students");
		    }
		    else
		    {
		      
		//LowAttendanceException lae = new LowAttendanceException();
		throw new LowAttendanceException("Low Attendance Issue"); //Anonymous Object
		      
		    }
		    
		  }
}
