/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee Dwight = new Employee(1987,"Dwight","Schrute",4416.66);
		Employee Jim = new Employee(2474,"Jim","Halpert",4416.66);
		Employee Pam = new Employee(2011,"Pam","Beesly",2250.00);
		Employee Sam = new Employee(2115,"Sam","Hutchins",4416.67);
		Dwight.raiseSalary(15);
		Dwight.employeeToString();
		System.out.println("Annual Salary: "+Dwight.getAnnualSalary());
		Jim.raiseSalary(15);
		Jim.employeeToString();
		System.out.println("Annual Salary: "+Jim.getAnnualSalary());
		Pam.raiseSalary(40);
		Pam.employeeToString();
		System.out.println("Annual Salary: "+Pam.getAnnualSalary());
		Sam.raiseSalary(10);
		Sam.employeeToString();
		System.out.println("Annual Salary: "+Sam.getAnnualSalary());
	}
}
