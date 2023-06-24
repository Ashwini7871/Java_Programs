package List;

import java.util.ArrayList;

public class ListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
		  al.add(100);
		  al.add(101);
		  al.add(102);
		  al.add(103);
		  System.out.println(al);
		  //------------------//
		  int[] arr = {100,101,102,103}; 
		//  for(int i=0;i<a.length;i++)
        //  System.out.println(a[i]);
		  //enhanced for loop - for each loop
		  for(int aa: arr)
		  {
			  if(aa%2==0) {
		    System.out.println(aa);}
		  }
		  //---------------------------//
		  ArrayList al1 = new ArrayList(); 
		  al1.add(100);
		  al1.add(101);
		  al1.add(102);
		  al1.add(103);
		  System.out.println(al1);
		  
		  for(Object ob:al1)
		  {//type casting
			  Integer no =(Integer)ob;
			  if(no%2==0) {
		    System.out.println(ob);}
		  }
		  //-------------------//
		  ArrayList al11 = new ArrayList(); 
		  al11.add(100);
		  al11.add(true);
		  al11.add("sabaribala");
		  al11.add(103.4f);
		  al11.add("siva");
		  al11.add(101);
		  System.out.println(al11);
		  for(Object ob:al11)
		  {
		    try
		    {
		    String no = (String)ob; 
		    System.out.println(no);
		    }
		    catch(ClassCastException cce)
		    {
		      
		    }
	}

}
}
