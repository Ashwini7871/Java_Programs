package thanjavur;

public class Father {
	public int amount =1000000000; // 1000
	public int amount2 = 1234;//1000=2234
	int age = 75;
	public int getAmount2()
	{
		return amount2;
	}

	public void setAmount(int amount) {
		//if(1000000000>0)
		this.amount = amount+amount2;//1000
	}

	public void setAmount2(int amount2) {
		this.amount2 = amount2;
	}

	public int getAmount() 
	{
		return amount;
	}
	
	void yield()
	{
		System.out.println("Yield Paddy");
	}
	protected void share_assets()
	{
		System.out.println("Sharing Assets");
	}
}
