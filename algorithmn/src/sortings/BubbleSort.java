package sortings;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a[]= {10,50,40,30,20};
int a[]= {1,4,6,7,8,9};

System.out.println("before swap");
for (int i = 0; i < a.length; i++) {
	System.out.print(a[i]+" ");
}

int j=1;
boolean swapped=false;//time complexity reduce pandrom
while(j<a.length) {
for(int i=0;i<a.length-1;i++) {
	
	if(a[i]>a[i+1]) {
		swapped=true;
		int temp=a[i];
		a[i]=a[i+1];
		a[i+1]=temp;
	}
}
if(!swapped) {
	break;//
}

j++;

}



System.out.println("after swap");
for (int i = 0; i < a.length; i++) {
	System.out.print(a[i]+" ");
}
		
		
	}

}
