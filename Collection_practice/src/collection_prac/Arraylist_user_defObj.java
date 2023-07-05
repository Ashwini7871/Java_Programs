package collection_prac;

public class Arraylist_user_defObj //pending
{

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraylist_user_defObj a = new Arraylist_user_defObj();
		a.add = new s("siva",10);
		a.add = new s("ashwini",20);
		a.add = new s("prabha",30);
		a.add = new s("praveen",40);
		
//		s.forEach(s->{
			System.out.println("name :"+s.getName()+ "\n age :"+s.getAge());
			
			
//		});
	

}

}

class s {
	String name;
	int age;

	public s(String n, int a) {
		// TODO Auto-generated constructor stub
		name=n;
		age=a;
		
	}
		
	
	

	public void SetName(String n) {
		name =n;
	}
	public int getAge() {
		return age;
	}
	public void SetAge (int a){
		age=a;
	}
	public String getName() {
		return name;
	}
	
	
}

