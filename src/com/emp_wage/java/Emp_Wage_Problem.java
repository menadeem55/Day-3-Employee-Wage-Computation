package com.emp_wage.java;

import java.util.Random;

public class Emp_Wage_Problem {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();

		int wagePerHrs = 20;
		int fullDayHrs = 8;
		int halfDaysHrs = 4;
		int salary = 0;
		int monthlySalary = 0;
		int workingDaysPerMonth = 20;

		for (int i = 1; i <= workingDaysPerMonth; i++) {

			int randomNum = random.nextInt(3);

			switch (randomNum) {
			case 0:

				System.out.println("Employee is Absent");
				break;

			case 1:

				System.out.println("Employee is Present");
				salary = wagePerHrs * fullDayHrs;
				break;

			case 2:
				System.out.println("Employee is Present for Half Day");
				salary = wagePerHrs * halfDaysHrs;
				

			}

			
			monthlySalary = monthlySalary + salary;
			System.out.println("Salary is: " + salary);
			
		}
			System.out.println("monthly salary: "+ monthlySalary);
			

//				if(randomNum == 1)
//				{	
//					System.out.println("Employee  is Present");
//						salary = wagePerHrs * fullDayHrs;
//				}
//				else if(randomNum == 2)
//				{
//					salary = wagePerHrs * halfDaysHrs;
//						System.out.println("Employee is Present for Half Day");
//				}
//				else
//					
//					System.out.println("Employee  is Absent");
//		
//				System.out.println("Salary is: "+salary);

	}

}