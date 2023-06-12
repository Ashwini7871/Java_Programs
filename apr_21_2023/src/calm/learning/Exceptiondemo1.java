package calm.learning;

public class Exceptiondemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exceptiondemo1 ed = new Exceptiondemo1();
		int no1=10,no2=5;
		ed.division(no1,no2);
		ed.add(no1,no2);
		
		

	}

	private void add(int no1,int no2) {
		// TODO Auto-generated method stub
	System.out.println(no1+no2);//10+5=15
		
	}

	private void division(int no1,int no2) {
		// TODO Auto-generated method stub
	try {
		System.out.println(no1/no2);//10/5=2  

	}
	catch(ArrayIndexOutOfBoundsException r) {
		System.out.println("check array no");
	}
	
	catch(Exception ae) {
		System.out.println("check no ");
	}
	finally 
	{
		System.out.println("mugilan");
	}

		
		
	}

}