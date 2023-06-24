package OOps_concept;

public interface Animals {
	//Encapsulation
    String name;//global non-static variable

    public Animals(String name) //constructor
    {
        this.name = name;
    }
//
   public default  void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
