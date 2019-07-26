import java.util.*;
class SumOfEvenAndOdd
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Starting Range: ");
		int num1=input.nextInt();
		System.out.println("Enter Last Range: ");
		int num2=input.nextInt();
		int even=0,odd=0;
		for(int i=num1; i<=num2;i++)
		{
			if(i%2==0)
			{
				even=even+i;
			}
			else
			{
				odd=odd+i;
			}
		}
		System.out.println("Sum of Even: "+even);
		System.out.println("Sum of Odd: "+odd);
	}
}