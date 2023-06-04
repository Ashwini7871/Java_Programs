package calm.learning;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String last_movie1 = "GN";
//		  String last_movie2 = "GN";
//		  String last_movie3 = "GN";
//		  String last_movie4 = "GN";
//		  System.out.println(last_movie1.hashCode());
//		  System.out.println(last_movie2.hashCode());
//		  System.out.println(last_movie3.hashCode());
//		  System.out.println(last_movie4.hashCode());
//		  last_movie1="2018";
//		  System.out.println(last_movie1.hashCode());
//		  System.out.println(last_movie2.hashCode());
//		  System.out.println(last_movie3.hashCode());
//		  System.out.println(last_movie4.hashCode());
		  String name = "ashwini";
//		  System.out.println(name.charAt(0));
//		  System.out.println(name.charAt(1));
//		  System.out.println(name.charAt(2));
//		  System.out.println(name.charAt(3));
//		  System.out.println(name.charAt(4));
//		  System.out.println(name.charAt(5));
//		  System.out.println(name.charAt(6));
//		  System.out.println(name.charAt(7));
		  System.out.println(name.length());
		  for(int i=0;i<name.length();i++) {
			  if(name.charAt(i)=='i')
			  System.out.println(name.charAt(i));
		  }
		  System.out.println(name.charAt(0));
		  System.out.println(name.charAt(name.length()-1));
		  System.out.println(name.charAt(name.length()/2));
		  System.out.println(name.startsWith("as"));
	}

}
