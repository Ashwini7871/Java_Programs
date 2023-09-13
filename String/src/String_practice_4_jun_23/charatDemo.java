package String_practice_4_jun_23;

public class charatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		charatDemo cd = new charatDemo();
//		cd.oddposition();
//		cd.counting_usingcharAt();
	
	}

	private void counting_usingcharAt() {
		// TODO Auto-generated method stub
        String str = "Welcome to Javatpoint portal"; 
        int count = 0;  
        for (int i=0; i<=str.length()-1; i++) {  
            if(str.charAt(i) == 't') {  
                count++;  
            }  
        }  
        System.out.println("Frequency of t is: "+count);  
    
	}

	private void oddposition() {
		// TODO Auto-generated method stub
        String str = "Welcome to Javatpoint portal"; 
        for(int i=0;i<str.length();i++) {
        	if(i%2!=0) {
        		System.out.println(str.charAt(i));
        	}
        }
	}
	
}
