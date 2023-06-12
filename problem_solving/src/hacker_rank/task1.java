package hacker_rank;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		task1 ts = new task1();
		ts.fizz_buzz();
		
	}

	private void fizz_buzz() {
		// TODO Auto-generated method stub
		for(int i=1;i<=15;i++) {
//			System.out.println(i);
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			}
			
		}
	}

}
