import java.util.*;
class ReverseNumber
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=input.nextInt();

		int rev=0;


		for(int i=0;i<num;)
		{
			int rem=num%10;
		    rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reversed Number is: "+rev);
	}
}