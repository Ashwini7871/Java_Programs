package String_practice;

public class removeExtraSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String s="this   is    practice     purpose     only";
		
		String s1="";
		
	
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch !=' ') {
				s1=s1+ch;
			}
			else {
				char ch1=s.charAt(i+1);
				if(ch1==' ') {
					continue;
				}
				else {
					s1=s1+ch;
				}
			}
		}
		System.out.println(s1);
	}*/
		String s="   how            are      you!  ";
		
		 boolean space=true; 
		 for(int i=0;i<s.length();i++)
		 {    
			 if(s.charAt(i)!=' ') 
		        {    
				 System.out.print(s.charAt(i));   
				 space=false;       
				 }  
		 else if(space==false) 
		 {    System.out.print(s.charAt(i));   
		 space=true;  
		 }
			 
		 }

}}
