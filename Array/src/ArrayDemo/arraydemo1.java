package ArrayDemo;

public class arraydemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arraydemo1 ad = new arraydemo1();
		ad.learning_1();//ref :arraydemo
//		ad.learning_2();
	}

	private void learning_2() {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int[][] marks = new int[3][5];//exam,sub
	    //quarterly: 
	   /* marks[0][0] = 90; 
	    marks[0][1] = 98; 
	    marks[0][2] = 100; 
	    marks[0][3] = 65; 
	    marks[0][4] = 78; 
	    
	    //half yearly: 
	    marks[1][0] = 90; 
	    marks[1][1] = 92; 
	    marks[1][2] = 99; 
	    marks[1][3] = 100; 
	    marks[1][4] = 95; 
	    
	    //annual
	    marks[2][0] = 87; 
	    marks[2][1] = 90; 
	    marks[2][2] = 95; 
	    marks[2][3] = 98; 
	    marks[2][4] = 93;*///first step
		//------------------//
	    //quarterly: 
		
			    
			    
			int exam = 0; 
			int subject = 0; 
			    marks[exam][subject] = 90; subject++;
			    marks[exam][subject] = 98; subject++;
			    marks[exam][subject] = 100; subject++;
			    marks[exam][subject] = 65; subject++;
			    marks[exam][subject] = 78; subject++;
			    
			    //half yearly: 
			    exam++; 
			    subject = 0; 
			    marks[exam][subject] = 90; subject++;
			    marks[exam][subject] = 92; subject++;
			    marks[exam][subject] = 99; subject++;
			    marks[exam][subject] = 100; subject++;
			    marks[exam][subject] = 95; subject++;
			    
			    //annual
			    exam++; 
			    subject = 0; 
			    marks[exam][subject] = 87; subject++;
			    marks[exam][subject] = 90; subject++;
			    marks[exam][subject] = 95; subject++;
			    marks[exam][subject] = 98; subject++;
			    marks[exam][subject] = 93; subject++;
			    
//			  for(exam = 0; exam<3; exam++)
//			  {
//			    for(subject=0; subject<5; subject++)
//			    {
//			      if(marks[exam][subject]==100)
//			      {
//			        System.out.println(exam);
//			        System.out.println(subject);
//			      }
//			    //System.out.print(marks[exam][subject]+" ");
//			    }
//			    System.out.println();
//			  }  find marks--------------------
//			  
			 int high=0;int examno=-1;
			 for(exam=0;exam<3;exam++) { 
			    int total =0;
			    for(subject=0;subject<5;subject++) {
			    	total = total+marks[exam][subject];
			    }
			    System.out.println("total: "+total);
			    if(total>high) {
			    	high=total;
			    	examno=exam;
			    }
			}
			 System.out.println("highest total is "+high+"in exam no: "+examno);
	
	}

	private void learning_1() {
		//jagged array
		// TODO Auto-generated method stub
//		  int[][] marks = new int[3][5];
//		    System.out.println(marks.length);//3
//		    System.out.println(marks[0].length);//5
//		    System.out.println(marks[1].length);//5
//		    System.out.println(marks[2].length);//5
//-----------------------------------------------
		  int[][] marks = new int[6][];
		    marks[0] = new int[5];
		    //array length declare
		    
		    marks[1] = new int[6];//array.len.declare
		    marks[2] = new int[4]; //array.len.declare
		    System.out.println(marks.length);
		    System.out.println(marks[0].length);
		    System.out.println(marks[1].length);
		    System.out.println(marks[2].length);		
		
		
	}

}
