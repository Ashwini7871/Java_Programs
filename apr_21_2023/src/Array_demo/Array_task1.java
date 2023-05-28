package Array_demo;

import java.util.Scanner;

public class Array_task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {29,39,49,59};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key");
		int key = sc.nextInt();
		
		Array_task1 at  = new Array_task1();
//		at.Printing_array();
//		at.printing_reverse();
		at.linear_search(a,key);
		sc.close();
	}

	private void linear_search(int []a,int key) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				System.out.println("key is presented"+ a[i]);
				break;
			}
			else{
				System.out.println("key is not available");
			}
		}
		
	}

	private void printing_reverse() {
		// TODO Auto-generated method stub
		int a[]= {10,30,50,70};
		for(int i=a.length-1;i>=0;i--)
		{
	System.out.println(a[i]);
		}

		
	}

	private void Printing_array() {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		int i;
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
			
		
	}

}
