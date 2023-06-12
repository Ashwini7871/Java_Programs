package Constuctor_demo;

public class Employee {

	String name;
	int salary;
	Employee(String Emplyeename,int Employeesalary )
	/*-->there is parameter 
	so its called 
	parameter constructor*/
	{
		name=Emplyeename;
		salary=Employeesalary;
		System.out.println("name of the Employee: "+name);
		System.out.println("salary of the Employee: "+salary);
	}
}
