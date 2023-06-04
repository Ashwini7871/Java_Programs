package task;
//Problem Description:
import java.util.Scanner;




//Selvan was playing with the a object of random size for stress relief.

//	Selvan knows that the length, Width, and Height of the object.

//	But he would like to know the surface area of the object he is playing with.

//	Can you help him in finding it?

//	Functional Description:

//	Surface area of the Object = 2 x [width x length + length x height + height x width]

//	Constraints:

//	1 <= widths <= 10

//	1 <= heights <= 10

//	Input Format

//	First Line Length of the object in Integer.

//	Second Line: Width of the object in Integer

//	Third Line: Height of the object in Integer

	//Output Format

	//Print a single integer value representing the surface area of the object selvan is playing with.


public class Task1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc= new Scanner(System.in);
		System.out.println("enter values");
		  int length= sc.nextInt();
		  int width=sc.nextInt();
		  int height = sc.nextInt();
		  int area = 2*(width*length+length*height+height*width);
		  System.out.println(area);
		 }
			
		

	}


