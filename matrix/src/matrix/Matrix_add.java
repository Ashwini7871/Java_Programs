package matrix;

public class Matrix_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix_add ma = new Matrix_add();
//		ma.matrix_add_2x2();
//		ma.matrix_add_3x3();
		ma.matrix_mul_2x2();
//		ma.matrix_mul_3x3();//pending
	}

	private void matrix_mul_3x3() {
		// TODO Auto-generated method stub
		
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
		int c[][] =new int[3][3];
         /*
          * |1 2 3|  |1 2 3|
          * |4 5 6|  |4 5 6|
          * |7 8 9|  |7 8 9|
          * c[0][0]=a[0][0]*b[0][0],=1*1=1
          * c[0][1]=a[0][1]*b[1][0],=2*4=8
          * c[0][2]=a[0][2]*b[2][0] =3*7=21
          * c[0][0]=30;ans(i)
          * c[0][0]=a[0][0]*b[0][1]=1*2 =2
          * c[0][1]=a[0][1]*b[1][1]=2*5=10
          * c[0][2]=a[0][2]*b[2][1]=3*8=24
          * c[0][1]=36;ans(ii)
          * c[0][0]=a[0][0]*b[0][2]=1*3 =3
          * c[0][1]=a[0][1]*b[1][2]=2*6=12
          * c[0][2]=a[0][2]*b[2][2]=3*9=27
          * c[0][2]=42;ans(iii)
          * 
          * c[1][0]=a[1][0]*b[0][0],=4*1=4
          * c[1][1]=a[1][1]*b[1][0],=5*4=20
          * c[1][2]=a[1][2]*b[2][0] =6*7=42
          * c[1][0]=66;ans(i)
          * c[1][0]=a[1][0]*b[0][1]=4*2 =8
          * c[1][1]=a[1][1]*b[1][1]=5*5=25
          * c[1][2]=a[1][2]*b[2][1]=6*8=48
          * c[1][1]=81;ans(ii)
          * c[1][0]=a[1][0]*b[0][2]=4*3 =12
          * c[1][1]=a[1][1]*b[1][2]=5*6=30
          * c[1][2]=a[1][2]*b[2][2]=6*9=54
          * c[1][2]=96;ans(iii)
          * 
          * c[2][0]=a[2][0]*b[0][0],=7*1=7
          * c[2][1]=a[2][1]*b[1][0],=8*4=32
          * c[2][2]=a[2][2]*b[2][0] =9*7=63
          * c[2][0]=102;ans(i)
          * c[2][0]=a[2][0]*b[0][1]=7*2 =14
          * c[2][1]=a[2][1]*b[1][1]=8*5=40
          * c[2][2]=a[2][2]*b[2][1]=9*8=72
          * c[2][1]=126;ans(ii)
          * c[2][0]=a[2][0]*b[0][2]=7*3 =21
          * c[2][1]=a[2][1]*b[1][2]=8*6=48
          * c[2][2]=a[2][2]*b[2][2]=9*9=81
          * c[2][2]=150;ans(iii)
		 * | 30  36  42|
		 * | 66  81  96|
		 * |102 126 150|
		 * 
		 * 
		 * 
		 * for_practice
		 * c[0][0]=a[0][0]*b[0][0]
		 * c[1][0]=a[1][0]*b[0][0]
		 * c[2][0]=a[2][0]*b[0][0]
		 *   
		 *   int j=0;
		 *   for( int i=0;i<a.length;i++){
		 *   c[j][i]=a[j][i]*b[j][i];
		 *   }
		 */
		
		
		
	}

	private void matrix_mul_2x2() {
		// TODO Auto-generated method stub
		
		int[][] a = {{1,2},{3,4}};
		int[][] b = {{5,6},{7,8}};
		int c[][] = new int[2][2];
		for(int j=0;j<a.length;j++) {
		 for(int i=0;i<a.length;i++) {
			c[j][i]=a[j][i]*b[j][i];
			System.out.println(c[j][i]);
		 }
		 
		}
		
		
	}

	private void matrix_add_3x3() {
		// TODO Auto-generated method stub
		
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b= {{10,11,12},{13,14,15},{16,17,18}};
		int[][] c=new int[3][3];
		
/*
c[0][0]=a[0][0]+b[0][0],=1+10 =11
c[0][1]=a[0][1]+b[0][1],2+11  =13
c[0][2]=a[0][2]+b[0][2],3+12  =15
c[1][0]=a[1][0]+b[1][0],4+13  =17
c[1][1]=a[1][1]+b[1][1],5+14  =19
c[1][2]=a[1][2]+b[1][2],6+15  =21
c[2][0]=a[2][0]+b[2][0],7+16  =23
c[2][1]=a[2][1]+b[2][1],8+17  =25
c[2][2]=a[2][2]+b[2][2].9+18  =27

*/  
for(   int j =0;j<b.length;j++) {
		for(int i=0;i<a.length;i++) {
			c[j][i]=a[j][i]+b[j][i];
			System.out.println(c[j][i]);
		}
}
		
	}

	private void matrix_add_2x2() {
		// TODO Auto-generated method stub
		int[][] a = {{1,2},{3,4}};//ARRAY DECLARATION
		int[][] b = {{5,6},{7,8}};
		/*
		 * a[0][0]=1,
		 * a[0][1]=2,
		 * a[1][0]=3,
		 * a[1][1]=4.
		 * 
		 * b[0][0]=5,
		 * b[0][1]=6,
		 * b[1][0]=7,
		 * b[1][1]=8.
		 */
		int c[][]= new int[2][2];
		/*
		 *c[0][0]=a[0][0]+b[0][0],
		 *c[0][1]=a[0][1]+b[0][1],
		 *c[1][0]=a[1][0]+b[1][0],
		   *c[1][1]=a[1][1]+b[1][1]. 
		 */
	for(int j=0;j<a.length;j++) {
		for(int i=0;i<a.length;i++) {
			c[j][i]=a[j][i]+b[j][i];
		//   0   0    0   0   0  0
//			 0   1    0   1   0  1
			System.out.println(c[j][i]);
			

		}
			}
	
		
		
		
		
		
	}

}
