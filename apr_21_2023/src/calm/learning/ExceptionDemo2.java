package calm.learning;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo2 ed =new ExceptionDemo2();
		int[] marks= {90,80,70,60,50};
		ed.display(marks);
		

	}

	public void display(int[] marks) {
		// TODO Auto-generated method stub
		int total=0;
		for(int i=0;i<5;i++) {
			total=total+marks[i];//0+90+80+70..+50
		}
		System.out.println(total);
	}

	

		

}
