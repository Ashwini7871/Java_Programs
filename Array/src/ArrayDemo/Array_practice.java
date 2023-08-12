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
//		ap.find_first_two_num();//try
//		ap.find_first_two_small();//try
//		ap.add_of_odd_index();
		ap.move_towards_left();
	}

	private void move_towards_left() {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		int temp=a[0];
		int i=0;
		while(i<a.length-1) {
			a[i]=a[i+1];
			System.out.println(a[i]+" ");
			i++;
		}
		a[i]=temp;
		System.out.print(a[i]);
		
		
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
	}

	private void find_first_two_num() {
		// TODO Auto-generated method stub
		//11) Finding first two biggest numbers in a given array
		
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
