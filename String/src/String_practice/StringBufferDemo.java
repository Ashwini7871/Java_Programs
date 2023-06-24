package String_practice;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuffer name = new StringBuffer("sivaramakrishnan");
//	    
//	    StringBuffer name2 = new StringBuffer(); 
//	    for(int i=0; i<name.length();i++)
//	    {
//	      name2.append(name.charAt(i));
//	      System.out.println(name2.hashCode());
//	    }
//	    System.out.println(name2);
	    //-----------------------//
	    StringBuilder name = new StringBuilder("sivaramakrishnan");
	    System.out.println(name.hashCode());
	    StringBuilder name2 = new StringBuilder(); 
	  for(int i=0; i<name.length();i++)
	  {
	    name2.append(name.charAt(i));
	    System.out.println(name2.hashCode());
	  }
	  System.out.println(name2);
	  name2.reverse();
	}

}
