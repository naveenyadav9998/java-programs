
import java.util.*;
class FindOldestAndYoungest
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);

		System.out.println("Enter First Person Age: ");
		int fage=input.nextInt();

		System.out.println("Enter Secound Person Age: ");
		int sage=input.nextInt();

		System.out.println("Enter Third Person Age: ");
		int tage=input.nextInt();

		if(fage>sage && fage>tage)
		{
			System.out.println("First person is oldest "+fage);

			if(sage>tage)
			{
				System.out.println("Third person is Youngest "+tage);
			}
			else
			{
				System.out.println("Secound person is Youngest "+sage);
			}
		}

		else if(sage>fage && sage>tage)
		{
			System.out.println("Secound person is oldest "+sage);

			if(fage>tage)
				{
					System.out.println("Third person is Youngest "+tage);
				}
			else
				{
					System.out.println("First person is Youngest "+fage);
			    }
		}


		else if(tage>fage && tage>sage)
		{
			System.out.println("Third person is oldest "+tage);

			if(fage>sage)
				{
					System.out.println("Secound person is Youngest "+sage);
				}
			else
				{
					System.out.println("First person is Youngest "+fage);
			    }
		}



	}
}