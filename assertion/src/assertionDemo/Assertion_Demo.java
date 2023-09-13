package assertionDemo;

public class Assertion_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		    
		        int x = 10;
		        assert x >0 : "x should be greater than 0";
		        
		        // If the assertion fails, an AssertionError with the specified message is thrown.
		        
		        System.out.println("After assertion");
		        boolean a= false,b=true;
		        foo(a,b);
		        
		        
		    }
	public static void foo( boolean a, boolean b)
	{ 
	    if( a ) 
	    {
	        System.out.println("A"); /* Line 5 */
	    } 
	    
	    else if(a && b) /* Line 7 *///f && f
	    { 
	        System.out.println( "A && B"); 
	    } 
	    else /* Line 11 */
	    { 
	        if ( !b ) 
	        {
	            System.out.println( "notB") ;
	        } 
	        else 
	        {
	            System.out.println( "ELSE" ) ; 
	        } 
	    } 
	}

		
	}

