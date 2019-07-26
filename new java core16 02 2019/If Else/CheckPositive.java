import java.util.*;

class CheckPositive
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number :");
		int x =input.nextInt();

		if(x>0)
		{
			System.out.println(x+" Number is postive");
		}
		else if(x==0)
		{
			System.out.println(x+" Number is Zero");
		}
		else
		{
			System.out.println(x+" Number is negative");
		}
	}
}