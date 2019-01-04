//Write a program to print absolute vlaue of a number entered by user. E.g.-
//INPUT: 1        OUTPUT: 1  INPUT: -1        OUTPUT: 1

import java.util.*;
class AbsoluteValue
{
	public static void main (String args[])
	{
		int num;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number Check his Absolute Value: ");
		num=input.nextInt();
		if(num>0)
		{
			System.out.println("Absolute value of "+num+" is: "+num);
		}
		else
		{
			System.out.println("Absolute value of "+num+" is: "+(-1*num));
		}
	}
}