import java.util.*;

class DoWhileAdd
{
	public static void main(String args[])
	{
		Scanner input=new Scanner (System.in);

		int a,b;
		char choice;

		do
		{
			System.out.println("Enter the First Number: ");
			 a =input.nextInt();
			System.out.println("Enter the Second Number: ");
			 b=input.nextInt();
			 int c=a+b;
			 System.out.println("Sum is :"+ c);

			  System.out.println("Do you want to continue y/n? ");
			  choice = input.next().charAt(0);


		}
		while(choice=='y' || choice == 'Y');
	}
}
