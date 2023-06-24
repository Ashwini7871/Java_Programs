package OOps_concept;

public class Animal {
	//Encapsulation
    protected String name;//global non-static variable

    public Animal(String name) //constructor
    {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
