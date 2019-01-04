//A school has following rules for grading system:
//a. Below 25 - F  b. 25 to 45 - E  c. 45 to 50 - D  d. 50 to 60 - C  e. 60 to 80 - B  f. Above 80 - A
//Ask user to enter marks and print the corresponding grade.

import java.util.*;
class Grade
{
	public static void main(String args[])
	{
		int p,c,m,h,e,grade;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Physics Number: ");
		p=input.nextInt();
		System.out.print("Enter Chemistry Number: ");
		c=input.nextInt();
		System.out.print("Enter Mathematics Number: ");
		m=input.nextInt();
		System.out.print("Enter Hindi Number: ");
		h=input.nextInt();
		System.out.print("Enter English Number: ");
		e=input.nextInt();
		grade=(p+c+m+h+e)/5;
		if(grade>=80)
		{
			System.out.print("You got A grade");
		}
		else if(grade>=60)
		{
			System.out.print("You got B grade");
		}
		else if (grade>=50)
		{
			System.out.print("You got C grade");
		}
		else if (grade>=45)
		{
			System.out.print("You got D grade");
		}
		else if (grade>=25)
		{
			System.out.print("You got E grade");
		}
		else
		{
			System.out.print("You got F grade");
		}
	}
}