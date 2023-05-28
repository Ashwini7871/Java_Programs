package calm.learning;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
		System.out.println(ch.balance);
		//ch.receive();
		ch.develop_java_applications();
		//Dynamic Binding
		  Parent pa = new Child(); 
		  pa.cook();
		  pa.receive();
//		  pa.develop_java_applications();
	}
	public void receive()//method over riding-
	  {System.out.println("Taking Care "
	        + "of Relatives and friends");
	  
	//Parent p = new parent();
	//super.receive();// keyword
	  }
	public void develop_java_applications()
	  {
	    System.out.println("Java Developer");
	  }
void getmarried() {
		
	}

}
