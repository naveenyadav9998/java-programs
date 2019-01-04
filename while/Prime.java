import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		int num,i=2,status=0;
		Scanner input =new Scanner(System.in);
		System.out.print("Enter number you want to check: ");
		num =input.nextInt();

		while(i<num)
		{
			if(num%i==0)
			{
				status++;
				break;
			}
			i++;
		}
		if(status==1 || num==1 || num==0 || num<0 )
		{
			System.out.println(num+" Number is not Prime");
		}
		else
		{
			System.out.println(num+" Number is Prime");
		}
	}
}