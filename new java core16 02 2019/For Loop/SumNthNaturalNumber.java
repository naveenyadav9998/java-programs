import java.util.*;
class SumNthNaturalNumber
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter range of Natural Number: ");
		int num=input.nextInt();

		int temp=0;
		for(int i=1;i<=num;i++)
		{
			temp=temp+i;

		}
		System.out.println("Sum of Natural number is: "+temp);
	}
}