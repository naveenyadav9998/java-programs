import java.util.*;

class PrimeNumber
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the the number ");
		int num=input.nextInt();

		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count>0 || num<=1 )
		{
			System.out.println("Number is not prime");
		}
		else
		{
			System.out.println("Number is Prime");
		}
	}
}