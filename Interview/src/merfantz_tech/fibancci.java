package merfantz_tech;

public class fibancci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int p1=0,p2=1;
 
 while(p1<=100){
	 System.out.println(p1);
	int p3=p1+p2;
	 p1=p2;
	 p2=p3;	 
 }
	}

}
