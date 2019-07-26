import java.util.*;

class Divide
{
	public static void main(String args[])
	{
		Scanner input =new Scanner (System.in);
		System.out.println("Enter First number: ");
		double a=input.nextInt();

		System.out.println("Enter Secound Number: ");
		double b=input.nextInt();

		double c=a/b;
		System.out.println("Divde is: "+c);
	}
}