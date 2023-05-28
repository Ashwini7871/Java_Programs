package Array_programs;

import java.util.Scanner;

public class Concatenation_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concatenation_arrays c = new Concatenation_arrays();
		//c.concatenation21();
//	c.concatenation();
		c.concatenation22();
		
	}

	private void concatenation22() {
		// TODO Auto-generated method stub
//		21) Concatenation of two integer arrays
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element count : ");
	int c=sc.nextInt();
	int[] arr=new int[c];
	
	
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the Array elements :");
		int element= sc.nextInt();
		arr[i]=element;
		
	}
	System.out.println();
	System.out.println("Array values");
	for(int j=0;j<arr.length;j++) {
		System.out.println(arr[j]);
		}
}
	

	private void concatenation() {
		// TODO Auto-generated method stub
		int a[]= {10,20,30};
		int b[]= {40,50,60};
		int len = a.length+b.length;
		int c[]= new int[len];
		for(int i=0;i<c.length;i++)//
		{
			if(i<a.length)//0<3,1<3,2<3
			{
				c[i]=a[i];//c[0]=a[0],c[1]=a[1],c[2]=a[2]
				//c=10,20,30
			}
			else {
				c[i]=b[i-a.length];//c[3]=b[3-3],=c[4]=b[1],
				//c=40,50,60
			}
//			System.out.println(c[i]);
		}
		for(int j=0;j<c.length;j++) {
			System.out.println(c[j]);
		}
		
	}

	private void concatenation21() {
		// TODO Auto-generated method stub
		int a[]= {10,20,30};
		int b[]= {40,50,60,70};
		int len = a.length+b.length;
		int c[]= new int[len];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			//10,20,30
//			System.out.println(c[i]);
		}
		int j=0;
		for(int i=a.length;i<c.length;i++) //i=3,
		{
			c[i]=b[j];//c[3]=b[0],c[4]=b[1],
			//40,50
			j++;
//			System.out.println(c[i]);
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		
	}

}
