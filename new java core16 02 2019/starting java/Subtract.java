import java.util.*;

class Subtract
{
	public static void main(String args[])
	{
		Scanner input =new Scanner (System.in);
		System.out.println("Enter First number: ");
		int a=input.nextInt();

		System.out.println("Enter Secound Number: ");
		int b=input.nextInt();

		int c=a-b;
		System.out.println("Subtract is: "+c);
	}
}