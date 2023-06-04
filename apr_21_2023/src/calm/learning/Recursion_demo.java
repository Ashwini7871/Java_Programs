package calm.learning;

public class Recursion_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion_demo rd = new Recursion_demo();
		rd.display(10);
	}

	private void display(int no) {
		// TODO Auto-generated method stub
		System.out.println(no);
		no=no+10;
		if(no<=50) {
			display(no);
		}
	}

}
