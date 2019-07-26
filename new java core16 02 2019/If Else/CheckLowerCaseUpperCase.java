import java.util.*;

class CheckLowerCaseUpperCase
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Character: ");
		String c=input.next();

		int temp=c.charAt(0);


		if(temp>=97 && temp<=122)
		{
			System.out.println(c+" Character is Lowercase And his AscII Value is: "+temp);
		}
		else if(temp>=65 && temp<=90)
		{
			System.out.println(c+" Character is Uppercase And his AscII Value is: "+temp);
		}
		else if(temp>=48 && temp<=57)
		{
			System.out.println(c+" This is Number And his AscII Value is: "+temp);
		}
		else
		{
			System.out.println(c+" This is neither a Character And Nor a Number Its a Special Character and his AscII Value is: "+temp);
		}


	}
}