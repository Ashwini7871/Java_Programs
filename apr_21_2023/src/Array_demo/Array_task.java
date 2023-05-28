package Array_demo;

public class Array_task {
	
public static void main(String[] args) 
{
Array_task at = new Array_task();
//at.add_two_arrays();
//at.	find_negative_numbers();
//at.copying_negative_another_array();
at.reversing_in_same_array();
}

private void reversing_in_same_array() {
	// TODO Auto-generated method stub
    char[] name = {'s','t','a','l','i','n'}; 
    int i = 0, j = name.length-1; 

    while(i<j)
    {
    char temp = name[i]; 
    name[i] = name[j]; 
    name[j] = temp; 
    i++; 
    j--; 
    }

    for(int k=0; k<name.length; k++)
    {
    System.out.print(name[k]+" "); 
    }
}

private void copying_negative_another_array() {
	// TODO Auto-generated method stub
	int[] a = {10,20,30,-5,-10,40,-18};
	
	int count = 0;
	int i =0;
	int j = 0;
	int b[]= new int[count];
	while(i<a.length) { 
		
		if(a[i]<0) {
			System.out.println(a[i]);
			b[j]=a[i];
			count++;
			j++;
		}
	i++;	
			
	}
	
	System.out.println("count of negative number"+count);
	System.out.println(b[j]);
}
	
	


private void find_negative_numbers() {
	// TODO Auto-generated method stub
	int[] a = {10,20,30,-5,-10,40,-18};
	int count = 0;
	int i =0;
	while(i<a.length) {
		
		if(a[i]<0) {
			System.out.println(a[i]);
			count++;
		}
	i++;	
			
	}
	
	System.out.println("count of negative number"+count);
	
}

private void add_two_arrays() {
	// TODO Auto-generated method stub
	
	int[]a = {10,20,30};
	int[]b = {40,50,60,70};
	int big = a.length>b.length?a.length:b.length;
	int small = a.length<b.length?a.length:b.length;
	int []c = new int [big];
	int i =0;
	while(i<c.length)
	{
		if(i<small) 
		{
			c[i]=a[i]+b[i];//c = 10+40,
		
		}
		else {
			c[i]=b[i];
		}
		
		System.out.println(c[i]);
		i++;
	}
	
	
	
	
	
}


}
