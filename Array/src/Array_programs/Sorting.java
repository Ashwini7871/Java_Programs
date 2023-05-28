package Array_programs;

public class Sorting {
public static void main(String[] args) {
	Sorting s = new Sorting();
	s.sorting_swap();
}

private void sorting_swap() {
	// TODO Auto-generated method stub
//	int[] ar = {10,7, 3,1};
//	  for(int i=0; i<ar.length;i++)
//	  {
//	    System.out.print("before swaping"+ar[i]+" ");//for array printing
//	  }
//	  System.out.println();
//	  for(int i=0; i<ar.length-1;i++)//0<3
//	  {
//	    if(ar[i]>ar[i+1])//a[0]>a[1]-->10 > 7
//	    {
//	      int temp = ar[i]; 
//	      ar[i] = ar[i+1]; 
//	      ar[i+1] = temp; 
//	    }
//	  }
//	  System.out.println("After First Swap");
//	  for(int i=0; i<ar.length;i++)
//	  {
//	    System.out.print(ar[i]+" ");
//	  }
//
//	  for(int i=0; i<ar.length-2;i++)
//	  {
//	    if(ar[i]>ar[i+1])
//	    {
//	      int temp = ar[i]; 
//	      ar[i] = ar[i+1]; 
//	      ar[i+1] = temp; 
//	    }
//	  }
//	  System.out.println();
//	  System.out.println("After Second Swap");
//	  for(int i=0; i<ar.length;i++)
//	  {
//	    System.out.print(ar[i]+" ");
//	  }
//	  for(int i=0; i<ar.length-3;i++)
//	  {
//	    if(ar[i]>ar[i+1])
//	    {
//	      int temp = ar[i]; 
//	      ar[i] = ar[i+1]; 
//	      ar[i+1] = temp; 
//	    }
//	  }
//	  System.out.println();
//	  System.out.println("After third Swap");
//	  for(int i=0; i<ar.length;i++)
//	  {
//	    System.out.print(ar[i]+" ");
//	  }
	
	int[] ar={10,7,3,1};
    System.out.println("Before Swap");

    for (int i=0;i<ar.length;i++)
    {
        System.out.print(ar[i]+" ");
    }
    System.out.println();

    for (int j=1;j<=ar.length-1;j++)//j=3,
    {
        for (int i=0;i<ar.length-j;i++)//0<3,
        {
            if (ar[i]>ar[i+1])
            {
                int temp= ar[i];
                ar[i]=ar[i+1];
                ar[i+1]=temp;

            }
        }
    }

    System.out.println("After Swap");
    for (int i=0;i<ar.length;i++)
    {
        System.out.print(ar[i]+" ");
    }
}

}

