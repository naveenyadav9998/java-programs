//Write a program to check if a year is leap year or not.
//If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400.

import java.util.*;
class LeapYear
{
	public static void main(String args[])
	{
		int year;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Year you want to check leap year aur not: ");
		year=input.nextInt();
		if (year%4==0)
		{
			System.out.println("Year is Leap Year");
		}
		else
		{
			System.out.println("Year is Not a Leap Year");
		}
	}
}