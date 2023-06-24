 package OOps_concept;
 import Inheritance.Laptop;
public class Inherit_concept extends  Human{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inherit_concept ii = new Inherit_concept();
		ii.eating();
		ii.sleeping();
		ii.browse();
		ii.playGames();
		
		
	}
	
}

class Human extends Laptop{
	
	public void eating() {
		System.out.println("Eating");
	}
	public void sleeping() {
		System.out.println("Sleeping");
		
	}
	
	
}
