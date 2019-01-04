import java.util.*;
class Reverse
{
	public static void main (String args[])
	{
		int num,rev=0;
		Scanner input =new Scanner(System.in);
		System.out.print("Enter A Number");
		num=input.nextInt();
		int temp=num;

		for(;num>0;)
		{
			int rem=num%10;
			 rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse Number is: "+rev);
		if(rev==temp)
		{
			System.out.println("Number is palindrom");
		}
		else
		{
			System.out.println("number is not palindrom");
		}

	}
}
