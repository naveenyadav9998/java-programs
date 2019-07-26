import java.util.*;

class BigSmall
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int x=input.nextInt();

		System.out.println("Enter Secound Number: ");
		int y=input.nextInt();

		if(x>y)
		{
			System.out.println(x+" Number is Big...");
			System.out.println(y+" Number is Small...");
		}
		else
		{
			System.out.println(y+" Number is Big...");
			System.out.println(x+" Number is Small...");
		}

	}
}