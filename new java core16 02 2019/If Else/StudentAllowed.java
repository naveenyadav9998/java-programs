import java.util.*;
class StudentAllowed
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number Of Classes Held: ");
		int held=input.nextInt();

		System.out.println("Enter Number Of Classes Attended By Student: ");
		int attend=input.nextInt();

		int per=(attend*100)/held;

		System.out.println("Your Attendence is: "+per+"%");
		if(per>=75)
		{
			System.out.println("You are allowed to sit in exam");

		}
		else
		{
			System.out.println("he/she has medical cause or not ( 'Y' or 'N' )");
		    String y=input.next();
		    int x=y.charAt(0);

			if(x==89 || x==121)
				{
					System.out.println("You are allowed to sit in exam");
				}
			else
				{
	        		System.out.println("You are not allowed to in exam");
				}

		}

	}
}