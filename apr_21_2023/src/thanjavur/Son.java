package thanjavur;

public class Son extends Father {
	int age =45;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son son = new Son();
		son.share_assets();
		son.yield();
		int father_amount = son.getAmount();
		System.out.println("before"+father_amount);
		son.setAmount(1000);
		father_amount = son.getAmount();
		System.out.println("after"+father_amount);
		System.out.println(son.age);
		Father f = new Father();
		System.out.println(f.age);
		son.work();
	}
	void work() {
		System.out.println(this.age);
		System.out.println(super.age);
	}

}
