package ArrayDemo;

public class Array_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_practice ap = new Array_practice ();
//		ap.patternA();
//		ap.print_array();
//		ap.rev_print_array();
//		ap.Linear_search();
//		ap.index_of_given_no();
//		ap.remving_array();//pending
//		ap.placing_array();//pending
//		ap.count_given_num();
//		ap.find_biggest_no();
//		ap.find_smallest_no();
//		ap.find_first_two_num();
//		ap.find_first_two_small();
//		ap.add_of_odd_index();
//		ap.move_towards_left();
//	    ap.move_towards_right();
//		ap.move_left_twice();
//		ap.move_right_twice();
//		ap.copy_array_to_array_inReverse();
//		ap.add_of_two_integerArrays();
//		ap.concatenation_of_two_arrays();
//		ap.find_negative_number_giverArray();
//		ap.negative_number_copy_newArray();
//		ap.copy_oddNumber_to_anotherArray();
//		ap.print_element_
	}

	private void copy_oddNumber_to_anotherArray() {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		int count=0;
		int j=0;
		for (int i = 0; i < a.length; i++) {
			if(i%2==0) {
				count++;
				int b[]=new int[count];
				b[j]=a[i];
				System.out.print(b[j]+" ");

			}
			
		}
		
		
        
	}

	private void negative_number_copy_newArray() {
		// TODO Auto-generated method stub
		int a[]= {10,-20,30,-40,-50};
         int count=0;
         int j=0;
         for (int i = 0; i < a.length; i++) {
			if(a[i]>0) {
				
			}
			else {
				count++;
				int b[]= new int[count];
				b[j]=a[i];
				System.out.print(b[j]+" ");

				j++;
			}
			
			
		}
         
         
		
	}

	private void find_negative_number_giverArray() {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,-40,-50};
         for(int i=0;i<a.length;i++) {
        	 if(a[i]>0) {
        		 
        	 }
        	 else {
        		 System.out.println(a[i]);
        	 }
         }
		
	}

	private void concatenation_of_two_arrays() {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		int b[]= {60,70,80,90};
		int len=a.length+b.length;
		int c[]=new int[len];
		for(int i=0;i<c.length;i++) {
			if(i<a.length) {
			c[i]=a[i];
			}
			else {
				c[i]=b[i-a.length];
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
	}

	private void add_of_two_integerArrays() {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		int b[]= {10,20,30,40};
		int big= a.length>b.length?a.length:b.length;
		int small=a.length<b.length? a.length:b.length;
		int c[]= new int[big];
		
		for(int i=0;i<c.length;i++) {
			if(i<small) {
			c[i]=a[i]+b[i];}
			else {
				c[i]=a[i];
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
		
		

		
	}

	private void copy_array_to_array_inReverse() {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		int b[]= new int[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--) {
			b[j]=a[i];
			j++;
			
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");

		}
		
	}

	private void move_right_twice() {
		// TODO Auto-generated method stub
		int no=0;
		
		int a[]= {10,20,30,40,50};// 50,10,20,30,40
		while(no<2) {
        int temp=a[a.length-1];
        int i=a.length-1;//4
        for(;i>0;i--) {
        	a[i]=a[i-1];
//        	System.out.println(a[i]+" ");
        }
       a[i]= temp ;
//		System.out.print(a[i]);
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" ");
		}
		System.out.println();
		no++;
		}
		
	}

	private void move_left_twice() {
		// TODO Auto-generated method stub
		int num=0;
		
		int a[]= {10,20,30,40,50};
		while(num<2) {
		int temp=a[0];
		int i=0;
		while(i<a.length-1) {
			a[i]=a[i+1];
			System.out.print(a[i]+" ");
			i++;
		}
		a[i]=temp;
		System.out.print(a[i]+" ");
		System.out.println();
		num++;
		}
		
	}

	private void move_towards_right() {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};// 50,10,20,30,40
        int temp=a[a.length-1];
        int i=a.length-1;//4
        for(;i>=0;i--) {
        	a[i]=a[i-1];
//        	System.out.println(a[i]+" ");
        }
       a[i]= temp ;
//		System.out.print(a[i]);
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" ");
		}
		
	}

	private void move_towards_left() {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		int temp=a[0];
		int i=0;
		while(i<a.length-1) {
			a[i]=a[i+1];
//			System.out.print(a[i]+" ");
			i++;
		}
		a[i]=temp;
//		System.out.print(a[i]+" ");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" ");
		}
		
	}

	private void add_of_odd_index() {
		// TODO Auto-generated method stub
		int a[]= {90,9,98,3,45};
        int sum=0;
        for(int i=0;i<a.length;i++) {
        	if(i%2!=0) {
        		sum=sum+a[i];
        	}
        }
        System.out.println(sum);
	}

	private void find_first_two_small() {
		// TODO Auto-generated method stub
//		
		int marks[]= {90,99,98,30,45};

		int small=Integer.MAX_VALUE;
		int secsmall=Integer.MAX_VALUE;
		
		for (int i = 0; i < marks.length; i++) {
			if(marks[i]<small) {
				secsmall= small;
				small=marks[i];
			}
			else if(marks[i]<secsmall) {
				secsmall=marks[i];
			}
			
		}
		System.out.println("first small no.is"+small);
		System.out.println("second small no.is"+secsmall);
	}

	private void find_first_two_num() {
		// TODO Auto-generated method stub
		//11) Finding first two biggest numbers in a given array
		int marks[]= {90,99,98,30,45};

		int big = Integer.MIN_VALUE,sbig=Integer.MIN_VALUE;
		for(int i=0;i<marks.length;i++) {//0-92,1-93,2-89,3-89,4-100,5-99
			if(marks[i]>big) { //92>-2147483648,93>92,89>93,100>93,99>100
				sbig=big;//sb=-2147483648,sb=92,sb=93,
				big=marks[i];//b=92,b=93,b=100
			}
			else if(marks[i]>sbig){//89>92,99>93
				sbig=marks[i]; //sb=92, sb=99
			}
		}
		
		System.out.println("Bigest value in Array : "+big);
		System.out.println("Second Bigest value in Array : "+sbig);
	}

		


	private void find_smallest_no() {
		// TODO Auto-generated method stub
		//10) Finding smallest no. in given array
		int a[]= {90,99,98,30,45};
        int small=a[0];
        for(int i=0;i<a.length;i++) {
        	if(a[i]<small) {
        		small=a[i];
        	}
        }
        System.out.println(small);
	}

	private void find_biggest_no() {
		// TODO Auto-generated method stub
		//9) Finding biggest no. in given array
		int a[]= {90,99,98,30,45};
		int high=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>high) {
				high=a[i];
			}
		}
		System.out.println(high);
	}

	private void count_given_num() {
		// TODO Auto-generated method stub
		//8) how many times a given element is present
		int a[]= {10,20,30,40,30,30};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==30) {
				count++;
			}
		}
		System.out.println("given number is present"+" "+count);
	}

	private void placing_array() {
		// TODO Auto-generated method stub
		//7) Placing given number in last index of given array
		int a[] = {0,1,2,3,4,5};
//		for(int i=0;i<=a.length;i++) {
			
//		}
		for(int j=0;j<a.length+1;j++) {
			a[6]=5;
			System.out.println(a[j]);
		}
	}

	private void remving_array() {
		// TODO Auto-generated method stub
		//6.Removing given number from an array
		int a[] = {0,1,2,3,4,5};
		
		
	}

	private void index_of_given_no() {
		// TODO Auto-generated method stub
		int a[] = {0,1,2,3,4,5};
	
		for(int i=0;i<=5;i++) {
		
			if(a[i]==5) {
				System.out.println(i);
			}
			
			}

		
	}
	

	private void Linear_search() {
		// TODO Auto-generated method stub
		int a[] = {0,1,2,3,4,5};
		for(int i=0;i<=5;i++) {
			if(a[i]==8) {
				System.out.println("values is present at"+a[i]);
				break;
			
			}
			if(i>=5) {
				System.out.println("value is not present");
			}
		}
		
	}

	private void rev_print_array() {
		// TODO Auto-generated method stub
		int a[] = {0,1,2,3,4,5};
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

	private void print_array() {
		// TODO Auto-generated method stub
		
		int a[] = {0,1,2,3,4,5};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	private void patternA() {
		// TODO Auto-generated method stub
		String s = "ABC";
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<=i;j++) {
				char c=s.charAt(i);
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}

}
