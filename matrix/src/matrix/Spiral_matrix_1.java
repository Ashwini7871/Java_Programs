package matrix;

public class Spiral_matrix_1 {
public static void main(String[] args) {
	int[][] a = new int[5][5];
    int no =1; 
    int minRow=0, maxRow=4, minCol=0, maxCol=4;
    //1 2 3  4
while(no<=25)
{
    for(int col=minCol; col<=maxCol; col++){
        a[minRow][col] = no; 
        no++;  } minRow++; //minRow = 1

    // 5 6 7 
    for(int row=minRow; row<=maxRow; row++) {
        a[row][maxCol] = no; 
        no++; } maxCol--; //maxCol = 2; 

    //8 9 10 
    for(int col=maxCol;col>=minCol; col--){
    a[maxRow][col] = no; no++; 
    } maxRow--; 

    //11 12
    for(int row=maxRow; row>=minRow; row--){
        a[row][minCol] = no; no++; }
    minCol++; 
   
}

    for(int row=0; row<=4; row++)
    {
      for(int col=0; col<=4; col++)
      {
        System.out.print(a[row][col]+"\t");
      }
      System.out.println();
    }
}
}
