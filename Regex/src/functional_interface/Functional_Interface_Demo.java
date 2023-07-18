package functional_interface;
@FunctionalInterface

public interface Functional_Interface_Demo//lamda function
{
//  public void test(); 
//  
//  public void display(); 
  
//Functional Interface should have only one abstract 
//method. 
//It can have static methods with definitions
//
	 default void display()
	    {
	      System.out.println("Displaying");
	    }
	    default void display2()
	    {
	      System.out.println("Displaying");
	    }
	    abstract int add(int a, int b); 
	    
	    static void test() {
	      System.out.println("Testing"); 
	    }
	    static void test2() {
	      System.out.println("Testing"); 
	    }  
//  abstract void subtract(); 
  
}
