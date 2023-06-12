package matrix;

public class Spiralmatrix_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Spiralmatrix_2 s = new Spiralmatrix_2();
//      s.matrix();
//      s.matrix1();
//      s.matrix_rev();
	}

	private void matrix_rev() {
		// TODO Auto-generated method stub
int[][] a = new int[5][5];
		
		int minRow =0,maxRow=4,
		    minCol=0,maxCol=4;
		int no=1;
		while(no<=25) {
		for(int col=maxCol;col>=minCol;col--) {
			a[minRow][col]=no;
			no++;
		}
		minRow++;
		for(int row=minRow;row<=maxRow;row++) {
			a[row][minCol]=no;
			no++;
		}
		minCol++;
		for(int col=minCol;col<=maxCol;col++) {
			a[maxRow][col]=no;
			no++;
		}
		maxRow--;
		for(int row=maxRow;row>=minRow;row--) {
			a[row][maxCol]=no;
			no++;
		}
		maxCol--;
		}
		//this loop for print array
		
		for(int row=0;row<=4;row++) {
			for(int col=0;col<=4;col++) {
				System.out.print(a[row][col]+"\t");
			}
			System.out.println();
		}
		
	}

	private void matrix1() {
		// TODO Auto-generated method stub
		int[][] a = new int[9][9];
		
		int minRow =0,maxRow=8,
		    minCol=0,maxCol=8;
		int no=5;
	while(no>=1) {
		//1 2 3 4 (up)
		
		for(int col=minCol;col<=maxCol;col++) {
			a[minRow][col]=no;

		}
		minRow++;//sec line
		//5 6 7 (right side)
		for(int row=minRow;row<=maxRow;row++) {
			a[row][maxCol]=no;
			
		}
		maxCol--;
		//8 9 10 (bottom)
		for(int col=maxCol;col>=minCol;col--) {
			a[maxRow][col]=no;
			
		}
		maxRow--;
		//11 12 (left)
		for(int row=maxRow;row>=minRow;row--) {
			a[row][minCol]=no;
			
		}
		minCol++;
		no--;
	}
		
		
		
		//this loop for array printing;
	for(int row=0;row<=8;row++) {
		for(int col=0;col<=8;col++) {
			System.out.print(a[row][col]+"\t");
		}
		System.out.println();
	}
		
		
	}

	private void matrix() {
		// TODO Auto-generated method stub
		int[][]a =new int [5][5];
		int no =1;
		 int minRow=0,maxRow=4,minCol=0,maxCol=4;
		 
			while(no<=25) {
			//1 2 3 4 (up)
			
			for(int col=minCol;col<=maxCol;col++) {
				a[minRow][col]=no;
				no++;

			}
			minRow++;//sec line
			//5 6 7 (right side)
			for(int row=minRow;row<=maxRow;row++) {
				a[row][maxCol]=no;
				no++;
			}
			maxCol--;
			//8 9 10 (bottom)
			for(int col=maxCol;col>=minCol;col--) {
				a[maxRow][col]=no;
				no++;
			}
			maxRow--;
			//11 12 (left)
			for(int row=maxRow;row>=minRow;row--) {
				a[row][minCol]=no;
				no++;
			}
			minCol++;
			
		}
			
			
			
			//this loop for array printing;
		for(int row=0;row<=4;row++) {
			for(int col=0;col<=4;col++) {
				System.out.print(a[row][col]+"\t");
			}
			System.out.println();
		}
			
			
		}
		 
	}


