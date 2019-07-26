import java.util.*;
class LeapYear
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter year Want to know its leapyear or not: ");
		int year=input.nextInt();
		if(year%4==0)
		{
			System.out.println(year+" is leap year ");
		}
		else
		{
			System.out.println(year+" is not a leap year ");
		}

	}
}
