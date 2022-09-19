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
		
				int randomNum = random.nextInt(3);
		
				if(randomNum == 1)
				{	
					System.out.println("Employee  is Present");
						salary = wagePerHrs * fullDayHrs;
				}
				else if(randomNum == 2)
				{
					salary = wagePerHrs * halfDaysHrs;
						System.out.println("Employee is Present for Half Day");
				}
				else
					
					System.out.println("Employee  is Absent");
		
				System.out.println("Salary is: "+salary);

	}

}