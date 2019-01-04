//8. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//Take following input from user Number of classes held Number of classes attended. And print percentage of class attended
//Is student is allowed to sit in exam or not.
//Modify the above question to allow student to sit if he/she has medical cause.
//Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.

import java.util.*;
class SitInExam
{
	public static void main (String args[])
	{
		int held,attend;
		int y=1;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the classes held: ");
		held=input.nextInt();
		System.out.print("Enter the claasses attended: ");
		attend=input.nextInt();

		int per=(attend*100)/held;
		System.out.println("Your Attendence is: "+per+"%");
		if(per<=75)
		{
			System.out.println("he/she has medical cause or not ( 'Y' or 'N' )");
			y=input.nextInt();
			System.out.println(y);
			if(y == 1)
			{
				System.out.println("You are allowed to sit in exam");
			}
			else
			{
				System.out.println("You are not allowed to in exam");
			}
		}
			else
			{
			System.out.println("You are allowed to sit in exam");
			}
		}
	}
