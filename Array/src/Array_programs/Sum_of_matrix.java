package Array_programs;

public class Sum_of_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] a = {{1,2},{2,3 }};
        
        int[] [] b= {{1,2,},{2,4}};
     

       int[][]c= new int [a.length][a.length];
     for(int i=0;i<a.length;i++) {
       for(int j=0; j<a[0].length;j++) {
            c [i][j]=a[i][j]+ b[i][j];

       }

             }
    for(int i=0;i<a.length;i++) {

    for(int j=0; j<a[0].length;j++) {
          System.out.print(c[i][j]+" ");
        //System.out.format("%d\t", c[i][j]);

                }
       System.out.println();
}


	}

}
