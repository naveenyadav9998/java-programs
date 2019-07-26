import java.util.*;

class FabbonacciSeries
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Nth term ");
		int n=input.nextInt();							//0, 1, 1, 2, 3, 5, 8, 13, 21,

		int num=0,num2=0,num3=1;
		for(int i=1;i<=n;i++)
		{
			num=num2;
			num2=num3;
			num3=num+num2;
			System.out.print(num+" ");
		}
	}
}