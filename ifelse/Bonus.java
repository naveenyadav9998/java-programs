// A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount.

import java.util.*;
class Bonus
{
	public static void main(String args[])
	{
		int salary,year;
		Scanner input =new Scanner(System.in);
		System.out.print("Enter Your Year of Service: ");
		year= input.nextInt();
		System.out.print("Enter your Salary: ");
		salary=input.nextInt();
		if(year>5)
		{
			int bonus =(salary*5)/100;
			salary= salary+bonus;
			System.out.println("Your net bonus amount is: "+bonus);
			System.out.println("Your new Sallary is: "+salary);
		}
		else
		{
			System.out.println("Your Salary is not got bonus");
		}
	}
}

