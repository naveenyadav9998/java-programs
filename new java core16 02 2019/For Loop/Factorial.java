import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number You Want to Factorial: ");
		int num=input.nextInt();

		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(num+" Factorial is: "+fact);
	}
}