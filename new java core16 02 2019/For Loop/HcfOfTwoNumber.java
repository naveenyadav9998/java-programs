import java.util.*;

class HcfOfTwoNumber
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);

		System.out.println("Enter First Number: ");
		int num1=input.nextInt();

		System.out.println("Enter Secound Number: ");
		int num2=input.nextInt();

		int hcf=0;

		for(int i=1; i<=num1 || i<=num2; i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				hcf=i;
			}
		}
		System.out.println("H.C.F. of the number "+num1+" , "+num2+" is "+hcf);
	}
}