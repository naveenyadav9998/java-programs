//Take two int values from user and print greatest among them.//

import java.util.*;
class GreaterValue
{
	public static void main(String args[])
	{
		int a,b;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the First Number");
		a=input.nextInt();
		System.out.print("Enter the Secound Number");
		b=input.nextInt();
		if(a>b)
		{
			System.out.println("The First Number Is Greater then Secound Number");
		}
		else
		{
			System.out.println("The Secound Number Is Greater then First Number");
		}
	}
}