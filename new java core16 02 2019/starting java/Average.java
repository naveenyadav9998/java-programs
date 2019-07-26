import java.util.*;

class Average
{
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter First number ");
		int num1=input.nextInt();

		System.out.println("Enter Secound number ");
		int num2=input.nextInt();

		System.out.println("Enter Third number ");
		int num3=input.nextInt();

		System.out.println("Enter Fourth number ");
		int num4=input.nextInt();

		System.out.println("Enter Fifth number ");
		int num5=input.nextInt();

		int avg=(num1+num2+num3+num4+num5)/5;

		System.out.println("Your average is: "+avg);
	}
}