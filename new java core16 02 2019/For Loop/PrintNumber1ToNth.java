import java.util.*;
class PrintNumber1ToNth
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter last Number: ");
		int num=input.nextInt();

		for(int i=1;i<=num;i++)
		{
			System.out.println(i);
		}
	}
}