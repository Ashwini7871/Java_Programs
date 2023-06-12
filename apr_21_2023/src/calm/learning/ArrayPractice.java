package calm.learning;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayPractice ap = new ArrayPractice();
		ap.matrix();
		

	}

	private void matrix() {
		// TODO Auto-generated method stub
		int  [][] a = {{2,4},{4,5}};
		int  [][] b = {{2,4},{4,5}};
		int  [][] c = new int[2][2];
		int j;
		for(j=0;j<b.length;j++) {
		for(int i=0;i<a.length;i++) {
			c[j][i]=a[j][i]+b[j][i];
			
			System.out.println(c[j][i]);
		}
		}
		
		
	}

}
