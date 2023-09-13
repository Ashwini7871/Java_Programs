package Inheritance;

public class Dog extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog d = new Dog();
        d.bark();
        d.bite();
        
	}
	public void bite() {
		System.out.println("bite");
	}
	
}
