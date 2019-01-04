//Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).

import java.util.*;
class CheckCharacter
{
	public static void main(String args[])
	{
		char ch;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Character: ");
		ch=input.next().charAt(0);
		int temp=(int)ch;
		if(temp>=97 && temp<=123)
		{
			System.out.println("You entered Lowercase and ASCII value is "+temp);
		}
		else if(temp>=65 && temp<=96)
		{
			System.out.println("You entered Uppercase and ASCII value is "+temp);
		}
	}
}