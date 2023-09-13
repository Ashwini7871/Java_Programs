package LabPrograms;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Age_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Please enter your date of birth  yyyy-mm-dd: ");
	Scanner sc = new Scanner(System.in);
		String input= sc.nextLine();
		sc.close();
		
		
		LocalDate dob = LocalDate.parse(input) ;
		System.out.println("Age is :"+getAge(dob));
		
	}

	private static int getAge(LocalDate dob) {
		// TODO Auto-generated method stub
		LocalDate curDate = LocalDate.now();
		return Period.between(dob, curDate).getYears();
	}

}
