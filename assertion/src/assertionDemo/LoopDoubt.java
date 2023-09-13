package assertionDemo;

import java.util.Collections;

public class LoopDoubt {

	
		final static short x = 2;
	    public static int y = 0;
	    public static void main(String [] args) 
	    {
	        for (int z=0; z < 3; z++) 
	        {
	            switch (z) 
	            {
	                case x: System.out.print("0 ");
	                case x-1: System.out.print("1 ");//2-1=1
	                case x-2: System.out.print("2 ");//2-2=0
	                
	            }
	        }
	    }
	}


