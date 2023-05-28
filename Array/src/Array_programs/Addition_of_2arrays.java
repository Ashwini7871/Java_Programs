package Array_programs;

public class Addition_of_2arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition_of_2arrays add = new Addition_of_2arrays();
		add.addition_of_2arrys();
	}

	private void addition_of_2arrys() {
		// TODO Auto-generated method stub
//		20) Addition of two integer arrays                                              ?
		
		int[]a =   {10,20,30};// small
		  int[]b = {40,50,60,70};
//		  		50,70,90,70
		  int big = a.length>b.length?a.length:b.length;
		  int small = a.length<b.length?a.length:b.length;
		  int []c = new int [big];// c=4
		  int i =0;
		  while(i<c.length)
			  //0<4 1<4,2<4,3<4,4<4
		  {
		    if(i<small)
		    	// 0< 3,1<3,2<3,3<3
		    {
		      c[i]=a[i]+b[i];
		      //i=0-c[0] = 10+40=50,i=1-c[1]=20+50=70,c[2]=90
		    
		    }
		    else {
		      c[i]=b[i];//c[3]=70
		    }
		    
		    System.out.println(c[i]);
		    i++;
		  }
		 
		
	}
	}


