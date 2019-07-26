import java.util.*;
class CheckPrimeNumber
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number You Want to Check Prime: ");
		int num=input.nextInt();

		int status=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				status=status+1;
				break;
			}
		}
		if(status==1 || num<=1 )
		{
			System.out.println("Number is not Prime");
		}
		else
		{
			System.out.println("Number is Prime");
		}
	}
}
