import java.util.*;
class CheckPalindrome
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number You Want to Check It's Palindrome Or Not: ");
		int num=input.nextInt();

		int rev=0;
		int temp=num;
		for(int i=1;i<=num;)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reversed Number Is: "+rev);
		if (temp==rev)
		{
			System.out.println("Enterd Number is Palindrome");
		}
		else
		{
			System.out.println("Enterd Number is not Palindrome");
		}
	}
}