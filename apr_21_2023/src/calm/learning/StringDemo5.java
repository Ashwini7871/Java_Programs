package calm.learning;

public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StringDemo5 sd = new StringDemo5();
//			sd.rmv_space();//name.stripLeadig
//			sd.rmv_bkspace();//name.strip trailling 
		sd.check_count_of_character();	
	}

	private void check_count_of_character() {
		// TODO Auto-generated method stub
		
	    String n = "sivasabaribala";
	              //0123456789abcd
	    int[] cc = new int[n.length()];
	    
	  for(int j = 0; j<n.length(); j++)//indexj=0;0<13,
	  {
	    int count = 1; 
	    char ch = n.charAt(j);//
	    for(int i=j+1; i<n.length();i++)//i=1;1<13,
	    {
	      if(ch == n.charAt(i))//ch==
	      {
	        cc[i] = -1; 
	        count++; 
	      }
	    }
	    if(cc[j]!=-1)
	    {
	      cc[j] = count;
	    }
	    if(cc[j]>0)
	    {
	    System.out.println(ch + " appears for " + cc[j] + 
	        " times");
	    }

	  }		
	}

	private void rmv_bkspace() {
		// TODO Auto-generated method stub
	    String name="amal raj   ";                                                                         
	    
	    String name2="";
	    char[] ch=name.toCharArray();
	    boolean alphabet=false;
	    
	    for(int i=ch.length-1;i>=0;i--)
	    {
	      char letter=ch[i];
	      if(letter==' ' && alphabet==false )
	      {
	        
	      }
	      else
	      {
	        alphabet= true;
	        name2=name2+letter;
	      }
	      }
	    System.out.println(name2);
	    
	    for(int i=name2.length()-1;i>=0;i--)
	    {
	      char[] cc=name2.toCharArray();
	      System.out.print(cc[i]);
	    }
	    
		
		
	}

	private void rmv_space() {
		// TODO Auto-generated method stub
		String name = "   amal raj";
	    String name2 = "";
	    boolean alphabet_came = false;
	    char[] ch = name.toCharArray();
	    for(int i=0; i<ch.length;i++)
	    {
	      char letter = ch[i];
	      if (letter==' ' && alphabet_came == false)
	      {
	  
	      }
	      else {
	        alphabet_came = true; 
	      //System.out.print(ch[i]);
	      name2 = name2 + letter; //amal
	      }
	    }
	    System.out.println(name2); 
	}

}
