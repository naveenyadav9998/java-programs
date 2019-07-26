
import java.util.*;
class EmployeeBonus

{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Employee name: ");
		String name=input.nextLine();

		System.out.println("Enter Employee Salary: ");
		int salary=input.nextInt();

		System.out.println("Enter Employee Year of Service: ");
		int year=input.nextInt();

		if(year>5)
		{
			int bonus=(salary*5)/100;
			int total=salary+bonus;
			System.out.println("Employee Name: "+name);
			System.out.println("Employee Working Years: "+year);
			System.out.println("Employee bonus: "+bonus);
			System.out.println("Employee Total Salary: "+total);
		}

		else
		{
			System.out.println("Employee Name: "+name);
			System.out.println("Employee Working Years: "+year);
			System.out.println("Employee salary: "+salary);
		}
	}
}