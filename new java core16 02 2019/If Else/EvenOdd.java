import java.util.*;

class EvenOdd
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number for check :");
		int num1=input.nextInt();

		if(num1%2==0)
		System.out.println("Number is Even");

		else
		System.out.println("Number is Odd");
	}
}