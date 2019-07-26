import java.util.*;

class CheckSquare
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter length: ");
		int length=input.nextInt();

		System.out.println("Enter breadth: ");
		int breadth=input.nextInt();

		if(length==breadth)
		{
			System.out.println("This Rectangle is Square");
		}

		else
		{
			System.out.println("This is Rectangle not square");
		}
	}
}