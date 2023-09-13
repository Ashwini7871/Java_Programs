package Learn_String;

public class ToStringDemo {

	
		String name;
	    int age;
	    String college;
	    String course;
	    String address;
	 
	 // Constructor of this class
	    ToStringDemo(String name, int age, String college,
	                String course, String address)
	    {
	        // This keyword refers to current instance itself
	        this.name = name;
	        this.age = age;
	        this.college = college;
	        this.course = course;
	        this.address = address;
	    }
	 // Method 1
	    // Creating our own toString() method
	    public String toString()
	    {
	        return name + " " + age + " " + college + " "
	            + course + " " + address;
	    }
	 
		
	    public static void main(String[] args) {
	    	 // Creating object of class inside main() method
	    	ToStringDemo b = new ToStringDemo(
	            "Gulpreet Kaur", 21, "BIT MESRA", "M.TECH",
	            "Kiriburu");
	    	 // Print and display commands to illustrate
	        // toString() method as both will print the same
	        // Print the object
	        System.out.println(b);
	 
	        // Printing object but using toString() method
	        System.out.println(b.toString());
	    
		}
	}
   
	


