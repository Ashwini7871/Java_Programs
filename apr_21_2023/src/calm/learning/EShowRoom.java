package calm.learning;

public class EShowRoom {
	int price;//non static,global variable
	int discount;
	
	EShowRoom()//no-args constructor
	{
		System.out.println("welcome to our EShowRoom");
	}

	public EShowRoom(int price, int discount) {
		// TODO Auto-generated constructor stub
		
		this.price = price;//global variable = local variable;
		this.discount= discount;//this--> constructor
		System.out.println("price is" + price);
		System.out.println("discount is"+ discount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EShowRoom tv = new EShowRoom(10000,10);
		EShowRoom fridge = new EShowRoom(); 
	    EShowRoom wm = new EShowRoom();
	    EShowRoom ac = new EShowRoom(25000,5);
	    ac.buy();
	    tv.buy();
	}

	private void buy() {
		// TODO Auto-generated method stub
		System.out.println(price);
		System.out.println(discount);
		
	}

}
