package Array_demo;

import java.util.Scanner;

public class Task_10_may {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task_10_may ad = new Task_10_may();
		// finished
//        ad.mark();//task1 = (mark task)
//		ad.task5(); // (Find out elder age Cricket)


//		ad.task2(); //Bus story Find_(savings and profits).
		ad.task3(); //Find out Youtube Avg.timeing
//		ad.task4(); //Ipl Team (Hardhik pandya) => avg findout pananum(batblowranrate||etc..)
  	

	}
	
	
	
		private void task4() {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("enter innings");
			int innings = sc.nextInt();
			System.out.println("enter notout");
		    int notout = sc.nextInt();
		    System.out.println("how many matches he played?");
		    int count = sc.nextInt();
		 int[]score = new int[count];
		 int i = 0;
		 int total = 0;
		 while(i<score.length) {
			 System.out.println("enter the score");
			 score[i]=sc.nextInt();
			 total = total + score[i];
			 i++;
		 }
		 System.out.println("score is"+ total);
		 int out = innings - notout;
		 double batting_avg = (double) total/out;
		 System.out.println("total batting avg is" + batting_avg);
		 
		 
	}



		private void task2() {
		      // TODO Auto-generated method stub
		      int cost[] = {30,30};
		      int i = 0;
		      int total = 0;
		      int days =25;
		      while(i<cost.length) 
		      {
		        total = total +cost[i];
		        i++;
		      }
		      int total_amt = days*total;
		      int new_amt = total_amt/2;
		      int profit =  total_amt - new_amt;
		      double percentage = (profit/(double)total_amt)*100;
		      System.out.println("total profit percentage :" + percentage+"%");
		      
		  }
	


	private void task3() { //pending panitay erukan
		// TODO Auto-generated method stub
		int youTube[] = { 15, 12, 10, 15, 30 };
		  int total = 0;
		  int avg;
		  System.out.println("Time watching youTube in minutes");
		  for (int i = 0; i < youTube.length; i++) {
		   System.out.println(youTube[i] + " ");
		   total = total + youTube[i];
		  }
		  
		  System.out.println("Total time watching youTube in a day :" +total +" mins");
		  avg=total/youTube.length;
		  System.out.println( youTube.length +" times Averagly watching youTube  :" + avg + " mins");
		 }

			
	
	private void task5() { // finished
		// TODO Auto-generated method stub
		int[] age = {35, 36, 42, 50, 35}; 
		String[] players = {"Virat Kohli", "Rohit Sharma", "MS Dhoni", "Sachin Tendulkar",
        "Ravindra Jadeja"}; 
		int index_h = 0; 
		int highest = age[0]; //highest = 35,36,42,50
		int i=0; 
		while(i<age.length)//0<5,1<5,2<5,3<5,4<5
		{
		  if(age[i]>highest)//35>35--false,36>35 -->true42>36-->true 50>42 true, 35>50false
		  {
		    highest = age[i];//36
		    index_h=i;
		    
		  }
		  i++;
		}
		System.out.println("Highest age is "+ highest +" from "+players[index_h]);
	}
	private void mark() {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
		// (48,85,79,99,89)
	    int[] marks = {48,85,79,99,89};
	    int i = 0;
	    while(i<marks.length) {
	    	 
            System.out.print(marks[i] + " ");  
            int b=marks[i]%10;//8,
			int a=marks[i]/10;//4,
			if(a<b){
				System.out.println("the given number a<b condition satisfied:"+marks[i]);			
				}
//			else {
//		         System.out.println("The given no a<b not satisfied ");
//			}
			i++;
	    }
        
	}
	public boolean check() {
		
	 int no = 4;
			int b=no%10;
			int a=no/10;
			
			if(a<b) {
				return true;
//				System.out.println(no);
			}else {
				return false;
//				System.out.println(b);
			}
		}

		
		

	}


