//Take values of length and breadth of a rectangle from user and check if it is square or not.//

import java.util.*;
class CheckSquare
{
	public static void main(String args[])
	{
		int length,breadth;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the length: ");
		length=input.nextInt();
		System.out.print("Enter the breadth: ");
		breadth=input.nextInt();
		if(length==breadth)
		{
			System.out.println("This is a Square");
		}
		else
		{
			System.out.println("This is not a Square");
		}
	}
}