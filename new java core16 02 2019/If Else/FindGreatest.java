import java.util.*;

class FindGreatest
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int fnum=input.nextInt();

		System.out.println("Enter the Secound Number: ");
		int snum=input.nextInt();

		System.out.println("Enter the Third Number: ");
		int tnum=input.nextInt();

		if(fnum > snum && fnum >tnum)
		{
			System.out.println("Greatest Number is: "+fnum);
		}

		else if(snum > fnum && snum >tnum)
		{
			System.out.println("Greatest Number is: "+snum);
		}

		else
		{
			System.out.println("Greatest Number is: "+tnum);
		}

	}
}
