import java.util.*;
class CheckPositive
{
	public static void main(String args[])
	{
		int num;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number you want to check number is positve or not");
		num=input.nextInt();
		if(num>0)
		{
			System.out.println("Number is positive");
		}
		else if(num==0)
		{
			System.out.println("Number is Zero");
		}
		else
		{
			System.out.println("Number is negative");
		}
	}
}