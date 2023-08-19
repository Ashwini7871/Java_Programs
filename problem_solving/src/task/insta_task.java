package task;

public class insta_task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insta_task it = new insta_task();
		it.short_to_int();
	}

	private void short_to_int() {
		// TODO Auto-generated method stub
		short x=10;
//		x= (x*5); tre is compile tym errror ---wcant change short to int
		x = (short) (x*5);// convert short
		System.out.println(x);
	}

}
