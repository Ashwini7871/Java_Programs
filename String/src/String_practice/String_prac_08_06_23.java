package String_practice;

public class String_prac_08_06_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_prac_08_06_23 sc = new String_prac_08_06_23();
//		sc.task1();//a1
		sc.task2();//a1b2c3
	}

	private void task2() {
		// TODO Auto-generated method stub
		String s="a1b2c3d5e1";
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i)))//default method; it prints alphabetic
				{
				
				System.out.print(s.charAt(i));

			    }
			else {
				int x=Integer.parseInt(String.valueOf(s.charAt(i)));
				for(int j=0;j<x;j++) //0<9
				{
				System.out.print(s.charAt(i-1));
			    }

			}
		}
	}

	private void task1() {
		// TODO Auto-generated method stub
		String s="a9";//ex o/p;aa
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				System.out.print(s.charAt(i));
				
			}
			else {
				int x=Character.getNumericValue(s.charAt(i)) ;//9,x=9
				for(int j=0;j<x;j++) //0<9
					{
					System.out.print(s.charAt(i-1));
				}
			}
		}
		
	}

}
