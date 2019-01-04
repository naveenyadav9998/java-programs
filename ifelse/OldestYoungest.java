//Take input of age of 3 people by user and determine oldest and youngest among them.

import java.util.*;
class OldestYoungest
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter A's age: ");
		a=input.nextInt();
		System.out.print("Enter B's age: ");
		b=input.nextInt();
		System.out.print("Enter C's age: ");
		c=input.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A is oldest then B and C");
			if (b>c)
			{
				System.out.println("B is oldest than C and C is youngest");
			}
			else
			{
				System.out.println("C is oldest than B and B is youngest");
			}
		}
		else if(b>a && b>c)
		{
					System.out.println("B is oldest then A and C");
					if (a>c)
					{
						System.out.println("A is oldest than C and C is youngest");
					}
					else
					{
						System.out.println("C is oldest than A and A is youngest");
					}
		}
		else
		{
					System.out.println("C is oldest then A and B");
					if (c>a)
					{
						System.out.println("B is oldest than A and A is youngest");
					}
					else
					{
						System.out.println("A is oldest than B and B is youngest");
					}
		}
	}
}