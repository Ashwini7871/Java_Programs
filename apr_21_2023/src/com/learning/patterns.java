package com.learning;

public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patterns p1 = new patterns();
//		p1.pattern1();
//		p1.pattern2();
//		p1.pattern3();
//		p1.pattern3i();
//		p1.pattern4();
		p1.pattern5();


	}

	private void pattern5() {
		// TODO Auto-generated method stub
		/*for(int no=1; no<=5; no++)
		{ System.out.print("*" + "\t"); }
		System.out.println(); 
		for(int no=1; no<=4; no++)
		{ System.out.print("*" + "\t"); }
		System.out.println();
		for(int no=1; no<=3; no++)
		{ System.out.print("*" + "\t"); }
		System.out.println(); 
		for(int no=1; no<=2; no++)
		{ System.out.print("*" + "\t"); }
		System.out.println();
		for(int no=1; no<=1; no++)
		{ System.out.print("*" + "\t"); }
		System.out.println();*/
	    int count =5; 
	    int num = 1; 
	    while(count>=1)
	    {
	    for(int no=1; no<=count; no++)
	    { 
	      System.out.print(num + "\t");
	      num++; 
	    }
	    System.out.println(); 
	    count--; 
	    }
	}

	private void pattern4() {
		// TODO Auto-generated method stub
		for(int count = 5;count>=1; count--)
		{
		    for(int no=count; no>=1; no--)
		    {   System.out.print(no+" ");   }
		    System.out.println(); 
		}
	}

	private void pattern3i() {
		// TODO Auto-generated method stub
		 int count = 5; 
		    while(count>=1)
		    {
		        for(int no=5; no<=count; no--) {
		        System.out.print(no+" "); 
		        }
		        System.out.println(); 
		    count++;}
		
	}

	private void pattern3() {
		// TODO Auto-generated method stub
//		for(int no=1; no<=5; no++) {
//			System.out.print(no+" "); 
//			}
//			System.out.println();
//			for(int no=1; no<=4; no++) {
//			System.out.print(no+" "); 
//			}
//			System.out.println(); 
//			for(int no=1; no<=3; no++) {
//			System.out.print(no+" "); 
//			}
//			System.out.println();
		   int count = 5; 
		    while(count>=1)
		    {
		        for(int no=1; no<=count; no++) {
		        System.out.print(no+" "); 
		        }
		        System.out.println(); 
		    count--; 
		    }
		    
	}

	private void pattern2() {
		// TODO Auto-generated method stub
		 for(int no=1; no<=25; no++)
		    {
		    System.out.print(no+" ");
		    if(no%5==0)
		    {
		      System.out.println();
		    }
		    }
	}

	private void pattern1() {
		// TODO Auto-generated method stub
		for(int count = 1; count<=3;count++)
	    {
	        for(int no = 1; no<=5; no++)
	        {
	        System.out.print(no+" "); 
	        }
	        System.out.println(); 
	    }

	}

}
