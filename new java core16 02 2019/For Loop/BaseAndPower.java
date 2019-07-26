import java.util.*;
class BaseAndPower
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Base: ");
		int base=input.nextInt();
		System.out.print("Enter power: ");
		int power=input.nextInt();

		int pow=1;
		for(int i=1;i<=power;i++)
		{
			pow=pow*base;
		}
		System.out.println("Result: "+pow);
	}
}

