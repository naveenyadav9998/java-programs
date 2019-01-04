//2. Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
//if employee is female, then she will work only in urban areas.
//if employee is a male and age is in between 20 to 40 then he may work in anywhere
//if employee is male and age is in between 40 t0 60 then he will work in urban areas only. And any other input of age should print "ERROR".

import java.util.*;
class PlaceOfService
{
	public static void main(String args[])
	{
		int age,temp;
		char sex,status;
		String name;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Name: ");
		name=input.next();

		System.out.print("Enter the age: ");
		age=input.nextInt();

		System.out.print("Enter the SEX: ");
		sex=input.next().charAt(0);
		temp=(int)sex;

		System.out.print("Enter the marital status: ");
		status=input.next().charAt(0);
		if(temp == 70 || temp == 102)
		{
			System.out.println(name+" will work only in urban areas");
		}
		else if(age>=40 && age<=60)
		{
			System.out.println(name+" will work only in urban areas");
		}
		else if(age>=20 && age<40)
		{
			System.out.println(name+" will work anywhere");
		}
		else
		{
			System.out.println("Error");
		}
	}
}
